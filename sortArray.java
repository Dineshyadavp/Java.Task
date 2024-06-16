import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
            int[] My_array1 = {
                36, 46, 56, 66, 76,
                26, 16, 06, 86,
                96, 106, 116
            };
            String[] My_array2 = {
                "Java",
                
            }; 
             System.out.println("Original numeric array : " + Arrays.toString(My_array1));
             Arrays.sort(My_array1);
             System.out.println("Sorted numeric array : " + Arrays.toString(My_array1));
             System.out.println("Original string array : " + Arrays.toString(My_array2));
             Arrays.sort(My_array2);
             System.out.println("Sorted string array : " + Arrays.toString(My_array2));
        }
    }
