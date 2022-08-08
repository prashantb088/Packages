/*
	Program to create customer bank account and get customer details
	by Prashant Bansal
*/


package ps.prashant;

class customer {

    private String userName;
    private int accountNum,balance,amount;

    public void createAccount(String name,int num,int bal){
        userName = name;
        accountNum = num;
        balance = bal;
    }

    public void withdrawAmount(int amount){
        if(amount>balance){
            System.out.println("---------\nAccount Balance is not enough to Withdraw Amount.");
        }
        else{
            balance = amount;
            System.out.println("---------\n"+userName+" your current balance after withdrawing Rs."+amount+" is : "+balance);
        }
    }

    public void depositAmount(int amount){
        if(amount > -1){
            balance += amount;
            System.out.println("--------\nInvalid Amount.");
        }
    }

    public void checkAmount(){
        System.out.println("----------\n"+userName+" your current balance is : "+balance);
    }

    public void getDetail(){
        System.out.println("------Account Detail------");
        System.out.println("Account Holder NAME :"+userName);
        System.out.println("Account Number :"+accountNum);
        System.out.println("Account Balance: Rs." +balance+"/-");
    }
}
