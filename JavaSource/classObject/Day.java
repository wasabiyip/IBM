/*
 * �������� 2007-9-25
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package classObject;

import java.sql.Timestamp;

import classAction.Data.One_day;
import classAction.Data.Stockrs;

/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Day implements Runnable{

	/* ���� Javadoc��
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
	
	
	while(1==1)
	{
				
		
	long ii=System.currentTimeMillis();
	Timestamp a=new Timestamp(ii);
	if(a.after(One_day.righttime))
	{
		One_day.set_left();
		One_day.set_cen();
		One_day.set_right();
		System.out.println("��������ʱ���Ѿ����ˡ�");
		System.out.println("���쿪��ʱ���Ѿ����ˡ�");
	}

	
	
	}
	
	
	
		// TODO �Զ����ɷ������
		
	}







}
