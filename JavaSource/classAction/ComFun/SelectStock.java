
/*
 * 创建日期 2007-9-9
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classAction.ComFun;

import java.sql.Timestamp;

import classAction.Data.AccountautoInf;
import classAction.Data.AutostockInf;
import classAction.Data.lishigu;
import classObject.User_fifth;
import classObject.User_first;
import classObject.User_fourth;
import classObject.User_second;
import classObject.User_third;
import function.Interest;
import function.Select_max;
import bsdata.ID_B_N;
import bsdata.Ig;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class SelectStock {



public static  int selectstock(int countid)
{
		Ig o=new Ig();
		lishigu[] a=AutostockInf.all_fun(countid,o);
		//System.out.println("jkk"+o.i);
		ID_B_N[]  ID_B_N_1=new ID_B_N[o.i];
		
		int []d=new int [5];
//********************************************************
//		先查询持续时间
		int l=0;
		for(int j=0;j<o.i;j++)
		{
			
			long tt=System.currentTimeMillis() ;
			Timestamp kk=new Timestamp(tt);
			//long a=kk.getHours()
			
			long b= kk.getTime()- a[j].time.getTime();	
			
			long c=0;
			switch (AccountautoInf.acctsty_fun(countid))
			{
				case 1:
				  c= User_first.hold_time;
				  break;
				case 2:
				 c= User_second.hold_time;
				case 3:
				c=User_third.hold_time;
				case 4:
				c=User_fourth.hold_time;
				case 5:
				c=User_fifth.hold_time;
				default: 
				break;
								
			}
			
			
			if(b>c)
			{
				//System.out.println("jinru");
				//a[j].dis();
			
				ID_B_N_1[l]=new ID_B_N();
				ID_B_N_1[l].idd=a[j].stoid;
				ID_B_N_1[l].buyprice=a[j].buypri;
				ID_B_N_1[l].nowprice=a[j].nowpri;
				//ID_B_N_1[l].dis();
		    	l++;
							
			}					
			
		}
		//System.out.println("kjk"+l);
		if(l==0)////  no stocks meet the require
		{
			return 0;
		}
		
		ID_B_N[] ID_B_N_2=new ID_B_N[l] ;//transform 
		
		for(int j=0;j<l;j++)
		{
			ID_B_N_2[j]=ID_B_N_1[j];
			
		}

		
//*************************************************	
//	判断有没有亏                 
 //判断过阀值5%没
 
 int z=0 ;
 int x=0;   	
 
 
	for( int j=0;j<l;j++)
	{
		 if(  Interest.profit_stock_people(ID_B_N_2[j].idd,ID_B_N_2[j].buyprice)<-0.05 )
		 {
			 
			ID_B_N_1[z].idd=ID_B_N_2[j].idd;
			ID_B_N_1[z].buyprice=ID_B_N_2[j].buyprice;
			ID_B_N_1[z].nowprice=ID_B_N_2[j].buyprice;
			z++;
		 }
		 
	}
	
	
	
	
	
	
	if (z!=0)
	{
			ID_B_N[] ID_B_N_3=new ID_B_N[z] ;
		
			for(int j=0;j<z;j++)
			{
				ID_B_N_3[j]=ID_B_N_1[j];
			
			}		
			//过了就调用Desireforsell计算交易欲望  		
			return 	Select_max.select_max (ID_B_N_3,z );
	}
		
	else 
	{
		
		for( int j=0;j<l;j++)
			{
				 if(  Interest.profit_stock_people(ID_B_N_2[j].idd,ID_B_N_2[j].buyprice)>0.05 )
				 {
			 
					ID_B_N_1[x].idd=ID_B_N_2[j].idd;
					ID_B_N_1[x].buyprice=ID_B_N_2[j].buyprice;
					ID_B_N_1[x].nowprice=ID_B_N_2[j].buyprice;
					x++;
				 }
		 
		
			}
			
			
			
					if (x==0)
					{
					//	System.out.println("kjlkjkjlkjjjj");
						return 0;
					}
				
				
					ID_B_N[] ID_B_N_4=new ID_B_N[x] ;
		
					for(int j=0;j<x;j++)
					{
						ID_B_N_4[j]=ID_B_N_1[j];
						//ID_B_N_4[j].dis();
					}
		
					//	过了就调用Desireforsell计算交易欲望  		
					return 	Select_max.select_max (ID_B_N_4,x );
					
					
	}

 
	 
		
		
	}
//	先查询持续时间                需要查询Account_Stock表  根据股票的ID查询THE_DATE 
			
	
	//访问自己的股票                需要查询Account_Stock表  根据ID查询自己的股票的ID
	
	 
	//先查询持续时间                需要查询Account_Stock表  根据股票的ID查询THE_DATE 
		
	
	//判断有没有亏                  需要查询Account_Stock表和Stock表  把PRICE和 STOPRI 做比较
	     
	//判断过阀值5%没    过了就调用Desireforsell计算交易欲望  
	
	//然后挑出最高的 返回这个股票的ID
	
		
	
	//没有过就看 盈利的有没有过5%     需要查询Account_Stock表和Stock表 把PRICE和 STOPRI 做比较
	
	//过了就调用Desireforsell计算交易欲望
	
	//然后挑出最高的 返回这个股票的ID
	
	
	
	
	//如果没有股票选择出来就返回空值

}
 