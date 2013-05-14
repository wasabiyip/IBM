/*
 * 创建日期 2007-9-9
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package deal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Random;

import bsdata.Ig;
import classAction.Data.AccountautoInf;
import classAction.Data.Accountautors;
import classAction.Data.AutostockInf;
import classAction.Data.Autostockrs;
import classAction.Data.Gupiao;
import classAction.Data.Hisaccrs;
import classAction.Data.Sellentrustrs;
import classAction.Data.StockInf;
import classAction.Data.Stockrs;
import classAction.Data.ToString;
import classAction.Data.Wt;
import classObject.User_fifth;
import classObject.User_first;
import classObject.User_fourth;
import classObject.User_second;
import classObject.User_third;

import com.ibm.db2.jcc.DB2Connection;

import connection.DoConnection;
import function.Interest;
/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Buy      //在这边把能够购买的股票改成思友的 


{
	
//static Wt[] wt;	
//static Gupiao[] a1;
Wt a;
 Gupiao[] sty_gu;
 Gupiao[] sty_gu1;
 Gupiao i_w;
public  Gupiao buy_id(int acctid)
  
 {
 	//先查询自己的总的余额，总的余额/100计算出可买价格   查表：account /accfund
  int i=AccountautoInf.acctsty_fun(acctid);//查股（每种用户都有自己可购买的类型），首先判断该股票的价格是不是不大于可买价格，
 switch(i)
  {
	case 1:
	int s=0;
	int s1=0;
	Ig n=new Ig();   
	Ig n1=new Ig();        //根据股票类型 返回股票 
	sty_gu=StockInf.all_fun(User_first.sty1,n);
// System.out.println("类型4的股票"+n.i);
	for(int j=0;j<n.i;j++)
{
//	System.out.println(j);
	//System.out.println("case 1"+sty_gu[j].stockid);
		if(Interest.profit_stock(sty_gu[j].stockid)<User_first.interest)
		{
			//System.out.println("hong");
			//sty_gu[j].dis();
			sty_gu[j].stockid=0;
		}
		else 
		{
			s++;
			if(StockInf.fhong_fun(sty_gu[j].stockid)==1)
			{
			sty_gu[j].y=1;
			   s1++;
			} 
		}		
	
}
	
		//System.out.println("xuanchude"+n.i);
		sty_gu1=StockInf.all_fun(User_first.sty2,n1);
	//System.out.println("类型5的股票"+n1.i);
		for(int j=0;j<n1.i;j++)
	
{
	//System.out.println("case1:"+sty_gu1[j].stockid);
		if(Interest.profit_stock(sty_gu1[j].stockid)<User_first.interest)
		{
			//sty_gu1[j].dis();
				sty_gu1[j].stockid=0;
		}
		else 
		{
			s++;
		if(StockInf.fhong_fun(sty_gu1[j].stockid)==1)
				{
			sty_gu1[j].y=1;
				  s1++;
				} 		
	
		}
}
		//	System.out.println("xuanchudeleixinger"+n1.i);
			if(s1!=0)
{
			
				int t;
						Random rand = new Random();
		
						t = rand.nextInt(s1); 
						int t1=-1;
						//System.out.println("第"+ t);
				for(int j=0;j<n.i;j++)
		{	
			//System.out.println("gupiao"+sty_gu[j].stockid);
					if(sty_gu[j].stockid!=0)
					{
				
					if(sty_gu[j].y==1);
					{
						t1++;
						if(t1==t)
						{
							if(AutostockInf.exist(acctid,sty_gu[j].stockid));
							else
							{
							i_w=sty_gu[j];
							//sty_gu[j].dis();
							break;
							}
						}
					} 		
	
					}
		}
			  for(int j=0;j<n1.i;j++)
		{
	//	System.out.println("gupiao"+sty_gu1[j].stockid);
			
						if(sty_gu1[j].stockid!=0)
						{
						if(sty_gu1[j].y==1)
							 {
								t1++;
								if(t1==t)
								{
									if(AutostockInf.exist(acctid,sty_gu1[j].stockid));
									else
									{
									
									i_w=sty_gu1[j];
								//	sty_gu[j].dis();
									break;
									}		
								}
							 }
							
						} 		
	
		}
	
			
			
}
		else{
				if(s!=0)
				{
					int t;
										Random rand = new Random();
		
										t = rand.nextInt(s); 
										int t1=-1;
									//	System.out.println("第"+ t);
								for(int j=0;j<n.i;j++)
									{
									if(sty_gu[j].stockid!=0)
									{
				
									t1++;
										if(t1==t)
										{
											if(AutostockInf.exist(acctid,sty_gu[j].stockid));
											else
											{
											i_w=sty_gu[j];
										//	sty_gu[j].dis();
											break;
											}
											
										}
									} 		
	
									}
							  for(int j=0;j<n1.i;j++)
										{
										if(sty_gu1[j].stockid!=0)
										{
								
												t1++;
												if(t1==t)
												{
													if(AutostockInf.exist(acctid,sty_gu1[j].stockid));
													else
													{
												
													i_w=sty_gu1[j];
												//	sty_gu[j].dis();
													break;
													}
												}
										 }
							
										} 		
	
				}
		
				
				else
				{
					i_w=null;
					break;
				}

		}
  	
		break;
		
		
		
		
		
		
	case 2:
	int s2=0;
		int s12=0;
		Ig n2=new Ig();   
		Ig n12=new Ig();        //根据股票类型 返回股票 
		sty_gu=StockInf.all_fun(User_second.sty1,n2);
	//System.out.println("case:"+n2.i);
		for(int j=0;j<n2.i;j++)
	{
		//System.out.println("case"+j);
		//sty_gu[j].dis();
		//System.out.println("liexi"+User_second.sty1+sty_gu[j].stockid);
			if(Interest.profit_stock(sty_gu[j].stockid)<User_second.interest)
			{
				//sty_gu[j].dis();
				sty_gu[j].stockid=0;
			}
			else 
			{
				s2++;
				if(StockInf.fhong_fun(sty_gu[j].stockid)==1)
				{
				sty_gu[j].y=1;
				   s12++;
				} 
			}		
	
	}
	
			//System.out.println("xuanchude"+n.i);
			sty_gu1=StockInf.all_fun(User_second.sty2,n12);
		
			for(int j=0;j<n12.i;j++)
	{
		//System.out.println("case2:"+j);
		//sty_gu[j].dis();
			if(Interest.profit_stock(sty_gu1[j].stockid)<User_second.interest)
			{    //  sty_gu1[j].dis();
					sty_gu1[j].stockid=0;
			}
			else 
			{
				s2++;
				//System.out.println("fenhong case2"+j);
				//sty_gu1[j].dis();
			if(StockInf.fhong_fun(sty_gu1[j].stockid)==1)
					{
				sty_gu1[j].y=1;
					  s12++;
					} 		
	
			}
	}
			//	System.out.println("xuanchudeleixinger"+n1.i);
				if(s12!=0)
	{
			
					int t;
							Random rand = new Random();
		
							t = rand.nextInt(s12); 
							int t1=-1;
							//System.out.println("第"+ t);
					for(int j=0;j<n2.i;j++)
			{
						if(sty_gu[j].stockid!=0)
						{
				
						if(sty_gu[j].y==1);
						{
							t1++;
							if(t1==t)
							{
								if(AutostockInf.exist(acctid,sty_gu[j].stockid));
								else
								{
								i_w=sty_gu[j];
								//sty_gu[j].dis();
								break;
								}
							}
						} 		
	
						}
			}
				  for(int j=0;j<n12.i;j++)
			{
			
			
							if(sty_gu1[j].stockid!=0)
							{
							if(sty_gu1[j].y==1)
								 {
									t1++;
									if(t1==t)
									{
										if(AutostockInf.exist(acctid,sty_gu1[j].stockid));
										else
										{
									
										i_w=sty_gu1[j];
									//	sty_gu[j].dis();
										break;
										}		
									}
								 }
							
							} 		
	
			}
	
			
			
	}
			else{
					if(s2!=0)
					{
						int t;
											Random rand = new Random();
		
											t = rand.nextInt(s2); 
											int t1=-1;
										//	System.out.println("第"+ t);
									for(int j=0;j<n2.i;j++)
										{
										if(sty_gu[j].stockid!=0)
										{
				
										t1++;
											if(t1==t)
											{
												if(AutostockInf.exist(acctid,sty_gu[j].stockid));
												else
												{
												i_w=sty_gu[j];
											//	sty_gu[j].dis();
												break;
												}
											
											}
										} 		
	
										}
								  for(int j=0;j<n12.i;j++)
											{
											if(sty_gu1[j].stockid!=0)
											{
								
													t1++;
													if(t1==t)
													{
														if(AutostockInf.exist(acctid,sty_gu1[j].stockid));
														else
														{
												
														i_w=sty_gu1[j];
													//	sty_gu[j].dis();
														break;
														}
													}
											 }
							
											} 		
	
					}
		
				
					else
					{
						i_w=null;
						break;
					}

			}
  	
	
	
	
	
	
	
	case 3:
	int s3=0;
		int s13=0;
		Ig n3=new Ig();   
		Ig n13=new Ig();        //根据股票类型 返回股票 
		sty_gu=StockInf.all_fun(User_third.sty1,n3);
	//System.out.println("leixing"+ User_third.sty1+"  " +n3.i);
		for(int j=0;j<n3.i;j++)
	{
	//	sty_gu[j].dis();
		//System.out.println(j);
			if(Interest.profit_stock(sty_gu[j].stockid)<User_third.interest)
			{
				sty_gu[j].stockid=0;
			}
			else 
			{
				s3++;
				if(StockInf.fhong_fun(sty_gu[j].stockid)==1)
				{
				sty_gu[j].y=1;
				   s13++;
				} 
			}		
	
	}
	
			//System.out.println("xuanchude"+n.i);
			sty_gu1=StockInf.all_fun(User_third.sty2,n13);
		//System.out.println("leixing case3"+ User_third.sty2+"  " +n13.i);
			for(int j=0;j<n13.i;j++)
	{
		//System.out.println("case3"+j);
			if(Interest.profit_stock(sty_gu1[j].stockid)<User_third.interest)
			{
					sty_gu1[j].stockid=0;
			}
			else 
			{
				s3++;
			if(StockInf.fhong_fun(sty_gu1[j].stockid)==1)
					{
				sty_gu1[j].y=1;
					  s13++;
					} 		
	
			}
	}
			//	System.out.println("xuanchudeleixinger"+n1.i);
				if(s13!=0)
	{
			
					int t;
							Random rand = new Random();
		
							t = rand.nextInt(s13); 
							int t1=-1;
							//System.out.println("第"+ t);
					for(int j=0;j<n3.i;j++)
			{
						if(sty_gu[j].stockid!=0)
						{
				
						if(sty_gu[j].y==1);
						{
							t1++;
							if(t1==t)
							{
								if(AutostockInf.exist(acctid,sty_gu[j].stockid));
								else
								{
								i_w=sty_gu[j];
								//sty_gu[j].dis();
								break;
								}
							}
						} 		
	
						}
			}
				  for(int j=0;j<n13.i;j++)
			{
			
			
							if(sty_gu1[j].stockid!=0)
							{
							if(sty_gu1[j].y==1)
								 {
									t1++;
									if(t1==t)
									{
										if(AutostockInf.exist(acctid,sty_gu1[j].stockid));
										else
										{
									
										i_w=sty_gu1[j];
									//	sty_gu[j].dis();
										break;
										}		
									}
								 }
							
							} 		
	
			}
	
			
			
	}
			else{
					if(s3!=0)
					{
						int t;
											Random rand = new Random();
		
											t = rand.nextInt(s3); 
											int t1=-1;
										//	System.out.println("第"+ t);
									for(int j=0;j<n3.i;j++)
										{
										if(sty_gu[j].stockid!=0)
										{
				
										t1++;
											if(t1==t)
											{
												if(AutostockInf.exist(acctid,sty_gu[j].stockid));
												else
												{
												i_w=sty_gu[j];
											//	sty_gu[j].dis();
												break;
												}
											
											}
										} 		
	
										}
								  for(int j=0;j<n13.i;j++)
											{
											if(sty_gu1[j].stockid!=0)
											{
								
													t1++;
													if(t1==t)
													{
														if(AutostockInf.exist(acctid,sty_gu[j].stockid));
														else
														{
												
														i_w=sty_gu[j];
													//	sty_gu[j].dis();
														break;
														}
													}
											 }
							
											} 		
	
					}
		
				
					else
					{
						i_w=null;
						break;
					}

			}
  	
			break;
		
		
		
		
	
	case 4:
	int s4=0;
		int s14=0;
		Ig n4=new Ig();   
		Ig n14=new Ig();        //根据股票类型 返回股票 
		sty_gu=StockInf.all_fun(User_fourth.sty1,n4);
	//System.out.println("leixing"+ User_third.sty2+"  " +n4.i);
		for(int j=0;j<n4.i;j++)
	{//sty_gu[j].dis();
		//System.out.println("case4"+j);
			if(Interest.profit_stock(sty_gu[j].stockid)<User_fourth.interest)
			{
				sty_gu[j].stockid=0;
			}
			else 
			{
				s4++;
				if(StockInf.fhong_fun(sty_gu[j].stockid)==1)
				{
				sty_gu[j].y=1;
				   s14++;
				} 
			}		
	
	}
	
			//System.out.println("xuanchude"+n.i);
			//sty_gu1=StockInf.all_fun(User_first.sty2,n1);
		
			for(int j=0;j<n14.i;j++)
	{
			if(Interest.profit_stock(sty_gu1[j].stockid)<User_fourth.interest)
			{
					sty_gu1[j].stockid=0;
			}
			else 
			{
				s4++;
			if(StockInf.fhong_fun(sty_gu1[j].stockid)==1)
					{
				sty_gu1[j].y=1;
					  s14++;
					} 		
	
			}
	}
			//	System.out.println("xuanchudeleixinger"+n1.i);
				if(s14!=0)
	{
			
					int t;
							Random rand = new Random();
		
							t = rand.nextInt(s14); 
							int t1=-1;
							//System.out.println("第"+ t);
					for(int j=0;j<n4.i;j++)
			{
						if(sty_gu[j].stockid!=0)
						{
				
						if(sty_gu[j].y==1);
						{
							t1++;
							if(t1==t)
							{
								if(AutostockInf.exist(acctid,sty_gu[j].stockid));
								else
								{
								i_w=sty_gu[j];
								//sty_gu[j].dis();
								break;
								}
							}
						} 		
	
						}
			}
				  for(int j=0;j<n14.i;j++)
			{
			
			
							if(sty_gu1[j].stockid!=0)
							{
							if(sty_gu1[j].y==1)
								 {
									t1++;
									if(t1==t)
									{
										if(AutostockInf.exist(acctid,sty_gu[j].stockid));
										else
										{
									
										i_w=sty_gu[j];
									//	sty_gu[j].dis();
										break;
										}		
									}
								 }
							
							} 		
	
			}
	
			
			
	}
			else{
					if(s4!=0)
					{
						int t;
											Random rand = new Random();
		
											t = rand.nextInt(s4); 
											int t1=-1;
										//	System.out.println("第"+ t);
									for(int j=0;j<n4.i;j++)
										{
										if(sty_gu[j].stockid!=0)
										{
				
										t1++;
											if(t1==t)
											{
												if(AutostockInf.exist(acctid,sty_gu[j].stockid));
												else
												{
												i_w=sty_gu[j];
											//	sty_gu[j].dis();
												break;
												}
											
											}
										} 		
	
										}
								  for(int j=0;j<n14.i;j++)
											{
											if(sty_gu1[j].stockid!=0)
											{
								
													t1++;
													if(t1==t)
													{
														if(AutostockInf.exist(acctid,sty_gu[j].stockid));
														else
														{
												
														i_w=sty_gu[j];
													//	sty_gu[j].dis();
														break;
														}
													}
											 }
							
											} 		
	 
					}
		
				
					else
					{
						i_w=null;
						break;
					}

			}
  	
			break;
		
		
		
		
	
	case 5:
	int s5=0;
		int s15=0;
		Ig n5=new Ig();   
     //根据股票类型 返回股票 
		sty_gu=StockInf.all_fun(User_fifth.sty1,n5);
//System.out.println(User_fifth.sty1+n5.i);
		for(int j=0;j<n5.i;j++)
	{
		//sty_gu[j].dis();
		//System.out.println("case"+j);
			if(Interest.profit_stock(sty_gu[j].stockid)<User_first.interest)
			{
				sty_gu[j].stockid=0;
			}
			else 
			{
				s5++;
				if(StockInf.fhong_fun(sty_gu[j].stockid)==1)
				{
				sty_gu[j].y=1;
				   s15++;
				} 
			}		
	
	}
	
			
		
				if(s15!=0)
	{
			
					int t;
							Random rand = new Random();
		
							t = rand.nextInt(s15); 
							int t1=-1;
							//System.out.println("第"+ t);
					for(int j=0;j<n5.i;j++)
			{
						if(sty_gu[j].stockid!=0)
						{
				
						if(sty_gu[j].y==1);
						{
							t1++;
							if(t1==t)
							{
								if(AutostockInf.exist(acctid,sty_gu[j].stockid));
								else
								{
								i_w=sty_gu[j];
								//sty_gu[j].dis();
								break;
								}
							}
						} 		
	
						}
			}
				
	
			
			
	}
			else{
					if(s5!=0)
					{
						int t;
											Random rand = new Random();
		
											t = rand.nextInt(s5); 
											int t1=-1;
										//	System.out.println("第"+ t);
									for(int j=0;j<n5.i;j++)
										{
										if(sty_gu[j].stockid!=0)
										{
				
										t1++;
											if(t1==t)
											{
												if(AutostockInf.exist(acctid,sty_gu[j].stockid));
												else
												{
												i_w=sty_gu[j];
											//	sty_gu[j].dis();
												break;
												}
											
											}
										} 		
	
										}
								  
					}
		
				
					else
					{
						i_w=null;
						break;
					}

			}
  	
			break;
		
		
		
		

	default:
	break;
		
}


return i_w; 	
 }
 public static void buy_finish(int acctid,int stockid,int stonum,double price,int guadan)
   {
   	
   	System.out.println("用户: "+acctid +"买入股票："+stockid+"数量："+stonum+"价格："+ToString.T(price));
  	//先往用户拥有的股票表里面加一调信息
  	long t=System.currentTimeMillis();
  	Timestamp time=new Timestamp(t);

	DB2Connection conn  =DoConnection.getCon();
		
					  try {
				    PreparedStatement	ps =conn.prepareStatement("insert into con35.auto_stock values(?,?,?,?,?,?)");
					ps.setInt(1,acctid);
					ps.setInt(2,stockid);
					ps.setInt(3,stonum);
					ps.setDouble(4,price);
					ps.setTimestamp(5,time);
					ps.setInt(6,guadan);
						
					ps.executeUpdate();
					double sum=stonum*price*100;
			       ps =conn.prepareStatement(
					"update con35.account_auto set acctfund=acctfund - "+sum+",acctstovalue=acctstovalue + "+sum+" where acctid="+acctid+"");	
					ps.executeUpdate();
					//		减少手上有这只股票的人的资金
					  } catch (SQLException e) {
						
						  e.printStackTrace();
					  }
			  return ;
 	
}
public  Wt buy_num(int acctid,int stockid)
	 {
	   a=new Wt();
	   double sum1;
	   double acctfund;
	   double mrzjb;
	   int sellencon;
	   double price;
	   int sellentid;
	   int b=0;
	   int number;
	   int number_for_buy;
	  //先往用户拥有的股票表里面加一调信息
  	
	  DB2Connection conn  =DoConnection.getCon();
		
						try {
							PreparedStatement	ps =conn.prepareStatement(
						   "select  ACCTMRZJB,acctfund  from con35.account_auto  where acctid="+acctid+"");
						   ResultSet rs = ps.executeQuery();
						   rs.next();
							mrzjb=rs.getDouble("ACCTMRZJB");
							acctfund=rs.getDouble("acctfund");
							sum1=mrzjb*acctfund;  //
							
					//ps.executeUpdate();
					 // double sum=stonum*price*100;
			 ps =conn.prepareStatement(
					  "select  sellencon,sellspri,sellsnum  from con35.sellentrust  where sellstoid="+stockid+" and sellchecks=0 order by sellspri,sellenttime");	
					  rs = ps.executeQuery();
					  if(rs.next())
										  {
											 a.sellencon=rs.getInt("sellencon");	
											 //a.price=rs.getDouble("sellspri");
											// number=rs.getInt("sellsnum");
											 number_for_buy=(int)(sum1/100/a.price);
											 b=number_for_buy;
											// System.out.println("可买数量"+b);
											 ps =conn.prepareStatement(
																	"select  sellentid,sellencon,sellspri,sellsnum  from con35.sellentrust  where sellstoid="+stockid+" and sellchecks=0 order by sellspri,sellenttime");	
																	rs = ps.executeQuery();
						
										 while(rs.next())
										 {
										 	//System.out.println("hong qiao na ");
											 sellentid=rs.getInt("sellentid");
											 sellencon=rs.getInt("sellencon");	
											 a.price=rs.getDouble("sellspri");
											 number=rs.getInt("sellsnum");
											  b=b-number;
											  if(number==0)
											  { 
											  	Sellentrustrs.set_check(a.sellencon,1);
											  	
											  }
											else if(b<0)//当b的数量小于卖单的量时，就只有买b
											{
											 int i=b+number;
											Sellentrustrs.set_num(sellencon,i);	//首先是减少委托的数量
											 double zijin2=i*a.price*100;
											 //减少卖者的相应资金，以及股票价值
											 Accountautors.str_stock(sellentid,zijin2); 
											// System.out.println(acctid+" "+stockid +" "+i);
											 Autostockrs.str_stock(sellentid,stockid,i);//减少卖者拥有该股票的数量
											 a.num+=i;
											    //1代表卖出
											 long tt1=System.currentTimeMillis();
											 Timestamp kk1=new Timestamp(tt1);
											 Hisaccrs.all_rs(sellentid,sellencon,stockid,kk1,a.price,i,1); 
											// public static void all_rs(int accid,int contract,int stid,Timestamp time,double traval,int num,int fx)
											 System.out.println("用户："+sellentid+"卖出股票"+stockid+"价格："+a.price+"数量："+i+"合同号："+sellencon);  
                                              Stockrs sp=new Stockrs();	
                                               sp.set_price(stockid,a.price);    
									        break;
				       	
				       	 
											}
											 else  //当b的数量大于卖单的量是，就将卖单的量全买
											 {
											  double zijin= a.price* number*100; 
																			  //增加卖者的钱				
											  Sellentrustrs.set_check(sellencon,1);
											  Accountautors.str_stock(sellentid,zijin);    
						                     a.num+=number;
											  Autostockrs.del_stock(sellentid,stockid);		
											  long tt1=System.currentTimeMillis();
											 Timestamp kk1=new Timestamp(tt1);
											 Hisaccrs.all_rs(sellentid,sellencon,stockid,kk1,a.price,number,1); 						//增加卖者的钱				
											  System.out.println("用户: "+sellentid+"卖出股票"+stockid+"价格："+a.price+"手数："+number+"合同号："+sellencon);
											  Stockrs sp=new Stockrs();	
																							 sp.set_price(stockid,a.price);
											 }
						
					
										 }
						
											
						
										  }
										  else
										  {
					 	
											 a.sellencon=0;
											
										  }
					  //		
						} catch (SQLException e) {
						
							e.printStackTrace();
						}
				return a;
 	
  }	
  
  public  void buy(int acctid,int stockid )
 {
  	
	//Gupiao a=buy_id(acctid);
	
	//System.out.println(acctid+"下单购买股票 "+a.stockid);
	//if(a==null)
	//{
		//System.out.println("weikong");
	//	return ;
	//} 
 Wt q=buy_num(acctid,stockid);
if(q.sellencon==0)
{
	//System.out.println(acctid+"购买股票没成功！");
	
}
  else
  {
  	if(q.num==0)
  	{
  		
  	}
  	else
  	{
  	
buy_finish(acctid,stockid,q.num,q.price,0);
//Stockrs sp=new Stockrs();	
//sp.set_price(a.stockid,q.price);    
long tt1=System.currentTimeMillis();
Timestamp kk1=new Timestamp(tt1);
Hisaccrs.all_rs(acctid,0,stockid,kk1,q.price,q.num,0);
  	} 	      //0代表卖出
  }
  	
  }
  
  
 }

  

