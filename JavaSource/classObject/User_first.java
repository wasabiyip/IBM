/*
 * 创建日期 2007-9-8
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classObject;
import java.util.Random;

import classAction.ComFun.SelectStock;
import classAction.Data.Accountautors;
import deal.Buy;
import deal.Sell;
/**
 * @author db2admin
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class User_first implements Runnable{
	



	int yi_gou=0;//记录已经买的股票数
	int user_type=1;//用户类型
	public int account_id;   //帐号  
	public static	int sty1=4;
	public	static int sty2=5;
	public static int interest=2;
	
	double percent=0.3;		//证券价值占有所有资金的比例  

public	double Sensity_Politic=0.1;//0.95;//这个怎么用还不清楚  政策敏感度  用于买的计算
	
	double ativefund=2000000 ;//帐户的可用资金
    
	double AccountValue=0;//帐户的股票价值
    
	double  Total=2000000 ;//用户的总资产
    
	double  percent_earn=0;//用户的收益率
	
	double acctreturn=2000000 ; //初始资金
 public  int idsty=1;
    
	public  static long hold_time=100;//为测试用 时间改为1000  15*24*60*60*1000
	public void run() 
	{
		
		int i=1;
				while(i<10)
				{
				try
				{
                Thread.sleep(200);
                
               Sell.sell(this.account_id);//只是选择自己能够买得
				Thread.sleep(300);
			  //int i3=SelectStock.selectstock(account_id);
			   Buy first =new Buy();
			 //  first.buy(this.account_id);
				//Buy.buy(this.account_id);
				//System.out.println(account_id+"完成一次股票交易");
					  // System.out.println(userName+"完成第"+String.valueOf(i)+"次购买股票");
				}
				catch (InterruptedException e) {
		   
				 //  System.out.println(account_id+"完成一次股票交易");
				}	   
				 i=i+1;
				}
		
		
		
		
		
		
		
	}
	public void init()
		{
	account_id=Accountautors.max();
		
	Accountautors.all_rs(account_id,1,Sensity_Politic,acctreturn,percent,ativefund,AccountValue,Total);
	int t;
	int t2;
	Random rand = new Random();
		
	t = rand.nextInt(3); 
	t2=rand.nextInt(1000)+1;											
    if(t==0)
    {   
		System.out.println("类型'疯狂'的用户："+account_id+"注册"); 
    	
    Buy.buy_finish(account_id,600050,t2,7.42,0);
    }
   else if(t==1)
    {
		System.out.println("类型'疯狂'的用户："+account_id+"注册"); 
		
						Buy.buy_finish(account_id,600723,t2,10.74,0);	
    	
    }
    else
    {
		System.out.println("类型'疯狂'的用户："+account_id+"注册"); 
		
    	Buy.buy_finish(account_id,600028,t2,14.46,0);
    }
	//public static void buy_finish(int acctid,int stockid,int stonum,double price,int guadan)

}
     
	    
	
	//public boolean yi_man()//判断还能不能买股票
	//{
	//	return ;
	//}
	

	
	
	public void start() //股票开始 股票开始   至于如何用时间这个机制 我还不知道在哪里用
	{
		
	
          
		
		
		
		return;
	}

}
 
