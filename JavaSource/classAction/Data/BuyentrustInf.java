package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ibm.db2.jcc.DB2Connection;
import java.sql.Timestamp;
import connection.DoConnection;
/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class BuyentrustInf {
static int i1;
static int i2;
static float i3;
static int i4;
static int i5;
static Timestamp time;
	public static int stoid_fun(int accid)
		{
		
			DB2Connection conn  =DoConnection.getCon();
		
			try {
				PreparedStatement	ps =conn.prepareStatement(
						"select stoid from CON35.buyentrust where entid = "
							+ accid
							+ "");
						
				ResultSet rs = ps.executeQuery(); 
				//rs.beforeFirst(); 
				rs.next();
						  i1=rs.getInt("stoid");
						//System.out.print(i1);
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		
		
		
			return i1;
		
			
		
		
			
			
		
		
		
		
		}
	public static int encon_fun(int accid)
			{
				DB2Connection conn  =DoConnection.getCon();
		
				try {
					PreparedStatement	ps =conn.prepareStatement(
							"select encon from CON35.buyentrust where entid = "
								+ accid
								+ "");
						
					ResultSet rs = ps.executeQuery(); 
					//rs.beforeFirst(); 
					rs.next();
							  i2=rs.getInt("encon");
							//System.out.print(i2);
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		
		
		
				return i2;
		
			
		
		
				//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
			
		
		
		
		
			}

	public static float bpri_fun(int accid)
			{
		
				DB2Connection conn  =DoConnection.getCon();
		
				try {
					PreparedStatement	ps =conn.prepareStatement(
							"select bpri from CON35.buyentrust where entid = "
								+ accid
								+ "");
						
					ResultSet rs = ps.executeQuery(); 
					//rs.beforeFirst(); 
					rs.next();
							  i3=rs.getFloat("bpri");
							//System.out.print(i3);
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		
		
		
				return i3;
		
			
		
		
				//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
			
		
		
		
		
			}


	public static int bnum_fun(int accid)
			{
				DB2Connection conn  =DoConnection.getCon();
		
				try {
					PreparedStatement	ps =conn.prepareStatement(
							"select bnum from CON35.buyentrust where entid = "
								+ accid
								+ "");
						
					ResultSet rs = ps.executeQuery(); 
					//rs.beforeFirst(); 
					rs.next();
							  i4=rs.getInt("bnum");
							//System.out.print(i4);
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		
		
		
				return i4;
		
			
		
		
				//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
			
		
		
		
		
			}



	public static int  checks_fun(int accid)
			{
		
				DB2Connection conn  =DoConnection.getCon();
		
				try {
					PreparedStatement	ps =conn.prepareStatement(
							"select checks from CON35.buyentrust where entid = "
								+ accid
								+ "");
						
					ResultSet rs = ps.executeQuery(); 
					//rs.beforeFirst(); 
					rs.next();
							  i5=rs.getInt("checks");
							//System.out.print(i5);
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		
		
		
				return i5;
		
			
		
		
				//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
			
		
		
		
		
			}

	public static Timestamp  enttime_fun(int accid)
			{
		
				DB2Connection conn  =DoConnection.getCon();
		
				try {
					PreparedStatement	ps =conn.prepareStatement(
							"select enttime from CON35.buyentrust where entid = "
								+ accid
								+ "");
						
					ResultSet rs = ps.executeQuery(); 
					//rs.beforeFirst(); 
					rs.next();
							  time=rs.getTimestamp("enttime");
							//System.out.print(time);
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		
		
		
				return time;
		
			
		
		
				//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
			
		
		
		
		
			}







}
