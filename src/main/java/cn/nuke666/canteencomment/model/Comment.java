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

}
