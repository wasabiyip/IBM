/*
 * 创建日期 2007-9-9
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package function;

import classAction.Data.Accountautors;
import classAction.Data.StockInf;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Interest  //计算收益率
{
	//一个是股票的收益率  （现价价-初始价）/初始价
public static double profit_stock(int id)
{
	double nowprice=StockInf.stopri_fun(id);
	double  price=StockInf.stofa_price_fun(id);
		
		
	double profit = (nowprice-price)/price;
		
	return profit;
}

	
//一个是某个帐户买了某个股票后 就这个股票的收益率  （现价－买入价格）/买入价格
	
public static double profit_stock_people(int stockid,double buyprice)
	{
			
		double nowprice=StockInf.stopri_fun(stockid);
		
			
		return  (nowprice-buyprice)/buyprice;
	}
		
	
		
//一个帐户的总的收益率   （现在总资金-初始资金）/初始资金
//public static double profit_people(int id)
	//{
	 
		
		
		 //chushi zijin
	 
		//return   （Accountautors.total(id)-Accountautors.accreturn( id)）/Accountautors.accreturn( id) ;//还没有加实际代码
	//}

}
