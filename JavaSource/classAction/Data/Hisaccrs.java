package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import bsdata.Ig;
import classAction.ComFun.Econ;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */


/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Hisaccrs {

public int a;
	public static void all_rs(int accid,int contract,int stid,Timestamp time,double traval,int num,int fx)
						{
							DB2Connection conn  =DoConnection.getCon();
		
							try {
								PreparedStatement	ps =conn.prepareStatement(
										"Insert into CON35.hisacc(accid,contract,stid,tratime,traval,stonum,bos) " + "values(?,?,?,?,?,?,?)");
							//PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
								ps.setInt(1, accid);	
								ps.setInt(2, contract);
								ps.setInt(3, stid);
								ps.setTimestamp(4, time);
								ps.setDouble(5, traval);
								ps.setInt(6, num);
								ps.setInt(7, fx);
							   ps.executeUpdate(); 
							//rs.beforeFirst(); 
				
							} catch (SQLException e) {
								// TODO �Զ����� catch ��
								e.printStackTrace();
							}
		
						}
					




	public  int  znum(int stid,Timestamp time1,Timestamp time2)
							{

								DB2Connection conn  =DoConnection.getCon();
		
								try {
									PreparedStatement	ps =conn.prepareStatement(
											"select sum(stonum) as h from CON35.hisacc where stid="+stid+" and tratime> '"+time1+"'and tratime< '"+time2+"' and bos=1");
											//	
								//PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
								  ResultSet rs=ps.executeQuery();
					             rs.next();
								 a=rs.getInt("h");
								  System.out.println(a);
									
								//rs.beforeFirst(); 
				
								} catch (SQLException e) {
									// TODO �Զ����� catch ��
									e.printStackTrace();
								}
		return a;
							}















}
