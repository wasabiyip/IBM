/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package function;

import classAction.Data.StockInf;

/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Desireforsell //����Ҫ��������  ������+�ǵ�
{
	
	public static double desireforsell(int stockid ,double buyprice)
	{
		double a=Interest.profit_stock_people(stockid,buyprice);
		 double desire=a+StockInf.stozhangfu_fun(stockid);
		
		return desire;
	}

}