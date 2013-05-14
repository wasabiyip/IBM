package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;
/**
/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class AccountautoInf //访问模拟帐户表
{
	
	static double i;
	static int i1;
	public static double accountfund_fun(int acctid)
	{
		
		DB2Connection conn  =DoConnection.getCon();
		
		try {
			PreparedStatement	ps =conn.prepareStatement(
					"select ACCtfund from CON35.ACCOUNT_auto where ACCtid = "
						+ acctid
						+ "");
						
			ResultSet rs = ps.executeQuery(); 
			//rs.beforeFirst(); 
			rs.next();
					  i=rs.getInt("acctfund");
				//	System.out.print(i);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		
		return i;
		
	//public double accreturn(int accid);//chushi zijin
			//public double total(int accid);//zongzijin 
		
		
		//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
			
		
		
		
		
	}

	public static double acctzc_fun(int acctid)//返回 政策敏感度
	
		{
		
			DB2Connection conn  =DoConnection.getCon();
		
			try {
				PreparedStatement	ps =conn.prepareStatement(
						"select acctzc from CON35.ACCOUNT_auto where ACCtid = "
							+ acctid
							+ "");
						
				ResultSet rs = ps.executeQuery(); 
				//rs.beforeFirst(); 
				rs.next();
						  i=rs.getDouble("acctzc");
					//	System.out.print(i);
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		
		
		
			return i;
		
		//public double accreturn(int accid);//chushi zijin
				//public double total(int accid);//zongzijin 
		
		
			//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
			}
	public static int acctsty_fun(int acctid)//根据id 返回 用户 类型 
	
			{
		
				DB2Connection conn  =DoConnection.getCon();
				try {
					PreparedStatement	ps =conn.prepareStatement(
							"select acctsty from CON35.ACCOUNT_auto where ACCtid = "
								+ acctid
								+ "");
						
					ResultSet rs = ps.executeQuery(); 
					//rs.beforeFirst(); 
					rs.next();
							  i1=rs.getInt("acctsty");
							//System.out.print(i);
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		
		
		
				return i1;
		
			//public double accreturn(int accid);//chushi zijin
					//public double total(int accid);//zongzijin 
		
		
				//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
				}

}
 
 