package cn.nuke666.canteencomment.repository;

import cn.nuke666.canteencomment.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
