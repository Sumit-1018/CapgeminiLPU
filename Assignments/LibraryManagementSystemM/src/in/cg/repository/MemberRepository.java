package in.cg.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import in.cg.model.Member;
import in.cg.service.MemberService;

@Repository
public class MemberRepository {
	
	public List<Member> members= new ArrayList<>();
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public Member getMemberById(int id) {
		for(Member member:members) {
			if(member.getId()==id) {
				return member;
			}
		}
		return null;
	}
	
}
