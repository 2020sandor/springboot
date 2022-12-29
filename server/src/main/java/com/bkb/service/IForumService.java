package com.bkb.service;

import com.bkb.domain.Forum;

public interface IForumService {
    Forum findPerForum(Integer forumId);
    public boolean PostPerForum(String title,String content,Integer userId);

}
