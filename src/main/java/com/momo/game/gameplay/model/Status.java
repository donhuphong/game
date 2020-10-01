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

    @JoinColumn(name = "stt")
    private int stt;

    @JoinColumn(name = "key")
    private String key;

    @JoinColumn(name = "hashid")
    private int hashId;
}
