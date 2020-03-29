import java.io.Console;


public class RegExTreehouse {
    public static void main(String[] args) {
       /*
       pattern matching

        .(any character)
        .*(one or more of these)
        [](allowed characters)
        [A-Za-z] (letters a-z)
        \w* (same as above)
        [0-9]
        \d*{5} (5 digits)
^\d{5}$
^\d{5}(-\d{4})?$ - zipcode 5 digs with optitional 4 digit extension
        */
       Console console = System.console();
String zipCode = console.readLine("Enter your zipcode: ");
if(zipCode.matches("\\d{5}")){
    System.out.printf("%s is a valid zip code%n", zipCode);
}
else{
    System.out.printf("%s is a valid zip code%n", zipCode);
}

    }


}
