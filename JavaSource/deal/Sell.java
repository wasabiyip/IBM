/*
 * �������� 2007-9-9
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package deal;

import java.sql.Timestamp;

import bsdata.Ig;
import classAction.ComFun.SelectStock;
import classAction.Data.AutostockInf;
import classAction.Data.Autostockrs;
import classAction.Data.Sellentrustrs;
import classAction.Data.ToString;
import classAction.Data.lishigu;
import function.Sellweitou;

/**
 * @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Sell {
	
	public static  void sell(int id )
	{
	
	
		Ig i=new Ig();
		lishigu[] a=AutostockInf.all_fun(id,i);
		
		for(int j=0;j<i.i;j++)
		{
			long k = System.currentTimeMillis();
			Timestamp now= new Timestamp(k);
			long t=now.getTime()-a[j].time.getTime();
			if(t>30*60*1000)
			{
				//System.out.print("shit");//chedan;////////////////////////////����
			}
		}
		int stockID=SelectStock.selectstock(id);
		
		//System.out.println("haha"+stockID);
		if(stockID==0)
		{
			//System.out.print("shit");
        return;
		}
		int aa=0;
	 	for(int j=0;j<i.i;j++)
		{
			if(a[j].stoid==stockID)
			{ aa=j;break; } 
				
		}
		
	 
		double stockPRICE=Sellweitou.sellweituo(stockID,a[aa].buypri,a[aa].nowpri,id);
		//����ȫ����
		
		//System.out.println(stockPRICE);
		long L = System.currentTimeMillis();
		Timestamp now= new Timestamp(L);
	    int conID=Sellentrustrs.max();
		
	//	System.out.println("sellentrust"+id);////////////////////////////////////////////////////
		
		
		Sellentrustrs.all_rs(id, conID, stockID,stockPRICE ,a[aa].stonum ,now);
            Autostockrs.set_guadan(id,stockID,1);
		System.out.println("�û���"+id+" �ҵ���Ʊ: "+stockID+" �۸�"+ToString.T(stockPRICE)+" ������"+a[aa].stonum+"��ͬ�ţ�"+conID);
	}
	
	
	//�ȷ����Լ���ί�У�����û����Ҫ������     ��ѯENTRUST
	
	//����SelectStock ��ѡҪ��Ĺ�Ʊ
	
	//����Sellweituo����ί�м۸�
	
	//���������� ��֪����ô����
	
	//д��ί�б������������֪����ô��  ��֪���ǲ�����DATA�����һ��д��ί�еĶ���
	
	//д�����ί�У��ȵ���������ί��ȫ���߶�����ͳһд��ί�б�
	

}
 