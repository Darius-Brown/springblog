package com.codeup.springblog.Repositories;

import com.codeup.springblog.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository <Post, String>{
    Post findByTitle(String title);
    Post findByTitleLike(String searchPattern);
}
