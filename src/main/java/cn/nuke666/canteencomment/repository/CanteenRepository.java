package cn.nuke666.canteencomment.repository;

import cn.nuke666.canteencomment.model.Canteen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanteenRepository extends JpaRepository<Canteen, Long> {
}
