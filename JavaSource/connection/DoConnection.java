package connection;
import java.sql.*;
import com.ibm.db2.jcc.DB2Connection;
import javax.swing.*;

public class DoConnection extends JFrame {
	
	  private static String url = "jdbc:db2://222.201.130.141:5023/DALLAS8";
	  private static String driver = "com.ibm.db2.jcc.DB2Driver";
	  private static String user = "CON35";
	  private static String password = "hong";
	  public static String abc="OK!!!";
	  
	  public static DB2Connection getCon() {
	    
		DB2Connection con = null;
		try{
		Class.forName(driver);
			con = (DB2Connection)DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println("Error:" + e);
			System.exit(-1);
		  }
		  finally {      
			 ; 
		  }
		  return con;
	  }
}