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

import bsdata.Ig;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;
/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class StockInf //���ʸ�����Ϣ��

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
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
		return i4;// TODO �Զ����ɷ������
	
	}
	 
	
	
	public static  double stopri_fun(int stockid)       //�����ּ�
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
					// TODO �Զ����� catch ��
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
						// TODO �Զ����� catch ��
						e.printStackTrace();
					}
			return i1;
		}
	public static int fhong_fun(int stockid)   //���ظù�Ʊ��û�зֺ졣
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
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
		return i2;
		
	}
	public static double zong_zhi()   //���ظù�Ʊ��û�зֺ졣
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
				// TODO �Զ����� catch ��
				e.printStackTrace();
			}
			return zongzhi;
		
		}
	
	public static double stozhangfu_fun(int stockid)   //���ظù�Ʊ��û�С�
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
				// TODO �Զ����� catch ��
				e.printStackTrace();
			}
		return i3;
		
		}

	public static void stozhangfu_fun_all()   //���ظù�Ʊ��û�С�
		{
			s=new String[11];
			s[0]="�Ĵ�����";
			s[1]="���";
			s[2]="��������";
			s[3]="�й���ͨ";
			s[4]="�������";
			s[5]="�й�ʯ��";
			s[6]="�Ϸ�����";
			s[7]="�Ÿ��";
			s[8]="һ���γ�";
			s[9]="��������";
			s[10]="�����̳�";
			
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
				    System.out.println("��Ʊ���ƣ�"+s[i]+"��Ʊid: "+id+"�����"+ToString.T(i5)+"�Ƿ���"+ToString.T(i3));
				    System.out.println(" ");
				    i++;
				 
				}
					//	System.out.print(i3);
			} catch (SQLException e) {
				// TODO �Զ����� catch ��
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
						// TODO �Զ����� catch ��
						e.printStackTrace();
					}
				return xinxi;
				}

	/**
	 * @param stockid
	 * @return
	 */


	

}
