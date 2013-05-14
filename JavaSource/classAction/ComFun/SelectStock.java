
/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
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
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
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
//		�Ȳ�ѯ����ʱ��
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
//	�ж���û�п�                 
 //�жϹ���ֵ5%û
 
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
			//���˾͵���Desireforsell���㽻������  		
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
		
					//	���˾͵���Desireforsell���㽻������  		
					return 	Select_max.select_max (ID_B_N_4,x );
					
					
	}

 
	 
		
		
	}
//	�Ȳ�ѯ����ʱ��                ��Ҫ��ѯAccount_Stock��  ���ݹ�Ʊ��ID��ѯTHE_DATE 
			
	
	//�����Լ��Ĺ�Ʊ                ��Ҫ��ѯAccount_Stock��  ����ID��ѯ�Լ��Ĺ�Ʊ��ID
	
	 
	//�Ȳ�ѯ����ʱ��                ��Ҫ��ѯAccount_Stock��  ���ݹ�Ʊ��ID��ѯTHE_DATE 
		
	
	//�ж���û�п�                  ��Ҫ��ѯAccount_Stock���Stock��  ��PRICE�� STOPRI ���Ƚ�
	     
	//�жϹ���ֵ5%û    ���˾͵���Desireforsell���㽻������  
	
	//Ȼ��������ߵ� ���������Ʊ��ID
	
		
	
	//û�й��Ϳ� ӯ������û�й�5%     ��Ҫ��ѯAccount_Stock���Stock�� ��PRICE�� STOPRI ���Ƚ�
	
	//���˾͵���Desireforsell���㽻������
	
	//Ȼ��������ߵ� ���������Ʊ��ID
	
	
	
	
	//���û�й�Ʊѡ������ͷ��ؿ�ֵ

}
 