package Practice;

public class MainTest {

	public static void main(String[] args) {
		
		BlogDAO blogDAO = new BlogDAO();
		
		BlogDTO dto = new BlogDTO(2, "2", "콘텐츠입니다." );
		int resultRowCount = blogDAO.insert(dto);
		

	}

}
