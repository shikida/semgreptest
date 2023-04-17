package semgreptest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) throws Exception{

		String hohoho = args[0];
		Connection conn = null;
		PreparedStatement pstmt = conn.prepareStatement("select * from x where y = '"+hohoho+"'");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getBoolean(1));
		}
	}

}
