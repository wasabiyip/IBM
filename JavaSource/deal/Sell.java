/*
 * 创建日期 2007-9-9
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package deal;

import java.sql.Timestamp;

import bsdata.Ig;
import classAction.ComFun.SelectStock;
import classAction.Data.AutostockInf;
import classAction.Data.Autostockrs;
import classAction.Data.Sellentrustrs;
import classAction.Data.ToString;
import classAction.Data.lishigu;
import function.Sellweitou;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Sell {
	
	public static  void sell(int id )
	{
	
	
		Ig i=new Ig();
		lishigu[] a=AutostockInf.all_fun(id,i);
		
		for(int j=0;j<i.i;j++)
		{
			long k = System.currentTimeMillis();
			Timestamp now= new Timestamp(k);
			long t=now.getTime()-a[j].time.getTime();
			if(t>30*60*1000)
			{
				//System.out.print("shit");//chedan;////////////////////////////撤单
			}
		}
		int stockID=SelectStock.selectstock(id);
		
		//System.out.println("haha"+stockID);
		if(stockID==0)
		{
			//System.out.print("shit");
        return;
		}
		int aa=0;
	 	for(int j=0;j<i.i;j++)
		{
			if(a[j].stoid==stockID)
			{ aa=j;break; } 
				
		}
		
	 
		double stockPRICE=Sellweitou.sellweituo(stockID,a[aa].buypri,a[aa].nowpri,id);
		//卖是全部卖
		
		//System.out.println(stockPRICE);
		long L = System.currentTimeMillis();
		Timestamp now= new Timestamp(L);
	    int conID=Sellentrustrs.max();
		
	//	System.out.println("sellentrust"+id);////////////////////////////////////////////////////
		
		
		Sellentrustrs.all_rs(id, conID, stockID,stockPRICE ,a[aa].stonum ,now);
            Autostockrs.set_guadan(id,stockID,1);
		System.out.println("用户："+id+" 挂单股票: "+stockID+" 价格："+ToString.T(stockPRICE)+" 数量："+a[aa].stonum+"合同号："+conID);
	}
	
	
	//先访问自己的委托，看有没有需要撤单的     查询ENTRUST
	
	//调用SelectStock 挑选要买的股票
	
	//调用Sellweituo计算委托价格
	
	//至于卖多少 不知道怎么计算
	
	//写入委托表。。。。这个不知道怎么办  不知道是不是在DATA里面加一个写入委托的东西
	
	//写入类的委托，等到所有卖的委托全部高顶后，再统一写入委托表
	

}
 