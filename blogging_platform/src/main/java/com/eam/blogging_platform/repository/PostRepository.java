package com.eam.blogging_platform.repository;

import com.eam.blogging_platform.entity.FollowedAuthor;
import com.eam.blogging_platform.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findPostByUserId (Long userId);
    List<Post> findPostByUserUsername(String username);
    Optional<Post> findPostByTitle(String title);
}
