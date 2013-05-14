/*
 * 创建日期 2007-9-9
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;
/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Account_stockrs 
{
	
	static int i1;
	static int i2;
	static int i3;
	static float i4;
	static int i5;
	
	public static int the_date_ins(int accid)//返回买的时间
	{
		DB2Connection conn  =DoConnection.getCon();
		
							try {
								PreparedStatement	ps =conn.prepareStatement(
										"select the_date from CON35.account_stock where accid = "
											+ accid
											+ "");
						
								ResultSet rs = ps.executeQuery(); 
								//rs.beforeFirst(); 
								rs.next();
										  i1=rs.getInt("the_data");
									//	System.out.print(i1);
							} catch (SQLException e) {
								// TODO 自动生成 catch 块
								e.printStackTrace();
							}
					return i1;
		
		
	}
	
	
	public static int the_time_ins(int accid)  //返回买的日期，
	{
		DB2Connection conn  =DoConnection.getCon();
							try {
								PreparedStatement	ps =conn.prepareStatement(
										"select the_time from CON35.account_stock where accid = "
											+ accid
											+ "");
						
								ResultSet rs = ps.executeQuery(); 
								//rs.beforeFirst(); 
								rs.next();
										  i2=rs.getInt("the_time");
									//	System.out.print(i2);
							} catch (SQLException e) {
								// TODO 自动生成 catch 块
								e.printStackTrace();
							}
					return i2;
		
		

		
	}
	
	public static int accsto_ins(int accid)   //返回股票id
		{

			DB2Connection conn  =DoConnection.getCon();
		
					try {
						PreparedStatement	ps =conn.prepareStatement(
								"select accsto from CON35.account_stock where accid = "
									+ accid
									+ "");
						
						ResultSet rs = ps.executeQuery(); 
						//rs.beforeFirst(); 
						rs.next();
								  i3=rs.getInt("accsto");
								//System.out.print(i3);
					} catch (SQLException e) {
						// TODO 自动生成 catch 块
						e.printStackTrace();
					}
			return i3;
		}
	public static float price_ins(int accid)//返回买入价格
		{
			DB2Connection conn  =DoConnection.getCon();
		
			try {
				PreparedStatement	ps =conn.prepareStatement(
						"select price from CON35.account_stock where accid = "
							+ accid
							+ "");
						
				ResultSet rs = ps.executeQuery(); 
				//rs.beforeFirst(); 
				rs.next();
						  i4=rs.getFloat("price");
					//	System.out.print(i4);
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
	return i4;

		}
	public static int accnum_ins(int accid)  //返回买的数量
		{
			DB2Connection conn  =DoConnection.getCon();
		
								try {
									PreparedStatement	ps =conn.prepareStatement(
											"select accnum from CON35.account_stock where accid = "
												+ accid
												+ "");
						
									ResultSet rs = ps.executeQuery(); 
									//rs.beforeFirst(); 
									rs.next();
											  i5=rs.getInt("accnum");
										//	System.out.print(i5);
								} catch (SQLException e) {
									// TODO 自动生成 catch 块
									e.printStackTrace();
								}
return i5;
		}
	
	

	
	
	
	
	

}
