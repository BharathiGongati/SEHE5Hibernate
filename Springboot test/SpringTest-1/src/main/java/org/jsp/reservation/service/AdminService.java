package org.jsp.reservation.service;

import org.jsp.reservation.dto.Admin;
import org.jsp.reservation.dto.ResponseStructure;
import org.jsp.reservationapp.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	private AdminDao dao;
	public ResponseEntity<ResponseStructure<Admin>> saveAdmin(Admin admin) 
	{
		ResponseStructure<Admin> structure=new ResponseStructure<>();
		structure.setData(dao.saveAdmin(admin));
		structure.setMessege("Admin Saved With Id:"+admin.getId());
		structure.setStatuscode(HttpStatus.CREATED.value());
	    return new ResponseEntity<ResponseStructure<Admin>>(structure,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<Admin>> updateAdmin(Admin admin) {
		ResponseStructure<Admin> structure=new ResponseStructure<>();
		structure.setData(dao.updateAdmin(admin));
		structure.setMessege("Admin Updated Successfully");
		structure.setStatuscode(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<Admin>>(structure,HttpStatus.ACCEPTED) ;
	}


}
