/*
 * 创建日期 2007-9-29
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package classAction.Data;

/**
 * @author kingson
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class ToString {
	public static String T(double tt)
			{
				java.text.DecimalFormat   df   =   new   java.text.DecimalFormat("###,##0.00");   
				return df.format(tt);
			}
}
