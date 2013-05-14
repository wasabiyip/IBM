/*
 * 创建日期 2007-9-9
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package function;

import classAction.Data.AccountautoInf;
import classAction.Data.StockInf;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Desireforbuy //计算要买的欲望 


//计算要买的欲望 权重政策敏感   用户类型

//交易欲望=收益率/政策敏感 - 涨跌幅 


{
	
	public static double desireforbuy(int stockid, int countid)
	{
		
		double a=Interest.profit_stock(stockid);
		
		double c=AccountautoInf.acctzc_fun(countid) ;
        double b=a/c-StockInf.stozhangfu_fun(stockid);  		
		return b;
	}
}