package com.momo.game.gameplay.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trandau")
public class TranDau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "iduser1")
    private User user1;

    @OneToOne
    @JoinColumn(name = "iduser2")
    private User user2;

    @OneToMany(mappedBy = "tranDau")
    private List<Hiep> hieps;

    public TranDau(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public List<Hiep> getHieps() {
        return hieps;
    }

    public void setHieps(List<Hiep> hieps) {
        this.hieps = hieps;
    }
}
