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
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Stockrs {
public  double stomax;
public  double stomin;
public  double sto_yesterday;
public  double jstopri;
public  Act[]a;
	public  void set_price(int stockid,double price)   //���ù�Ʊ�۸� 
						  {
		//System.out.println("shezhi jiage "+price+stockid);
							DB2Connection conn  =DoConnection.getCon();
		//�����Ƿ������ֵ����Сֵ 
							  try {
								PreparedStatement	ps =conn.prepareStatement(
																		 "select  sto_yesterday,stomax,stomin,stopri from con35.stock where stockid="+stockid+"");
								//  PreparedStatement	ps =conn.prepareStatement(
										//  "update  CON35.sellentrust set sellchecks="+check+"where sellencon="+sellencon+"");
							  //PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
							  ResultSet rs = ps.executeQuery(); 
					rs.next();
					sto_yesterday=rs.getDouble("sto_yesterday");
					stomax=rs.getDouble("stomax");
					stomin=rs.getDouble("stomin");
					jstopri=rs.getDouble("stopri");
					//System.out.println("jkjks"); 
					//System.out.println(stomin);
					if(price>stomax)
					{
						 	ps =conn.prepareStatement( "update  CON35.STOCK set STOMAX="+price+" where stockid="+stockid+"");
						 	ps.executeUpdate();
					}
						if (price<stomin)
						{
							ps =conn.prepareStatement( "update  CON35.STOCK set STOmin="+price+" where stockid="+stockid+"");
														ps.executeUpdate();		
														//System.out.println("jkjk"); 
						}
						ps =conn.prepareStatement( "update  CON35.STOCK set STOpri="+price+", stozhengfu = (stomax - stomin) / sto_yesterday , stozhangfu = (stopri - sto_yesterday) / sto_yesterday ,bp1= "+price+" - 0.01 ,bp2="+price+" - 0.02, bp3="+price+" - 0.03,bp4="+price+" - 0.04,bp5="+price+" - 0.05,sp1="+price+" + 0.01, sp2="+price+" + 0.02,sp3="+price+" + 0.03,sp4="+price+" + 0.04,sp5="+price+" + 0.05 where stockid="+stockid+"");
					
													ps.executeUpdate();
							
				
				   //�Ȳ��ҳ����ļ����û�ӵ�������Ʊ
				   //���޸���Ӧ�û��ϵĹ�Ʊ��ֵ
			 
				//ps =conn.prepareStatement("select count(auto_id) as h from CON35.auto_stock where acctsto = "+ stockid+ "");
										//	rs=ps.executeQuery();
				//rs.next();
				//int i=rs.getInt("h");
				
	            a=new Act[1000];
	           // System.out.println(i);
				ps =conn.prepareStatement("select auto_id, acctnum from CON35.auto_stock where acctsto = "+ stockid+ "");
								rs=ps.executeQuery();										  
				int i=0;
				while(rs.next())
							  {
							  	a[i]=new Act();
							  	a[i].accountid=rs.getInt("auto_id");
							  //	System.out.println(a[b].accountid);
							  	a[i].acctnum=rs.getInt("acctnum");
							  	//a[b].dis();
							       i++;
							  }
						  
			int	b=0;
				int ac;
				int an;
				double s=(price-jstopri);
				//System.out.println(s);
				while(b<i)
				{
					//System.out.println("fanhuide "+i+"   "+b);
					//a[b].dis();
				ac=a[b].accountid;
				an=a[b].acctnum;
				s=s*an*100;
			
				//System.out.println(s);
				ps =conn.prepareStatement("update con35.account_auto set ACCTSTOVALUE = "+s+" + acctstovalue,accttotal= "+s+" + accttotal where acctid="+ac+"");	
				
			try
				{
					ps.executeUpdate();
				}
				catch(Exception ex)
				{
					System.out.print(ex.toString());
				}
				
				b++;
				}
				
				
				
							  } catch (SQLException e) {
								
								  e.printStackTrace();
							  }
		
						  }
						  
						  
	public static void day_over()   //���ù�Ʊ�۸� 
								  {
																	 //�����ڼ۸�д������۸�
																	 //�����ֵ����Сֵ����Ϊ���̼�
																	 //���Ƿ��ȣ��������Ϊ0 
																	 //�ڹ�Ʊ��ʷ��¼�������һ����Ϣ
									DB2Connection conn  =DoConnection.getCon();
				//�����Ƿ������ֵ����Сֵ 
			try {
	PreparedStatement	ps =conn.prepareStatement("update con35.stock set sto_yesterday=stopri,stomax=stopri,stomin=stopri,stozhengfu=0,stozhangfu=0");
										//  PreparedStatement	ps =conn.prepareStatement(
												//  "update  CON35.sellentrust set sellchecks="+check+"where sellencon="+sellencon+"");
									  //PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
						ps.executeUpdate();
								  }catch (SQLException e) {
								
								  e.printStackTrace();
							  }
							  }
							  



//�����¼
//ɾ����¼
}
