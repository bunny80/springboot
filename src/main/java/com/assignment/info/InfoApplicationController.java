package com.assignment.info;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/details")
public class InfoApplicationController {
	
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getSomeParameters() {
	    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
	            "Name", "Sai Akhil Tabdil",
	            "Email", "saiakhil.tabdil@quantiphi.com",
	            "Birth place","Kurnool",
	            "Mobile Phone","6239320899",
	            "Gender","Male",
	            "Assigned Unit","GCP"
	    		));
	}    

}
