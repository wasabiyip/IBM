/*
 * �������� 2007-9-8
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
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
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class User_first implements Runnable{
	



	int yi_gou=0;//��¼�Ѿ���Ĺ�Ʊ��
	int user_type=1;//�û�����
	public int account_id;   //�ʺ�  
	public static	int sty1=4;
	public	static int sty2=5;
	public static int interest=2;
	
	double percent=0.3;		//֤ȯ��ֵռ�������ʽ�ı���  

public	double Sensity_Politic=0.1;//0.95;//�����ô�û������  �������ж�  ������ļ���
	
	double ativefund=2000000 ;//�ʻ��Ŀ����ʽ�
    
	double AccountValue=0;//�ʻ��Ĺ�Ʊ��ֵ
    
	double  Total=2000000 ;//�û������ʲ�
    
	double  percent_earn=0;//�û���������
	
	double acctreturn=2000000 ; //��ʼ�ʽ�
 public  int idsty=1;
    
	public  static long hold_time=100;//Ϊ������ ʱ���Ϊ1000  15*24*60*60*1000
	public void run() 
	{
		
		int i=1;
				while(i<10)
				{
				try
				{
                Thread.sleep(200);
                
               Sell.sell(this.account_id);//ֻ��ѡ���Լ��ܹ����
				Thread.sleep(300);
			  //int i3=SelectStock.selectstock(account_id);
			   Buy first =new Buy();
			 //  first.buy(this.account_id);
				//Buy.buy(this.account_id);
				//System.out.println(account_id+"���һ�ι�Ʊ����");
					  // System.out.println(userName+"��ɵ�"+String.valueOf(i)+"�ι����Ʊ");
				}
				catch (InterruptedException e) {
		   
				 //  System.out.println(account_id+"���һ�ι�Ʊ����");
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
		System.out.println("����'���'���û���"+account_id+"ע��"); 
    	
    Buy.buy_finish(account_id,600050,t2,7.42,0);
    }
   else if(t==1)
    {
		System.out.println("����'���'���û���"+account_id+"ע��"); 
		
						Buy.buy_finish(account_id,600723,t2,10.74,0);	
    	
    }
    else
    {
		System.out.println("����'���'���û���"+account_id+"ע��"); 
		
    	Buy.buy_finish(account_id,600028,t2,14.46,0);
    }
	//public static void buy_finish(int acctid,int stockid,int stonum,double price,int guadan)

}
     
	    
	
	//public boolean yi_man()//�жϻ��ܲ������Ʊ
	//{
	//	return ;
	//}
	

	
	
	public void start() //��Ʊ��ʼ ��Ʊ��ʼ   ���������ʱ��������� �һ���֪����������
	{
		
	
          
		
		
		
		return;
	}

}
 
