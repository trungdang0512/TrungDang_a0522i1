package mvc.service;

import java.sql.SQLException;
import java.util.List;

public interface CRUDService<T> {
    void create(T t) throws Exception;
    void update(T t) throws Exception;
    void deleteById(String id) throws Exception;
    T findById(String id) throws SQLException, ClassNotFoundException;
    List<T> findAll() throws SQLException, ClassNotFoundException;
}
