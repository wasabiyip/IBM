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
public class Buyentrustrs 

{    
	
	//
	//将委托插入表中
	//
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
					
		
					//
//
//当委托成交后，设置checks 为1
//

  public static void set_check(int buyencon,int check)
					  {
						DB2Connection conn  =DoConnection.getCon();
						  try {
							  PreparedStatement	ps =conn.prepareStatement(
									  "update  CON35.buyentrust set buychecks="+check+"where buyencon="+buyencon+"");
						  //PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
						ps.executeUpdate(); 
							  //rs.beforeFirst(); 
				
						  } catch (SQLException e) {
							  // TODO 自动生成 catch 块
							  e.printStackTrace();
						  }
		
					  }

}
