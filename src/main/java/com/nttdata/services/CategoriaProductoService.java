package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.CategoriaProducto;
import com.nttdata.repositories.CategoriaProductoRepository;

@Service
public class CategoriaProductoService {
	
@Autowired 
CategoriaProductoRepository categoriaproductoRepository;

public void insertarCategoriaProducto(@Valid CategoriaProducto categoriaproducto) {
	categoriaproductoRepository.save(categoriaproducto);
}

public List<CategoriaProducto> obtenerListaCategoriaProducto() {
	
	return  categoriaproductoRepository.findAll();
}

public List<CategoriaProducto> obtenerCategoriaProductoWhereId(Long id){
	return categoriaproductoRepository.obtenerCategoriaProductoWhereId(id);
}





}
