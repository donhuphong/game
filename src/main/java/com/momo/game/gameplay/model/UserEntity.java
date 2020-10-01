package com.momo.game.gameplay.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;

    private String name;

    private Integer diem;

    @Column(name = "soluot")
    private Integer soLuot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    public Integer getSoLuot() {
        return soLuot;
    }

    public void setSoLuot(Integer soLuot) {
        this.soLuot = soLuot;
    }
}
