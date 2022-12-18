package com.example.demo.services;

import org.springframework.stereotype.beans.factory.annotation.*;

import com.example.demo.models.ProductoModel;
import com.example.demo.repositories.ProductoRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	
	public ArrayList<ProductoModel> obtenerProductos(){
		return (ArrayList<ProductoModel> productoRepository.findAll());
	}

	public ProductoModel guardarProducto(ProductoModel productoModel) {
		return productoRepository.save(productoModel);
	}
	
	public Optional<ProductoModel> obtenerProductoPorId(String idProducto) {
		return productoRepository.findById(idProducto);
	}
	
	public boolean eliminarProductoPorId(String idProducto) {
		try {
			productoRepository.deleteById(idProducto);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
}
