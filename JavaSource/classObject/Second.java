/*
 * �������� 2007-9-27
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package classObject;

import classAction.Data.Robotnum;
import deal.Buy;
import deal.Sell;

/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Second implements Runnable{

	/* ���� Javadoc��
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		int num2=Robotnum.get_num(2);// TODO �Զ����ɷ������
		User_second[] user_second_group=new User_second[num2];
		int j=0;
		while(j<40)
		{
		
		for(int i=0;i<num2;i++)
						{
							user_second_group[i]=new User_second();
							 user_second_group[i].init();
						}
		for(int i=0;i<num2;i++)
										{
											Sell.sell(user_second_group[i].account_id);
										}
		for(int i=0;i<1;i++)
																{
																	Buy second =new Buy();
																	second.buy(user_second_group[i].account_id,600036);
																}
			for(int i=1;i<3;i++)
																			{
																				Buy second =new Buy();
																				second.buy(user_second_group[i].account_id,600050);
																			}
			for(int i=3;i<6;i++)
																			{
																				Buy second =new Buy();
																				second.buy(user_second_group[i].account_id,600795);
																			}
			for(int i=6;i<8;i++)
																			{
																				Buy second =new Buy();
																				second.buy(user_second_group[i].account_id,800);
																			}
			for(int i=8;i<10;i++)
																			{
																				Buy second =new Buy();
																				second.buy(user_second_group[i].account_id,6001398);
																			}
																			
	
	
			j++;
	}
	}
}
