/*
 * 创建日期 2007-9-9
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classObject;

import java.util.Random;

import classAction.Data.Accountautors;
import classAction.Data.StockInf;
import deal.Buy;
import deal.Sell;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class User_second implements Runnable{
	
	int yi_gou=0;//记录已经买的股票数
	public static	int sty1=3;
		public	static int sty2=4;
		public static int interest=2;
	public int account_id;   //帐号  
	
	 //public dontknow（）  //对应的股票类型 。。。可能是个函数  目前不太清楚
		//{
	   // 	          
		//}
	    
	int user_type=2;//用户类型
	
	double percent=0.25;		//证券价值占有所有资金的比例  

	public double Sensity_Politic=0.1;//这个怎么用还不清楚  政策敏感度  用于买的计算
	
	double ativefund=1500000;//帐户的可用资金
    
	double AccountValue=0;//帐户的股票价值
    
	double  Total=1500000;//用户的总资产
    
	double  percent_earn=0;//用户的收益率
	public int idsty=2;
	double acctreturn=1500000; //初始资金
	public static	long hold_time=100;//为测试用 时间改为1000  15*24*60*60*1000
	public void run() 
	
		{
			int i=1;
							while(i<10)
							{
							try
							{
						           Thread.sleep(200);
							Sell.sell(account_id);
							Thread.sleep(300);
							Buy second =new Buy();
							//second.buy(account_id);
							//Buy.buy(account_id);
							//StockInf.stopri_fun(600050);
										//	System.out.println(account_id+"完成一次股票交易");
								  // System.out.println(userName+"完成第"+String.valueOf(i)+"次购买股票");
							}
							catch (InterruptedException e) {
		   
							  // System.out.println(account_id+"完成一次股票交易");
							}	   
							 i=i+1;
							}
		
		}
	public void init()
			{
		account_id=Accountautors.max();
		
		Accountautors.all_rs(account_id,2,Sensity_Politic,acctreturn,percent,ativefund,AccountValue,Total);
		int t;
			int t2;
			Random rand = new Random();
		
			t = rand.nextInt(6); 
			t2=rand.nextInt(1000)+1;											
			if(t==0)
			{ 
				System.out.println("类型'偏疯狂'的用户："+account_id+"注册"); 
			
	Buy.buy_finish(account_id,600050,t2,7.42,0);
			}
		else	if(t==1)
						{ 
							System.out.println("类型'偏疯狂'的用户："+account_id+"注册"); 
						Buy.buy_finish(account_id,600036,t2,33,0);
						}
			else	if(t==2)
							{ 
								System.out.println("类型'偏疯狂'的用户："+account_id+"注册");  
							Buy.buy_finish(account_id,600029,t2,21.86,0);
							}
			else	if(t==3)
											{ 
												System.out.println("类型'偏疯狂'的用户："+account_id+"注册"); ;  
											Buy.buy_finish(account_id,600795,t2,21.86,0);
											}
			else if(t==4)
			{
				System.out.println("类型'偏疯狂'的用户："+account_id+"注册"); 
				
										Buy.buy_finish(account_id,601398,t2,10.74,0);	
			}
			else
			{
				System.out.println("类型2的用户："+account_id+"注册"); 
				
						Buy.buy_finish(account_id,800,t2,10.74,0);
			}
			}
	
	//public boolean hold_time()//判断持有的时间到了可以卖的程度没
	//{
		
	//}
	
	
	//public boolean yi_man()//判断还能不能买股票
	//{
	//	return ;
	//}
	

	
	
	public void start() //股票开始 股票开始   至于如何用时间这个机制 我还不知道在哪里用
	{
		
//		当系统时间是早上9：30和下午3：00开始运行这个循环
			  //一个循环体   (time){BUY SELL}
			  //否则就挂起
		
		
		return;
	}

}
