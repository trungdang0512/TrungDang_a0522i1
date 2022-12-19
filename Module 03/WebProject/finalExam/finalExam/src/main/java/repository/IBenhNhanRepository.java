package repository;

import model.BenhNhan;

import java.util.List;

public interface IBenhNhanRepository {
    List<BenhNhan> findAll();

    BenhNhan findById(String id);
    boolean updateBenhNhan(BenhNhan benhNhan);
}
