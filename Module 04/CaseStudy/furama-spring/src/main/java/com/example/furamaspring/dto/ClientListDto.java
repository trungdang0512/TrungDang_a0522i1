package com.example.furamaspring.dto;

import com.example.furamaspring.model.ClientType;
import com.example.furamaspring.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ClientListDto {
    @Autowired
    private IClientRepository clientRepository;

    private Long id;

    @NotEmpty(message = "Không được để trống")
    private String name;

    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^(([1][9]([2-9][3-9]|[3-9][0-9]))|([2][0]{2}[0-4]+))[-|/]\\d{2}[-|/]\\d{2}$",message = "ngày sinh phải >= 18 tuổi ")
    private String dateOfBirth;
    @NotEmpty(message = "Không được để trống")

    private String gender;
    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "[0-9]{9}",message = "Số chứng minh phải có 9 chữ số")
    private String idNumber;
    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "(090|091|([(]84[)])\\+90|([(]84[)])\\+91)+[0-9]{7}",message = "Số điện thoại không đúng định dạng")
    private String phoneNumber;
    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^[a-zA-Z0-9]+@gmail.com$",message = "mail không đúng định dạng")
    private String email;
    @NotEmpty(message = "Không được để trống")
    private String address;
//    @NotEmpty(message = "Không được để trống")
    private ClientType clientType;

    public ClientListDto() {
    }

    public ClientListDto(IClientRepository clientRepository, Long id, String name, String dateOfBirth, String gender, String idNumber, String phoneNumber, String email, String address, ClientType clientType) {
        this.clientRepository = clientRepository;
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.clientType = clientType;
    }

    public IClientRepository getClientRepository() {
        return clientRepository;
    }

    public void setClientRepository(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }
}
