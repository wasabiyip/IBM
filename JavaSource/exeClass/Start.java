/*
 * 创建日期 2007-9-8
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package exeClass;

import classAction.Data.Stockrs;



/**
 * @author ZW
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Start{

	// public static lishigu[]a=new lishigu[2];

public static void main(String[] args) throws InterruptedException {
	
/*Econ.i=Sellentrustrs.max1()-1;
	One_day.set_start_time();
	Thread t = new Thread();
   Day a=new Day();
 t=new Thread(a);
 
int num1=Robotnum.get_num(1);
int num2=Robotnum.get_num(2);
int num3=Robotnum.get_num(3);
int num4=Robotnum.get_num(4);
int num5=Robotnum.get_num(5);

User_first[] user_first_group=new User_first[num1]; 
Thread[] t1=new Thread[num1];

User_second[] user_second_group=new User_second[num2];
Thread[] t2=new Thread[num2];

User_third[] user_third_group=new User_third[num3];
Thread[] t3=new Thread[num3];

User_fourth[] user_fourth_group=new User_fourth[num4];
Thread[] t4=new Thread[num4];

User_fifth[] user_fifth_group=new User_fifth[num5]; 
Thread[] t5=new Thread[num5];
		//Obj_user[] tmpUser=new Obj_user[4];//在这边加上机器人吧 
		
		for(int i=0;i<num1;i++)
		{
			System.out.println(i);  /////////////////////////////////////////////////////////////////////////
			user_first_group[i]=new User_first();
			user_first_group[i].init();
			//tmpUser[i].userName=String.valueOf(i);
		//	System.out.print(tmpUser[i].userName);//="用户"+String.valueOf(i);
			t1[i]=new Thread(user_first_group[i]);
			t1[i].start();
			Thread.sleep(50);
		}
	   for(int i=0;i<num2;i++)
			{
				user_second_group[i]=new User_second();
			     user_second_group[i].init();
				//System.out.print(tmpUser[i].userName);//="用户"+String.valueOf(i);
				t2[i]=new Thread(user_second_group[i]);
				t2[i].start();
				Thread.sleep(50);
			}
	 for(int i=0;i<num3;i++)
			{
				user_third_group[i]=new User_third();
			     user_third_group[i].init();
				//System.out.print(tmpUser[i].userName);//="用户"+String.valueOf(i);
				t3[i]=new Thread(user_third_group[i]);
				t3[i].start();
				Thread.sleep(50);
			}
		for(int i=0;i<num4;i++)
			{
				user_fourth_group[i]=new User_fourth();
			     user_fourth_group[i].init();
				//System.out.print(tmpUser[i].userName);//="用户"+String.valueOf(i);
				t4[i]=new Thread(user_fourth_group[i]);
				t4[i].start();
				Thread.sleep(50);
			}
			for(int i=0;i<num5;i++)
			{
				user_fifth_group[i]=new User_fifth();
			     user_fifth_group[i].init();
				//System.out.print(tmpUser[i].userName);//="用户"+String.valueOf(i);
				t5[i]=new Thread(user_fifth_group[i]);
				t5[i].start();
				Thread.sleep(50);
			}
			
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
Stockrs a=new Stockrs();
Stockrs.day_over();


}

}