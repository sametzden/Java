public class BankAccount {
    private String ownerName;
    private double balance;


    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String name){
        ownerName = name;
    }

    public double getBalance(){
        return balance;
    }


    public void deposit(double amount){
        //bakiyeyi arttır 
        balance += amount;
    }

    public void withdraw(double amount){
        //yeterli para varsa ceker
        if(balance>amount){
            balance -=amount;
            System.out.println("para çekildi");
        }
        else {
            System.out.println("yeterli para yok");
        }
    }
}
