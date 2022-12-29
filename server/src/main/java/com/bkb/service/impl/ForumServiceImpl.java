package com.bkb.service.impl;
import com.bkb.dao.IForumDao;
import com.bkb.domain.Forum;
import com.bkb.service.IForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumServiceImpl implements IForumService {
    @Autowired
    private IForumDao iForumDao;

    @Override
    public Forum findPerForum(Integer forumId) {
        Forum forum = iForumDao.findPerForum(forumId);
        return forum;
    }


    @Override
    public boolean PostPerForum(String title,String content,Integer userId) {
        boolean post = iForumDao.PostPerForum(title,content,userId);
        return post;
    }
}
