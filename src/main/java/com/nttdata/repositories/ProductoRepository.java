package com.nttdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.models.Categoria;
import com.nttdata.models.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

	List<Producto> findAll();
	
	@Query("SELECT c from Categoria c where c.nombre like %?1%")
	public List <Categoria> findByCategorias(String nombre);
	
}