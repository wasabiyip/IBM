/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package classObject;

import java.util.Random;

import classAction.Data.Accountautors;
import deal.Buy;
import deal.Sell;

/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class User_fifth implements Runnable{
	int yi_gou=0;//��¼�Ѿ���Ĺ�Ʊ��
	public static	int sty1=1;

		public static int interest=2;
	public 	int account_id;   //�ʺ�  
	
		// public dontknow����  //��Ӧ�Ĺ�Ʊ���� �����������Ǹ�����  Ŀǰ��̫���
		//	{
	    	          
		//	}
	    
		int user_type=5;//�û�����
	
	double percent=0.1;		//֤ȯ��ֵռ�������ʽ�ı���  

	public double Sensity_Politic=0.95;//�����ô�û������  �������ж�  ������ļ���
	
	double ativefund=50000;//�ʻ��Ŀ����ʽ�
    
	double AccountValue=0;//�ʻ��Ĺ�Ʊ��ֵ
    
	double  Total=50000;//�û������ʲ�
    
	double  percent_earn=0;//�û���������
public	int idsty=5;
	double acctreturn=50000; //��ʼ�ʽ�
	public static long hold_time=100;//75*24*60*60*1000;
	public void run() 
	
		{
			int i=1;
										while(i<10)
										{
										try
										{
										Thread.sleep(100);
										Sell.sell(account_id);
										Thread.sleep(300);
							           Buy fifth=new Buy();
									   fifth.buy(account_id,600839);
										//Buy.buy(account_id);
										//StockInf.stopri_fun(600050);
														//System.out.println(account_id+"���һ�ι�Ʊ����");
											  // System.out.println(userName+"��ɵ�"+String.valueOf(i)+"�ι����Ʊ");
										}
										catch (InterruptedException e) {
		   
										  // System.out.println(account_id+"���һ�ι�Ʊ����");
										}	   
										 i=i+1;
										}
		}
    
	
	//	public boolean hold_time()//�жϳ��е�ʱ�䵽�˿������ĳ̶�û
	//	{
		
	//	}
	
	
	//	public boolean yi_man()//�жϻ��ܲ������Ʊ
	//	{
	//		return ;
	//	}
	
	public void init()
				{
			account_id=Accountautors.max();
		
			Accountautors.all_rs(account_id,5,Sensity_Politic,acctreturn,percent,ativefund,AccountValue,Total);
	
						int t2;
						Random rand = new Random();
		
					
						t2=rand.nextInt(1000)+1;											
						
					System.out.println("����'����'���û���"+account_id+"ע��");  
				Buy.buy_finish(account_id,600839,t2,10,0);
					
					
	
				}
	
	
	
		public void start()//  ��Ʊ��ʼ   ���������ʱ��������� �һ���֪����������
		{
		
	
//			��ϵͳʱ��������9��30������3��00��ʼ�������ѭ��
				  //һ��ѭ����   (time){BUY SELL}
				  //����͹���
		
		
		
			return;
		}


}
