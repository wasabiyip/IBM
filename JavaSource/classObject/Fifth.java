/*
 * 创建日期 2007-9-28
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classObject;

import classAction.Data.Robotnum;
import deal.Buy;
import deal.Sell;

/**
 * @author kingson
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Fifth implements Runnable{

	/* （非 Javadoc）
	 * @see java.lang.Runnable#run()
	 */
	public void run() 
	{
		int num5=Robotnum.get_num(5);
		User_fifth[] user_fifth_group=new User_fifth[num5]; 
		for(int i=0;i<num5;i++)
			{
				user_fifth_group[i]=new User_fifth();
				 user_fifth_group[i].init();
			}
			int j=0;
			while(j<40)
			{
			
		for(int i=0;i<num5;i++)
							{
																				
							Sell.sell(user_fifth_group[i].account_id);
							}  
		for(int i=0;i<num5;i++)
									{
										Buy fifth=new Buy();
																				
										fifth.buy(user_fifth_group[i].account_id,600839);
										try {
											Thread.sleep(1000);
										} catch (InterruptedException e) {
											// TODO 自动生成 catch 块
											e.printStackTrace();
										}
									}  
				// TODO 自动生成方法存根
		j++;
			}
	}

}
