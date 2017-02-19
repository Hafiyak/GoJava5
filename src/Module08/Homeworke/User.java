package Module08.Homeworke;

/**
 * Created by user on 19.02.2017.
 */

public class User extends AbstractEntity{

    private String name;

    public User(long id, String name) {
        super(id);
        this.name = name;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                "id='" + getId() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}