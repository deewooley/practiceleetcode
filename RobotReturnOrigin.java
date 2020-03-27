public class RobotReturnOrigin {
    public static void main(String[] args) {
        System.out.println(RobotWhere("LRU"));
     //Z RobotWhere("LR");
    }

    public static boolean RobotWhere(String directions) {
        char[] location = directions.toCharArray();
        boolean output;
        int LCount=0;
        int RCount=0;
        int UCount = 0;
        int DCount = 0;

        for (int i = 0; i<location.length; i++) {
            if (location[i]=='L'){
                ++LCount;
        }
            else if (location[i]=='R'){
                RCount+=1;
            }
            else if (location[i]=='U'){
                UCount+=1;
            }
            else if (location[i]=='D'){
                DCount=DCount+1;
            }
            else{}
    }

        if(LCount==RCount && UCount==DCount){
            output=true;
        }
        else {
            output=false;
        }

        return output;
}


}
