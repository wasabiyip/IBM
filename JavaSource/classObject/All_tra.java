/*
 * 创建日期 2007-9-26
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classObject;

import classAction.Data.Robotnum;
import classAction.Data.StockInf;
import deal.Buy;
import deal.Sell;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class All_tra implements Runnable{

					/* （非 Javadoc）
					 * @see java.lang.Runnable#run()
					 */
public void run() {
	
	int num1=Robotnum.get_num(1);
	int num2=Robotnum.get_num(2);
    int num3=Robotnum.get_num(3);
	int num4=Robotnum.get_num(4);
	int num5=Robotnum.get_num(5);
	User_first[] user_first_group=new User_first[num1]; 
	//Thread[] t1=new Thread[num1];

	User_second[] user_second_group=new User_second[num2];
	//Thread[] t2=new Thread[num2];

	  User_third[] user_third_group=new User_third[num3];
//	  Thread[] t3=new Thread[num3];

	  User_fourth[] user_fourth_group=new User_fourth[num4];
//	  Thread[] t4=new Thread[num4];

	  User_fifth[] user_fifth_group=new User_fifth[num5]; 
//	  Thread[] t5=new Thread[num5];
			//Obj_user[] tmpUser=new Obj_user[4];//在这边加上机器人吧 
		
			for(int i=0;i<num1;i++)
			{
				user_first_group[i]=new User_first();
				user_first_group[i].init();
			}
		   for(int i=0;i<num2;i++)
				{
					user_second_group[i]=new User_second();
					 user_second_group[i].init();
				}
			for(int i=0;i<num3;i++)
				{
					user_third_group[i]=new User_third();
					 user_third_group[i].init();
				}
			for(int i=0;i<num4;i++)
				{
					user_fourth_group[i]=new User_fourth();
					 user_fourth_group[i].init();
					
				}
			for(int i=0;i<num5;i++)
				{
					user_fifth_group[i]=new User_fifth();
					 user_fifth_group[i].init();
				}
				int turn=1;
				
			while(turn<6)
				{
					
					try {
					
						   for(int i=0;i<num1;i++)
								{
									Sell.sell(user_first_group[i].account_id);
								}
							for(int i=0;i<num2;i++)
								{
							        Sell.sell(user_second_group[i].account_id);
								}
							for(int i=0;i<num3;i++)
								{

									Sell.sell(user_third_group[i].account_id);
								}
							for(int i=0;i<num4;i++)
								{
																					
								   Sell.sell(user_fourth_group[i].account_id);
					
								}
							for(int i=0;i<num5;i++)
								{
																				
								Sell.sell(user_fifth_group[i].account_id);
								}  
				
							Thread.sleep(10);
						
						for(int i=0;i<num1;i++)
														{
															
															Buy first=new Buy();
															first.buy(user_first_group[i].account_id);
														}
													for(int i=0;i<num2;i++)
														{   Buy second=new Buy();
															second.buy(user_second_group[i].account_id);
														}
													for(int i=0;i<num3;i++)
														{
                                                            Buy third=new Buy();
															third.buy(user_third_group[i].account_id);
														}
													for(int i=0;i<num4;i++)
														{
															Buy fourth=new Buy();						
															fourth.buy(user_fourth_group[i].account_id);
					
														}
													for(int i=0;i<num5;i++)
														{
															Buy fifth=new Buy();
																				
															fifth.buy(user_fifth_group[i].account_id);
														}  
				
						} catch (InterruptedException e) {
							// TODO 自动生成 catch 块
							e.printStackTrace();
						}
								
					turn=turn+1;
					StockInf.stozhangfu_fun_all();
				}
				
				/*
			int i=1;
										while(i<3)
										{
										try
										{
											   Thread.sleep(2000);
										Sell.sell(account_id);
										Thread.sleep(3000);
							
										Buy.buy(account_id);
										//StockInf.stopri_fun(600050);
													//	System.out.println(account_id+"完成一次股票交易");
											  // System.out.println(userName+"完成第"+String.valueOf(i)+"次购买股票");
										}
										catch (InterruptedException e) {
		   
										  // System.out.println(account_id+"完成一次股票交易");
										}	   
										 i=i+1;
										}*/
					}

}
