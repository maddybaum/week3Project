package com.javaunit3.springmvc.model;

import org.hibernate.annotations.Table;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;


@Entity
    @Table(name = "votes")

public class VoteEntity {
        @Id
        @GeneratedValue
        private Integer id;

        @Column(name = "voter_Name")
        private String voterName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }
}

}
