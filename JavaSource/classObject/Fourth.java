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
public class Fourth implements Runnable{

	/* （非 Javadoc）
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		int num4=Robotnum.get_num(4);
		User_fourth[] user_fourth_group=new User_fourth[num4];
		for(int i=0;i<num4;i++)
				{
					user_fourth_group[i]=new User_fourth();
					 user_fourth_group[i].init();
					
				}
				int j=0;
				while(j<40)
				{

		for(int i=0;i<num4;i++)
						{
																					
						   Sell.sell(user_fourth_group[i].account_id);
					
						}
		for(int i=0;i<num4;i++)
										{
											Buy fourth=new Buy();						
											fourth.buy(user_fourth_group[i].account_id,600839);
					
										}// TODO 自动生成方法存根
		j++;
				}
	}
	

}
