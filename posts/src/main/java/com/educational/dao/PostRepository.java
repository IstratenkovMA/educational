package com.educational.dao;

import com.educational.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author miis0317
 * @date 19-09-18
 */
@Repository
public interface PostRepository extends JpaRepository<Post,  Long> {
}
