package ss09_DSA.bai_tap.BT_Them02.services;

import ss09_DSA.bai_tap.BT_Them02.models.Motorbike;

public interface IMotorBikeService {
    void addNewMotorBike();

    void displayMotorBikeList();

    void removeMotorBike(String indexBKS);

    String findMotorBike(String indexBKS);

    boolean checkValidMotorBike(String indexBKS);

    Motorbike inputMotorBikeInfo();

    String findBKS(String inputBKS);
}
