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
public class Third implements Runnable{

	/* ���� Javadoc��
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		int num3=Robotnum.get_num(3);
		User_third[] user_third_group=new User_third[num3];
		int j=0;
		while(j<40)
		{
		
		for(int i=0;i<num3;i++)
				{
					user_third_group[i]=new User_third();
					 user_third_group[i].init();
				}
		for(int i=0;i<num3;i++)
										{

											Sell.sell(user_third_group[i].account_id);
										}
		for(int i=0;i<1;i++)
												{
                                                    Buy third =new Buy();
													third.buy(user_third_group[i].account_id,600808);
												}
			for(int i=1;i<2;i++)
															{
																Buy third =new Buy();
																third.buy(user_third_group[i].account_id,60050);
															}
			for(int i=2;i<5;i++)
															{
																Buy third =new Buy();
																third.buy(user_third_group[i].account_id,600795);
															}
			for(int i=5;i<7;i++)
															{
																Buy third =new Buy();
																third.buy(user_third_group[i].account_id,800);
															}
															
			for(int i=7;i<10;i++)
															{
																Buy third =new Buy();
																third.buy(user_third_group[i].account_id,601398);
															}
												// TODO �Զ����ɷ������
		j++;
		}
	}

}
