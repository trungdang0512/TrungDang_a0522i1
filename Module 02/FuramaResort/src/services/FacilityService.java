package services;

import models.Facility.Facility;


public interface FacilityService extends Service{
    void displayAll();

    void addNewVilla();

    void addNewHouse();

    void addNewRoom();

    void displayMaintainedFacility();

    Facility findFacility(int inputID);

    Facility getVillaInfo();

    Facility getHouseInfo();

    Facility getRoomInfo();
}
