package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
ArrayList<Patient> patients = new ArrayList<Patient>();
ArrayList<Doctor> doctors = new ArrayList<Doctor>();
public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
  	        }

	public void addDoctor(Doctor Doctor) {
		// TODO Auto-generated method stub
		doctors.add(Doctor);
	}

	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for (Doctor doctor : doctors) {
			
		}
	}

}

	