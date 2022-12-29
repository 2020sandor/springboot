package com.bkb.controller;

import com.bkb.domain.Forum;
import com.bkb.service.IForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForumController {
    @Autowired
    private IForumService iForumService;
    Forum forum = new Forum();

    @GetMapping("/showPerForum")
    public Forum showPerForum(Integer forumId) {
        forumId = 1;
        forum = iForumService.findPerForum(forumId);
        return forum;
    }

    @GetMapping("/insertForum")
//    public boolean insertForum(@RequestParam String title, @RequestParam String content,@RequestParam int userId) {
    public boolean insertForum( String title,  String content, Integer userId) {
//       boolean result = iForumService.PostPerForum(title,content,userId);
       boolean result = iForumService.PostPerForum("biaoti","neirong",001);
       if(result)
       {

           System.out.println("插入成功！！！");
       }
       else {
           System.out.println("插入失败！！！");
       }
        return result;
    }
}
