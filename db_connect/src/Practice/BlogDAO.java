package Practice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BlogDAO implements IBlogDAO{
	
	private DBHelper dbHelper;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public BlogDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	

	@Override
	public int insert(BlogDTO dto) {
		
		String sqlFormat = " INSERT INTO " 	+ " 	blog( id, user_id, content) "
				+ "    					VALUES( %d, %s, %s ) ";
		String sql = String.format(sqlFormat, dto.getId() ,dto.getUserId(), dto.getContent());
		dbHelper = DBHelper.getInstance();
		conn = dbHelper.getConnection();
		int resultRowCount = 0;
		stmt = null;
		
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
				e.printStackTrace();
			}
		}
		
		return resultRowCount;
	}



	@Override
	public int reply() {
		// TODO Auto-generated method stub
		return 0;
	}

}

