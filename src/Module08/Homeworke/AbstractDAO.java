package Module08.Homeworke;

/**
 * Created by user on 19.02.2017.
 */
import java.util.List;

public interface AbstractDAO<T  extends  AbstractEntity> {


    T save(T t);
    void delete(T t );
    void deleteAll(List<? extends T> tlist );
    void saveAll(List<? extends T> tlist);
    List<? extends T> tlist();
    void daleteById(long id);
    T get(long id);

}
