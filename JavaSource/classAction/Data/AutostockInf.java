package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bsdata.Ig;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;

public class AutostockInf 

{
	//String a1;
public static	boolean a;
	public static lishigu[] all_fun(int acctid,Ig a)    
		{
			lishigu[] xinxi=null;
		
		///fan hui yi ge lei de suzhu
		DB2Connection conn  =DoConnection.getCon();
		
			try {
	PreparedStatement	ps =conn.prepareStatement(
						"select count(auto_id) as h from CON35.auto_stock where auto_id = "
							+ acctid
							+ " and guadan=0");
				int i;	
				ResultSet rs = ps.executeQuery(); 
				//rs.beforeFirst(); 
				rs.next();
						  i=rs.getInt("h");
						  a.i=i;
				if(a.i==0)
				{
					return xinxi;		 
				}
				
					//System.out.print("shuliang"+i+"hong");/////////////////////////////////////////////////
		xinxi	=new lishigu[i];
				i=0;
				//System.out.print("shuliang"+i+"a,i"+a.i);
			ps =conn.prepareStatement(
								" SELECT CON35.AUTO_STOCK.ACCTSTO,CON35.AUTO_STOCK.ACCTNUM," +								"CON35.AUTO_STOCK.ACCTPRICE,CON35.AUTO_STOCK.ACCTTIME,CON35.STOCK.STOPRI FROM" +								" CON35.ACCOUNT_AUTO LEFT JOIN CON35.AUTO_STOCK" +								" ON CON35.AUTO_STOCK.AUTO_ID =CON35.ACCOUNT_AUTO.ACCTID " +								"LEFT JOIN CON35.STOCK ON CON35.AUTO_STOCK.ACCTSTO=CON35.STOCK.STOCKID" +								" WHERE CON35.ACCOUNT_AUTO.ACCTID="+acctid+" and con35.auto_stock.guadan=0");
								
						 rs = ps.executeQuery();					
				//System.out.println("wodezhi"+i); 	
				while(rs.next()){
					
					//System.out.println("wodezhi"+i);   //////////////////////////////////////////
					xinxi[i]=new lishigu();
					xinxi[i].stoid=rs.getInt("ACCTSTO");
					xinxi[i].stonum=rs.getInt("ACCTNUM");
					xinxi[i].buypri=rs.getDouble("ACCTPRICE");
					xinxi[i].time=rs.getTimestamp("ACCTTIME");
					xinxi[i].nowpri=rs.getDouble("STOPRI");
		         
				//   xinxi[i].dis();
				   i++;					}
							
										
						

			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		return xinxi;
		}
					
	public static lishigu[] np_g_bp_fun(int acctid,Ig a)
			{
				lishigu[] xinxi=null;
		
			///fan hui yi ge lei de suzhu
			DB2Connection conn  =DoConnection.getCon();
				try {
		//PreparedStatement	ps =conn.prepareStatement(
		//					"select count(auto_id) as h from CON35.auto_stock where auto_id = "
		//						+ acctid
		//						+ "");
		//					int i;
		//			ResultSet rs = ps.executeQuery(); 
					//rs.beforeFirst(); 
		//			rs.next();
		//					  i=rs.getInt("h");
		//					  a.i=i;
		//					System.out.print(i);
		//	xinxi	=new lishigu[i];
		
				PreparedStatement		ps =conn.prepareStatement(
									" SELECT CON35.AUTO_STOCK.ACCTSTO,CON35.AUTO_STOCK.ACCTNUM," +
									"CON35.AUTO_STOCK.ACCTPRICE,CON35.AUTO_STOCK.ACCTTIME,con35.stock.stozhangfu,CON35.STOCK.STOPRI FROM" +
									" CON35.ACCOUNT_AUTO LEFT JOIN CON35.AUTO_STOCK" +
									" ON CON35.AUTO_STOCK.AUTO_ID =CON35.ACCOUNT_AUTO.ACCTID " +
									"LEFT JOIN CON35.STOCK ON CON35.AUTO_STOCK.ACCTSTO=CON35.STOCK.STOCKID" +
									" WHERE (CON35.auto_stock.ACCTPRICE * 0.95) > con35.stock.stopri and con35.account_auto.acctid="+acctid+"");
								
					ResultSet	 rs = ps.executeQuery();
					int i=0;					
					while(rs.next()){
						i++;
					}	
					a.i=i;
				ps =conn.prepareStatement(
														" SELECT CON35.AUTO_STOCK.ACCTSTO,CON35.AUTO_STOCK.ACCTNUM," +
														"CON35.AUTO_STOCK.ACCTPRICE,CON35.AUTO_STOCK.ACCTTIME,con35.stock.stozhangfu,CON35.STOCK.STOPRI FROM" +
														" CON35.ACCOUNT_AUTO LEFT JOIN CON35.AUTO_STOCK" +
														" ON CON35.AUTO_STOCK.AUTO_ID =CON35.ACCOUNT_AUTO.ACCTID " +
														"LEFT JOIN CON35.STOCK ON CON35.AUTO_STOCK.ACCTSTO=CON35.STOCK.STOCKID" +
														" WHERE (CON35.auto_stock.ACCTPRICE * 0.95) > con35.stock.stopri and con35.account_auto.acctid="+acctid+"");
								
									 rs = ps.executeQuery();
					xinxi=new lishigu[i];
					i=0;
					while(rs.next()){
					
						//System.out.println(i);
						xinxi[i]=new lishigu();
						xinxi[i].stoid=rs.getInt("ACCTSTO");
						xinxi[i].stonum=rs.getInt("ACCTNUM");
						xinxi[i].buypri=rs.getDouble("ACCTPRICE");
						xinxi[i].time=rs.getTimestamp("ACCTTIME");
						xinxi[i].zhangfu=rs.getDouble("stozhangfu");
						xinxi[i].nowpri=rs.getDouble("STOPRI");
		         
					//   xinxi[i].dis();
					   i++;					}
							
										
						

				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			return xinxi;
			}
	public static lishigu[] np_l_bp_fun(int acctid,Ig a)
				{
					lishigu[] xinxi=null;
		
				///fan hui yi ge lei de suzhu
				DB2Connection conn  =DoConnection.getCon();
		
					try {
			//PreparedStatement	ps =conn.prepareStatement(
			//					"select count(auto_id) as h from CON35.auto_stock where auto_id = "
			//						+ acctid
			//						+ "");
			//					int i;
			//			ResultSet rs = ps.executeQuery(); 
						//rs.beforeFirst(); 
			//			rs.next();
			//					  i=rs.getInt("h");
			//					  a.i=i;
			//					System.out.print(i);
			//	xinxi	=new lishigu[i];
		
					PreparedStatement		ps =conn.prepareStatement(
										" SELECT CON35.AUTO_STOCK.ACCTSTO,CON35.AUTO_STOCK.ACCTNUM," +
										"CON35.AUTO_STOCK.ACCTPRICE,CON35.AUTO_STOCK.ACCTTIME,con35.stock.stozhangfu,CON35.STOCK.STOPRI FROM" +
										" CON35.ACCOUNT_AUTO LEFT JOIN CON35.AUTO_STOCK" +
										" ON CON35.AUTO_STOCK.AUTO_ID =CON35.ACCOUNT_AUTO.ACCTID " +
										"LEFT JOIN CON35.STOCK ON CON35.AUTO_STOCK.ACCTSTO=CON35.STOCK.STOCKID" +
										" WHERE (CON35.auto_stock.ACCTPRICE * 1.05) < con35.stock.stopri and con35.account_auto.acctid="+acctid+"");
								
						ResultSet	 rs = ps.executeQuery();
						int i=0;					
						while(rs.next()){
							i++;
						}	
						a.i=i;
					ps =conn.prepareStatement(
															" SELECT CON35.AUTO_STOCK.ACCTSTO,CON35.AUTO_STOCK.ACCTNUM," +
															"CON35.AUTO_STOCK.ACCTPRICE,CON35.AUTO_STOCK.ACCTTIME,con35.stock.stozhangfu,CON35.STOCK.STOPRI FROM" +
															" CON35.ACCOUNT_AUTO LEFT JOIN CON35.AUTO_STOCK" +
															" ON CON35.AUTO_STOCK.AUTO_ID =CON35.ACCOUNT_AUTO.ACCTID " +
															"LEFT JOIN CON35.STOCK ON CON35.AUTO_STOCK.ACCTSTO=CON35.STOCK.STOCKID" +
															" WHERE (CON35.auto_stock.ACCTPRICE * 1.05) < con35.stock.stopri and con35.account_auto.acctid="+acctid+"");
								
										 rs = ps.executeQuery();
						xinxi=new lishigu[i];
						i=0;
						while(rs.next()){
					
							//System.out.println(i);
							xinxi[i]=new lishigu();
							xinxi[i].stoid=rs.getInt("ACCTSTO");
							xinxi[i].stonum=rs.getInt("ACCTNUM");
							xinxi[i].buypri=rs.getDouble("ACCTPRICE");
							xinxi[i].time=rs.getTimestamp("ACCTTIME");
							xinxi[i].zhangfu=rs.getDouble("stozhangfu");
							xinxi[i].nowpri=rs.getDouble("STOPRI");
		         
						//   xinxi[i].dis();
						   i++;					}
							
										
						

					} catch (SQLException e) {
						// TODO 自动生成 catch 块
						e.printStackTrace();
					}
				return xinxi;
				}
	public static boolean exist(int acctid,int stockid)  //减少ACCTFUND增加 ACCTSTOVALUE
	{
	
		DB2Connection conn  =DoConnection.getCon();
			try {
	 	
				
				PreparedStatement	ps =conn.prepareStatement(
					"select auto_id from CON35.auto_stock where auto_id = "+ acctid+ " and acctsto= "+stockid+" ");	
					ResultSet rs=ps.executeQuery();
					if(rs.next()) a=true;
					else a=false;
						//		
						  } catch (SQLException e) {
						
							  e.printStackTrace();
						  }
			
 	return a;
 	
	}
}