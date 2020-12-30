package cn.nuke666.canteencomment.service;

import cn.nuke666.canteencomment.model.Comment;
import cn.nuke666.canteencomment.model.dto.CommentDto;

import java.util.List;

public interface CommentService {

    public List<Comment> getCommentList();

    public List<Comment> search(Integer canteen, String foodName);

    public void add(Comment comment);

    public void add(CommentDto commentDto);

    public void edit(Comment comment);

    public void delete(Long id);

}
