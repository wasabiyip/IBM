
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
<TITLE>����Աҳ��--��ӹ�Ʊ��Ϣ</TITLE>
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

<div align="center"><img src="image/banner.jpg" width="730" height="160">
  <table width="756" border="0" cellpadding="0" cellspacing="0">
    <!--DWLayoutTable-->
    <!--����-->
    <tr>
      <td width="756" height="14"></td>
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
          <td bgcolor="#3333FF"><div align="center" class="STYLE2"><a href="News.jsp">������Ϣ����</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#3333FF"><div align="center" class="STYLE3"><a href="Addstock.jsp">��ӹ�Ʊ��Ϣ</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#3333FF"><div align="center" class="STYLE3"><a href="Botnum.jsp">�޸Ļ���������</a></div></td>
        </tr>
      </table></td>
      <td width="9">&nbsp;</td>
      <td width="538" valign="top"><form id="form1" name="form1" method="post" action="servlet/Insert">
        <div align="left">��Ʊ���ƣ�
          <input name="stockname" type="text" id="stockname" />
        </div>
        <label></label>
            <p align="left">��Ʊ���룺          
              <input name="stockid" type="text" id="stockid" />
          </p>
            <p align="left">����������
              <input name="basicnum" type="text" id="basicnum" />
</p><p>
            <label>��Ʊ���ͣ�<INPUT name="stosty" type="text"id="stosty"></label>
            </p>
            <p align="left">��Ʊ��Ϣ��            </p>
            <p align="left">
              <label></label>
            
              <textarea name="stockinfom" cols="50" rows="5" id="stockinfom"></textarea>
</p>
            <p>&nbsp;</p>
            <p>
              <label>
              <input type="submit" name="Submit" value="ȷ��" />
              </label>
              <label>
              <input type="reset" name="Submit2" value="����" />
              </label>
            </p>
      </form>      <p align="left">&nbsp;</p>      </td>
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
        <p>LXYH-���н���ģ��ϵͳ</p>
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
