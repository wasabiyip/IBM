package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import bsdata.Ig;
import classAction.ComFun.Econ;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;
/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Sellentrustrs 

{    
	
	//
	//将委托插入表中
	//
	
	public static void all_rs(int sellentid,int sellencon,int sellstoid,double sellbpri,int sellbnum,Timestamp sellenttime)
					{
		
						DB2Connection conn  =DoConnection.getCon();
						try {
							PreparedStatement	ps =conn.prepareStatement(
									"Insert into CON35.sellentrust " + "values(?,?,?,?,?,?,?,?)");
						//PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
											ps.setInt(1, sellentid);	
							ps.setInt(2, sellencon);
							ps.setInt(3, sellstoid);
							ps.setDouble(4, sellbpri);
							ps.setInt(5, sellbnum);
							ps.setTimestamp(6, sellenttime);
							ps.setInt(7, 0);
							ps.setInt(8, 0);
	                       ps.executeUpdate(); 
						//rs.beforeFirst(); 
				
						} catch (SQLException e) {
							// TODO 自动生成 catch 块
							e.printStackTrace();
						}
		
					}
					
		
					//
//
//当委托成交后，设置checks 为1
//

  public static void set_check(int sellencon,int check)
					  {
		
						DB2Connection conn  =DoConnection.getCon();
		
						  try {
							  PreparedStatement	ps =conn.prepareStatement(
									  "update  CON35.sellentrust set sellchecks="+check+" where sellencon="+sellencon+"");
						  //PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
						ps.executeUpdate(); 
							  //rs.beforeFirst(); 
				
						  } catch (SQLException e) {
							  // TODO 自动生成 catch 块
							  e.printStackTrace();
						  }
		
					  }
	public static void set_num(int sellencon,int num)
						 {
		
							DB2Connection conn  =DoConnection.getCon();
		
							 try {
								 PreparedStatement	ps =conn.prepareStatement(
										 "update  CON35.sellentrust set sellsnum=sellsnum - "+num+" where sellencon="+sellencon+"");
							 //PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
						   ps.executeUpdate(); 
								 //rs.beforeFirst(); 
				
							 } catch (SQLException e) {
								 // TODO 自动生成 catch 块
								 e.printStackTrace();
							 }
		
						 }
	
			public static int max()
			{
		    /*Ig a=new Ig();
				DoConnection lt=new DoConnection();
				DB2Connection conn  = lt.getCon();
		
				try {
					PreparedStatement	ps =conn.prepareStatement(
							"select max(sellencon) as sellencon from CON35.sellentrust ");
						
					ResultSet rs = ps.executeQuery(); 
					
					rs.next();
							 a.i=rs.getInt("sellencon")+1;
							//System.out.print(a.i);
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		
		*/
		Econ.i++;
				return Econ.i;

			}				  
					  

	public static int max1()
	{
	Ig a=new Ig();
	DB2Connection conn  =DoConnection.getCon();
		
		try {
			PreparedStatement	ps =conn.prepareStatement(
					"select max(sellencon) as sellencon from CON35.sellentrust ");
						
			ResultSet rs = ps.executeQuery(); 
					
			rs.next();
					 a.i=rs.getInt("sellencon")+1;
					//System.out.print(a.i);
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		

		return a.i;

	}				  
				
}
