<html>
<head>
<title>管理员界面--添加股票</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- ImageReady Slices (页面2.psd) -->
<table width="800" height="1000" border="0" align="center" cellpadding="0" cellspacing="0" id="__01">
	<tr>
		<td colspan="3">
			<a href="Index.jsp" target="_self"><img src="images/test_01.gif" alt="" width="800" height="162" border="0"></a></td>
	</tr>
	<tr>
		<td colspan="3" background="images/test_02.gif">&nbsp;</td>
	</tr>
	<tr>
		<td width="223">
			<a href="News.jsp"><img src="images/test_03.gif" alt="" width="223" height="58" border="0"></a></td>
		<td width="546" rowspan="7" valign="top" background="images/test_05.gif"><p>&nbsp;</p>
		  <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td width="23">&nbsp;</td>
            <td width="495" valign="top"><form id="form1" name="form1" method="post" action="servlet/Insert">
                <div align="left">股票名称：
                  <input name="stockname" type="text" id="stockname" />
                </div>
              <label></label>
                <p align="left">股票代码：
                  <input name="stockid" type="text" id="stockid" />
                </p>
              <p align="left">发行数量：
                <input name="basicnum" type="text" id="basicnum" />
              </p>
              <p>
                  <label>股票类型：
                    <INPUT name="stosty" type="text"id="stosty">
                </label>
              </p>
              <p align="left">股票信息： </p>
              <p align="left">
                  <label></label>
                  <textarea name="stockinfom" cols="50" rows="5" id="stockinfom"></textarea>
              </p>
              <p>&nbsp;</p>
              <p>
                  <label>
                  <input type="submit" name="Submit" value="确定" />
                  </label>
                  <label>
                  <input type="reset" name="Submit2" value="重置" />
                  </label>
              </p>
            </form>
            <p align="left">&nbsp;</p></td>
            <td width="28">&nbsp;</td>
          </tr>
          
        </table></td>
		<td width="31" rowspan="7">&nbsp;</td>
	</tr>
	<tr>
		<td>
			<img src="images/test_06.gif" width="223" height="20" alt=""></td>
	</tr>
	<tr>
		<td>
			<a href="Addstock.jsp"><img src="images/test_07.gif" alt="" width="223" height="51" border="0"></a></td>
	</tr>
	<tr>
		<td>
			<img src="images/test_08.gif" width="223" height="21" alt=""></td>
	</tr>
	<tr>
		<td>
			<a href="Botnum.jsp"><img src="images/test_09.gif" alt="" width="223" height="54" border="0"></a></td>
	</tr>
	<tr>
		<td>
			<img src="images/test_10.gif" width="223" height="19" alt=""></td>
	</tr>
	<tr>
		<td>
			<img src="images/test_11.gif" width="223" height="468" alt=""></td>
	</tr>
	<tr>
		<td colspan="3" background="images/test_12.gif"><table width="756" border="0" align="center" cellpadding="0" cellspacing="0">
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
        </table></td>
	</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>