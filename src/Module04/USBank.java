package Module04;

/**
 * Created by user on 04.04.2017.
 */
public class USBank extends Bank {



    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }




    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.EUR) {
            return 1200;
        } else if (this.getCurrency() == Currency.USD) {
            return 1000;
        } else {
            return -1;
        }
    }
    @Override
    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) {
            return 10000;
        } else if (this.getCurrency() == Currency.USD) {
            return 0;
        } else {
            return -1;
        }
    }
    @Override
    int getMonthlyRate() {
        if (this.getCurrency() == Currency.EUR) {
            return 1/100;
        } else if (this.getCurrency() == Currency.USD) {
            return 2/100;
        } else {
            return -1;
        }
    }
    @Override
    int getCommission(int summ) {
        if (this.getCurrency() == Currency.EUR) {
            return 6/100;
        } else if ( this.getCurrency() == Currency.USD ) {
            return 5/100 ;
        } else {
            return -1;
        }
    }
    @Override
    double moneyPaidMonthlyForSalary() {
        if (this.getCurrency() == Currency.EUR) {
            return 1000;
        } else if (this.getCurrency() == Currency.USD) {
            return 5000;
        } else {
            return -1;
        }
    }
}
