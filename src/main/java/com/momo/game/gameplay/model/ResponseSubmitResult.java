package com.momo.game.gameplay.model;

public class ResponseSubmitResult {

    private String key;
    private String result;
    private String tenDoiThu;
    private String soHiep;
    private int soHiepThang;
    private Boolean finish;

    public ResponseSubmitResult(String key, String result, String tenDoiThu, String soHiep, int soHiepThang, Boolean finish) {
        this.key = key;
        this.result = result;
        this.tenDoiThu = tenDoiThu;
        this.soHiep = soHiep;
        this.soHiepThang = soHiepThang;
        this.finish = finish;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTenDoiThu() {
        return tenDoiThu;
    }

    public void setTenDoiThu(String tenDoiThu) {
        this.tenDoiThu = tenDoiThu;
    }

    public String getSoHiep() {
        return soHiep;
    }

    public void setSoHiep(String soHiep) {
        this.soHiep = soHiep;
    }

    public int getSoHiepThang() {
        return soHiepThang;
    }

    public void setSoHiepThang(int soHiepThang) {
        this.soHiepThang = soHiepThang;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }
}
