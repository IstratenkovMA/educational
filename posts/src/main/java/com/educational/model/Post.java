package com.educational.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author miis0317
 * @date 11-07-18
 */
@Entity
@Data
//@Getter
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "Posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    private long id;

    @Column(name = "text")
    private String text;
    @Column(name = "author_id")
    private long author;


}
