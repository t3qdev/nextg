<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="../top.jsp"%>
<style>
<!--
.nmsw_linked { color:white; background-color:rgb(94,150,194); }
-->
</style>


<style type="text/css">
 <!--
a:link { text-decoration:none; color:#000000; }
 a:visited { text-decoration:none; color:#000000; }
 a:active { text-decoration:none; color:#000000; }
 a:hover { text-decoration:none; color:#ffffff; }
 -->
 </style>
 
</head>

<body bgcolor="whitesmoke" text="black">
<table border="0" width="900" align="center">
    <tr>
        <td width="200" bordercolor="white" bgcolor="#666666" height="50" valign="middle">
            <p align="center"><b><font size="4" face="맑은 고딕" color="white">통합 CMS</font></b></p>
        </td>
        <td width="700" height="50" bgcolor="#CCCCCC" bordercolor="white" valign="middle">
           <b><font face="맑은 고딕"><span style="font-size:16pt;">&nbsp;&nbsp;&nbsp;</span><span style="font-size:14pt;">&nbsp;기사 관리</span></font></b> 
        </td>
    </tr>
    <tr>
        <td width="200" bordercolor="white" height="5"></td>
        <td width="700" bordercolor="white" height="5"></td>
    </tr>
    <tr>
        <td width="200" bordercolor="white" height="700" valign="top" bgcolor="#ACD6F6">

             <p align="center">&nbsp;</p>

		</td>
        <td width="700" bordercolor="white" align="left" valign="top" bgcolor="white">
            <p>&nbsp;</p>
            <p>&nbsp;&nbsp;&nbsp;<font face="맑은 고딕"><b>&nbsp;&nbsp;◆ 데스크</b></font></p>
            <table border="1" align="center" width="640" bgcolor="#FAFAFA" bordercolor="#CCCCCC" cellspacing="0" bordercolordark="#999999" bordercolorlight="white">
                <tr>
                    <td width="356" bgcolor="#D7E4BD">
                        <p align="center"><font size="2" face="맑은 고딕"><b>기사 제목</b></font></p>
</td>
                    <td width="144" bgcolor="#D7E4BD">
                        <p align="center"><font size="2" face="맑은 고딕"><b>등록일시</b></font></p>
</td>
                    <td width="78" bgcolor="#D7E4BD">
                        <p align="center"><font size="2" face="맑은 고딕"><b>부서</b></font></p>
</td>
                </tr>
                
                <!-- 기사리스트 반복... -->
             	<c:forEach var="list" items="${articleList}" varStatus="sts">   
                <tr>
                    <td width="356">
                        <p align="left"><font size="2" face="맑은 고딕"><a href="view/${list.idx}">${list.title}</a></font></p>
					</td>
                    <td width="144">
                        <p align="center"><font size="2" face="맑은 고딕">${list.regdate}</font></p>
					</td>
                    <td width="78" align="center" valign="middle">
                        <p align="center"><font size="2" face="맑은 고딕">${list.writer}</font></p>
					</td>
                </tr>
                </c:forEach> 

            </table>
</td>
    </tr>
</table>



</body>

</html>
