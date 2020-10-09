package cn.nuke666.canteencomment.service.impl;

import cn.nuke666.canteencomment.model.Comment;
import cn.nuke666.canteencomment.repository.CommentRepository;
import cn.nuke666.canteencomment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> getCommentList() {
        return commentRepository.findAll();
    }

    @Override
    public List<Comment> findCommentByScore(int score) {
        return null;
    }

    @Override
    public List<Comment> findCommentByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(Comment comment) {

    }

    @Override
    public void edit(Comment comment) {
    }

    @Override
    public void delete(long id) {

    }
}
