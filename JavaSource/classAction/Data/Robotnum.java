/*
 * 创建日期 2007-9-24
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
public class Robotnum
{
	public static int i1;
public static int get_num(int style)
{
	DB2Connection conn  =DoConnection.getCon();
				   try {
					   PreparedStatement	ps =conn.prepareStatement(
							   "select num from CON35.robotnum where sty = "+ style+ "");
						
					   ResultSet rs = ps.executeQuery(); 
					   //rs.beforeFirst(); 
					   rs.next();
								 i1=rs.getInt("num");
						   //	System.out.print(i1);
				   } catch (SQLException e) {
					   // TODO 自动生成 catch 块
					   e.printStackTrace();
				   }
		   return i1;
}

public static void test( )
{
	int h2;
	int num;
	DB2Connection conn  =DoConnection.getCon();
				   try {
					   PreparedStatement	ps =conn.prepareStatement(
							   "select count(num)as h from CON35.robotnum ,select num from con35.robotnum; ");
						
					   ResultSet rs = ps.executeQuery(); 
					  
					 // rs.last();
					rs.next();
					h2=rs.getInt("h");
				 System.out.println(h2);
					// rs.first();
					   //rs.beforeFirst(); 
					  //   rs.next();
								// h2=rs.getInt("h");
								// System.out.println(h2);
								 while(rs.next())
							{
								 	num=rs.getInt("num");
									System.out.println(num);
								 }
						   //	System.out.print(i1);
				   } catch (SQLException e) {
					   // TODO 自动生成 catch 块
					   e.printStackTrace();
				   }
		   return ;
}
}
