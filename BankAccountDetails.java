import java.util.*;

class Bank_Account{
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	int accountNo;
	String userName;
	String accountType;
	String email;
	double accountBalance;
    
    public void getAccountDetails(){
    	System.out.print("Enter account number : ");
    	accountNo = sc.nextInt();
    	sc.nextLine();
    	System.out.print("Enter your name : ");
    	userName = sc.nextLine();
    	System.out.print("Enter account type : ");
    	accountType = sc.nextLine();
    	System.out.print("Enter your email : ");
    	email = sc.nextLine();
    }

    public void printAccountDetails(){
    	System.out.println("Your account number is : "+accountNo);
    	System.out.println("Your User Name is : "+userName);
    	System.out.println("Your account type is : "+accountType);
    	System.out.println("Your email is : "+email);
    	int rand_int1 = rand.nextInt(100000);
    	System.out.println("Your Bank Account balance is : "+rand_int1);
    }
}


public class BankAccountDetails{
	public static void main(String[] args) {
       	Bank_Account b1 = new Bank_Account();
       	b1.getAccountDetails();
       	b1.printAccountDetails();	
	}
}