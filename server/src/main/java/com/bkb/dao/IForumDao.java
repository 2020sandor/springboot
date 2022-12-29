package com.bkb.dao;

import com.bkb.domain.Forum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface
IForumDao {
    Forum findPerForum(Integer forumId);

    boolean PostPerForum(@Param("title") String title,@Param("content") String content,@Param("userId") Integer userId);
}
