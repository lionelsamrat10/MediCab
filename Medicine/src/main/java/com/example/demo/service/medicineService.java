package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Medicine;
import com.example.demo.dao.medicineRepository;
@Service
public class medicineService {

	@Autowired
	medicineRepository MedicineRepository;
	
	public List<Medicine> getAllStudent() {
		// TODO Auto-generated method stub
		List<Medicine> medicines=new ArrayList<Medicine>();
		MedicineRepository.findAll().forEach(medicine->medicines.add(medicine));
		return medicines;
	}

	public Medicine getMedicineBySerial_no(int serial_no) {
		// TODO Auto-generated method stub
		return MedicineRepository.findById(serial_no).get();
	}

	public void delete(int serial_no) {
		// TODO Auto-generated method stub
		MedicineRepository.deleteById(serial_no);
		
	}

	public int saveOrUpdate(Medicine medicine) {
		// TODO Auto-generated method stub
		MedicineRepository.save(medicine);
		return medicine.getSerial_no();
	}
	

}
