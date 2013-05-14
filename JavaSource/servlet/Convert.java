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
public class Convert extends JFrame {
/** 把ISO-8859-1码转换成GB2312
*/
public static String ISOtoGB(String iso){
String gb;
try{
if(iso.equals("") || iso == null){
return "";
}
else{
iso = iso.trim();
gb = new String(iso.getBytes("ISO-8859-1"),"GB2312");

return gb;
}
}
catch(Exception e){
System.err.print("编码转换错误："+e.getMessage());
return "";
}
}
}
