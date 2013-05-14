<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>用户页面--个人信息</title>
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
.STYLE4 {color: #00FFFF}
-->
</style>
</head>

<body>
<div align="center">
  <table width="756" border="0" cellpadding="0" cellspacing="0">
    <!--顶部-->
    <tr>
      <td width="9" height="50">&nbsp;</td>
      <td width="730" align="center" valign="top" bordercolor="#00FFFF" bgcolor="#00FFCC"><div align="center">
        <h3>LXYH-股市交易模拟系统</h3>
        <p><a href="/logon/custom.jsp">用户界面</a></p>
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
      <td width="168" valign="top"><table width="200" height="398" border="1">
        <tr>
          <td bgcolor="#00FFCC"><div align="center" class="STYLE3"><a href="/logon/inquire.jsp">个人信息</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC"><div align="center" class="STYLE3"><a href="/logon/buy.jsp">买入</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC"><div align="center" class="STYLE3"><a href="/logon/sale.jsp">卖出</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC" class="STYLE3"><div align="center"><a href="/logon/cancel.jsp">委托撤单</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC" class="STYLE3"><div align="center"><a href="/logon/history.jsp">历史查询</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC" class="STYLE3"><div align="center"><a href="/logon/self.jsp">自选股</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC" class="STYLE3"><div align="center"><a href="/logon/modify.jsp">修改信息</a></div></td>
        </tr>
      </table></td>
      <td width="9">&nbsp;</td>
      <td width="538" valign="top"><form id="form1" name="form1" method="post" action="">
        <table width="287" height="200" border="1">
          <tr>
            <td width="121">账户ID</td>
            <td width="239"><label>
              <input name="accid" type="text" id="accid" />
            </label></td>
          </tr>
          <tr>
            <td>账户姓名</td>
            <td><label>
              <input name="accname" type="text" id="accname" />
            </label></td>
          </tr>
          <tr>
            <td>账户昵称</td>
            <td><label>
              <input name="accni" type="text" id="accni" />
            </label></td>
          </tr>
          <tr>
            <td>E-mail</td>
            <td><label>
              <input name="accemail" type="text" id="accemail" />
            </label></td>
          </tr>
          <tr>
            <td>电话</td>
            <td><label>
              <input name="accphone" type="text" id="accphone" />
            </label></td>
          </tr>
          <tr>
            <td>收益率</td>
            <td><label>
              <input name="accreturn" type="text" id="accreturn" />
            </label></td>
          </tr>
          <tr>
            <td>资金</td>
            <td><label>
              <input name="accfund" type="text" id="accfund" />
            </label></td>
          </tr>
          <tr>
            <td>股票价值</td>
            <td><label>
              <input name="accstovalue" type="text" id="accstovalue" />
            </label></td>
          </tr>
          <tr>
            <td height="20">总资产</td>
            <td><label>
              <input name="acctotal" type="text" id="acctotal" />
            </label></td>
          </tr>
        </table>
            <table width="484" height="145" border="1" bordercolor="#000000">
              <tr>
                <td width="61"><div align="center">持有股票</div></td>
                <td width="59"><div align="center">股票ID</div></td>
                <td width="68"><div align="center">股票名称</div></td>
                <td width="57"><div align="center">买入价格</div></td>
                <td width="67"><div align="center">买入数量</div></td>
                <td width="70"><div align="center">现价</div></td>
                <td width="56"><div align="center">涨跌</div></td>
              </tr>
              <tr>
                <td><div align="center">1</div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
              </tr>
              <tr>
                <td><div align="center">2</div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
              </tr>
              <tr>
                <td><div align="center">3</div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
              </tr>
              <tr>
                <td><div align="center">4</div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
              </tr>
              <tr>
                <td height="24"><div align="center">5</div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
                <td><div align="center"></div></td>
              </tr>
            </table>
            <p>&nbsp;</p>
      </form>
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
</body>
</html>
