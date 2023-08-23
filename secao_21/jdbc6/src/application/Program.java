package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
// Deletar dados
public class Program {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false); // O commit das operações não será automático (manual). Isso permite garantir a atomicidade da operação.
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			//if (true) {
			//	throw new SQLException("Fake Error");				
			//}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit(); // commit só é feito após as operações.
			
			System.out.println("Rows affected first operation " + rows1);
			System.out.println("Rows affected second operation " + rows2);
		} catch(SQLException e) {
			try {
				conn.rollback(); // se der algum erro, rollback das operções
				throw new DbException("Transaction rolled back! " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! " + e1.getMessage());
			} 
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
