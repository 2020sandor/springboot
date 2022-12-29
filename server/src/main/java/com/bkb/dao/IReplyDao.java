package com.bkb.dao;

import com.bkb.domain.Reply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IReplyDao {
    List<Reply> showForumReply(Integer fatherId);
}
