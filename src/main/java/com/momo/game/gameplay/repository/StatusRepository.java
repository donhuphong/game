package com.momo.game.gameplay.repository;

import com.momo.game.gameplay.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatusRepository extends JpaRepository<Status,Integer> {
     Optional< Status> findByHiep(int id);
}
