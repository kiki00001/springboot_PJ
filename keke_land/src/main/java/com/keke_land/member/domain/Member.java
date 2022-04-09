package com.keke_land.member.domain;

import lombok.Getter;


import javax.persistence.*;

@Entity
@Getter
@Table(name ="member")
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long user_num;
    private String id;
    private String pw;
    private String name;
    private String email;


}
