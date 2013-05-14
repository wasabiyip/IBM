
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html>
<HEAD>
<%@ page 
language="java"
contentType="text/html; charset=GB18030"
pageEncoding="GB18030"
%>
<META http-equiv="Content-Type" content="text/html; charset=GB18030">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>管理员页面--修改机器人数量</TITLE>
<style type="text/css">
<!--
#news {
	position:absolute;
	width:485px;
	height:209px;
	z-index:1;
	visibility: visible;
	left: 330px;
	top: 83px;
}
#nor {
	position:absolute;
	width:514px;
	height:386px;
	z-index:2;
	visibility: hidden;
}
#stockinf1 {
	position:absolute;
	width:514px;
	height:388px;
	z-index:3;
	visibility: hidden;
}
.STYLE2 {font-size: 24px; font-weight: bold; color: #00FFFF; }
.STYLE3 {font-size: 24px; font-weight: bold; color: #FFFFFF; }
-->
</style>
</HEAD>

<BODY>

<div align="center">
  <table width="756" border="0" cellpadding="0" cellspacing="0">
    <!--顶部-->
    <tr>
      <td width="9" height="50">&nbsp;</td>
      <td width="730" align="center" valign="top" bordercolor="#00FFFF" bgcolor="#00FFCC"><div align="center">
        <h3>LXYH-股市交易模拟系统</h3>
        <p><a href="Admin.jsp">管理员界面</a></p>
      </div></td>
    <td width="17">&nbsp;</td>
    </tr>
  </table>
</div>
<div align="center">
  <table width="756" border="0" cellpadding="0" cellspacing="0">
    <!--DWLayoutTable-->
    <tr>
      <td width="13" height="398">&nbsp;</td>
      <td width="168" valign="top"><table width="200" height="159" border="1">
        <tr>
          <td bgcolor="#3333FF"><div align="center" class="STYLE2"><a href="News.jsp">政策信息发布</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#3333FF"><div align="center" class="STYLE3"><a href="Addstock.jsp">添加股票信息</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#3333FF"><div align="center" class="STYLE3"><a href="Botnum.jsp">修改机器人数量</a></div></td>
        </tr>
      </table></td>
      <td width="9">&nbsp;</td>
      <td width="538" valign="top"><form id="form1" name="form1" method="post" action="">
        <p>修改机器人数量：
          <label>
          <input name="numberbot" type="text" id="numberbot" />
          </label>
        </p>
        <p>
          <label>
          <input type="submit" name="Submit" value="提交" />
          </label>
          <label>
          <input type="reset" name="Submit2" value="重置" />
          </label>
        </p>
      </form>      
      <p align="left">&nbsp;</p>
      </td>
      <td width="28">&nbsp;</td>
    </tr>
    <tr>
      <td height="27">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</div>
<div align="center">
  <table width="756" border="0" cellpadding="0" cellspacing="0">
    <!--DWLayoutTable-->
    <tr>
      <td width="11" height="14">&nbsp;</td>
      <td width="724">&nbsp;</td>
      <td width="21">&nbsp;</td>
    </tr>
    <tr>
      <td height="25">&nbsp;</td>
      <td valign="top"><div align="center">
        <p>LXYH-股市交易模拟系统</p>
        <p>2007</p>
      </div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="16">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</div>

</BODY>
</html:html>
