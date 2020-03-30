import java.util.HashSet;
import java.util.Set;

public class RevVowelString {
    public static void main(String[] args) {
        System.out.println( revStrVowels("leetcode"));
  //345
        // https://leetcode.com/problems/reverse-vowels-of-a-string/
    }
    public static String revStrVowels(String userInput){
       Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');

        char[] arrayOfChars = userInput.toCharArray();
        int i = 0;
        int j = userInput.length()-1;
        while(i<j){
            while(i<j && !vowels.contains(arrayOfChars[i])){
             i++;
            }
            while(i<j && !vowels.contains(arrayOfChars[j])){
                j--;
            }
            char temp = arrayOfChars[i];
            arrayOfChars[i++] = arrayOfChars[j];
            arrayOfChars[j--] = temp;
        }
        return new String(arrayOfChars);
    }
}
