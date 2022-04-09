package com.keke_land.test;

import com.keke_land.member.domain.Member;
import com.keke_land.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Optional;

@SpringBootTest
public class Test {

    @Autowired
    MemberRepository memberRepository;


    public void testSelect(){

        String id = "test10";
        Optional<Member> result = memberRepository.findById(id)

        if(result.isPresent()) {
            Member member = result.get(); System.out.println(member);
        }
    }
}
