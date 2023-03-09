package ch04;

import java.util.ArrayList;

public interface IBuyDAO {
	
	ArrayList<BuyDTO> select();
	
	int insert(BuyDTO dto);
	
	int update(BuyDTO dto, String targetUserName);
	
	boolean delete(String username);

}
