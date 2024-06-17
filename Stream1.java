import java.util.Arrays;
import java.util.List;
public class Stream1 {
  public static void main(String[] args) {
    List < Integer > nums = Arrays.asList(6, 16, 26, 3, 9, 14, 36);
    System.out.println("List of numbers: " + nums);
    double average = nums.stream()
      .mapToDouble(Integer::doubleValue)
      .average()
      .orElse(0.0);

    System.out.println("Average value of the said numbers: " + average);
  }
}
