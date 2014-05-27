public class MonetaryAccount {
  private int AccountNumber;
  private double Balance;
  private String userName;


public MonetaryAccount(int AccountNumber, double Balance, String NameOwner) {
        this.AccountNumber = AccountNumber;
        this.Balance = 0;
        this.userName = name;
    }           // конструктор

    
public void deposit(double money) {
     
   balance = balance + money;
    
     }

  //добавить деньги
  


  
public void withdraw(int money) {
      
  balance = balance - money;
   
     }   // снять деньги
  



public double getBalance() {
        return Balance;
    }       // получить остаток счета


public int Check(MonetaryAccount es) {
     return Balance.equals(es.Balance);
        
    }  // проверить остаток


    public MonetaryAccount createNewAccount(int AccountNumber, double Balance, String userName) {
        return new MonetaryAccount(AccountNumber, this.Balance, userName);
    }  // Открыть влдельцу новый счет с переносом всего остатка с другого его счета

}