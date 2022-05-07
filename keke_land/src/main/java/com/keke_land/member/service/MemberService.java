package com.keke_land.member.service;

import com.keke_land.member.domain.Member;
import com.keke_land.member.repository.JpaMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemberService {

    @Autowired
    JpaMemberRepository JpaMemberRepository;

/*
    // 회원가입 시, 유효성 체크
    public Map<String, String> validateHandling(Errors errors) {
        Map<String, String> validatorResult = new HashMap<>();

        for (FieldError error : errors.getFieldErrors()) {
            String validKeyName = String.format("valid_%s", error.getField());
            validatorResult.put(validKeyName, error.getDefaultMessage());
        }

        return validatorResult;
    }
*/

    //회원가입
    public void registration(Member member){

        JpaMemberRepository.save(member);


    }

    public void test(Member member){
        System.out.println(member.getName());

    }
}
