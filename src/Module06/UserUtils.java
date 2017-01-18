package Module06;

/**
 * Created by user on 18.01.2017.
 */
public class UserUtils {

    static  User[] uniqueUsers(User[] users){
        for (int i = 0; i < users.length-1; i++) {
            for (int j = 1; j < users.length; j++) {
                if (users[i].equals(users[j])) users[j] = null;
            }
        }
        return deleteEmptyUsers(users);
    }
    //users are equal when all their field are equal
     static  User[] usersWithContitionalBalance(User[] users, int balance){
         int count = 0;
         for (User us : users) {
             if (us.getBalance() == balance) count++;
         }
         User[] res = new User[count];
         int index = 0;
         for (User us : users){
             if (us.getBalance() == balance){
                 res[index] = us;
                 index++;
             }
         }
         return res;
     }
    //user’s balance == balance

     static  User[] paySalaryToUsers(User[] users){
         for (User us : users) {
             us.setBalance(us.getBalance() + us.getSalary());
         }
    }
     static  long[] getUsersId(User[] users){
         long[] res = new long[users.length];
         int index = 0;
         for (User user : users){
             res[index] = user.getId();
             index++;
         }
         return res;

     }

    static  User[] deleteEmptyUsers(User[] users){
        int quantityOfEmptyUs = 0;
        for (User user : users){
            if (user == null) quantityOfEmptyUs++;
        }
        User[] res = new User[users.length-quantityOfEmptyUs];
        int index = 0;
        for (User user : users){
            if(user != null){
                res[index] = user;
                index++;
            }
        }
        return res;

    }

}
