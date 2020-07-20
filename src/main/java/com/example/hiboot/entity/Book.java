package com.example.hiboot.entity;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * description :
 *
 * @author : HandSomeMaker
 * @date : 2020/7/18 22:54
 */
@Document(indexName = "handsomemaker")
public class Book implements Serializable {
    private static final long serialVersionUID = 961966655181367777L;
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
