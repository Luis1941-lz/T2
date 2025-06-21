package com.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practica.models.Inventario;
import com.practica.models.Producto;
import com.practica.repositories.ICategoriaRepository;
import com.practica.repositories.IInventorioRepository;
import com.practica.repositories.IProductoRepository;

@Controller
@RequestMapping("/inventario")
public class InventarioController {
	
	@Autowired
	private IInventorioRepository _IInventoryRepository;
	@Autowired
	private IProductoRepository _IProductoRepository;
	@Autowired
	private ICategoriaRepository _ICategoriaRepository;
	
	@GetMapping("/listado")
	public String listado(Model model) {
		List<Inventario> lstinventario = _IInventoryRepository.findAll();
		model.addAttribute("lstinventario", lstinventario);
		return "inventario/listadoZapata";


	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		
		model.addAttribute("productos", _IProductoRepository.findAll());
		model.addAttribute("categorias", _ICategoriaRepository.findAll());
		model.addAttribute("inventario", new Inventario());
		return "inventario/nuevoZapata";
		
	}
	
	@PostMapping("/registrar")
	public String registrar(@ModelAttribute Inventario inventario, Model model) {
		
		model.addAttribute("productos", _IProductoRepository.findAll());
		model.addAttribute("categorias", _ICategoriaRepository.findAll());
		
		Inventario registrado = _IInventoryRepository.save(inventario);
		return "inventario/nuevoZapata";
		
	}
}
