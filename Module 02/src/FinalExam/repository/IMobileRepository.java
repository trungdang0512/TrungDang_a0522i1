package FinalExam.repository;

import FinalExam.models.Mobile;

import java.util.List;

public interface IMobileRepository {
    void addMobile(Mobile mobile);

    List findAll();

    void removeMobile(int inputID);

    List findMobileByName(String inputName);

    List findMobileByID(int inputID);

    boolean checkMobileNameExist(String inputName);

    boolean checkMobileIDExist(int inputID);

    int findMobileIndex(Mobile mobile);

}
