public class Bank2 {
        static int currentBalance = 1000;
        public static void greetCustomer ()
        {
            System.out.println("Hello,Welcome to the Banking Application");
        }
        public static void deposit(int amount) {
            currentBalance = currentBalance+amount;
            System.out.println("Amount is deposited Successfully");
        }
        public static void withdraw(int amount){
            currentBalance = currentBalance - amount;
            System.out.println("Amount is Whithdrawn Successfully");
        }
        public int getCurrentBalance()
        {
            return currentBalance;
        }
        public static void main(String[] args) {
                greetCustomer();
                System.out.println("Current Balance is :" ); //+bank1.getCurrentBalance());
                deposit(500);
                System.out.println("Current Balance is :"); // +bank1.getCurrentBalance());
                withdraw(300);
                System.out.println("Current Balance is :");  //+bank1.getCurrentBalance());
    
        }
    
        }
