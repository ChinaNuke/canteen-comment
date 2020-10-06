package cn.nuke666.canteencomment.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * 创建这条评价的用户id
     */
    @Column(name = "user_id")
    private long userId;

    /**
     * 赞同这条评论的人数
     */
    @Column
    private int approvals;

    /**
     * 价格评分（1-5分）
     */
    @Column(name = "score_for_price", nullable = false)
    private int scoreForPrice;

    /**
     * 味道评分（1-5分）
     */
    @Column(name = "score_for_taste", nullable = false)
    private int scoreForTaste;

    @Column
    private String title;

    /**
     * 评价内容
     */
    @Column(nullable = false)
    private String content;

    /**
     * 评价时间
     */
    @Column
    private Date comment_time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getApprovals() {
        return approvals;
    }

    public void setApprovals(int approvals) {
        this.approvals = approvals;
    }

    public int getScoreForPrice() {
        return scoreForPrice;
    }

    public void setScoreForPrice(int scoreForPrice) {
        this.scoreForPrice = scoreForPrice;
    }

    public int getScoreForTaste() {
        return scoreForTaste;
    }

    public void setScoreForTaste(int scoreForTaste) {
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

    public Date getComment_time() {
        return comment_time;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }
}
