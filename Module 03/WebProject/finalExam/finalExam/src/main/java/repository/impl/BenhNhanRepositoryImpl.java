package repository.impl;

import model.BenhNhan;
import repository.BaseRepository;
import repository.IBenhNhanRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepositoryImpl implements IBenhNhanRepository {
    private final String SELECT_FROM_BENHNHAN = "select * from benh_nhan";
    private final String UPDATE_BN = "update benh_nhan set id=?, name=? where id=?;";
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<BenhNhan> findAll() {
        List<BenhNhan> benhNhans = new ArrayList<>();
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_BENHNHAN);
            ResultSet resultSet = preparedStatement.executeQuery();
            BenhNhan benhNhan;
            while (resultSet.next()){
                benhNhan = new BenhNhan();
                benhNhan.setId(resultSet.getString("id"));
                benhNhan.setName(resultSet.getString("name"));
                benhNhans.add(benhNhan);
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return benhNhans;
    }

    @Override
    public BenhNhan findById(String id) {
        return null;
    }

    @Override
    public boolean updateBenhNhan(BenhNhan benhNhan) {
        boolean rowUpdate;
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BN);
            preparedStatement.setString(1, benhNhan.getId());
            preparedStatement.setString(2, benhNhan.getName());
            preparedStatement.setString(3, benhNhan.getId());
            rowUpdate = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdate;
    }
}
