package Codesoft;

import java.util.Scanner;

class Account
{
    private double balance;
    public int accNumber;
    private int count=12300001;
    public Account(double initialAmount){
        accNumber=count;
        count++;
        balance=initialAmount;
    }
    public double getBalance(){
        return balance;
    }
    public void depositBalance(double amount){
        balance+=amount;
    }
    public  void withdrawBalance(double amount){
        balance-=amount;
    }

    public int getAccNumber() {
        return accNumber;
    }


}
class Atm
{
    Account acc;
    public Atm(Account account){
        acc=account;
    }
    public void displayMenu(){
        System.out.println("Welcome to ATM");
        System.out.println("Press 1 for Check balance");
        System.out.println("Press 2 for Deposit Money");
        System.out.println("Press 3 for Withdraw Money");
        System.out.println("press 4 for Exit");

    }
    public void deposit(double amount){
        if(amount>0){
            acc.depositBalance(amount);
            System.out.println("your amount will deposited"+"\n"+"your updated balance will be ₹"+acc.getBalance()+"\n");
        }else {
            System.out.println("! invalid amount"+"\n");
        }

    }

    public  void withdraw(double amount){
       if(amount<=acc.getBalance() && amount>0){
           acc.withdrawBalance(amount);
           System.out.println("your updated balance will be ₹"+acc.getBalance()+"\n");
       }else {
           System.out.println("! invalid amount or insufficient balance"+"\n");
       }
    }

    public void checkBalance(){
        System.out.println("your balance will be ₹"+acc.getBalance()+"\n");
    }



}

public class Atmmachine
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account acc=new Account(1000);
        Atm atm=new Atm(acc);
        boolean flag=false;

        while (!flag){

            atm.displayMenu();

            int choice=sc.nextInt();

            switch (choice){
             case 1:
                 System.out.println("Account Number="+acc.accNumber);
                 atm.checkBalance();
             break;
             case 2:
                 System.out.println("Enter amount");
                 atm.deposit(sc.nextDouble());
             break;
             case 3:
                 System.out.println("Enter amount");
                 atm.withdraw(sc.nextDouble());
             break;
             case 4:
                 System.out.println("Thank you Please visit again");
                 flag=true;
                 break;
             default:
                 System.out.println("invalid input"+"Please try again"+"\n");
         }

        }



    }

}
