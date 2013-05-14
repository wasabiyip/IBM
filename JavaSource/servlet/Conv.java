package servlet;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
/**
 * @version 	1.0
 * @author
 */
public class Conv extends JFrame {
/** 把ISO-8859-1码转换成GB2312
*/
public static String toasc(String needConv){
try{
byte [] b=needConv.getBytes("GB2312");
String result=new String(b,"iso-8859-1");
return result;
}catch(java.io.UnsupportedEncodingException e){
System.out.println(e.getMessage());
}
//如果失败，返回原字符串
return needConv;
}

/**
* 把英文字符串转变为中文字符集
*
* @param needConv
* @return */
public static String togb(String needConv){
try{
byte [] b=needConv.getBytes("iso-8859-1");
String result=new String(b,"GB2312");
return result;
}catch(java.io.UnsupportedEncodingException e){
System.out.println(e.getMessage());
}
return needConv;
}

}