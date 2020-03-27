public class LengthOfLastWord {
    /*
    Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
     */

    public static void main(String[] args) {
        //System.out.println(lengthLast("Hello World"));
lengthLast("Hello World ");
    }

    public static int lengthLast(String userInput){
        char[] fullChar = userInput.toCharArray();
        int charLength = userInput.length();
        int counter=0;

        for(int i = charLength-1; i>=0; i--){
            if(charLength>1 &&fullChar[charLength-1] == ' '){
                    ++i;
            }
                //    ==' ' & fullChar[charLength-2] not Null

           if(fullChar[i] != ' '){
                counter+=1;
            }
           if(fullChar[i] ==' '){
               break;
           }

        }
        System.out.println(counter);
        return counter;
    }
}
