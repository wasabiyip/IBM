/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;
/**
/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Account_stockInf //���ʸ��˳ֹ�
{

	static int i1;
	static int i2;
	static int i3;
	static float i4;
	static int i5;
	
	public static int the_date_fun(int accid)//�������ʱ��
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
								// TODO �Զ����� catch ��
								e.printStackTrace();
							}
					return i1;
		
		
	}
	
	
	public static int the_time_fun(int accid)  //����������ڣ�
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
										//System.out.print(i2);
							} catch (SQLException e) {
								// TODO �Զ����� catch ��
								e.printStackTrace();
							}
					return i2;
		
		

		
	}
	
	public static int accsto_fun(int accid)   //���ع�Ʊid
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
							//	System.out.print(i3);
					} catch (SQLException e) {
						// TODO �Զ����� catch ��
						e.printStackTrace();
					}
			return i3;
		}
	public static float price_fun(int accid)//��������۸�
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
				// TODO �Զ����� catch ��
				e.printStackTrace();
			}
	return i4;

		}
	public static int accnum_fun(int accid)  //�����������
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
									// TODO �Զ����� catch ��
									e.printStackTrace();
								}
return i5;
		}
	
	
	
	
	
	
	
	

}
