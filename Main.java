//public class Main {
//    public static void main(String[] args) {
//        System.out.println( reverse(9999949399));
//
//    }
//    public static int reverse(int x) {
//String input = x+"";
//
//        char[] inputCharArr = input.toCharArray();
//        int lengthArr = inputCharArr.length-1;
//        int finIndex=0;
//        String output="";
//        String outputFin = "";
//
//       // System.out.println(inputCharArr);
//        if(lengthArr >9){
//            return 0;
//        }
//if(inputCharArr[0] =='-'){
//    output+='-';
//    finIndex=1;
//}
//if(inputCharArr[lengthArr]==0){
//    ++finIndex;
//}
//        for(int i = lengthArr; i>=finIndex; i--){
//            output+=inputCharArr[i];
//        }
//        int strToInt = Integer.parseInt(output);
//
//
//
//        return strToInt;
//    }
//}
