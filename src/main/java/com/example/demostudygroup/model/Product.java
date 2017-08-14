package com.example.demostudygroup.model;

import java.util.*;
public class Product {

    private String id;
    private String name;
    private String photo;
    private Date creationDate;

    public Product(String id, String name, String photo, Date creationDate) {
        super();
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.creationDate = creationDate;
    }

    public Product(){
        super();
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    public void setDateCreated(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
