/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package function;

import classAction.Data.Accountautors;
import classAction.Data.StockInf;

/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Interest  //����������
{
	//һ���ǹ�Ʊ��������  ���ּۼ�-��ʼ�ۣ�/��ʼ��
public static double profit_stock(int id)
{
	double nowprice=StockInf.stopri_fun(id);
	double  price=StockInf.stofa_price_fun(id);
		
		
	double profit = (nowprice-price)/price;
		
	return profit;
}

	
//һ����ĳ���ʻ�����ĳ����Ʊ�� �������Ʊ��������  ���ּۣ�����۸�/����۸�
	
public static double profit_stock_people(int stockid,double buyprice)
	{
			
		double nowprice=StockInf.stopri_fun(stockid);
		
			
		return  (nowprice-buyprice)/buyprice;
	}
		
	
		
//һ���ʻ����ܵ�������   ���������ʽ�-��ʼ�ʽ�/��ʼ�ʽ�
//public static double profit_people(int id)
	//{
	 
		
		
		 //chushi zijin
	 
		//return   ��Accountautors.total(id)-Accountautors.accreturn( id)��/Accountautors.accreturn( id) ;//��û�м�ʵ�ʴ���
	//}

}
