package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Medicine;
import com.example.demo.service.medicineService;

@RestController
public class medicineController {

	@Autowired
	medicineService MedicineService;
	
	@GetMapping("/medicine")
	private List<Medicine> getAllMedicine()
	{
		return MedicineService.getAllStudent();
	}
	@GetMapping("/medicine/{serial_no}")
	private Medicine getMedicine(@PathVariable("serial_no")int serial_no)
	{
		return MedicineService.getMedicineBySerial_no(serial_no);
	}
	@DeleteMapping("/medicine/{serial_no}")
	private void deleteMedicine(@PathVariable("serial_no") int serial_no)
	{
		MedicineService.delete(serial_no);
	}
	@PostMapping("/medicine")
	private void saveMedicine(@RequestBody Medicine medicine)
	{
		MedicineService.saveOrUpdate(medicine);
	}
	
}
