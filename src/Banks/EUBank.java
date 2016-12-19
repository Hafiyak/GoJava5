package Banks;

/**
 * Created by user on 01.12.2016.
 */
public class  EUBank extends Bank {


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.EUR) {
            return 2200;
        } else if (this.getCurrency() == Currency.USD) {
            return 2000;
        } else {
            return -1;
        }
    }

    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) {
            return 20000;
        } else if (this.getCurrency() == Currency.USD) {
            return 10000;
        } else {
            return -1;
        }
    }

    int getMonthlyRate() {
        if (this.getCurrency() == Currency.EUR) {
            return 1;
        } else if (this.getCurrency() == Currency.USD) {
            return 0;
        } else {
            return -1;
        }
    }

    int getCommission(int summ) {
        if (this.getCurrency() == Currency.EUR) {
            return 2/100;
        } else if (this.getCurrency() == Currency.USD) {
            return 5/100;
        } else {
            return -1;
        }
    }


    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
