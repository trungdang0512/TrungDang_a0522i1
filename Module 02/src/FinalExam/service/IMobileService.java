package FinalExam.service;

import FinalExam.models.Mobile;

public interface IMobileService {
    void addMobile();

    void displayList();

    void removeMobile();

    void searchMobile();

    void searchByID();

    void searchByName();

    Mobile getMobileInfoCH();

    Mobile getMobileInfoXT();
}
