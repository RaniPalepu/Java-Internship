<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
<%@ page import="com.pace.hospital.display" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Details</title>
</head>
<body>
	<h1>Patient Details</h1>
    	<table border="1">
        	<tr>
            	<th>Case Number</th>
            	<th>Patient Name</th>
            	<th>Contact Number</th>
            	<th>Disease</th>
        	</tr>
        	<%
            
            ArrayList <Patient> patientList = (ArrayList<Patient>) request.getAttribute("patientList");
            if (patientList != null) {
                for (Patient patient : patientList) {
        %>
        <tr>
            <td><%= patient.getCaseNumber() %></td>
            <td><%= patient.getPatientName() %></td>
            <td><%= patient.getContactNo() %></td>
            <td><%= patient.getDisease() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="4">No patient details available.</td>
        </tr>
        <%
            }
        %>

</body>
</html>