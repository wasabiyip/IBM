/*
 * 创建日期 2007-9-9
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package function;

import classAction.Data.StockInf;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Desireforsell //计算要卖的欲望  收益率+涨跌
{
	
	public static double desireforsell(int stockid ,double buyprice)
	{
		double a=Interest.profit_stock_people(stockid,buyprice);
		 double desire=a+StockInf.stozhangfu_fun(stockid);
		
		return desire;
	}

}