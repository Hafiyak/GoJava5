package Module08.Homeworke;

/**
 * Created by user on 19.02.2017.
 */

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T extends  AbstractEntity> implements AbstractDAO<T> {
    private List<T> list = new ArrayList<T>();

    @Override
    public T save(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteAll(List<? extends T> tlist) {

    }

    @Override
    public void saveAll(List<? extends T> tlist) {

    }

    @Override
    public List<? extends T> tlist() {
        return null;
    }

    @Override
    public void daleteById(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }
}
