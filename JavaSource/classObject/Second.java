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
public class Second implements Runnable{

	/* （非 Javadoc）
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		int num2=Robotnum.get_num(2);// TODO 自动生成方法存根
		User_second[] user_second_group=new User_second[num2];
		int j=0;
		while(j<40)
		{
		
		for(int i=0;i<num2;i++)
						{
							user_second_group[i]=new User_second();
							 user_second_group[i].init();
						}
		for(int i=0;i<num2;i++)
										{
											Sell.sell(user_second_group[i].account_id);
										}
		for(int i=0;i<1;i++)
																{
																	Buy second =new Buy();
																	second.buy(user_second_group[i].account_id,600036);
																}
			for(int i=1;i<3;i++)
																			{
																				Buy second =new Buy();
																				second.buy(user_second_group[i].account_id,600050);
																			}
			for(int i=3;i<6;i++)
																			{
																				Buy second =new Buy();
																				second.buy(user_second_group[i].account_id,600795);
																			}
			for(int i=6;i<8;i++)
																			{
																				Buy second =new Buy();
																				second.buy(user_second_group[i].account_id,800);
																			}
			for(int i=8;i<10;i++)
																			{
																				Buy second =new Buy();
																				second.buy(user_second_group[i].account_id,6001398);
																			}
																			
	
	
			j++;
	}
	}
}
