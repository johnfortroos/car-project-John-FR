package tech.tarragona.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.tarragona.spring.model.Product;
import tech.tarragona.spring.repository.ProductRepository;

@Service
public class ProductsService {
	
	@Autowired
	ProductRepository productRepository;
	@Transactional
	public List <Product> getProducts(){
		return productRepository.findAll();
	}

}
