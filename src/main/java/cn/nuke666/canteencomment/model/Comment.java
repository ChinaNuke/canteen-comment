package cn.nuke666.canteencomment.model;

import javax.persistence.*;
import java.util.Date;

/**
 * TODO: 解决属性 canteen 的转换，commentTime 的显示
 */

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
    private String foodName;

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

    public Comment(Long id, Long userId, Integer canteen, Integer whichWindow, String foodName, Integer approvals, Integer scoreForPrice, Integer scoreForTaste, String title, String content, Date commentTime) {
        this.id = id;
        this.userId = userId;
        this.canteen = canteen;
        this.whichWindow = whichWindow;
        this.foodName = foodName;
        this.approvals = approvals;
        this.scoreForPrice = scoreForPrice;
        this.scoreForTaste = scoreForTaste;
        this.title = title;
        this.content = content;
        this.commentTime = commentTime;
    }

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCanteen() {
        return canteen;
    }

    public void setCanteen(Integer canteen) {
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

    public void setFoodName(String food) {
        this.foodName = food;
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
