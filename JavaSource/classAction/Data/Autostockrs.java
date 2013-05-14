package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import bsdata.Ig;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;

public class Autostockrs 

{
	public static void str_stock(int acctid,int stockid,int num)  //减少股票的数量
	{//System.out.println("减少");
		//System.out.println(acctid+stockid+num);
		DB2Connection conn  =DoConnection.getCon();
			try {
	 	//System.out.println("减少股票的数量");
				
				PreparedStatement	ps =conn.prepareStatement(
						"update con35.auto_stock set acctnum=acctnum - "+num+" where auto_id="+acctid+" and acctsto="+stockid+"");	
						ps.executeUpdate();
						//		
						  } catch (SQLException e) {
						
							  e.printStackTrace();
						  }
				  return ;
 	
 	
	}	
	public static void del_stock(int acctid,int stockid)  //减少股票的数量
		{
			DB2Connection conn  =DoConnection.getCon();
				try {
	 	
				
					PreparedStatement	ps =conn.prepareStatement(
							"delete from con35.auto_stock where auto_id="+acctid+" and acctsto="+stockid+"");	
							ps.executeUpdate();
							//		
							  } catch (SQLException e) {
						
								  e.printStackTrace();
							  }
					  return ;
 	
 	
		}	
public static void all_rs(int buyentid,int buyencon,int buystoid,double buybpri,int buybnum,Timestamp buyenttime)
					{
		
						DB2Connection conn  =DoConnection.getCon();
		
						try {
							PreparedStatement	ps =conn.prepareStatement(
									"Insert into CON35.buyentrust " + "values(?,?,?,?,?,?,?)");
						//PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
											ps.setInt(1, buyentid);	
							ps.setInt(2, buyencon);
							ps.setInt(3, buystoid);
							ps.setDouble(4, buybpri);
							ps.setInt(5, buybnum);
							ps.setTimestamp(6, buyenttime);
							ps.setInt(7, 0);
	                       ps.executeUpdate(); 
							//rs.beforeFirst(); 
				
						} catch (SQLException e) {
							// TODO 自动生成 catch 块
							e.printStackTrace();
						}
		
					}
	
	
	public static void set_guadan(int acctid,int stockid,int guadan)
						 {
		
							DB2Connection conn  =DoConnection.getCon();
		
							 try {
								 PreparedStatement	ps =conn.prepareStatement(
										 "update  CON35.auto_stock set guadan="+guadan+" where auto_id="+acctid+" and acctsto="+stockid+"");
							 //PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
						   ps.executeUpdate(); 
								 //rs.beforeFirst(); 
				
							 } catch (SQLException e) {
								 // TODO 自动生成 catch 块
								 e.printStackTrace();
							 }
		
						 }				
		
}
