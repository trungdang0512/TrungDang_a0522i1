package com.example.prductspingboots.productspringboots.service.impl;

import com.example.prductspingboots.productspringboots.dto.ProductListDto;
import com.example.prductspingboots.productspringboots.model.Product;
import com.example.prductspingboots.productspringboots.repository.IProductRepository;
import com.example.prductspingboots.productspringboots.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<ProductListDto> findAll() {
        List<Product> productList = productRepository.findAll();
        List<ProductListDto> productListDtoList = new ArrayList<>();
        ProductListDto productListDto;
        for (Product product: productList){
            productListDto = new ProductListDto();
            BeanUtils.copyProperties(product, productListDto);
            productListDtoList.add(productListDto);
        }
        return productListDtoList;
    }

    @Override
    public Page<Product> getAllWithPage(PageRequest pageRequest) {
        return productRepository.findAllWithPage(pageRequest);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return this.productRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        this.productRepository.deleteById(id);
    }
}
