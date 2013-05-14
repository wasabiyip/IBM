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
public class Third implements Runnable{

	/* （非 Javadoc）
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		int num3=Robotnum.get_num(3);
		User_third[] user_third_group=new User_third[num3];
		int j=0;
		while(j<40)
		{
		
		for(int i=0;i<num3;i++)
				{
					user_third_group[i]=new User_third();
					 user_third_group[i].init();
				}
		for(int i=0;i<num3;i++)
										{

											Sell.sell(user_third_group[i].account_id);
										}
		for(int i=0;i<1;i++)
												{
                                                    Buy third =new Buy();
													third.buy(user_third_group[i].account_id,600808);
												}
			for(int i=1;i<2;i++)
															{
																Buy third =new Buy();
																third.buy(user_third_group[i].account_id,60050);
															}
			for(int i=2;i<5;i++)
															{
																Buy third =new Buy();
																third.buy(user_third_group[i].account_id,600795);
															}
			for(int i=5;i<7;i++)
															{
																Buy third =new Buy();
																third.buy(user_third_group[i].account_id,800);
															}
															
			for(int i=7;i<10;i++)
															{
																Buy third =new Buy();
																third.buy(user_third_group[i].account_id,601398);
															}
												// TODO 自动生成方法存根
		j++;
		}
	}

}
