package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.MemberDTO;

public class MemberRepository {
	@Autowired
	SqlSession sqlSession;
	private final String namesace="";
	private String statement;
	
	public void memDel(String memId) {
		statement = namesace + ".memberDelete";
		sqlSession.selectOne(statement, memId);
	}
	
	public MemberDTO memInfo(String memId) {
		statement = namesace + ".memInfo";
		return sqlSession.selectOne(statement, memId);
	}
	
	public void memUpdate(MemberDTO dto) {
		statement = namesace + ".memUpdate";
		sqlSession.update(statement, dto);		
	}
	
	public List<MemberDTO> memList() {
		statement = namesace + ".memberList";
		return sqlSession.selectList(statement);
	}
	public void memberInsert(MemberDTO dto) {
		statement = namesace + ".memberInsert";
		sqlSession.insert(statement, dto);
	}

}
