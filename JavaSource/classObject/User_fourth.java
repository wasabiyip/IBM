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
public class User_fourth implements Runnable{
	
	int yi_gou=0;//��¼�Ѿ���Ĺ�Ʊ��
	public static	int sty1=1;
		public	static int sty2=2;
		public static int interest=2;
	public int account_id;   //�ʺ�  
	
	// public dontknow����  //��Ӧ�Ĺ�Ʊ���� �����������Ǹ�����  Ŀǰ��̫���
	//	{
	    	          
	//	}
	    
	int user_type=4;//�û�����
	
	double percent=0.9;		//֤ȯ��ֵռ�������ʽ�ı���  

public	double Sensity_Politic=0.65;//�����ô�û������  �������ж�  ������ļ���
	
	double ativefund=250000;//�ʻ��Ŀ����ʽ�
    
	double AccountValue=0;//�ʻ��Ĺ�Ʊ��ֵ
    
	double  Total=250000;//�û������ʲ�
public	int idsty=4;
	double  percent_earn=0;//�û���������
	double acctreturn=250000; //��ʼ�ʽ�
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
							  Buy fourth=new Buy();
							 // fourth.buy(account_id);
										//Buy.buy(account_id);
										//StockInf.stopri_fun(600050);
													//	System.out.println(account_id+"���һ�ι�Ʊ����");
											  // System.out.println(userName+"��ɵ�"+String.valueOf(i)+"�ι����Ʊ");
										}
										catch (InterruptedException e) {
		   
										  // System.out.println(account_id+"���һ�ι�Ʊ����");
										}	   
										 i=i+1;
										}
		}
	public void init()
				{
			account_id=Accountautors.max();
		
			Accountautors.all_rs(account_id,4,Sensity_Politic,acctreturn,percent,ativefund,AccountValue,Total);
			int t;
						int t2;
						Random rand = new Random();
		
						t = rand.nextInt(3); 
						t2=rand.nextInt(1000)+1;											
						if(t==0)
						{ 
							System.out.println("����'ƫ����'���û���"+account_id+"ע��"); 
							
						Buy.buy_finish(account_id,600839,t2,10,0);
						}
			
						else
						{
							System.out.println("����'ƫ����'���û���"+account_id+"ע��"); 
					
							Buy.buy_finish(account_id,600808,t2,28,0);
						}
					
	
				}
	
	public static long hold_time=100;//60*24*60*60*1000;;

	
	//public boolean hold_time()//�жϳ��е�ʱ�䵽�˿������ĳ̶�û
	//{
		
	//}
	
	
	//public boolean yi_man()//�жϻ��ܲ������Ʊ
	//{
	//	return ;
	//}
	

	
	
	//public void start() //��Ʊ��ʼ ��Ʊ��ʼ   ���������ʱ��������� �һ���֪����������
	//{
		
	
//		��ϵͳʱ��������9��30������3��00��ʼ�������ѭ��
			  //һ��ѭ����   (time){BUY SELL}
			  //����͹���
		
		
		
	//	return;


}
