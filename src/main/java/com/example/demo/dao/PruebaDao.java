package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PruebaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertar(String nombre1) {
		String sql = "INSERT INTO prueba1 (nombre) VALUES (?)";
		jdbcTemplate.update(sql, nombre1);
		
	}
	
}
