package in.cg.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cg.model.Member;
import in.cg.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepo;
	private long idCounter = 1;
	
	public MemberService(MemberRepository memberRepo) {
		this.memberRepo = memberRepo;
	}
	
	public void registerMember(String name, String email) {
		Member member = new Member(idCounter++, name, email);
		memberRepo.addMember(member);
		System.out.println("Member registered: " + member.getName());
	}
	
	public Member getMemberById(int id) {
		return memberRepo.getMemberById(id);
	}
}	
