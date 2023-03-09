package ch04;

public class MainTest2 {

	public static void main(String[] args) {
		
		BuyDAO buyDAO = new BuyDAO();
		
		// insert 확인
//		BuyDTO dto = new BuyDTO("이승기", "아이폰", 10, 5);
//		int RowCount = buyDAO.insert(dto);
		
		// update 확인 
//		BuyDTO dto = new BuyDTO("이승기", "커피", 10, 5);
//		int updateRowCount = buyDAO.update(dto, dto.getUsername());
//		System.out.println("updateRowCount" + updateRowCount);
		
		// delete 확인
		boolean isDelete = buyDAO.delete("이승기");
		System.out.println("isDelete" + isDelete);
		if(isDelete == false) {
			System.out.println("==");
		}
		
		
		
		
		
		

	}

}
