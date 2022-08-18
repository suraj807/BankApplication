package com.bankapp;

import java.util.Scanner;
import static java.lang.System.*;
import com.bankapp.Controller.bankController;
import com.bankapp.model.bankModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*System.out.println( "Hello World!" );
        bankController bc=new bankController();
        bankModel bm =new bankModel();
        Scanner scan=new Scanner(System.in);
        out.println("------------Anudip Bank---------------");
        out.println("Enter account Holder Name");
        String accHolderName=scan.next();
         bm.setAccHolderName(accHolderName);
         
         out.println("Enter minimum balance");
         int accBalance=scan.nextInt();
         bm.setAccBalance(accBalance);
         
         out.println("Enter your account number");
         int accNumber=scan.nextInt();
         bm.setAccNumber(accNumber);
         
         out.println("Enter password your accunt");
         String accPassword=scan.next();
         bm.setAccpassword(accPassword);
         
        out.println("***********your deatils***********");
        out.println(bm.toString());
        
        
        //out.println("Account holder name :" +bm.getAccHolderName());
      //  out.println(""+ bm.getAccBalance());
      //  out.println(""+bm.getAccpassword());
       // out.println(""+bm.getAccNumber());
        
         scan.close();*/
    	 bankController bc=new bankController();//controller object to validate the data
         bankModel bm = new bankModel();//model object to pass the data
         Scanner scan=new Scanner(System.in);
         out.println("\t\t\t------welcome to Anudip Bank------");
         out.println("Enter account Holder Name");
         String accHolderName=scan.next();
         bm.setAccHolderName(accHolderName);
         try
         {
         	//validating username
         	if(bc.checkUsername(bm))
         	{
         		  out.println("Enter Password for your account ");
         	        String accPassword=scan.next();
         	        bm.setAccpassword(accPassword);
         	        try {
         	        	//validating password
         	        		if(bc.checkPassword(bm))
         	        		{
         	        			out.println("Enter account number ");
         	        	        int accNumber = scan.nextInt();
         	        	        bm.setAccNumber(accNumber);
         	        	        out.println("Enter Minimum balance");
         	        	        int accBalance=scan.nextInt();
         	        	        bm.setAccBalance(accBalance);
         	        	        out.println("------your details------");
         	                    out.println(bm.toString());
         	                    //performing baking operations
         	                   int op=0;
         	                    while(op<3)
         	                    {
         	                    out.println("Select Operation \n Press 1 for Deposit \n Press 2 for Withdraw \n Press 3 for details \\n Press 4 for exist");
         	                   op=scan.nextInt();
         	                    switch(op) {
         	                    //deposit method
         	                    case 1->
         	                    {
         	                    	out.println("Enter password to deposit");
         	                    	String pwd=scan.next();
         	                    	try {
         	                    		if(bc.toDeposit(bm, pwd)) 
         	                    		{
         	                    		out.println("Enter amount to deposit");
         	                    		int newAmt=scan.nextInt();
         	                    		bm.depositAmount(newAmt);
         	                    		out.println("your account balance is :"+bm.getAccBalance());	
         	                    		}
         	                    	}
         	                    	catch(Exception e)
         	                    	{
         	                    		out.println(e.getMessage());
         	                    	}
         	                    	
         	                    }
         	                    //withdraw method
         	                    case 2->
         	                    
         	                    {
         	                    	out.println("Enter password to withdraw");
         	                    	String pwd=scan.next();
         	                    	out.println("Enter amount to withdraw");
     	                    		int newAmt=scan.nextInt();
     	                    		try {
     	                    			if(bc.toWithdraw(bm, pwd, newAmt)) {
     	                    				bm.withdrawAmount(newAmt);
     	                    				out.println("Withdraw successfull \nyour account balance is : "+bm.getAccBalance());
     	                    			}
     	                    		}
     	                    		catch(Exception e) {
     	                    			out.println(e.getMessage());
     	                    		}
         	                    }
         	                    case 3->
         	                    {
         	                    	out.println("***********your deatils***********");
         	                       out.println(bm.toString());
         	                    }
         	                    	default->System.exit(0);
         	                    
         	                    }
         	                    }
         	        		}
         	        }
         	        catch(Exception e) {
         	        	out.println(e.getMessage());
         	        }
         	}
         }
         catch(Exception e)
         {
         	out.println(e.getMessage());
         	System.exit(0);
         }
         
         
         
         scan.close();
       
    }
}
