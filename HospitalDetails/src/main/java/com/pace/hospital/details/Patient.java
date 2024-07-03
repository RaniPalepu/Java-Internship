package com.pace.hospital.details;

public class Patient {
	int casenumber;
	String patientname;
	float contactno;
	String disease;
	public Patient(int casenumber,String patientname,float contactno,String disease) {
		this.casenumber=casenumber;
		this.patientname=patientname;
		this.contactno=contactno;
		this.disease=disease;
	}
	public int getCasenumber() {
		return casenumber;
	}
	
	public String getPatientname() {
		return patientname;
	}
	
	public float getContactno() {
		return contactno;
	}
	
	public String getDisease() {
		return disease;
	}
	
	
	
	

}
