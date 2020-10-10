package cn.nuke666.canteencomment.repository;

import cn.nuke666.canteencomment.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("select c from Comment c where (:canteen is null or c.canteen = :canteen) and (:food is null or c.foodName like '%:foodName%')")
    List<Comment> searchByCanteenAndFood(@Param("canteen") Integer canteen, @Param("food") String foodName);

}
