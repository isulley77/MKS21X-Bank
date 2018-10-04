public class BankAccount{
 
 private double balance;
 private int accountID;
 private String password;
 
public static void main(String[] args){
    BankAccount ba = new BankAccount(60001, 500000, "hello");
    }
 
 public BankAccount(int IDnum, double money, String pass){
 
    accountID = IDnum;
    balance = money;
    password = pass;
 
    
 }
 
 
 public String toString(){
 
return "getAccountID()\tgetBalance()";
 
 }
 
 
 public int getAccountID(){
 
    return accountID;
 
 }
 
 public double getBalance(){
 
    return balance;
 
 }
 
 public void setPassword(String newPass){
 
    password = newPass;

 }
 

public boolean deposit(double amount){

    if(amount > 0){
        balance += amount;
        return true;
    }
    else{
        return false;
    }

}

public boolean withdraw(double amount){
    if(balance - amount > 0){
        balance -= amount;
        return true;
    }
    else{
        return false;
    }

}

} 
