package com.bkb.controller;

import com.bkb.domain.Reply;
import com.bkb.service.IReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReplyController {
    @Autowired
    private IReplyService iReplyService;
    List<Reply> replyList;

    @GetMapping("/showForumReply")
    public List<Reply> showForumReply(Integer fatherId) {
        fatherId = 1;
        replyList = iReplyService.showForumReply(fatherId);
        return replyList;
    }
}
