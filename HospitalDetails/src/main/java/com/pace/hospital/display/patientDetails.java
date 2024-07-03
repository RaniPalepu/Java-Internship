package com.pace.hospital.display;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pace.hospital.details.Patient;

/**
 * Servlet implementation class patientDetails
 */
public class patientDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static ArrayList<Patient> patientList = new ArrayList<Patient>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public patientDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		int casenumber = Integer.parseInt(request.getParameter("casenumber"));
		String patientname = request.getParameter("patientname");
		float contactno = Float.parseFloat(request.getParameter("contactno"));
		String disease = request.getParameter("disease");
		
		Patient patient = new Patient(casenumber, patientname,contactno,disease);
		patientList.add(patient);
		request.setAttribute("patientList", patientList);
		request.getRequestDispatcher("patientDetails.jsp").forward(request, response);
		
	}

}
