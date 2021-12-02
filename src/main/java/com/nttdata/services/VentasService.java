package com.nttdata.services;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Ventas;
import com.nttdata.repositories.VentasRepository;

@Service
public class VentasService {
	@Autowired
	VentasRepository ventasRepository;

	public void insertarVentas(@Valid Ventas ventas) {
		ventasRepository.save(ventas);
	}

	public List<Ventas> obtenerListaVentas() {
		
		return  ventasRepository.findAll();
	}

	public Ventas buscarVentasId(Long id) {
		
		return ventasRepository.findById(id).get();
	}

	public void eliminarVentas(Long id) {
		ventasRepository.deleteById(id);
	}

	public void eliminarVentasObjeto(Ventas ventas) {
		ventasRepository.delete(ventas);
		
	}

	public void updateVentas(@Valid Ventas ventas) {
		if(ventasRepository.existsById(ventas.getId())){
			ventasRepository.save(ventas);
		}		
	}
	
	
	
}
