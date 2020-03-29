import java.util.ArrayList;
import java.util.List;

public class TreehouseList {
    public static void main(String[] args) {
        List<String> groceryLine = new ArrayList<String>();
        groceryLine.add("Dante");
        groceryLine.add("Javier");
        groceryLine.add("Ben");

        System.out.println(groceryLine);
        System.out.println(groceryLine.size());
       groceryLine.remove(1);
        System.out.println(groceryLine);
        System.out.println(groceryLine.size());
        System.out.println(groceryLine.indexOf("Dee"));


    }
}
