package _04_hospital;

import java.util.ArrayList;

public class Doctor {
 ArrayList<Patient> patients = new ArrayList<Patient>();
	public void assignPatient(Patient max) throws DoctorFullException {
		
		
		
			if(patients.size() < 3) {
				patients.add(max);
			} else {
				throw new DoctorFullException();
				
			}

		
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (Patient patient : patients) {
			patient.checkPulse();
		}
	}
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}
	}

	