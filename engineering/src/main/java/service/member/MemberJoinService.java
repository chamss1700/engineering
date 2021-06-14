package service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import command.MemberCommand;
import model.MemberDTO;
import repository.MemberRepository;

public class MemberJoinService {
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	MemberRepository memberRepository;
	
	public void memberInsert(MemberCommand membercommand) {
		MemberDTO dto= new MemberDTO();
		dto.setDetailAddr(membercommand.getDetailAddr());
		dto.setMembAddr(membercommand.getMembAddr());
		dto.setMembBirth(membercommand.getMembBirth());
		dto.setMembConfirm(membercommand.getMembConfirm());
		dto.setMembEmail(membercommand.getMembEmail());
		dto.setMembGender(membercommand.getMembGender());
		dto.setMembId(membercommand.getMembId());
		dto.setMembName(membercommand.getMembName());
		dto.setMembPhoneNumber(membercommand.getMembPhoneNumber());
		dto.setMembPw(bCryptPasswordEncoder.encode(membercommand.getMembPw()));
		dto.setPostNumber(membercommand.getPostNumber());
	}

}
