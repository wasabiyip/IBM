/*
 * 创建日期 2007-9-17
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
package function;

import bsdata.ID_B_N;

/**
 * @author yll
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class Select_max {
	
	
	public static int select_max(ID_B_N[] group,int group_nums )
	
	{
		double a[]=new double [group_nums];
		for(int j=0; j<group_nums;j++)
		{
			
			//System.out.println("hong"+group[j].idd );
			//System.out.println(group[j].buyprice );
			a[j]=Desireforsell.desireforsell(group[j].idd  ,group[j].buyprice);	
						
		}
		
		int max_stock = group[0].idd;
		for(int j=0;j<group_nums-1;j++)
		{
			if(a[j]<a[j+1])
			{
				max_stock=group[j+1].idd;
			}
		}
		
		return max_stock;
		
		
		
		
		
		
		 
		
	}

}
