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
public class Fourth implements Runnable{

	/* ���� Javadoc��
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		int num4=Robotnum.get_num(4);
		User_fourth[] user_fourth_group=new User_fourth[num4];
		for(int i=0;i<num4;i++)
				{
					user_fourth_group[i]=new User_fourth();
					 user_fourth_group[i].init();
					
				}
				int j=0;
				while(j<40)
				{

		for(int i=0;i<num4;i++)
						{
																					
						   Sell.sell(user_fourth_group[i].account_id);
					
						}
		for(int i=0;i<num4;i++)
										{
											Buy fourth=new Buy();						
											fourth.buy(user_fourth_group[i].account_id,600839);
					
										}// TODO �Զ����ɷ������
		j++;
				}
	}
	

}
