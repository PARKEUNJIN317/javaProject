package interfaceex.interfacemember;

import java.util.ArrayList;

//회원관리 모듈을 구성을 위해 interface에서 회원관리 기능을 정의
public interface IMemberDAO {

	//추상메소드 선언
	//1명 회원정보 등록 : 1명 회원 정보를 받아서 DB에 저장하고 종료(반환값없음)
	public void insertMember();
	
	//1명 회원정보 삭제 : 1명 회원 id를 받아서 DB에서 해당 id의 정보를 삭제하고 종료(반환값 없
	public void deleteMember(String memId);
	
	//전체 회원정보 조회 : DB에서 회원테이블의 모든 정보를 반환 (매개변수 없음 반환값있
	//반환하는 회원수 : n명 (n>=0)
	//MemberDTO는 회원 1명을 표현, 회원 n명은 집합형태여야 함
	//배열형태 : 원소수가 명확해야함, 회원수를 모르는 상태에서는 배열 사용 불가능
	//자바제공  API중 ArrayList 자료구조를 제공 -배열과 같지만 크기가 정해져있지 않은 가변형 배열
	public ArrayList<MemberDTO> getALLMEMber();
	
	//1명 회원정보 수정 : 1명 회원의 수정된 정보를 전달받아서 DB에서 수정하고 종료(매개변수있음 반환값없음)
	//수정의 범위 : 수정여부 상관없이 전체 정보를 모두 받아서 DB에서 전부 수정하는 방식을 사용
	public void updateMember(MemberDTO dto); 
	
	//1명 회원 검색 : 1명 회원의 id를 전달받고 해당 id의 정보를 DB 에서 조회해서 반환(매개변수있음 반환값있음)
	//id 검색 : id는 유일한 정보
	public MemberDTO searchMember(String memId);
}
