package com.momo.game.gameplay.repository;

import com.momo.game.gameplay.model.Hiep;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HiepRepository extends JpaRepository<Hiep,Integer> {

    public List<Hiep>  findByTranDauAndKetQua(int tranDau,int ketqua);
}
