package com.bkb.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Reply {
    private int replyId;
    private String replyContent;
    @JsonFormat(pattern = "YYYY-MM-DD HH:MM:SS")
    private String replyTime;
    private int userId;
    private int fatherId;
    private int replyLike;
    private int replyCom;
    private int replyType;
}
