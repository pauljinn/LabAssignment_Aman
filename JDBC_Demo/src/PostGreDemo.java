import java.sql.*;
import org.apache.log4j.Logger;

public class PostGreDemo {
	private static Logger logger=Logger.getLogger(PostGreDemo.class);
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class c = Class.forName("org.postgresql.Driver");
			logger.info(c);
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Demo","postgres","123456");
			logger.info(con);
		}
		catch(ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}
		catch(SQLException s) {
			System.out.println(s.getMessage());
		}
		return con;
	}
	
	public static void readData(Connection con) throws SQLException{
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from Employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}	
	}
	
	
	public static void insertData(Connection con) throws SQLException{
		String insertCommand = "insert into Employee(Empid,Empname,Empage) values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertCommand);
		ps.setInt(1,2);
		ps.setString(2, "Sam");
		ps.setInt(3, 20);
		logger.info(ps.executeUpdate());
		readData(con);
	}
	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		Connection con = getConnection();
		readData(con);
		insertData(con);
				
	}

}
