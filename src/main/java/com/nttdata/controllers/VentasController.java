package com.nttdata.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nttdata.models.Ventas;
import com.nttdata.services.VentasService;

@Controller
@RequestMapping("/ventas")
public class VentasController {

	@Autowired
	VentasService ventasService;
	

	@RequestMapping("")
	public String ventas(@ModelAttribute("ventas") Ventas ventas,
			Model model) {
		model.addAttribute("listaVentas", ventasService.obtenerListaVentas());
		return "ventas/ventas.jsp";
	}
	
	@RequestMapping("/login")
	
	public String login(@Valid @ModelAttribute("ventas") Ventas ventas)
	{
		System.out.println(ventas.getNombreProducto()+" "+ventas.getCodigo()+" "+ventas.getPrecio());
			
		ventasService.insertarVentas(ventas);
		
		return "redirect:/ventas";
	}
	
	@RequestMapping("/eliminar")
	public String eliminarVenta(@RequestParam("id") Long id) {
		
		Ventas ventas = ventasService.buscarVentasId(id);
		
		if(ventas !=null) {
			ventasService.eliminarVentasObjeto(ventas);
		}
		
		return "redirect:/ventas";
	}
	
    @RequestMapping("/{id}/editar")
    public String edit(@PathVariable("id") Long id, Model model) {
    	System.out.println("editar");
    	Ventas ventas = ventasService.buscarVentasId(id);
    	if(ventas !=null) {
		       model.addAttribute("ventas", ventas);
		       return "/ventas/editar.jsp";
		}
		
		return "redirect:/ventas";
    }
    
    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("ventas") Ventas ventas, BindingResult result) {
    	System.out.println("Update");
        if (result.hasErrors()) {
            return "/ventas/editar.jsp";
        } else {
        	ventasService.updateVentas(ventas);
            return "redirect:/ventas";
        }
    }
}
