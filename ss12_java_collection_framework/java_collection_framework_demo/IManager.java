package ss12_java_collection_framework.java_collection_framework_demo;

import java.util.List;

public interface IManager<E> {
    void add(E e);
    List<E> list();
}
