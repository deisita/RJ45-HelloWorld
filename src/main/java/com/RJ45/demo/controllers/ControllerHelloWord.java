package com.RJ45.demo.controllers;
import org.springframework.web.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RJ45.demo.model.Persona;


@RestController
public class ControllerHelloWord {
	 List personas=new ArrayList();
			 
	 @RequestMapping("/")
	 public   String hellow() 
	    {
	        return "Hello World!";
	    }
	 
	 @GetMapping("/persona")
	   public List<Persona> getPersona() 
	    {
		 		//Persona aux = new Persona("maria","deisy","liberato","herrera",new Date(),"femenino");
		  	//	this.personas.add(aux);
		 		return personas;
		//return new Persona("maria","deisy","liberato","herrera",new Date(),"femenino");
	    }
	 
	 @PostMapping("/persona")
	 public void agregarPersona(@RequestBody Persona nueva)
	 	{
		 this.personas.add(nueva);
		 
	 	}
	 
	 }
	 
	 

