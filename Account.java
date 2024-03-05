package HAq1;

public class Account {
    String name;
    String NIDNo;
    String accountNo;
    String openingDate;
    double balance=0;

    Account(String name, String NIDNo, String accountNo,  String openingDate){
        this.name=name;
        this.NIDNo=NIDNo;
        this.accountNo=accountNo;
        this.openingDate=openingDate;
    }
    void depositMoney(double amount){
        balance=balance+amount;
    }
    void withDrawMoney(double amount){
        if(amount>balance)
            return;
        else{
            balance=balance-amount;
        }

    }
    void check_balance(){
        System.out.println("Current Balance:"+balance);
        //optional//
        System.out.println("Holder Name:"+name);
        System.out.println("Account no:"+accountNo);
    }
}
class test1{
    public static void main(String[] args) {
        Account a1=new Account("Anne", "944554", "5480345", "10-2-21");
        a1.depositMoney(10000);
        a1.withDrawMoney(3000);
        a1.check_balance();
    }
}