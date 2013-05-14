/*
 * 创建日期 2007-9-25
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classObject;

import java.sql.Timestamp;

import classAction.Data.One_day;
import classAction.Data.Stockrs;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Day implements Runnable{

	/* （非 Javadoc）
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
	
	
	while(1==1)
	{
				
		
	long ii=System.currentTimeMillis();
	Timestamp a=new Timestamp(ii);
	if(a.after(One_day.righttime))
	{
		One_day.set_left();
		One_day.set_cen();
		One_day.set_right();
		System.out.println("今天收盘时间已经到了。");
		System.out.println("今天开盘时间已经到了。");
	}

	
	
	}
	
	
	
		// TODO 自动生成方法存根
		
	}







}
