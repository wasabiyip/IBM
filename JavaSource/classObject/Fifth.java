/*
 * �������� 2007-9-28
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package classObject;

import classAction.Data.Robotnum;
import deal.Buy;
import deal.Sell;

/**
 * @author kingson
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Fifth implements Runnable{

	/* ���� Javadoc��
	 * @see java.lang.Runnable#run()
	 */
	public void run() 
	{
		int num5=Robotnum.get_num(5);
		User_fifth[] user_fifth_group=new User_fifth[num5]; 
		for(int i=0;i<num5;i++)
			{
				user_fifth_group[i]=new User_fifth();
				 user_fifth_group[i].init();
			}
			int j=0;
			while(j<40)
			{
			
		for(int i=0;i<num5;i++)
							{
																				
							Sell.sell(user_fifth_group[i].account_id);
							}  
		for(int i=0;i<num5;i++)
									{
										Buy fifth=new Buy();
																				
										fifth.buy(user_fifth_group[i].account_id,600839);
										try {
											Thread.sleep(1000);
										} catch (InterruptedException e) {
											// TODO �Զ����� catch ��
											e.printStackTrace();
										}
									}  
				// TODO �Զ����ɷ������
		j++;
			}
	}

}
