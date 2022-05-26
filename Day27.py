'''
Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.

'''
def balance(s):
    stack = []
    for char in s:
        if char in ["(", "[", "{"]:
            stack.append(char)
        else:
            # Check character is not unmatched
            if not stack:
                return False

            # Char is a closing bracket, check top of stack if it matches
            if (char == ")" and stack[-1] != "(") or (char == "]" and stack[-1] != "[") or (char == "}" and stack[-1] != "{"):
                return False
            stack.pop()

    return len(stack) == 0
    
    
print(balance("([])[]({})"))
print(balance("[(])"))
