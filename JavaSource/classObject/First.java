/*
 * 创建日期 2007-9-27
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classObject;

import classAction.Data.Robotnum;
import deal.Buy;
import deal.Sell;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class First implements Runnable{

	/* （非 Javadoc）
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		int num1=Robotnum.get_num(1);
		User_first[] user_first_group=new User_first[num1]; 
		int j=0;
		while(j<40)
		{
		
		for(int i=0;i<num1;i++)
					{
						user_first_group[i]=new User_first();
						user_first_group[i].init();
					}
						for(int i=0;i<num1;i++)
														{
															Sell.sell(user_first_group[i].account_id);
														}
						for(int i=0;i<1;i++)
																				{
																					//System.out.println("jinru mai de liucheng");
																					Buy first=new Buy();
																				first.buy(user_first_group[i].account_id,600723);
																			}
			for(int i=1;i<3;i++)
																							{
																								Buy first=new Buy();
																							first.buy(user_first_group[i].account_id,600177);
																	
																						}
			for(int i=3;i<6;i++)
																							{
																								Buy first=new Buy();
																							first.buy(user_first_group[i].account_id,600028);
																						}
			for(int i=6;i<10;i++)
																							{
																								Buy first=new Buy();
																							first.buy(user_first_group[i].account_id,600723);
																						}		
			
			j++;
					}
	}
	

}
