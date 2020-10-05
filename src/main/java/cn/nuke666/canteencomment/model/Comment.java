package cn.nuke666.canteencomment.model;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * 创建这条评价的用户id
     */
    @Column
    private long userId;

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

    /**
     * 服务评分（1-5分）
     */
    @Column(name = "score_for_service", nullable = false)
    private int scoreForService;

    /**
     * 评价内容
     */
    @Column(nullable = false)
    private String content;

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

    public int getScoreForService() {
        return scoreForService;
    }

    public void setScoreForService(int scoreForService) {
        this.scoreForService = scoreForService;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
