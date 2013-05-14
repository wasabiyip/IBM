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

import bsdata.Ig;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;
/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class StockInf //访问个股信息表

{
	static double i1;
	static int i2;
	static double i3;
	static double zong1;
	static double zong2;
	static double i4;
  static double zongzhi;
  static String[] s;
	public static double sto_yesterday(int stockid) {
		DB2Connection conn  =DoConnection.getCon();
		
				try {
					PreparedStatement	ps =conn.prepareStatement(
							"select sto_yesterday from CON35.stock where stockid = "
								+ stockid
								+ "");
						
					ResultSet rs = ps.executeQuery(); 
					//rs.beforeFirst(); 
					rs.next();
							  i4=rs.getDouble("sto_yesterday");
						//	System.out.print(i1);
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		return i4;// TODO 自动生成方法存根
	
	}
	 
	
	
	public static  double stopri_fun(int stockid)       //返回现价
	{
		

		DB2Connection conn  =DoConnection.getCon();
		
				try {
					PreparedStatement	ps =conn.prepareStatement(
							"select stopri from CON35.stock where stockid = "
								+ stockid
								+ "");
						
					ResultSet rs = ps.executeQuery(); 
					//rs.beforeFirst(); 
					rs.next();
							  i1=rs.getDouble("stopri");
						//	System.out.print(i1);
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		return i1;
	}
	
	public static  double stofa_price_fun(int stockid)
		{
		

			DB2Connection conn  =DoConnection.getCon();
		
					try {
						PreparedStatement	ps =conn.prepareStatement(
								"select stofa_price from CON35.stock where stockid = "
									+ stockid
									+ "");
						
						ResultSet rs = ps.executeQuery(); 
						//rs.beforeFirst(); 
						rs.next();
								  i1=rs.getDouble("stofa_price");
							//	System.out.print(i1);
					} catch (SQLException e) {
						// TODO 自动生成 catch 块
						e.printStackTrace();
					}
			return i1;
		}
	public static int fhong_fun(int stockid)   //返回该股票有没有分红。
	{

		
		DB2Connection conn  =DoConnection.getCon();
		try {
			PreparedStatement	ps =conn.prepareStatement(
					"select fhong from CON35.stock where stockid = "
						+ stockid
						+ "");
						
			ResultSet rs = ps.executeQuery(); 
			//rs.beforeFirst(); 
			rs.next();
					  i2=rs.getInt("fhong");
				//	System.out.print(i2);
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return i2;
		
	}
	public static double zong_zhi()   //返回该股票有没有分红。
		{
        double fapric;
        double nowprice;
        int num;
        
        		
		DB2Connection conn  =DoConnection.getCon();
	
			try {
				PreparedStatement	ps =conn.prepareStatement(
						"select stofa,stofa_price,stopri from CON35.stock");
						
				ResultSet rs = ps.executeQuery(); 
				
				while(rs.next())
				{
					num=rs.getInt("stofa");
					fapric=rs.getDouble("stofa_price");
					nowprice=rs.getDouble("stopri");
					zong1+=fapric*num;
					zong2+=nowprice*num;
					
				}
				zongzhi=(zong2/zong1)*250;
						
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
			return zongzhi;
		
		}
	
	public static double stozhangfu_fun(int stockid)   //返回该股票有没有。
		{
			DB2Connection conn  =DoConnection.getCon();
			try {
				PreparedStatement	ps =conn.prepareStatement(
						"select stozhangfu from CON35.stock where stockid = "
							+ stockid
							+ "");
						
				ResultSet rs = ps.executeQuery(); 
				//rs.beforeFirst(); 
				rs.next();
						  i3=rs.getDouble("stozhangfu");
					//	System.out.print(i3);
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		return i3;
		
		}

	public static void stozhangfu_fun_all()   //返回该股票有没有。
		{
			s=new String[11];
			s[0]="四川长虹";
			s[1]="马钢";
			s[2]="招商银行";
			s[3]="中国联通";
			s[4]="国电电力";
			s[5]="中国石化";
			s[6]="南方航空";
			s[7]="雅戈尔";
			s[8]="一汽轿车";
			s[9]="工商银行";
			s[10]="西单商场";
			
			double i5;
			int id;
			DB2Connection conn  =DoConnection.getCon();
		
			try {
				PreparedStatement	ps =conn.prepareStatement(
						"select stockid,stozhengfu,stozhangfu from CON35.stock");
						
				ResultSet rs = ps.executeQuery(); 
				//rs.beforeFirst(); 
				int i=0;
				while(rs.next())
				{
					
					id=rs.getInt("stockid");
					i5=rs.getDouble("stozhengfu");
				    i3=rs.getDouble("stozhangfu");
				    System.out.println("股票名称："+s[i]+"股票id: "+id+"振幅："+ToString.T(i5)+"涨幅："+ToString.T(i3));
				    System.out.println(" ");
				    i++;
				 
				}
					//	System.out.print(i3);
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		}
		
	
	public static Gupiao[] all_fun(int stosty,Ig a)
				{
					Gupiao[] xinxi=null;
		
				///fan hui yi ge lei de suzhu
				DB2Connection conn  =DoConnection.getCon();
		
					try {
			PreparedStatement	ps =conn.prepareStatement(
								"select count(stosty) as h from CON35.stock where stosty = "
									+ stosty
									+ "");
								int i;
						ResultSet rs = ps.executeQuery(); 
						//rs.beforeFirst(); 
						rs.next();
								  i=rs.getInt("h");
								  a.i=i;
							//	System.out.print(i);
				xinxi	=new Gupiao[i];
						i=0;
					ps =conn.prepareStatement(
										" SELECT stockid,stofa,stofa_price,sto_yesterday,stomax,stomin" +
										",stozhengfu,stozhangfu,stopri " +
										"from con35.stock where stosty="+stosty+"");
								
								 rs = ps.executeQuery();					
			
						while(rs.next()){
					
				    // System.out.println(stosty);
							xinxi[i]=new Gupiao();
							xinxi[i].stockid=rs.getInt("stockid");
							xinxi[i].stofa=rs.getInt("stofa");
							xinxi[i].stofa_price=rs.getDouble("stofa_price");
							xinxi[i].sto_yesterday=rs.getDouble("sto_yesterday");
							xinxi[i].stomax=rs.getDouble("stomax");
							xinxi[i].stomin=rs.getDouble("stomin");
		               
							xinxi[i].stozhengfu=rs.getDouble("stozhengfu");
							xinxi[i].stozhangfu=rs.getDouble("stozhangfu");
							xinxi[i].stopri=rs.getDouble("stopri");
						  // System.out.println("xinxi"+i);
						   // xinxi[i].dis();
						   i++;					}
							
										
						

					} catch (SQLException e) {
						// TODO 自动生成 catch 块
						e.printStackTrace();
					}
				return xinxi;
				}

	/**
	 * @param stockid
	 * @return
	 */


	

}
