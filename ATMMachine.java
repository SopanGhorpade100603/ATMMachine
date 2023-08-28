import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
class ATM{
    int PIN=0;
    Float Balance=10000f;

    public void createPin(){
        System.out.println("Create a pin.");
        Scanner ss = new Scanner(System.in);
        PIN = ss.nextInt();
    }
    void CheckPin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome! To ATM");
        System.out.println("Enter Your PIN here!");
        int EnteredPin=sc.nextInt();
        if(EnteredPin==PIN){
            menu();
        }
        else{
            System.out.println("PlEASE enter valid PIN");
        }
        }public void menu(){
            System.out.println("Select your choice!");
        System.out.println("1.Checked A/C Balance");
        System.out.println("2.Deposit Amount");
        System.out.println("3.withdraw Amount");
        System.out.println("4.Exist");

        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            CheckBalanced();
        }
        else if(choice==2){
            DepositMoney();
        }
        else if(choice==3){
            WithdrawMoney();
        }else{
            System.out.println("Thank you for visit");
        }
      }
         public void CheckBalanced(){
             System.out.println("Balance: "+Balance);

             menu();
         }
         public void WithdrawMoney() {
             System.out.println("Enter you want to Withdraw Money amount");
             Scanner sc = new Scanner(System.in);
             float amount = sc.nextFloat();
             if (amount > Balance) {
                 System.out.println("Insufficient Balance");
             } else {
                 Balance = Balance - amount;
                 System.out.println("Remening Balance "+Balance);
             }
             menu();
         }
         public void DepositMoney(){
                 System.out.println("enter you want to Deposit amount");
                 Scanner sc=new Scanner(System.in);
                 float amount=sc.nextFloat();
                 Balance=Balance+amount;
             System.out.println("Deposit Money Successfully"+"Total Balance: "+Balance);
             menu();
             }

         }


public class ATMMachine {
    public static void main(String[] args) {
        ATM at = new ATM();
        at.createPin();
        at.CheckPin();
    }
}
