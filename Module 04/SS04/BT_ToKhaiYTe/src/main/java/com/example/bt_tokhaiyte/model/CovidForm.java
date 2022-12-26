package com.example.bt_tokhaiyte.model;

public class CovidForm {
    private String name;
    private int birthDate;
    private String gender;
    private String nationality;
    private String id;
    private String vehicle;
    private String vehicleId;
    private int vehicleChair;
    private String departDate;
    private String arriveDate;
    private String cityArrived;
    private String city;
    private String district;
    private String ward;
    private String address;
    private String phoneNumber;
    private String email;
    private String symptom;
    private String exposureNo1;
    private String exposureNo2;

    public CovidForm() {
    }

    public CovidForm(String name, int birthDate, String gender, String nationality, String id, String vehicle, String vehicleId, int vehicleChair, String departDate, String arriveDate, String cityArrived, String city, String district, String ward, String address, String phoneNumber, String email, String symptom, String exposureNo1, String exposureNo2) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.nationality = nationality;
        this.id = id;
        this.vehicle = vehicle;
        this.vehicleId = vehicleId;
        this.vehicleChair = vehicleChair;
        this.departDate = departDate;
        this.arriveDate = arriveDate;
        this.cityArrived = cityArrived;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.symptom = symptom;
        this.exposureNo1 = exposureNo1;
        this.exposureNo2 = exposureNo2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getVehicleChair() {
        return vehicleChair;
    }

    public void setVehicleChair(int vehicleChair) {
        this.vehicleChair = vehicleChair;
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getCityArrived() {
        return cityArrived;
    }

    public void setCityArrived(String cityArrived) {
        this.cityArrived = cityArrived;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getExposureNo1() {
        return exposureNo1;
    }

    public void setExposureNo1(String exposureNo1) {
        this.exposureNo1 = exposureNo1;
    }

    public String getExposureNo2() {
        return exposureNo2;
    }

    public void setExposureNo2(String exposureNo2) {
        this.exposureNo2 = exposureNo2;
    }
}
