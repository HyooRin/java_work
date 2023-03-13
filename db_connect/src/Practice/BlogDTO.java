package Practice;

public class BlogDTO {
	
	private String userId;
	private int id;
	private String userName;
	private String email;
	private String content;	
	
	public BlogDTO( int id, String userId,  String content) {
		super();
		this.id = id;
		this.userId = userId;
		this.content = content;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}
