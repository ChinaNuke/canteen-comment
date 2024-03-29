package cn.nuke666.canteencomment.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Canteen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "canteen")
    private Set<Comment> comments;

    public Canteen(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Canteen() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
