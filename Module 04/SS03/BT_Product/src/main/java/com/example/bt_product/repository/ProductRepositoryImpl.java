package com.example.bt_product.repository;

import com.example.bt_product.model.Product;
import com.mysql.cj.Query;
import com.mysql.cj.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements IProductRepository{
    static List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        List<Product> productList = BaseRepository.entityManager.createQuery("select s from Product s", Product.class).getResultList();
        return productList;
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
            BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(int id) {
        Product product = BaseRepository.entityManager.createQuery("select s from Product s where s.id = ?1", Product.class).setParameter(1,id).getSingleResult();
        return product;
    }

    @Override
    public void update(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void remove(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        Product product = this.findById(id);
        entityTransaction.begin();
        BaseRepository.entityManager.remove(product);
        entityTransaction.commit();
    }

    @Override
    public List<Product> findByName(String name) {
            List<Product> products = BaseRepository.entityManager.createQuery("select s from Product s where s.name like ?1", Product.class).setParameter(1,name).getResultList();
        return products;
    }
}
