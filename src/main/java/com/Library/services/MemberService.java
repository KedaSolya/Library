package com.Library.services;

import com.Library.data.Database;
import com.Library.data.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final Database database = new Database();

    public List<Member> findAll() {
        return database.getMemberArrayList();
    }

    public Member findById(long id) {
        for (int i = 0; i < database.getMemberArrayList().size(); i++) {
            if (database.getMemberArrayList().get(i).getId() == (id)) {
                return database.getMemberArrayList().get(i);
            }
        }
        return null;
    }

    public void save(Member member) {
        database.setMemberArrayList(member);
    }

    public void deleteAll() {
        database.getMemberArrayList().clear();
    }

    public void deleteByID(long id) {
        database.getMemberArrayList().remove(findById(id));
    }

    public void update(long id, Member member) {
        Member toUpdateMember = findById(id);
        toUpdateMember.setId(member.getId());
        toUpdateMember.setName(member.getName());
        toUpdateMember.setAge(member.getAge());
        toUpdateMember.setSex(member.getSex());
    }
}
