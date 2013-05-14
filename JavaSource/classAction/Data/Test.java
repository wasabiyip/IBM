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
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
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
