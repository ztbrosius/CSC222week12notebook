public class BankAccount implements Increasable
{
   double balance;
   public BankAccount(double bal)
   {
      balance = bal;
   }
   public void increase()
   {
      balance = balance + 1;
   }
   public double getBalance()
   {
      return balance;
   }
}