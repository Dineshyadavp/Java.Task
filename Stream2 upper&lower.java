import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Stream2 {
  public static void main(String[] args) {
    List < String > Names = Arrays.asList("Dinesh", "Venkatesh", "Vineeth", "Rohith", "SHIVA");
    System.out.println("List of strings: " + Names);
    List < String > uppercaseStrings = Names.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toList());
    System.out.println("\nUppercase Strings: " + uppercaseStrings);
    List < String > lowercaseStrings = Names.stream()
      .map(String::toLowerCase)
      .collect(Collectors.toList());

    System.out.println("Lowercase Strings: " + lowercaseStrings);
  }
}
