package lesson15;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new LinkedList<>();
        for (Integer item : a) {
            if (b.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>(a); // Создаем множество из первой коллекции
        result.addAll(b); // Добавляем все элементы второй коллекции (дубликаты автоматически удаляются)
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();
        for (Integer item : a) {
            if (b.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> result = new ArrayList<>();
        for (Integer item : a) {
            if (!b.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
