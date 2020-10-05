package cn.nuke666.canteencomment.service;

import cn.nuke666.canteencomment.model.Comment;

import java.util.List;

public interface CommentService {

    public List<Comment> getCommentList();

    public List<Comment> findCommentByScore(int score);

    public List<Comment> findCommentByKeyword(String keyword);

    public void add(Comment comment);

    public void edit(Comment comment);

    public void delete(long id);

}
