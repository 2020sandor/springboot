package com.bkb.service.impl;

import com.bkb.dao.IReplyDao;
import com.bkb.domain.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements com.bkb.service.IReplyService {
    @Autowired
    private IReplyDao iReplyDao;

    @Override
    public List<Reply> showForumReply(Integer fatherId) {
        List<Reply> replyList = iReplyDao.showForumReply(fatherId);
        return  replyList;
    }
}
