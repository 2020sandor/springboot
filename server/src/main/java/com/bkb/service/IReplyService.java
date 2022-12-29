package com.bkb.service;

import com.bkb.domain.Reply;

import java.util.List;

public interface IReplyService {
    List<Reply> showForumReply(Integer fatherId);
}
