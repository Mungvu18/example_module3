package service;

import java.util.List;

public interface IGeneralService<T>{
    List<T> fillAll();
    boolean save(T t);
    boolean update(T t, int id);
    boolean delete(int id);
    T findById(int id);
    List<T> findByName(String name);
}
