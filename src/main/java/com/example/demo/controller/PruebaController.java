package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.PruebaDao;

@Controller
@RequestMapping("/prueba")
public class PruebaController {
	@Autowired
	private PruebaDao pruebaDao;
	@GetMapping("/hola")
	private ResponseEntity<String> holaMundo() {
		pruebaDao.insertar("juanito");
		return new ResponseEntity<String>("ok, tamo READY", HttpStatus.OK);
		
	}
}
