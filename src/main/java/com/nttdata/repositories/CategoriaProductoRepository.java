package com.nttdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.models.CategoriaProducto;

@Repository
public interface CategoriaProductoRepository extends CrudRepository<CategoriaProducto ,Long> {

	List<CategoriaProducto> findAll();

	@Query(value = "SELECT * FROM categorias_producto cp WHERE categoria_id = ?1",nativeQuery =true)
	List<CategoriaProducto> obtenerCategoriaProductoWhereId(Long id);
}
