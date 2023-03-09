package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO{
	
	private DBClient dbClient;
	
	public BuyDAO() {
		initData();
	}

	private void initData() {
		dbClient = new DBClient();
		
	}

	@Override
	public ArrayList<BuyDTO> select() {
		ArrayList<BuyDTO> list = new ArrayList<>();
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees ");
			while(rs.next()) {
				
				String username = rs.getString("username");
				String prodName = rs.getString("prodName");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");				
				
				BuyDTO dto = new BuyDTO(username, prodName, price, amount);
				list.add(dto);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return list;
	}

	@Override
	public int insert(BuyDTO dto) {
		
		String sqlFormat = "INSERT INTO "
				+ "	                         buytbl(username, prodName, price, amount) "
				+ "                     VALUES('%s', '%s', %d, %d)";
		String sql = String.format(sqlFormat, dto.getUsername(), dto.getProdName(), 
				                                                        dto.getPrice(), dto.amount);
		Connection conn = dbClient.getConnection();
		int resultRowCount = 0;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return resultRowCount;		
		
	}


	@Override
	public int update(BuyDTO dto, String targetUserName) {
		
		String sqlFormat = "UPDATE buytbl "
				+ "	SET prodName = '%s', price = %d, amount = %d "
				+ "WHERE username = '%s' ";
		String sql = String.format(sqlFormat, dto.getProdName(), dto.getPrice(),
				                                                      dto.getAmount(), targetUserName);	
		int resultRow = 0;
		
		try(Connection conn = dbClient.getConnection();
				Statement stmt = conn.createStatement();){
			resultRow = stmt.executeUpdate(sql);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public boolean delete(String username) {
		boolean isOk = true;
		String sqlFormat = "DELETE FROM buytbl WHERE username = '%s' ";
		String sql = String.format(sqlFormat, username);
		Connection conn = dbClient.getConnection();
		Statement stmt = null;		
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isOk;
		
		
	}


}
