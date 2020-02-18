package Business;

import java.sql.*;

public class checkMate {
	
	public boolean getCheckMate(String id, String access) throws Exception{
		
		Connection conn = null;
		boolean outputValue = false;
		try {
			conn = DBUtil.getConnection();
			CallableStatement cStmt = conn.prepareCall("{? = call functionfm.checkMeOut(?,?)}");
					
			cStmt.registerOutParameter(1,java.sql.Types.BOOLEAN);
			cStmt.setString(2, id);
			cStmt.setString(3, access);
			cStmt.execute();
			outputValue = cStmt.getBoolean(1);
			cStmt.close();
			conn.close();
			
		} catch (Exception ex) {}
		
		return outputValue;
	}

}