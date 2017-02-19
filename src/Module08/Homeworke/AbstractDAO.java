package Module08.Homeworke;

/**
 * Created by user on 19.02.2017.
 */
import java.util.List;

public interface AbstractDAO<T extends AbstractEntity> {
    T save(T t);
    void delete(T t);
    void deleteAll(List <? extends T> tList);
    void saveAll(List <? extends T> tList);
    List <? extends T> getList();
    void deleteById(long id);
    T get(long id);
}