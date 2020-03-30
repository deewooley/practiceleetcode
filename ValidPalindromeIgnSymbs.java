public class ValidPalindromeIgnSymbs {
    public static void main(String[] args) {
       // palindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome("0P"));
    }
    public static boolean palindrome(String s){

        char[] chars = s.toLowerCase().toCharArray();
        int lengthChars = s.length();
        String forComparison = "";
        String initial ="";
        boolean output;
        for(int i = lengthChars-1; i>=0; i--){
            if(Character.isLetter(chars[i])
            || Character.isDigit(chars[i])) {
                forComparison += chars[i];

                    {
                        forComparison += chars[i];

                }
            }
        }

        for(int i = 0; i<lengthChars; i++) {
            if (Character.isLetter(chars[i])) {
                initial += chars[i];
                if (Character.isDigit(chars[i])) {
                    initial += chars[i];
                }
            }
        }

int length = initial.toCharArray().length;

       if(length==1 ){
            output=true;
        }
        else if(length==0 ){
            output=true;
        }
        else if(forComparison.equals(initial)){
            output=true;
        }
        else{
            output=false;
        }

        System.out.println(forComparison);
        System.out.println(initial);
        return output;
    }
}
