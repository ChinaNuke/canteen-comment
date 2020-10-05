package cn.nuke666.canteencomment.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String gender;

    private String email;

    /**
     * 入学时间
     */
    @Column
    private Date admissionTime;

}
