package Module04;

/**
 * Created by user on 04.12.2016.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.EUR) {
            return 150;
        } else if (this.getCurrency() == Currency.USD) {
            return 100;
        } else {
            return -1;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) {
            return 5000;
        } else if (this.getCurrency() == Currency.USD) {
            return 10000;
        } else {
            return -1;
        }
    }

    @Override
    int getMonthlyRate() {
        if (this.getCurrency() == Currency.EUR) {
            return 1;
        } else if (this.getCurrency() == Currency.USD) {
            return 0;
        } else {
            return -1;
        }
    }


    @Override
        int getCommission (int summ) {
            if (this.getCurrency() == Currency.EUR) {
                if (summ <= 1000) {
                    return 10;

                } else if (this.getCurrency() == Currency.USD) {
                    return 3;
                } else {
                    return -1;
                }
            }
            return 0;
        }


}

