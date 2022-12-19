package repository.impl;

import model.Room;
import repository.IPaymentRepository;
import repository.IRoomRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomRepositoryImpl implements IRoomRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private IPaymentRepository paymentRepository = new PaymentRepositoryImpl();

    private final String SELECT = "select * from Room;";
    private final String INSERT = "insert into Room(room_id,customer_name,sdt,ngayBatDau,idPayMent,note) VALUE (?,?,?,?,?,?);";
    private final String SELECT_BY_ID = "select * from Room r inner join Payment p on p.idPayMent = r.idPayMent where r.id = ?;";
    private final String DELETE = "delete from room where room_id = ?;";
    private static final String SEARCH = "select*from Room where customer_name like ?;";
    private static final String SEARCHSDT = "select*from Room where sdt like ?;";
    private static final String SEARCHID= "select*from Room where room_id like ?";



    @Override
    public void insert(Room room) {
        try (Connection connection = this.baseRepository.getConnectionJavaToDB();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT)){
            preparedStatement.setInt(1, room.getId());
            preparedStatement.setString(2,room.getName());
            preparedStatement.setInt(3,room.getPhone());
            preparedStatement.setString(4,room.getDate());
            preparedStatement.setInt(5,room.getIdPayment_room());
            preparedStatement.setString(6, room.getNote());
            preparedStatement.executeUpdate();
            } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Room selectRoom(int id) {
        Room room = null;
        try (Connection connection = this.baseRepository.getConnectionJavaToDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)){
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idRoom = id;
                String name = resultSet.getString("customer_name");
                int sdt = resultSet.getInt("sdt");
                String date = resultSet.getString("ngayBatDau");
                int idPayment = resultSet.getInt("idPayMent");
                String note = resultSet.getString("note");
                room = new Room(idRoom, name, sdt,date,idPayment,note);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return room;
    }

    @Override
    public List<Room> findAll() {
        List<Room> rooms = new ArrayList<>();
        try (Connection connection = this.baseRepository.getConnectionJavaToDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT)){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("room_id");
                String name = resultSet.getString("customer_name");
                int phone = resultSet.getInt("sdt");
                String date = resultSet.getString("ngayBatDau");
                int idpayment = resultSet.getInt("idPayMent");
                String note = resultSet.getString("note");
                rooms.add(new Room(id,name,phone,date,idpayment,note));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return rooms;
    }

    @Override
    public boolean delete(int idRoom) throws SQLException {
        boolean rowDelete;
        try (Connection connection = this.baseRepository.getConnectionJavaToDB();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)){
                preparedStatement.setInt(1, idRoom);
                rowDelete = preparedStatement.executeUpdate()>0;
            }

        return rowDelete;
    }

    @Override
    public List<Room> search(String searchName) {
        List<Room> rooms = new ArrayList<>();
        Connection connection = this.baseRepository.getConnectionJavaToDB();
        try {
            PreparedStatement preparedStatement =connection.prepareStatement(SEARCH);
            preparedStatement.setString(1, "%"+ searchName +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("room_id");
                String name = resultSet.getString("customer_name");
                int sdt = resultSet.getInt("sdt");
                String ngaybatdau = resultSet.getString("ngayBatDau");
                int idPayment = resultSet.getInt("idPayMent");
                String note = resultSet.getString("note");
                Room room = new Room(id,name,sdt,ngaybatdau,idPayment,note);
                rooms.add(room);
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return rooms;
    }
    public List<Room> searchPhone(int searchNumberPhone) {
        List<Room> rooms = new ArrayList<>();
        Connection connection = this.baseRepository.getConnectionJavaToDB();
        try {
            PreparedStatement preparedStatement =connection.prepareStatement(SEARCHSDT);
            preparedStatement.setInt(1, Integer.parseInt("%"+searchNumberPhone+"%"));
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("room_id");
                String name = resultSet.getString("customer_name");
                int sdt = resultSet.getInt("sdt");
                String ngaybatdau = resultSet.getString("ngayBatDau");
                int idPayment = resultSet.getInt("idPayMent");
                String note = resultSet.getString("note");
                Room room = new Room(id,name,sdt,ngaybatdau,idPayment,note);
                rooms.add(room);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return rooms;
    }
    public List<Room> searchID(String idPayment_room) {
        List<Room> rooms = new ArrayList<>();
        Connection connection = this.baseRepository.getConnectionJavaToDB();
        try {
            PreparedStatement preparedStatement =connection.prepareStatement(SEARCHID);
            preparedStatement.setString(1, "%"+idPayment_room+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("room_id");
                String name = resultSet.getString("customer_name");
                int sdt = resultSet.getInt("sdt");
                String ngaybatdau = resultSet.getString("ngayBatDau");
                int idPayment = resultSet.getInt("idPayMent");
                String note = resultSet.getString("note");
                Room room = new Room(id,name,sdt,ngaybatdau,idPayment,note);
                rooms.add(room);
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return rooms;
    }
}
