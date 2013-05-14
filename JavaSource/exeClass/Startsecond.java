/*
 * 创建日期 2007-9-26
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package exeClass;

import java.text.NumberFormat;

import classAction.ComFun.Econ;
import classAction.ComFun.Id;
import classAction.Data.Accountautors;
import classAction.Data.One_day;
import classAction.Data.Sellentrustrs;
import classAction.Data.Stockrs;
import classObject.Day;
import classObject.Fifth;
import classObject.First;
import classObject.Fourth;
import classObject.Second;
import classObject.Third;
import classObject.Zongzhi;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Startsecond 
{
	
	public static void main(String[] args) throws InterruptedException {
	
Econ.i=Sellentrustrs.max1()-1;
	Id.i=Accountautors.max1()-1;
	
	
		One_day.set_start_time();
		Thread t = new Thread();
	   Day a=new Day();
	 t=new Thread(a);
	 t.start();
	 
			 Thread t2 = new Thread();
			Zongzhi z=new Zongzhi();
		  t2=new Thread(z);
		  t2.start();
		  
	 Thread t1 = new Thread();
		First a1=new First();
	  t1=new Thread(a1);
	 t1.start();
	 
	 Thread t3 = new Thread();
			Second a2=new Second();
		  t3=new Thread(a2);
		 t3.start();
		 
Thread t4 = new Thread();
			   Third a3=new Third();
			 t4=new Thread(a3);
			t4.start();
		Thread t5 = new Thread();
					   Fourth a4=new Fourth();
					 t5=new Thread(a4);
					t5.start();
					Thread t6 = new Thread();
		Fifth a5=new Fifth();
	  t6=new Thread(a5);
	 t6.start();
	 
	 
	 Thread t7 = new Thread();
					Third a6=new Third();
				  t7=new Thread(a6);
				 t7.start();
			// Thread t8 = new Thread();
						//	Fourth a7=new Fourth();
						//  t8=new Thread(a7);
						// t8.start();
						// Thread t9 = new Thread();
			// Fifth a10=new Fifth();
		  // t9=new Thread(a10);
		 // t9.start();
			
		/*				
	ThreadLink tmp=new ThreadLink();
	tmp.Tname="测试 ";
	 t = new Thread[4];
	for(int i=0;i<4;i++)
			{
				t[i]=new Thread(tmp);
				System.out.print("对象 "+String.valueOf(i));
				t[i].start();
			}
			Random rand = new Random();
						int c=rand.nextInt(20);
						c=0-c;
						System.out.println(c);*/
					//	Sellweitou.sellweituo(600177,25,27.92,1);
		//public static double sellweituo(int stockid,double buyprice,double nowprice,int id) 
		//Stockrs.set_price(600839,13);
		//Stockrs.set_price(600050,8.8);
		//Stockrs.set_price(600795,17);
		//Stockrs.set_price(600028,16.8);
//double zo=StockInf.zong_zhi();
//System.out.println(zo);

    


 
 
 

	}
	
	
	

}
