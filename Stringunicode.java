import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < str.length()) {
            char character = str.charAt(index);
            int unicode = (int) character;
            System.out.println("Unicode code point at index " + index + ": " + unicode);
        } else {
            System.out.println("Index out of bounds.");
        }

        scanner.close();
    }
}
