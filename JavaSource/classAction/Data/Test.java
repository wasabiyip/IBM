package classAction.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ibm.db2.jcc.DB2Connection;
import java.sql.Timestamp;
import connection.DoConnection;
import classAction.Data.lishigu;

 /* @author yll
 *
 * ��������������ע�͵�ģ��Ϊ
 * ���� > ��ѡ�� > Java > �������� > �����ע��
 */
public class Test {
public static lishigu[] q()

{
	lishigu[] a=new lishigu[2];
	 a[0]=new lishigu();
	a[0].buypri=32;

	a[1]=new lishigu();
	a[1].nowpri=39;
return a;
	
}
}
