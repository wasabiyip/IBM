/*
 * 创建日期 2007-9-26
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classObject;

import classAction.Data.StockInf;
import classAction.Data.ToString;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Zongzhi implements Runnable{

	/* （非 Javadoc）
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		
		while(1==1)
		{
			try{
			
			Thread.sleep(2000);
			double a=StockInf.zong_zhi();
			
			System.out.println("现在大盘的指数是"+ToString.T(a));
			Thread.sleep(500);
			StockInf .stozhangfu_fun_all();
			
			Thread.sleep(1000);
			}
			catch (InterruptedException e) {
		   
							 //  System.out.println(account_id+"完成一次股票交易");
							}	  
		}
		
	}
	

}
