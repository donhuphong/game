package com.momo.game.gameplay.model;

import javax.persistence.*;

@Entity
@Table("user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int diem;
    private int soluot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public int getSoluot() {
        return soluot;
    }

    public void setSoluot(int soluot) {
        this.soluot = soluot;
    }
}
