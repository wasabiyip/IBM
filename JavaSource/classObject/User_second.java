/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
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
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class User_second implements Runnable{
	
	int yi_gou=0;//��¼�Ѿ���Ĺ�Ʊ��
	public static	int sty1=3;
		public	static int sty2=4;
		public static int interest=2;
	public int account_id;   //�ʺ�  
	
	 //public dontknow����  //��Ӧ�Ĺ�Ʊ���� �����������Ǹ�����  Ŀǰ��̫���
		//{
	   // 	          
		//}
	    
	int user_type=2;//�û�����
	
	double percent=0.25;		//֤ȯ��ֵռ�������ʽ�ı���  

	public double Sensity_Politic=0.1;//�����ô�û������  �������ж�  ������ļ���
	
	double ativefund=1500000;//�ʻ��Ŀ����ʽ�
    
	double AccountValue=0;//�ʻ��Ĺ�Ʊ��ֵ
    
	double  Total=1500000;//�û������ʲ�
    
	double  percent_earn=0;//�û���������
	public int idsty=2;
	double acctreturn=1500000; //��ʼ�ʽ�
	public static	long hold_time=100;//Ϊ������ ʱ���Ϊ1000  15*24*60*60*1000
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
		
		Accountautors.all_rs(account_id,2,Sensity_Politic,acctreturn,percent,ativefund,AccountValue,Total);
		int t;
			int t2;
			Random rand = new Random();
		
			t = rand.nextInt(6); 
			t2=rand.nextInt(1000)+1;											
			if(t==0)
			{ 
				System.out.println("����'ƫ���'���û���"+account_id+"ע��"); 
			
	Buy.buy_finish(account_id,600050,t2,7.42,0);
			}
		else	if(t==1)
						{ 
							System.out.println("����'ƫ���'���û���"+account_id+"ע��"); 
						Buy.buy_finish(account_id,600036,t2,33,0);
						}
			else	if(t==2)
							{ 
								System.out.println("����'ƫ���'���û���"+account_id+"ע��");  
							Buy.buy_finish(account_id,600029,t2,21.86,0);
							}
			else	if(t==3)
											{ 
												System.out.println("����'ƫ���'���û���"+account_id+"ע��"); ;  
											Buy.buy_finish(account_id,600795,t2,21.86,0);
											}
			else if(t==4)
			{
				System.out.println("����'ƫ���'���û���"+account_id+"ע��"); 
				
										Buy.buy_finish(account_id,601398,t2,10.74,0);	
			}
			else
			{
				System.out.println("����2���û���"+account_id+"ע��"); 
				
						Buy.buy_finish(account_id,800,t2,10.74,0);
			}
			}
	
	//public boolean hold_time()//�жϳ��е�ʱ�䵽�˿������ĳ̶�û
	//{
		
	//}
	
	
	//public boolean yi_man()//�жϻ��ܲ������Ʊ
	//{
	//	return ;
	//}
	

	
	
	public void start() //��Ʊ��ʼ ��Ʊ��ʼ   ���������ʱ��������� �һ���֪����������
	{
		
//		��ϵͳʱ��������9��30������3��00��ʼ�������ѭ��
			  //һ��ѭ����   (time){BUY SELL}
			  //����͹���
		
		
		return;
	}

}
