package com.java.springboot.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

@Entity
@Table(name =  "post", uniqueConstraints = @UniqueConstraint(columnNames = "status"))
public class Post {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status")
    private String status;

    private String choosePrivacy;

    private String checkIn;

    public Post() {

    }

    public Post(String status, String choosePrivacy, String checkIn) {
        super();
        this.status = status;
        this.choosePrivacy = choosePrivacy;
        this.checkIn = checkIn;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChoosePrivacy() {
        return choosePrivacy;
    }

    public void setChoosePrivacy(String choosePrivacy) {
        this.choosePrivacy = choosePrivacy;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
}
