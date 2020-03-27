public class ValidPalindrome {
    /*
    Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
     */

    public static void main(String[] args) {
        System.out.println(palindrome("abas"));
//palindrome("abcra");
    }
    public static boolean palindrome(String userInput){
        boolean boolReturn=false;
        String conToChart = userInput+"";
        char[] toArray = conToChart.toCharArray();
        String finStr = "";
        for(int i = toArray.length-1; i>=0; i--){
            finStr += toArray[i];
        }
        if(finStr.equals(userInput)){
            boolReturn = true;
        }
        else{boolReturn=false;}
       return boolReturn;
    }
}
