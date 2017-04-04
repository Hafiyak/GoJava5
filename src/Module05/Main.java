package Module05;

import java.util.Arrays;

/**
 * Created by user on 21.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Room[] result;
        System.out.println("Search room:");
        Controller control = new Controller();
        result = control.requstRooms(15, 1, "Uzghorod", "Kilikia");
        System.out.println(Arrays.toString(result));
        result = control.requstRooms(65, 2, "Lviv", "Lviv");
        System.out.println(Arrays.toString(result));
        result = control.requstRooms(600, 3, "Odessa", "Mama");
        System.out.println(Arrays.toString(result));


        System.out.println("Check similar rooms in different apies:");
        API[] apiArray = control.getApis();
        result = control.check(apiArray[0], apiArray[0]);
        System.out.println(Arrays.toString(result));
        result = control.check(apiArray[1], apiArray[1]);
        System.out.println(Arrays.toString(result));
        result = control.check(apiArray[2], apiArray[2]);
        System.out.println(Arrays.toString(result));

        System.out.println("Processing with DB:");
        Room room;


        Room room1 = new Room(1001,15,1,2017,05,05,"Kilikia","Uzghorod");
         control.getDataBase().getAll();
        System.out.println(Arrays.toString(result));
        //control.findById(1001);
        control.save(room1);
        System.out.println(room1);
        control.delete(room1);
        System.out.println(room1);
        control.update(room1);
        System.out.println(room1);





    }
}
