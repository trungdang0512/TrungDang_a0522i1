package repository.impl;

import model.Product;
import repository.ProductRepository;
import until.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {
    private static final String SELECT_FROM_LIST = "select * from product_list";
    private static final String INSERT_NEW_PRODUCT = "insert into product_list (name, price, description, producer) value (?,?,?,?);";
    private static Map<Integer, Product> productMap = new HashMap<>();
    private BaseRepository baseRepository = new BaseRepository();


    @Override
    public void createNewProduct(Product product){
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_PRODUCT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getDes());
            preparedStatement.setString(4, product.getProducer());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteById(int id) {
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public String viewProductDes(int id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>(productMap.values());

        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_LIST);
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product;
            while (resultSet.next()){
                product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setDes(resultSet.getString("description"));
                product.setProducer(resultSet.getString("producer"));
                productList.add(product);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
