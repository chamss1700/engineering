<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 정보 수정페이지입니다.<br />
<form action="memModifyOk" method="post" name="frm">
<input type-"hideen" name="membId" value="${dto.membId }">
    <table border="1" align="center">
         <tr><td>아이디</td>
         <td>${dto.membId }</td></tr>
         <tr><td>이름</td>
             <td>${dto.membName }</td></tr>
         <tr><td>우편번호</td>
              <td><input type="text" name="postNumber" id="sample4_postcode" value="${dto.postNumber}" /></td></tr>
         <tr><td>주소</td>
              <td><input type="text" name="membAddr" id="sample4_roadAddress" value="${dto.membAddr}"/>
              <a href="javascript:sample4_execDaumPostcode()">주소검색</td></a></tr>
         <tr><td>상세주소</td>
              <td><input type="text" name="detailAddr" /></td></tr>            
         <tr><td>연락처</td>
              <td><input type="text" name="membPhoneNumber" value="${dto.membPhoneNumber}"></td></tr>
         <tr><td>생년월일</td>
              <td>
                  <fmt:formatDate value="${dto.membBirth }" type ="date" pattern="yyyy-mm-dd"/> </td></tr>
         <tr><td>성별</td>
              <td><c:if test="${dto.membGender =='M' }"> 남자 </c:if>
              <td><c:if test="${dto.membGender =='F' }"> 여자 </c:if>
              </td></tr>
         <tr><td>이메일</td>
            <td><input type="email" name=membEmail/> 
            </td></tr>
         <tr><td>이메일수신여부</td>
            <td><input type="radio" name="membConfirm" value="Y"<c:if test="${dto.membConfirm =='Y' }">checked
                 </c:if> />예
                <input type="radio" name="membConfirm" value="Y"<c:if test="${dto.membConfirm =='N' }">checked
                 </c:if> />아니오
            </td></tr>
         <tr><td colspan="2" align="center">
              <input type="submit" value="회원수정" />
              <input type="button" value="수정 안함" onclick="javascript:history.back();" />
              <input type="button" value="강퇴" onclick="javascript:location.href='memDel?memId=${dto.membId }'"/>
         </td></tr>
    </table> 
</form>
</body>
</html>