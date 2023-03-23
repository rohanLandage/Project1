import java.util.Scanner;

public class BankMain {

	
	String name;
	String acc_type;
	int acc_no;
	int balance;
	
	Scanner sc = new Scanner(System.in);
	
	//method to open Account
    public void openAccount() 
    {  
        System.out.println("Enter Account No: ");  
        acc_no = sc.nextInt();  
        System.out.println("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.println("Enter Name: ");  
        name = sc.next();  
        System.out.println("Enter Balance: ");  
        balance = sc.nextInt();  
    }

    public void accountHolder() {
    	System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + acc_no);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }

    public void withdraw() {
		// TODO Auto-generated method stub
       	int withdraw ;
       	  System.out.println("Enter the amount of withdraw"); 
       	withdraw = sc.nextInt();  
		System.out.println("User withdraw amount =");
		
		if(balance>=withdraw)
		{
			balance = balance-withdraw;
			System.out.println("withdrawl amt is ="+withdraw);
		}
		else
		{
			System.out.println("Insufficient fund");
		}
		System.out.println("Remaining balance is ="+balance);
		
	}
    
    public void deposit() {
		// TODO Auto-generated method stub
		int deposit;
		System.out.println("Enter the amount to deposit");
		deposit=sc.nextInt();
		
		System.out.println("the deposite amt of User1="+deposit);
	    balance=balance+deposit;
		System.out.println("The total balance of User1 is ="+balance);
		
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*****Simple Banking System *****");
		
		String s;
	      Scanner sc=new Scanner(System.in);
		   BankMain b = new  BankMain ();
		/*   b.openAccount();
		   b.accountHolder();
		   b.deposit();
		   b.withdraw();
		   */
		   System.out.println("1.Opening of Account ");
			 System.out.println("2.Show Account holder details");
			 System.out.println("3.Deposit  the cash");
			 System.out.println("4.Withdrawl the cash");
			 
			 do
		      {
		    	  System.out.println("Enter the choice -: ");
		    	  int choice=sc.nextInt();
		    	  switch(choice)
		    	  {
		    	  case 1:
		    		  b.openAccount();
		    		  break;
		    	
		    	  case 2:
		    		  System.out.println("The Account holders details are as follows ");
		    		 b.accountHolder();
		    		  break;
		    		  
		    	  case 3:
		    		b.deposit();
		    		  break;
		    		  
		    	  case 4:
		    		  b.withdraw();
		    		  break;
		    	  }
		    	 
		    	  System.out.println("do you want to continue");
		    	   s=sc.next();
		       }
			  while(s.equals("yes"));

		
		
			}

}
