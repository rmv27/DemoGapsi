package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.services.ProductoService;
import com.example.demo.models.ProductoModel;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping()
	public ArrayList<ProductoModel> obtenerProductos() {
		return this.productoService.obtenerProductos();
	}
	
	@GetMapping(path="/porId/{idProducto}")
	public Optional<ProductoModel> obtenerProductoPorId(@PathVariable("idProducto") String idProducto) {
		return this.productoService.obtenerProductoPorId(idProducto);
	}
	
	@PostMapping(path="/guardar")
	public ProductoModel guardarProducto(@RequestBody ProductoModel productoModel) {
		if(productoModel.getIdProducto()!=null) {
			return null;
		}
		return this.productoService.guardarProducto(productoModel);
	}
	
	@PutMapping(path="/actualizar")
	public ProductoModel actualizarProducto(@RequestBody ProductoModel productoModel) {
		productoModel.setNombre(null);
		productoModel.setPrecio(null);
		return this.productoService.guardarProducto(productoModel);
	}
	
	@DeleteMapping(path="/eliminar/{idProducto}")
	public String eliminarProductoPorId(@PathVariable("idProducto") String idProducto) {
		boolean ok = this.productoService.eliminarProductoPorId(idProducto);
		if(ok) {
			return "Producto eliminado con ID " + idProducto;
		} else {
			return "No se pudo eliminar el producto con ID " + idProducto;
		}
	}
	

}
