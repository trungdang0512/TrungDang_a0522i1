package repository;

import model.Room;

import java.sql.SQLException;
import java.util.List;

public interface IRoomRepository {
    void insert(Room room);
    Room selectRoom(int id);
    List<Room>findAll();
    boolean delete(int id) throws SQLException;
    List<Room> search(String searchName);
    List<Room> searchPhone(int searchNumberPhone);
    List<Room> searchID(String idPayment_room);
}
