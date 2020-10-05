package cn.nuke666.canteencomment.repository;

import cn.nuke666.canteencomment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
