package servlet;
import java.sql.*;
import com.ibm.db2.jcc.DB2Connection;
import javax.swing.*;

public class DoConnection extends JFrame {
	
	  private String url = "jdbc:db2://222.201.130.141:5023/DALLAS8";
	  private String driver = "com.ibm.db2.jcc.DB2Driver";
	  private String user = "CON35";
	  private String password = "HONG";
	  public String abc="OK!!!";
	  
	  public DB2Connection getCon() {
	    
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