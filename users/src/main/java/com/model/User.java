package com.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author miis0317
 * @date 28-09-18
 */
@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "user_id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "rating")
    private int rating;
}
