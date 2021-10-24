
package my.package2;
public class MyPackage2 {
    public static void main(String[] args)
    {
      Account a =new Account(1122,20000);
      a.set_annualintersetrate(4.5);
      a.withdraw(2500);
      a.deposit(3000);
      System.out.println("your balance is :"+a.get_balance());
      System.out.println("your monthly interset is :"+( a.getMonthlyIntersetRate()/100 )*( a.get_balance()));
      System.out.print("you create the Account in ");
      a.get_Datacreated();
    }
    
}
