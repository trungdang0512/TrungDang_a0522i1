package repository.impl;

import model.BenhAn;
import model.BenhNhan;
import repository.BaseRepository;
import repository.IBenhAnRepository;
import repository.IBenhNhanRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepositoryImpl implements IBenhAnRepository {
    private final String SELECT_FROM_BENHAN = "select * from benh_an ba inner join benh_nhan bn on ba.idbenh_nhan = bn.id ORDER BY ba.idbenh_an;";
    private final String SELECT_BY_ID ="select * from benh_an ba inner join benh_nhan bn on ba.idbenh_nhan = bn.id where ba.idbenh_an = ?;";
    private final  String UPDATE ="update benh_an set ngaynhapvien = ?, ngayravien = ?, lydo =? where idbenh_an = ?";
    private final String DELETE = "delete from benh_an where idbenh_an=?;";
    static List<BenhAn> benhAnList = new ArrayList<>();
    private BaseRepository baseRepository = new BaseRepository();
    private IBenhNhanRepository benhNhanRepository = new BenhNhanRepositoryImpl();
    @Override
    public List<BenhAn> findAll() {
        List<BenhAn> benhAn = new ArrayList<>();
        try{
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_BENHAN);
            ResultSet resultSet = preparedStatement.executeQuery();
            BenhAn benhAnNew;
            while (resultSet.next()){
                benhAnNew = new BenhAn();
                benhAnNew.setId(resultSet.getString("idbenh_an"));
                String idBN = resultSet.getString("idbenh_nhan");
                benhAnNew.setBenhNhan(new BenhNhan(idBN, resultSet.getString("name")));
                benhAnNew.setNgayNhapVien(resultSet.getString("ngaynhapvien"));
                benhAnNew.setNgayXuatVien(resultSet.getString("ngayravien"));
                benhAnNew.setLydo(resultSet.getString("lydo"));
                benhAn.add(benhAnNew);
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return benhAn;
    }

    @Override
    public boolean deleteBenhAn(String id) throws SQLException{
        boolean rowDelelte;
        try (Connection connection = this.baseRepository.getConnectionJavaToDB();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)){

            preparedStatement.setString(1, id);
            rowDelelte = preparedStatement.executeUpdate()>0;
        }
        return rowDelelte;
    }

    @Override
    public boolean updateBenhAn(BenhAn benhAn) {
        boolean rowUpdate;
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, benhAn.getNgayNhapVien());
            preparedStatement.setString(2, benhAn.getNgayXuatVien());
            preparedStatement.setString(3, benhAn.getLydo());
            preparedStatement.setString(4, benhAn.getId());
            rowUpdate = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdate;
    }

    @Override
    public BenhAn selectBenhAn(String id) {
        BenhAn benhAn = null;
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                benhAn = new BenhAn();
                benhAn.setId(resultSet.getString("idbenh_an"));
                String idBN = resultSet.getString("idbenh_nhan");
                benhAn.setBenhNhan(new BenhNhan(idBN, resultSet.getString("name")));
                benhAn.setNgayNhapVien(resultSet.getString("ngaynhapvien"));
                benhAn.setNgayXuatVien(resultSet.getString("ngayravien"));
                benhAn.setLydo(resultSet.getString("lydo"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return benhAn;
    }
}
