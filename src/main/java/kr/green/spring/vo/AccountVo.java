package kr.green.spring.vo;

public class AccountVo {
	//멤버 변수의 이름은 테이블 속성의 이름과 일치시켜주는 것이 좋다. (자동으로 값이 입력되도록)
	//단 필수는 아니지만 일치하지 않으면 Mapper에서 추가 작업을 해야한다.
	private String id;
	private String pw;
	private String email;
	
	//외부에서 접근하기 위해서는 getter, setter함수가 필요함
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//vo만들기
	@Override
	public String toString() {
		return "AccountVo [id=" + id + ", pw=" + pw + ", email=" + email + "]";
		
	}
	
	
	
}
