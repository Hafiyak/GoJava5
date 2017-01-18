package Module04;

/**
 * Created by user on 04.12.2016.
 */
public class Main {


    public static void main(String[] args) {



        Bank bank1 = new ChinaBank(12,"China",Currency.USD,100,50,55,1000000);
        Bank bank2 = new ChinaBank(11,"Tokyo",Currency.EUR,100,900,60,1000000);
        Bank bank3 = new EUBank(14,"Brusel",Currency.EUR,150,1200,65,1000000);
        Bank bank4= new EUBank(15,"Berlin",Currency.USD,160,1350,70,1000000);
        Bank bank5 = new USBank(20,"California",Currency.USD,200,1500,75,1000000);
        Bank bank6 = new USBank(25,"Washington",Currency.EUR,250,1600,80,1000000);





        User user1 = new User(10,"Alex",10000.00,10,"Ubisoft",1000, bank1);
        User user2 = new User(11,"Vova",10000.00,10,"AAA",1000,bank2);
        User user3 = new User(12,"Misha",10000.00,10,"AAA",1000,bank3);
        User user4 = new User(13,"Oleh",10000.00,10,"AAA",1000,bank4);
        User user5 = new User(14,"Adriy",10000.00,10,"AAA",1000,bank5);
        User user6 = new User(15,"Sasha",10000.00,10,"AAA",1000,bank6);


        BankSystemImpl Implementation = new BankSystemImpl();
        User[] users = {user1,user2,user3,user4,user5,user6};

        for (User user : users){
            System.out.println(user.getName());
            System.out.println(user.toString());

            Implementation.withdrawOfUser(user, 0);
            Implementation.fundUser(user, 0);
            Implementation.paySalary(user );
            if (user != user2) {
                Implementation.transferMoney(user, user2, 100);
            } else {
                Implementation.transferMoney(user, user4, 0);
            }
            System.out.println();
            System.out.println(user.getName() + " balance properties after operations:");
            System.out.println(user.getBalance());
            System.out.println();
        }

        }
    }


