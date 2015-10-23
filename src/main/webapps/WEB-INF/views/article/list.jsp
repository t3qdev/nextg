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
 
<script language="JavaScript"><!--
function namosw_cell_rollover(cell, classname) {
  if (document.all || document.getElementById) {
    cell.classBackup = cell.className;
    cell.className   = classname;
  }
}

function namosw_cell_rollout(cell)
{
  if (document.all || document.getElementById) {
    cell.className   = cell.classBackup;
  }
}
// -->
</script>
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
			<!-- 레프트 -->
			<%@ include file="left.jsp"%>
			<!-- 레프트 -->
			
    
            
             <p align="center">&nbsp;</p>

		</td>
        <td width="700" bordercolor="white" align="left" valign="top" bgcolor="white">
            <p>&nbsp;</p>
            <p>&nbsp;&nbsp;&nbsp;<font face="맑은 고딕"><b>&nbsp;&nbsp;◆ 데스크</b></font></p>
            <table border="1" align="center" width="640" bgcolor="#FAFAFA" bordercolor="#CCCCCC" cellspacing="0" bordercolordark="#999999" bordercolorlight="white">
                <tr>
                    <td width="44" bgcolor="#D7E4BD" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>순번</b></font></p>
</td>
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
                <tr>
                    <td width="44" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>64</b></font></p>
</td>
                    <td width="356">
                        <p align="left"><font size="2" face="맑은 고딕">&nbsp;&nbsp;동급생 폭행 혐의 대학생 1명 '메르스' 의심 증세...</font></p>
</td>
                    <td width="144">
                        <p align="center"><font size="2" face="맑은 고딕">2015.06.25 &nbsp;13:57:23</font></p>
</td>
                    <td width="78" align="center" valign="middle">
                        <p align="center"><font size="2" face="맑은 고딕">사회부</font></p>
</td>
                </tr>
                <tr>
                    <td width="44" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>63</b></font></p>
</td>
                    <td width="356">
                        <p align="left"><font size="2" face="맑은 고딕">&nbsp;&nbsp;합석거절여성과 닮은 행인'묻지마 폭행'…징역 15년...</font></p>
</td>
                    <td width="144">
                        <p align="center"><font size="2" face="맑은 고딕">2015.06.25 &nbsp;13:52:11</font></p>
</td>
                    <td width="78" align="center" valign="middle">                        <p align="center"><font size="2" face="맑은 고딕">문화부</font></p>
</td>
                </tr>
                <tr>
                    <td width="44" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>62</b></font></p>
</td>
                    <td width="356">
                        <p align="left"><font size="2" face="맑은 고딕">&nbsp;&nbsp;&quot;수면 방해하는 새 쫓으려 새총으로 쇠구슬 쐈다&quot; </font></p>
</td>
                    <td width="144">
                        <p align="center"><font size="2" face="맑은 고딕">2015.06.25 &nbsp;13:47:36</font></p>
</td>
                    <td width="78" align="center" valign="middle">                        <p align="center"><font size="2" face="맑은 고딕">정치부</font></p>
</td>
                </tr>
                <tr>
                    <td width="44" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>61</b></font></p>
</td>
                    <td width="356">
                        <p align="left"><font size="2" face="맑은 고딕">&nbsp;&nbsp;빈 사무실 500곳 턴 '대도'가 검거되자 한 말은...</font></p>
</td>
                    <td width="144">
                        <p align="center"><font size="2" face="맑은 고딕">2015.06.25 &nbsp;13:24:28</font></p>
</td>
                    <td width="78">
                        <p align="center"><font size="2" face="맑은 고딕">사회부</font></p>
</td>
                </tr>
                <tr>
                    <td width="44" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>60</b></font></p>
</td>
                    <td width="356">                        <p align="left"><font size="2" face="맑은 고딕">&nbsp;&nbsp;'20년 차명 인생' 90대, 61년만에 국가유공자...</font></p>
</td>
                    <td width="144">                        <p align="center"><font size="2" face="맑은 고딕">2015.06.25 &nbsp;13:07:19</font></p>
</td>
                    <td width="78">
                        <p align="center"><font size="2" face="맑은 고딕">사회부</font></p>
</td>
                </tr>
                <tr>
                    <td width="44" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>59</b></font></p>
</td>
                    <td width="356">                        <p align="left"><font size="2" face="맑은 고딕">&nbsp;&nbsp;'현금결제 유도' ATM기까지 설치한 성매매업소 </font></p>
</td>
                    <td width="144">                        <p align="center"><font size="2" face="맑은 고딕">2015.06.25 &nbsp;12:50:44</font></p>
</td>
                    <td width="78">
                        <p align="center"><font size="2" face="맑은 고딕">경제부</font></p>
</td>
                </tr>
                <tr>
                    <td width="44" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>58</b></font></p>
</td>
                    <td width="356">                        <p align="left"><font size="2" face="맑은 고딕">&nbsp;&nbsp;한국인 조종하던 드론, 밀라노 두오모 성당에 충돌 </font></p>
</td>
                    <td width="144">                        <p align="center"><font size="2" face="맑은 고딕">2015.06.25 &nbsp;12:33:13</font></p>
</td>
                    <td width="78">
                        <p align="center"><font size="2" face="맑은 고딕">정치부</font></p>
</td>
                </tr>
                <tr>
                    <td width="44" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>57</b></font></p>
</td>
                    <td width="356">                        <p align="left"><font size="2" face="맑은 고딕">&nbsp;&nbsp;45년 만에 아내 살해 누명 벗은 캐나다 75세 노인...</font></p>
</td>
                    <td width="144">                        <p align="center"><font size="2" face="맑은 고딕">2015.06.25 &nbsp;12:21:03</font></p>
</td>
                    <td width="78">
                        <p align="center"><font size="2" face="맑은 고딕">연예부</font></p>
</td>
                </tr>
                <tr>
                    <td width="44" height="35">
                        <p align="center"><font size="2" face="맑은 고딕"><b>56</b></font></p>
</td>
                    <td width="356">                        <p align="left"><font size="2" face="맑은 고딕">&nbsp;&nbsp;합석거절여성과 닮은 행인'묻지마 폭행'…징역 15년...</font></p>
</td>
                    <td width="144">                        <p align="center"><font size="2" face="맑은 고딕">2015.06.25 &nbsp;13:52:11</font></p>
</td>
                    <td width="78"><p align="center"><font size="2" face="맑은 고딕">문화부</font></p>
</td>
                </tr>


            </table>

 
</td>
    </tr>
</table>
</body>

</html>
