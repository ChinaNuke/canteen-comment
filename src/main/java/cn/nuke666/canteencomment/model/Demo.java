package cn.nuke666.canteencomment.model;

import javax.persistence.*;

@Entity
public class Demo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "field_a")
    private int fieldA;

    @Column(name = "field_b")
    private String fieldB;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFieldA() {
        return fieldA;
    }

    public void setFieldA(int fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }
}
