public class DefangIP {
    public static void main(String[] args) {
        System.out.println( defangIPaddr("255.100.50.0"));
        //defangIPaddr("255.100.50.0");
    }

        public static String defangIPaddr(String address) {
            char[] intArray = address.toCharArray();
            String output = "";

            for(int i = 0; i<intArray.length; i++){
                if(intArray[i] =='.'){
                    output+="[.]";
                }
                else{ output+=intArray[i];}

            }
            return output;
        }

}
