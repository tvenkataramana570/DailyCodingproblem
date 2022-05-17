/*

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.

*/
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class Main {
    public static void main(String[] args)
    {
        // A = 3 -> 7 -> 8 -> 10 
        Node n1 = new Node(3);
        n1.next = new Node(7);
        n1.next.next = new Node(8);
        n1.next.next.next = new Node(10);
        // B = 99 -> 1 -> 8 -> 10
        Node n2 = new Node(99);
        n2.next = new Node(1);
        n2.next.next = new Node(8);
        n2.next.next.next = new Node(10);
        n2.next.next=n1.next.next;
        Print(n1);
        Print(n2);
        System.out.println(MergeNode(n1, n2).data);
    }
 
    // function to print the list
    public static void Print(Node n)
    {
        Node cur = n;
        while (cur != null) {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }
 
    // function to find the intersection of two node
    public static Node MergeNode(Node n1, Node n2)
    {
        
        HashSet<Node> hs = new HashSet<Node>();
        while (n1 != null) {
            hs.add(n1);
            n1 = n1.next;
        }
        while (n2 != null) {
            if (hs.contains(n2)) {
                return n2;
            }
            n2 = n2.next;
        }
        return null;
    }
}
