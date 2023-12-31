package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entidades.Pasatiempo;
import com.empresa.entidades.Usuario;
import com.empresa.service.PasatiempoService;
import com.empresa.service.UsuarioService;
import com.empresa.util.AppSettings;

@RestController
@RequestMapping("/url/util")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class UtilController {

	@Autowired
	private PasatiempoService pasatiempoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/listaPasatiempo")
	@ResponseBody
	public List<Pasatiempo> listaPasatiempo() {
		return pasatiempoService.listaPasatiempo();
	}
	
	@GetMapping("/listaUsuario")
	@ResponseBody
	public List<Usuario> listaUsuario() {
		return usuarioService.listaUsuario();
	}
}
