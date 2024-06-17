import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Duplicate {
  public static void main(String[] args) {
    List < Integer > nums = Arrays.asList(6, 26, 36, 46, 26, 36, 33, 6, 26, 46);
    System.out.println("Original List of numbers: " + nums);
    List < Integer > distinctNumbers = nums.stream()
      .distinct()
      .collect(Collectors.toList());
    System.out.println("After removing duplicates from the said list: " + distinctNumbers);
  }
}
