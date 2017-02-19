package Module08.Homeworke;

/**
 * Created by user on 19.02.2017.
 */
public abstract class AbstractEntity {

    private  long id ;

    public AbstractEntity(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
