
/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package function;

import java.sql.Timestamp;
import java.util.Random;

import classAction.Data.AccountautoInf;
import classAction.Data.Hisaccrs;
import classAction.Data.One_day;
import classAction.Data.Parameter;
import classAction.Data.StockInf;
import classAction.Data.ToString;

/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Sellweitou //��ί�� Ϊ�˼������ļ۸�
{
	public static int d;
	public static double trapri;
	
//	����>�ּ�
//	 a=�ǵ��� /�� ��ȡϵͳʱ�� ϵͳʱ��-9��30��
	//�������һ����20*ʲô�ĵ���b
	//a*b+���ڼ۸�
	
	
	//����<�ּ� 
//������û����5%�������ɿ��̼۴��ּ��е�ĳ�����ּ۸�һ���ļ�λ �������һ���������ּ�101%����Ϊ����
//����������5%�����ǰ����ּ�����
	
	public static double sellweituo(int stockid,double buyprice,double nowprice,int id) 
	{
 	    double yes_price=StockInf.sto_yesterday(stockid);
 	    double yes_gao=yes_price*1.1;
 	   
 	    double yes_di=yes_price*0.9;
		int idsty=AccountautoInf.acctsty_fun(id);
        double zc=Parameter.get_zc(idsty);
		System.out.println(stockid+"  "+yes_price+zc);
		if(buyprice>nowprice)   //����
		
		{
			long tt=System.currentTimeMillis() ;
			Timestamp kk=new Timestamp(tt);  //��ǰʱ��
            double oo=kk.getTime()-One_day.centtime.getTime();
			// System.out.println("ʱ��"+kk+ "  "+ll+"  "+oo); 	
			double a=(1000*StockInf.stozhangfu_fun(stockid)*StockInf.sto_yesterday(stockid) )/(oo);
			Random rand = new Random();
			Random rand2=new Random();
			Random rand3=new Random();
			
			int  t = rand.nextInt(50); //t ���ż۸�����
			int c=rand2.nextInt(100);   //c���ż۸��µ�
			int c1=rand3.nextInt(5)+1;
			double c2=c1*0.1; 
			if(zc>0.5)
			{
				c2=0-c2*zc;                 //=t-c Э�̺õļ۸� 
			}
			else 
			{
				c2=c2*zc;  
				
			}
			Hisaccrs tra_num=new Hisaccrs();
			int yes;
	        int tod;
	        yes=tra_num.znum(stockid,One_day.lefttime,One_day.centtime);
	        tod=tra_num.znum(stockid,One_day.centtime,One_day.centtime);
	        double price_chag;
	        if(yes>tod)
	        {
	        	
			 t=(t)*(1-(int)zc) ;          
			 c=c*(int)zc;  
			 d=t-c;    //���������жȴﵽ1 ʱ ��ֻ���
	        }
	        
	        
	
			//public static void znum(int stid,Timestamp time1,Timestamp time2)
			//��1�� �������ı�random�� 
			//��2���������иı�Ȩ��
			//random1= (0-10)*(1-��������)      //����һ������ʾ�������жȣ�
			//random2= 0-50*(��������)
			
			//System.out.print(c);
			
			//double a1=nowprice+c*a;
			//System.out.println("ʱ��"+a1);
			trapri=nowprice+d*a+c2*(nowprice);
			if(trapri>yes_gao)
			{
				trapri=yes_gao;
			}
			else if(trapri<yes_di)
			{
				trapri=yes_di;
			}
			//return nowprice+d*a;
			else
			{
				
			}
			
			
		
		}
		
		
		else
		{
			if(((nowprice-buyprice)/buyprice)>-0.05)
			{
				Random rand3 = new Random();
				Random rand = new Random();
			   int c=rand.nextInt(10);
			   
			   if(zc>0.5)
						   {
							  c=0-c;                 //=t-c Э�̺õļ۸� 
						   }
						  
			   //System.out.print(nowprice*(0.001*c+1));				
				trapri=nowprice*(0.05*c+1);
				if(trapri>yes_gao)
							{
								trapri=yes_gao;
							}
				else if(trapri<yes_di)
							{
								trapri=yes_di;
							}
			    else
			    {	
			    	
			    }
			}
			else
			{
				//System.out.print(nowprice);	
				trapri= nowprice;
			}
		}
	System.out.println("��Ʊ��"+stockid+" ���ڼ۸�"+ToString.T(nowprice)+" �ɽ��۸� ��"+ToString.T(trapri));
		return trapri;

	}

}



