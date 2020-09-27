package com.java.springboot.web.dto;

public class UserStatusDto {
    private String status;
    private String choosePrivacy;
    private String checkIn;

    public UserStatusDto(){

    }

    public UserStatusDto(String status, String choosePrivacy, String checkIn) {
        super();
        this.status = status;
        this.choosePrivacy = choosePrivacy;
        this.checkIn = checkIn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChoosePrivacy() {
        return choosePrivacy;
    }

    public void setChoosePrivacy(String choosePrivacy) {
        this.choosePrivacy = choosePrivacy;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
}
