package cn.nuke666.canteencomment.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Canteen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "canteen")
    private Set<Comment> comments;

    public Canteen(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Canteen() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
