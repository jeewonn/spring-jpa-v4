package com.example.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    // 회원명, 팀명, 나이(ageGoe, ageLeo)

    // 화면에서 파라미터로 받음.
    private String username;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;
}
