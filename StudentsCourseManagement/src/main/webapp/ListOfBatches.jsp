<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.batch.Dao.*,com.batchBean.*, java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<jsp:include page="includes/Header.jsp" />
<body>
<h1>List of Batches</h1>
<br>
<hr>
<% 
List <Batch> batchList= new ArrayList<>();
BatchService batchService= new BatchService();
batchList=batchService.getAllBatches();
pageContext.setAttribute("batchList", batchList);
%>
<table border="2" style="width:100%;text-align:center" >
<thead>
<tr>
<th> batch_id </th>
<th> student_id</th>
<th>course_name</th>
<th>enroll_date</th>
<th>instructor</th>
<th>batch_session</th>
<th>session_mode</th>
<th>session_course</th>
<th>edit batch</th>
<th> delete batch</th>
</tr>
</thead>

<c:forEach var="item"  items="${pageScope.batchList}">
<tbody>
<tr>
<td><c:out value="${item.batch_id }" /> </td>
<td><c:out value="${item.student_id }" />  </td>
<td><c:out value="${item.course_name }" />  </td>
<td><c:out value="${item.enroll_date }" />  </td>
<td> <c:out value="${item.instructor }" /> </td>
<td><c:out value="${item.batch_session }" />  </td>
<td> <c:out value="${item.session_mode }" /> </td>
<td> <c:out value="${item.session_course }" /> </td>
<td> <a href="updateBatch.jsp?id=${item.batch_id}">update details</a></td>
<td>  <a href="deleteBatch.jsp?id=${item.batch_id}">delete batch</a></td>
</tr>
</tbody>
</c:forEach>
</table>


</body>
</html>