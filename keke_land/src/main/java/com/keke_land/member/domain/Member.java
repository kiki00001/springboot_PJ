package com.keke_land.member.domain;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name ="member")
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long user_num;
    private String id;
    private String pw;
    private String name;
    private String email;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id.equals(member.id) &&
                name.equals(member.name) &&
                email.equals(member.email) &&
                pw.equals(member.pw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, pw);
    }
}
