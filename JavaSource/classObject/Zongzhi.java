/*
 * �������� 2007-9-26
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package classObject;

import classAction.Data.StockInf;
import classAction.Data.ToString;

/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Zongzhi implements Runnable{

	/* ���� Javadoc��
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		
		while(1==1)
		{
			try{
			
			Thread.sleep(2000);
			double a=StockInf.zong_zhi();
			
			System.out.println("���ڴ��̵�ָ����"+ToString.T(a));
			Thread.sleep(500);
			StockInf .stozhangfu_fun_all();
			
			Thread.sleep(1000);
			}
			catch (InterruptedException e) {
		   
							 //  System.out.println(account_id+"���һ�ι�Ʊ����");
							}	  
		}
		
	}
	

}
