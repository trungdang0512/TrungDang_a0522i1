package repository;

import model.BenhAn;

import java.sql.SQLException;
import java.util.List;

public interface IBenhAnRepository {
    List<BenhAn> findAll();
    boolean deleteBenhAn(String id) throws SQLException;
    boolean updateBenhAn(BenhAn benhAn);
    BenhAn selectBenhAn(String id);
}
