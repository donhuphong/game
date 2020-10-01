package com.momo.game.gameplay.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "iduser")
    private User user;

    @OneToOne
    @JoinColumn(name = "idhiep")
    private Hiep hiep;

    @Column(name = "stt")
    private int stt;

    @Column(name = "key")
    private String key;

}
