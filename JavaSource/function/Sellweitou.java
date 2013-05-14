
/*
 * 创建日期 2007-9-9
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package function;

import java.sql.Timestamp;
import java.util.Random;

import classAction.Data.AccountautoInf;
import classAction.Data.Hisaccrs;
import classAction.Data.One_day;
import classAction.Data.Parameter;
import classAction.Data.StockInf;
import classAction.Data.ToString;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Sellweitou //卖委托 为了计算卖的价格
{
	public static int d;
	public static double trapri;
	
//	买入>现价
//	 a=涨跌幅 /（ 获取系统时间 系统时间-9：30）
	//随机生成一个〈20*什么的的数b
	//a*b+现在价格
	
	
	//买入<现价 
//当跌幅没超过5%，我们由开盘价大到现价中的某个比现价高一点点的价位 随机生成一个不超过现价101%的数为卖价
//当跌幅超过5%，我们按照现价卖出
	
	public static double sellweituo(int stockid,double buyprice,double nowprice,int id) 
	{
 	    double yes_price=StockInf.sto_yesterday(stockid);
 	    double yes_gao=yes_price*1.1;
 	   
 	    double yes_di=yes_price*0.9;
		int idsty=AccountautoInf.acctsty_fun(id);
        double zc=Parameter.get_zc(idsty);
		System.out.println(stockid+"  "+yes_price+zc);
		if(buyprice>nowprice)   //亏损
		
		{
			long tt=System.currentTimeMillis() ;
			Timestamp kk=new Timestamp(tt);  //当前时间
            double oo=kk.getTime()-One_day.centtime.getTime();
			// System.out.println("时间差："+kk+ "  "+ll+"  "+oo); 	
			double a=(1000*StockInf.stozhangfu_fun(stockid)*StockInf.sto_yesterday(stockid) )/(oo);
			Random rand = new Random();
			Random rand2=new Random();
			Random rand3=new Random();
			
			int  t = rand.nextInt(50); //t 主张价格上涨
			int c=rand2.nextInt(100);   //c主张价格下跌
			int c1=rand3.nextInt(5)+1;
			double c2=c1*0.1; 
			if(zc>0.5)
			{
				c2=0-c2*zc;                 //=t-c 协商好的价格 
			}
			else 
			{
				c2=c2*zc;  
				
			}
			Hisaccrs tra_num=new Hisaccrs();
			int yes;
	        int tod;
	        yes=tra_num.znum(stockid,One_day.lefttime,One_day.centtime);
	        tod=tra_num.znum(stockid,One_day.centtime,One_day.centtime);
	        double price_chag;
	        if(yes>tod)
	        {
	        	
			 t=(t)*(1-(int)zc) ;          
			 c=c*(int)zc;  
			 d=t-c;    //当政策敏感度达到1 时 就只会跌
	        }
	        
	        
	
			//public static void znum(int stid,Timestamp time1,Timestamp time2)
			//第1， 交易量改变random数 
			//第2，政治敏感改变权重
			//random1= (0-10)*(1-政治敏感)      //加入一个表，表示政策敏感度：
			//random2= 0-50*(政治敏感)
			
			//System.out.print(c);
			
			//double a1=nowprice+c*a;
			//System.out.println("时间差："+a1);
			trapri=nowprice+d*a+c2*(nowprice);
			if(trapri>yes_gao)
			{
				trapri=yes_gao;
			}
			else if(trapri<yes_di)
			{
				trapri=yes_di;
			}
			//return nowprice+d*a;
			else
			{
				
			}
			
			
		
		}
		
		
		else
		{
			if(((nowprice-buyprice)/buyprice)>-0.05)
			{
				Random rand3 = new Random();
				Random rand = new Random();
			   int c=rand.nextInt(10);
			   
			   if(zc>0.5)
						   {
							  c=0-c;                 //=t-c 协商好的价格 
						   }
						  
			   //System.out.print(nowprice*(0.001*c+1));				
				trapri=nowprice*(0.05*c+1);
				if(trapri>yes_gao)
							{
								trapri=yes_gao;
							}
				else if(trapri<yes_di)
							{
								trapri=yes_di;
							}
			    else
			    {	
			    	
			    }
			}
			else
			{
				//System.out.print(nowprice);	
				trapri= nowprice;
			}
		}
	System.out.println("股票："+stockid+" 现在价格："+ToString.T(nowprice)+" 成交价格 ："+ToString.T(trapri));
		return trapri;

	}

}



