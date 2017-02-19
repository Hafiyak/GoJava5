package Module08.Homeworke;

/**
 * Created by user on 19.02.2017.
 */

import java.util.Iterator;

public class UserDAO<T extends AbstractEntity> extends AbstractDAOImpl<T> {


    @Override
    public void deleteById(long id) {
        Iterator iterator = getList().iterator();
        while (iterator.hasNext()) {
            T t =(T) iterator.next();
            if (t.getId() == id) {
                iterator.remove();
            }
        }
    }

    @Override
    public T get(long id) {
        for (T t : getList()) {
            if (t.getId() == id) {
                return t;
            }
        }

        return null;
    }
}