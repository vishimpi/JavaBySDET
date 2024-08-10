package day12EncapAndpolymorph;

public class AccountMain 
{
public static void main(String[] args) 
{
	  Account ac = new Account();
//	  ac.amount= 2000;
//	  System.out.println(ac.amount);
	  ac.setAmount(20000);
	  System.out.println(ac.getAmount());
	  ac.setName("Vivek");
	  System.out.println(ac.getName());
}

}
