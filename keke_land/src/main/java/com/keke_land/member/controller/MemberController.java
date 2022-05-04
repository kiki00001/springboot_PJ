package com.keke_land.member.controller;

import com.keke_land.member.domain.Member;
import com.keke_land.member.dto.MemberDto;
import com.keke_land.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Validated
@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/signin")
    public String signin() {
        return "view/signin";
    }
    @RequestMapping(value = "/signup")
    public String signup(Model model) {
        model.addAttribute("memberDto", new MemberDto());
        return "view/signup";
       }


    @RequestMapping(value = "/newRegistration", method = RequestMethod.POST)
    public String newMember(Member member){

        //memberService.test(member);
        memberService.registration(member);
        return "view/main";
    }

    @PostMapping(value = "/validCheck")
 //   public String validCheck(BindingResult bindingResult, @RequestBody @Valid MemberDto memberDto){
    public String validCheck(@RequestBody @Valid MemberDto memberDto, BindingResult result){
        System.out.println("1------");

        System.out.println("memberDto.getID() = " + memberDto.getName());
        System.out.println("memberDto.getPassword1() = " + memberDto.getPassword1());

        //model.addAttribute("MemberDto", new MemberDto());
        //패스워드 유효성 검사 부적합 시
        if (result.hasErrors()) {
            System.out.println("2------");
            return "view/main";
            }


        return "view/main";
    }
}
