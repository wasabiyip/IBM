/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package function;

import classAction.Data.AccountautoInf;
import classAction.Data.StockInf;

/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Desireforbuy //����Ҫ������� 


//����Ҫ������� Ȩ����������   �û�����

//��������=������/�������� - �ǵ��� 


{
	
	public static double desireforbuy(int stockid, int countid)
	{
		
		double a=Interest.profit_stock(stockid);
		
		double c=AccountautoInf.acctzc_fun(countid) ;
        double b=a/c-StockInf.stozhangfu_fun(stockid);  		
		return b;
	}
}