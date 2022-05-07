package com.keke_land.member.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Getter
@Setter
public class MemberDto {

    @NotBlank(message = "id를 입력하세요.")
    @Size(min = 6, max = 20, message = "id는 최소 6자 , 최대 20자로 생성하세요.")
    private String id;

    @NotBlank(message = "pw를 입력하세요")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-z])(?=.*\\W)(?=\\S+$).{8,16}",
            message = "8~16 characters consisting of letters(A-Z, a-z), numbers, or special characters.")
    private String password1;

    @NotBlank(message = "pw를 입력하세요")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-z])(?=.*\\W)(?=\\S+$).{8,16}",
            message = "8~16 characters consisting of letters(A-Z, a-z), numbers, or special characters.")
    private String password2;
/*
    @Email(message = "이메일 형식에 맞지 않습니다.")
    private String email;

    @NotBlank(message = "name를 입력하세요")
    private String name;

    public MemberDto(String id, String password1, String password2, String email, String name){
        this.id = id;
        this.password1 = password1;
        this.password2 = password2;
        this.email = email;
        this.name = name;
    }
    */

}
