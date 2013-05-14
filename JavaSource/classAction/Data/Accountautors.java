package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bsdata.Ig;
import classAction.ComFun.Id;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;
/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Accountautors //机器人账户
{
	public static void add_stock(int acctid,double zijin)  //减少ACCTFUND增加 ACCTSTOVALUE
{
	DB2Connection conn  =DoConnection.getCon();
		try {
	 	
				
			PreparedStatement	ps =conn.prepareStatement(
					"update con35.account_auto set acctfund=acctfund - "+zijin+",acctstovalue=acctstovalue + "+zijin+" where acctid="+acctid+"");	
					ps.executeUpdate();
					//		
					  } catch (SQLException e) {
						
						  e.printStackTrace();
					  }
			  return ;
 	
 	
	
	
	
	
}
	public static void str_stock(int acctid,double zijin)//
{

	DB2Connection conn  =DoConnection.getCon();
		
					  try {
					  	
					  		
						PreparedStatement	ps =conn.prepareStatement(
					"update con35.account_auto set acctfund=acctfund + "+zijin+",acctstovalue=acctstovalue - "+zijin+" where acctid="+acctid+"");	
					ps.executeUpdate();
					//		
					  } catch (SQLException e) {
						
						  e.printStackTrace();
					  }
			  return ;

		
}
	
	
	
	
	
	
	
	
	public static int max()
					{
					
					//Ig a=new Ig();
					//DB2Connection conn  =DoConnection.getCon();
		
						//try {
						//	PreparedStatement	ps =conn.prepareStatement(
							//		"select max(acctid) as accid from CON35.account_auto ");
						
							//ResultSet rs = ps.executeQuery(); 
					
							//rs.next();
								//	 a.i=rs.getInt("accid")+1;
									//System.out.print(a.i);
						//} catch (SQLException e) {
							// TODO 自动生成 catch 块
						//	e.printStackTrace();
						//}
		
		                 Id.i++;
		
						return Id.i;

					}				  	
	public static int max1()
						{
					
						Ig a=new Ig();
						DB2Connection conn  =DoConnection.getCon();
		
							try {
								PreparedStatement	ps =conn.prepareStatement(
										"select max(acctid) as accid from CON35.account_auto ");
						
								ResultSet rs = ps.executeQuery(); 
					
								rs.next();
									 a.i=rs.getInt("accid")+1;
										//System.out.print(a.i);
							} catch (SQLException e) {
								// TODO 自动生成 catch 块
								e.printStackTrace();
						}
		
							
		
							return a.i;

						}		
	public static void acctid_rs(int acctid)
	{
		
		DB2Connection conn  =DoConnection.getCon();
		
							try {
								PreparedStatement	ps =conn.prepareStatement(
										"Insert into CON35.account_auto " + "values(?)");
							//PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
												ps.setInt(1, acctid);	
								
							   ps.executeUpdate(); 
								//rs.beforeFirst(); 
				
							} catch (SQLException e) {
								// TODO 自动生成 catch 块
								e.printStackTrace();
							}
		
	}
	
	public static void all_rs(int acctid, int acctsty, double acctzc,double acctreturn,double acctmrzjb,double acctfund,double acctstovalue,double accttotal)
		{
		
			DB2Connection conn  =DoConnection.getCon();
		
								try {
									PreparedStatement	ps =conn.prepareStatement(
											"Insert into CON35.account_auto " + "values(?,?,?,?,?,?,?,?)");
								//PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
													ps.setInt(1, acctid);
									ps.setInt(2, acctsty);	
									ps.setDouble(3, acctzc);	
									ps.setDouble(4, acctreturn);	
									ps.setDouble(5, acctmrzjb);	
									ps.setDouble(6, acctfund);	
									ps.setDouble(7, acctstovalue);	
									ps.setDouble(8, accttotal);		
								
								   ps.executeUpdate(); 
									//rs.beforeFirst(); 
				
								} catch (SQLException e) {
									// TODO 自动生成 catch 块
									e.printStackTrace();
								}
		
		}
	
}
