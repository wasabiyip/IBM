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
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Buyentrustrs 

{    
	
	//
	//��ί�в������
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
							// TODO �Զ����� catch ��
							e.printStackTrace();
						}
		
					}
					
		
					//
//
//��ί�гɽ�������checks Ϊ1
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
							  // TODO �Զ����� catch ��
							  e.printStackTrace();
						  }
		
					  }

}
