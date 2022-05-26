import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String w[]=new String[]{"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
		System.out.println(fullJustify(w,16));
	}
	public static List<String> fullJustify(String[] words, int maxWidth){
	    // final answer
	    List<String> ans = new ArrayList<>();
	    // index of word to consider
	    int i = 0;
	    // tracks current line width (words + spaces)
	    int currLineWidth = 0;
	    // intermediate list of words that will be added to 'ans' (only words, no spaces)
	    List<String> currLine = new ArrayList<>();

	    while (i < words.length) {
		    String word = words[i];
		    // if word can be added to currLine
		    if (currLineWidth + word.length() <= maxWidth) {  
			    currLine.add(word);
			    currLineWidth += word.length() + 1;
			    i++;
		        } else {
			    // spaces to be distributed among words
			    int spaces = maxWidth - currLineWidth + currLine.size();   
			    int spacesAdded = 0;
			    int j = 0;

			    while (spacesAdded < spaces) {
				    // should not add space to last word of currLine
				    if (j >= currLine.size()-1) 
					    j = 0;
				        currLine.set(j, currLine.get(j) + " ");
				        spacesAdded++;
				        j++;
			        }

			    ans.add(String.join("", currLine));
			    currLine = new ArrayList<>();
			    currLineWidth = 0;
		    }
	    }

	    // last line
	    for (int j=0; j<currLine.size()-1; j++) {
		    currLine.set(j, currLine.get(j) + " ");
	    }

	    currLine.set(currLine.size()-1, currLine.get(currLine.size()-1) + " ".repeat(maxWidth - currLineWidth + 1));
	    ans.add(String.join("", currLine));
    
	    return ans;
	}
}
