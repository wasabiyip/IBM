/*
 * �������� 2007-9-29
 *
 * �����������ļ�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
package classAction.Data;

/**
 * @author kingson
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class ToString {
	public static String T(double tt)
			{
				java.text.DecimalFormat   df   =   new   java.text.DecimalFormat("###,##0.00");   
				return df.format(tt);
			}
}
