package com.Library.controllers;

import com.Library.data.Member;
import com.Library.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/all")
    public List<Member> findAll() {
        return memberService.findAll();
    }

    @GetMapping("/{id}")
    public Member findById(@PathVariable long id) {
        return memberService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Member member) {
        memberService.save(member);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Member member) {
        memberService.update(id, member);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        memberService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id) {
        memberService.deleteByID(id);
    }
}


