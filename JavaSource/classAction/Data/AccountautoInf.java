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
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class AccountautoInf //����ģ���ʻ���
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

	public static double acctzc_fun(int acctid)//���� �������ж�
	
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
				// TODO �Զ����� catch ��
				e.printStackTrace();
			}
		
		
		
			return i;
		
		//public double accreturn(int accid);//chushi zijin
				//public double total(int accid);//zongzijin 
		
		
			//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
			}
	public static int acctsty_fun(int acctid)//����id ���� �û� ���� 
	
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
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
		
		
		
				return i1;
		
			//public double accreturn(int accid);//chushi zijin
					//public double total(int accid);//zongzijin 
		
		
				//PreparedStatement ps = conn.prepareStatement("select ACCfund from CON35.ACCOUNT where ACCid = "+accid+ "");
				}

}
 
 