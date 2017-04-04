package Module04;

/**
 * Created by user on 04.04.2017.
 */
public interface BankSystem {

    abstract void withdrawOfUser(User user, int amount);
    abstract void fundUser(User user, int amount);
    abstract void transferMoney(User fromUser, User toUser, int amount);
    abstract void paySalary(User user);
}
