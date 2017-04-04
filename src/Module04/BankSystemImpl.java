package Module04;

/**
 * Created by user on 04.04.2017.
 */
public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user ,int amount){
        int commission = user.getBank().getCommission(amount);
        double balance = user.getBalance();
        int limit  = user.getBank().getLimitOfWithdrawal();


        if(amount <= limit) {
            double commissionMoney = amount * 5 / 100;
            double total = balance - (amount + commissionMoney);
            if (total >= 0) {
                user.setBalance(total);
            }
        }

    }



    @Override
    public void fundUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfFunding()){
            user.setBalance(user.getBalance() + amount);
        }
    }





    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double balance = fromUser.balance;
        double balance1= toUser.balance;
        int limitOfFunding = toUser.getBank().getLimitOfFunding();
        int limitofwithdrawal = fromUser.getBank().getLimitOfWithdrawal();

        if(amount <= balance && amount <= limitofwithdrawal && amount <= limitOfFunding ){
            fromUser.setBalance(balance - amount);
            toUser.setBalance(balance1 + amount);

        }


    }

    @Override
    public void paySalary(User user){
        user.setBalance(user.getBalance() + user.getSalary());
    }
}

