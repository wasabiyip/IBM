/*
 * �������� 2007-9-24
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
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Parameter {

public static double i1;

	
		public static void set_zc(int style,double zc)
						{
		
							DB2Connection conn  =DoConnection.getCon();
		
							try {
								PreparedStatement	ps =conn.prepareStatement(
										"Insert into CON35.parameter " + "values(?,?)");
							//PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					           ps.setDouble(1, zc);
								ps.setInt(2, style);
								
							   ps.executeUpdate(); 
							//rs.beforeFirst(); 
				
							} catch (SQLException e) {
								// TODO �Զ����� catch ��
								e.printStackTrace();
							}
		
						}
	 public static double get_zc(int style)
	 {
		DB2Connection conn  =DoConnection.getCon();
		
						try {
							PreparedStatement	ps =conn.prepareStatement(
									"select zc from CON35.Parameter where idsty = "
										+ style
										+ "");
						
							ResultSet rs = ps.executeQuery(); 
							//rs.beforeFirst(); 
							rs.next();
									  i1=rs.getDouble("zc");
								//	System.out.print(i1);
						} catch (SQLException e) {
							// TODO �Զ����� catch ��
							e.printStackTrace();
						}
				return i1;
	 }
					
	}
