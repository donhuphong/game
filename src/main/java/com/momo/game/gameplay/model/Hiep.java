package com.momo.game.gameplay.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table("hiep")
public class Hiep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate tgbd;
    private LocalDate tgkt;
    private int ketqua;

    @ManyToOne
    @JoinColumn(name = "idtrandau")
    private TranDau tranDau;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getTgbd() {
        return tgbd;
    }

    public void setTgbd(LocalDate tgbd) {
        this.tgbd = tgbd;
    }

    public LocalDate getTgkt() {
        return tgkt;
    }

    public void setTgkt(LocalDate tgkt) {
        this.tgkt = tgkt;
    }

    public int getKetqua() {
        return ketqua;
    }

    public void setKetqua(int ketqua) {
        this.ketqua = ketqua;
    }

    public TranDau getTranDau() {
        return tranDau;
    }

    public void setTranDau(TranDau tranDau) {
        this.tranDau = tranDau;
    }
}
