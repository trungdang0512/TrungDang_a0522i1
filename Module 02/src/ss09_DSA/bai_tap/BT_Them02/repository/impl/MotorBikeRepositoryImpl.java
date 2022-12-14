package ss09_DSA.bai_tap.BT_Them02.repository.impl;

import ss09_DSA.bai_tap.BT_Them02.models.Motorbike;
import ss09_DSA.bai_tap.BT_Them02.repository.IMotorBikeRepository;

import java.util.ArrayList;
import java.util.List;

public class MotorBikeRepositoryImpl implements IMotorBikeRepository {

    private static List<Motorbike> motorbikeList = new ArrayList<>();

    @Override
    public void addNewMotorBike(Motorbike motorbike) {
        motorbikeList.add(motorbike);
    }

    @Override
    public List<Motorbike> findAll() {
        return motorbikeList;
    }

    @Override
    public void removeMotorBike(int index) {
        motorbikeList.remove(index);
    }

    @Override
    public String findMotoBike(String indexBKS) {
        return motorbikeList.get(getIndexMotorBike(indexBKS)).toString();
    }

    @Override
    public int getIndexMotorBike(String indexBKS) {
        Motorbike motorbike =new Motorbike(indexBKS);
        return motorbikeList.indexOf(motorbike);
    }

    @Override
    public boolean checkValidMotorBike(String indexBKS) {
        Motorbike motorbike = new Motorbike(indexBKS);
        return motorbikeList.contains(motorbike);
    }
}
