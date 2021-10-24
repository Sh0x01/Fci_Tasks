
package my.package2;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Account 
{
    private int id;
    private double balance;
    private double annualintersetrate;
    private Date datacreated=new Date();
    
    
    public Account()
    {
        id=0;
        balance=0.0;
        annualintersetrate=0.0;
    }
    public Account(int idd,double b)
    {
        id=idd;
        b=balance;
        
    }
    public void set_id(int d)
    {
        id=d;
    }
    public void set_balance(double b)
    {
        balance=b;
    }
    public void set_annualintersetrate(double a)
    {
        annualintersetrate=a;
    }
    public int get_id()
    {
        return id;
    }
      public double get_balance()
    {
        return balance;
    }
    public double get_annualintersetrate()
    {
        return annualintersetrate;
    }
    public double getMontlyintersetrate()
    {
        return annualintersetrate;
    }
    public void get_Datacreated()
    {
        SimpleDateFormat formatter=new SimpleDateFormat("dd//MM//yyyy HH:mm:ss"); 
        System.out.println(formatter.format(datacreated));
    }
    public double getMonthlyIntersetRate()
    {
        return annualintersetrate/12;
    }
    public void withdraw(double withdraw)
    {
        balance-=withdraw;
    }
    public void deposit(double deposit)
    {
        balance+=deposit;
    }
    
    
    
    }
