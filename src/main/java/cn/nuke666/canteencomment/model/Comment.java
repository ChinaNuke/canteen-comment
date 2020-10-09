package cn.nuke666.canteencomment.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 创建这条评价的用户id
     */
    private Long userId;

    /**
     * 菜品所在的餐厅
     */
    private Integer canteen;

    /**
     * 菜品所在窗口号
     */
    @Column(nullable = true)
    private Integer whichWindow;

    /**
     * 菜品名称
     */
    private String food;

    /**
     * 赞同这条评论的人数
     */
    private Integer approvals;

    /**
     * 价格评分（1-5分）
     */
    private Integer scoreForPrice;

    /**
     * 味道评分（1-5分）
     */
    private Integer scoreForTaste;

    /**
     * 评价标题
     */
    private String title;

    /**
     * 评价内容
     */
    private String content;

    /**
     * 评价时间
     */
//    @Temporal(TemporalType.DATE)
    private Date commentTime;

    public Comment(long id, long userId, int canteen, int whichWindow, String food, int approvals, int scoreForPrice, int scoreForTaste, String title, String content, Date commentTime) {
        this.id = id;
        this.userId = userId;
        this.canteen = canteen;
        this.whichWindow = whichWindow;
        this.food = food;
        this.approvals = approvals;
        this.scoreForPrice = scoreForPrice;
        this.scoreForTaste = scoreForTaste;
        this.title = title;
        this.content = content;
        this.commentTime = commentTime;
    }

    public Comment() {
    }

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

    public int getCanteen() {
        return canteen;
    }

    public void setCanteen(int canteen) {
        this.canteen = canteen;
    }

    public int getWhichWindow() {
        return whichWindow;
    }

    public void setWhichWindow(int whichWindow) {
        this.whichWindow = whichWindow;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
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

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

}
