/*
 * 创建日期 2007-9-24
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classAction.Data;

import java.sql.Timestamp;

import classObject.Zj;
import deal.Buy;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class One_day {
public static Timestamp lefttime;
public static Timestamp centtime;
public static Timestamp righttime;
public static double a;
public static int b;
public static void set_start_time()
{
	b=1000;
	a=0.45;
	long ii=System.currentTimeMillis();
	centtime=new Timestamp(ii);
	Zj zj1=new Zj();
			zj1.init(49001+b);
			Buy.buy_finish(zj1.account_id,600177,30000,30.8+a,0);
			Sellentrustrs.all_rs(zj1.account_id,0, 600177,30.8+a ,30000 ,centtime);
		
	Zj zj2=new Zj();
				zj2.init(49002+b);
				Buy.buy_finish(zj2.account_id,600723,30000,12.3+a,0);
				Sellentrustrs.all_rs(zj2.account_id,0, 600723,12.3+a,30000 ,centtime);
	Zj zj3=new Zj();
					zj3.init(49003+b);
					Buy.buy_finish(zj3.account_id,600839,30000,11.05-a,0);
					Sellentrustrs.all_rs(zj3.account_id,0, 600839,11.05-a,30000 ,centtime);
	Zj zj4=new Zj();
					zj4.init(49004+b);
					Buy.buy_finish(zj4.account_id,600808,30000,9.78-a,0);
					Sellentrustrs.all_rs(zj4.account_id,0, 600808,9.78-a,30000 ,centtime);
   Zj zj5=new Zj();
						zj5.init(49005+b);
						Buy.buy_finish(zj5.account_id,600036,30000,21-a,0);
						Sellentrustrs.all_rs(zj5.account_id,0, 600036,21-a,30000 ,centtime);	
	Zj zj6=new Zj();
							zj6.init(49006+b);
							Buy.buy_finish(zj6.account_id,600050,30000,6.5-a,0);
							Sellentrustrs.all_rs(zj6.account_id,0, 600050,6.5-a,30000 ,centtime);		
	Zj zj7=new Zj();
							zj7.init(49007+b);
							Buy.buy_finish(zj7.account_id,600795,30000,15.20-a,0);
							Sellentrustrs.all_rs(zj7.account_id,0, 600795,15.20-a,30000 ,centtime);		
	Zj zj8=new Zj();
							zj8.init(49008+b);
							Buy.buy_finish(zj8.account_id,600028,30000,13.0+a,0);
							Sellentrustrs.all_rs(zj8.account_id,0, 600028,13.0+a,30000 ,centtime);		
	Zj zj9=new Zj();
							zj9.init(49009+b);
							Buy.buy_finish(zj9.account_id,800,30000,13-a,0);
							Sellentrustrs.all_rs(zj9.account_id,0, 800,13-a,30000 ,centtime);		
	Zj zj10=new Zj();
							zj10.init(49010+b);
							Buy.buy_finish(zj10.account_id,601398,30000,5.59-a,0);
							Sellentrustrs.all_rs(zj10.account_id,0, 601398,5.59-a,30000 ,centtime);		
	
							Sellentrustrs.all_rs(zj5.account_id,0, 600036,21-a,30000 ,centtime);		
								
	b=b+b;				
	long g=ii+400000; 
	long g2=ii-400000;
	righttime=new Timestamp(g);
	lefttime=new Timestamp(g2);
	System.out.println(centtime);
	System.out.println(righttime);                          //还有一点还没有对涨幅进行限制 
	
}
public static void set_left()
{
	
	long i=lefttime.getTime();
	long i1=i+400000;
	lefttime=new Timestamp(i1);
	System.out.println(lefttime);
	Stockrs.day_over();
	
}
public static void set_cen()
{
	
long i=centtime.getTime();
long i1=i+400000;
centtime=new Timestamp(i1);
System.out.println(centtime);
	
	
}
public static void set_right()
{
	long i=righttime.getTime();
	long i1=i+400000;
	righttime=new Timestamp(i1);
	System.out.println(righttime);
}


}
