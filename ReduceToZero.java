public class ReduceToZero {
    public static void main(String[] args) {
      reduceToZero(8);

    }
    public static int reduceToZero(int num) {
        int startAmount = num;
// 5
        // div 2 obtain 7
        int counter=0;

        while (startAmount!=0) {
            if (startAmount % 2 == 0) {
                int amt = startAmount / 2;
                startAmount = amt;
                counter+=1;
            }
            else{
                startAmount= (startAmount-1);
//                counter+=1;
                ++counter;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
