package com.example.bt_mail.model;

public class Mail {
    private String language;
    private int pageSize;
    private String enableSpam;
    private String signature;

    public Mail() {
    }

    public Mail(String language, int pageSize, String enableSpam, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.enableSpam = enableSpam;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getEnableSpam() {
        return enableSpam;
    }

    public void setEnableSpam(String enableSpam) {
        this.enableSpam = enableSpam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
