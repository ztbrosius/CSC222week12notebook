public class BankAccountDemo
{
   public static void main(String[] args)
   {
      BankAccount acct = new BankAccount(100.25);
      acct.increase();
      System.out.println("New balance: " + acct.getBalance());
   }
}