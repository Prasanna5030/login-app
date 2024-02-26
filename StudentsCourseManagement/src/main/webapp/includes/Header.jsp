<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.student.Dao.* ,com.studentBean.*" errorPage="errorpage.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
 <title>Students & course Management </title>
</head>
<body>
<div class="container  shadow-lg bg-white rounded-lg p-3">
<div class="container">
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container ">
    <a class="navbar-brand" href="#"><img src="images/avataaars.svg" width="50px" height="50px" /></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse px-5  " id="navbarNav" style="position:absolute ; right:0"  >
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addParticipant.jsp">add participant</a>
        </li>
        <li class="nav-item">
          <a class="nav-link " href="updateStudent.jsp">update participant</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="ListOfStudents.jsp">List of participants </a>
        </li>
        <li class="nav-item">
          <a class="nav-link " href="addBatch.jsp">add new batch</a>
        </li>
        <li class="nav-item">
          <a class="nav-link " href="ListOfBatches.jsp">List of batches</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
