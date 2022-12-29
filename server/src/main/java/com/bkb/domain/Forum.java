package com.bkb.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Forum {
    private int forumId;
    private String title;
    private String content;
    @JsonFormat(pattern = "YYYY-MM-DD HH:MM:SS")
    private String forumCreateTime;
    private int userId;
    private int forumView;
    private int forumCom;
    private int forumLike;
    private int forumCol;
}
