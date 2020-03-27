public class FindDifference {
    public static void main(String[] args) {
spotDifferenct("abcde", "abcd");
    }
    public static char spotDifferenct(String a, String b){
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        int aArraylength = aArray.length;
        int bArraylength = bArray.length;
        int length=0;
        int length2=0;

        if(aArraylength>bArraylength){
         length=aArraylength;
         length2 = bArraylength;

        }
        else{
            length=bArraylength;
            length2= aArraylength;}


        for(int i=0; i<=length-1;i++ ){
            for(int x = 0; x<=length2-1; x++) {
//                if (aArray[i] == bArray[x]) {
//                    System.out.println(aArray[i]);
//                }
                if (aArray[i] != bArray[x]) {
                    System.out.println(aArray[i]);
                }
//                if(char){
//
//                }

            }

        }
return 'c';
    }
}
