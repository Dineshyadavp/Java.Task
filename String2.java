public class Str {

    public static void main(String[] args) {
  
.
        String str = "Dineshkumar";
      
        System.out.println("Original String : " + str);
        
        int val1 = str.codePointBefore(3);
    
        int val2 = str.codePointBefore(6);
       
        System.out.println("Character(unicode point) = " + val1);
        
        System.out.println("Character(unicode point) = " + val2);
    }
}
