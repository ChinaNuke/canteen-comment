package cn.nuke666.canteencomment.service.impl;

import cn.nuke666.canteencomment.model.Comment;
import cn.nuke666.canteencomment.model.dto.CommentDto;
import cn.nuke666.canteencomment.repository.CanteenRepository;
import cn.nuke666.canteencomment.repository.CommentRepository;
import cn.nuke666.canteencomment.repository.UserRepository;
import cn.nuke666.canteencomment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentRepository commentRepository;

    @Resource
    private CanteenRepository canteenRepository;

    @Resource
    private UserRepository userRepository;

    @Override
    public List<Comment> getCommentList() {
        return commentRepository.findAll(Sort.by("commentTime").descending());
    }

    @Override
    public List<Comment> search(Integer canteen, String foodName) {
        return commentRepository.searchByCanteenAndFood(canteen, foodName);
    }

    @Override
    public void add(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void add(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setCreatedBy(userRepository.findByUsername(commentDto.getCreatedBy()));
        comment.setCanteen(canteenRepository.getOne(commentDto.getCanteen()));
        comment.setWhichWindow(commentDto.getWhichWindow());
        comment.setFoodName(commentDto.getFoodName());
        comment.setApprovals(0);
        comment.setScoreForTaste(commentDto.getScoreForTaste());
        comment.setScoreForPrice(commentDto.getScoreForPrice());
        comment.setTitle(commentDto.getTitle());
        comment.setContent(commentDto.getContent());

        commentRepository.save(comment);
    }

    @Override
    public void edit(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void delete(Long id) {
        commentRepository.deleteById(id);
    }

}
