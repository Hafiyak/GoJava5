package Module08;

import java.util.List;

/**
 * Created by user on 31.03.2017.
 */
public interface AbstractDAO<T> {
    T save(T t);
    void delete(T t);
    void deleteAll(List <T> tList);
    void saveAll(List <? extends T> tList);
    List <? extends T> getList();
    void deleteById(long id);
    T get(long id);
}
