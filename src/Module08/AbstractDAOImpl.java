package Module08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31.03.2017.
 */
public abstract class  AbstractDAOImpl<T extends AbstractEntity> implements AbstractDAO<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void deleteById(long id) {
        list.removeIf(t -> t.getId() == id);
    }

    @Override
    public T get(long id) {
        if (list.stream().anyMatch(t -> t.getId() == id)) {
            return list.stream().filter(t -> t.getId() == id).findFirst().get();
        } else {
            return null;
        }
    }

    @Override
    public void delete(T t) {
        list.remove(t);
    }

    @Override
    public void deleteAll(List<T> tList) {
        list.removeAll(tList);
    }

    @Override
    public void saveAll(List<? extends T> tList) {
        list.addAll(tList);
    }

    @Override
    public List<? extends T> getList() {
        return this.list;
    }
}
