package cn.nuke666.canteencomment.model.dto;

import java.util.Date;

public class CommentDto {

    private Long id;

    private String createdBy;

    private Long canteen;

    private Integer whichWindow;

    private String foodName;

    private Integer approvals;

    private Integer scoreForPrice;

    private Integer scoreForTaste;

    private String title;

    private String content;

    private Date commentTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCanteen() {
        return canteen;
    }

    public void setCanteen(Long canteen) {
        this.canteen = canteen;
    }

    public Integer getWhichWindow() {
        return whichWindow;
    }

    public void setWhichWindow(Integer whichWindow) {
        this.whichWindow = whichWindow;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getApprovals() {
        return approvals;
    }

    public void setApprovals(Integer approvals) {
        this.approvals = approvals;
    }

    public Integer getScoreForPrice() {
        return scoreForPrice;
    }

    public void setScoreForPrice(Integer scoreForPrice) {
        this.scoreForPrice = scoreForPrice;
    }

    public Integer getScoreForTaste() {
        return scoreForTaste;
    }

    public void setScoreForTaste(Integer scoreForTaste) {
        this.scoreForTaste = scoreForTaste;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
