package ss09_DSA.bai_tap.BT_Them02.repository;

import ss09_DSA.bai_tap.BT_Them02.models.Motorbike;

import java.util.List;

public interface IMotorBikeRepository {
    void addNewMotorBike(Motorbike motorbike);

    List<Motorbike> findAll();

    void removeMotorBike(int index);

    String findMotoBike(String indexBKS);

    int getIndexMotorBike(String indexBKS);

    boolean checkValidMotorBike(String indexBKS);
}
