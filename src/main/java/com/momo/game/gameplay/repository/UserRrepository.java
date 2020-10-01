package com.momo.game.gameplay.repository;

import com.momo.game.gameplay.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRrepository extends JpaRepository<User,Integer> {
}
