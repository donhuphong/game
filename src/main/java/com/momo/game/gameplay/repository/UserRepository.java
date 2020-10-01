package com.momo.game.gameplay.repository;

import com.momo.game.gameplay.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
