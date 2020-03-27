public class PalindromeNumber {
    public static void main(String[] args) {
        //System.out.println( palindromeNumbers(121));
       palindromeNumbers(121);
    }
    public static boolean palindromeNumbers(int input){
        String intToString = input+"";
        char[] stringToChar = intToString.toCharArray();
        boolean output;
        String reversedArray = "";

        for(int i = stringToChar.length-1; i>=0; i--){
            reversedArray+=stringToChar[i];
        }
        if(reversedArray.equals(intToString)){
            output=true;
        }
        else{
            output=false;
        }
        System.out.println(output);
        return output;
    }
}
