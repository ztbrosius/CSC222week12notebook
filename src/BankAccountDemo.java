public class BankAccountDemo implements PizzaConstants
{
   public static void main(String[] args)
   {
      BankAccount acct = new BankAccount(100.25);
      acct.increase();
      System.out.println("Company: " + COMPANY);
      System.out.println("New balance: " + acct.getBalance());
   }
}