


class ATM{
    int money;

      ATM(){
        money=0;
     }

    public  int withdraw(int amount){
            if(money==0){
                System.out.println("No money baby!!");
                return 0;
            }
            else if(money<amount){
                System.out.println("Unsufficient amount");
                return 0;
            }
            else{
                money-=amount;
                System.out.println("Withdraw Successfull");
               return amount;
            }

        }
        
        public void depoist(int money){
            this.money+=money;
        }

        public  void  balance(){
            if(money==0){
                System.out.println("No money baby!!");
            }
            else{
             System.out.println(money);
            }

        }


        public void displayMenu() {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
        }

}

class User extends ATM{
}

public class ATMUser {
    public static void main(String[] args) {
      User user1=new User();
      user1.depoist(1100);
     user1.balance();
     System.out.println(user1.withdraw(900));
     user1.balance();
    }
}