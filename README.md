// Java Program to Add elements to An ArrayList
// Importing all utility classes
import java.util.*;
class Main {
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("Dinesh");
        al.add("Dinesh");
        al.add(1, "is");
        System.out.println(al);
    }
}
