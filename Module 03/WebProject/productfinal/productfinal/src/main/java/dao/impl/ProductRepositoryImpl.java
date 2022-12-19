package dao.impl;

import dao.BaseRepository;
import dao.IProductRepository;
import model.Category;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {

    private final String SELEC_FROM_PRODUCT = "select * from products pr inner join category ct on pr.categoryid = ct.id";
    private final String ADD_PRODUCT = "insert into products (id,name,price,quantity,color,description,categoryid) value (?,?,?,?,?,?,?)";
    private final String DELETE_PRODUCT = "delete from products where id = ?;";
    private final String SELECT_BY_ID = "select * from products pr inner join category ct on pr.categoryid = ct.id where pr.id = ?;";
    private final String UPDATE_PRODUCT = "update products set id=?, name=?, price=?, quantity=?, color=?, description=?, categoryid=? where id=?;";
    private final String FIND_BY_NAME = "select * from products pr inner join category ct on pr.categoryid = ct.id where pr.name like ?";
    static List<Product> products = new ArrayList<>();
    private BaseRepository baseRepository = new BaseRepository();
    private CategoryRepositoryImpl categoryRepository = new CategoryRepositoryImpl();

    @Override
    public void addNewProduct(Product product) {
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_PRODUCT);
            preparedStatement.setString(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setInt(4, product.getQuantity());
            preparedStatement.setString(5, product.getColor());
            preparedStatement.setString(6, product.getDescription());
            preparedStatement.setInt(7, product.getCategory().getId());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean deleteProduct(String id) throws SQLException {
        boolean rowDelete;
        try( Connection connection = this.baseRepository.getConnectionJavaToDB();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT);) {
            preparedStatement.setString(1, id);
            rowDelete = preparedStatement.executeUpdate() > 0;
        }
        return rowDelete;
    }

    @Override
    public boolean updateProduct(Product product) {
        boolean rowUpdate;
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT);
            preparedStatement.setString(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setInt(4, product.getQuantity());
            preparedStatement.setString(5, product.getColor());
            preparedStatement.setString(6, product.getDescription());
            preparedStatement.setInt(7, product.getCategory().getId());
            preparedStatement.setString(8, product.getId());
            rowUpdate = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdate;
    }

    @Override
    public Product selectProduct(String id) {
        Product product = null;
        try {
            Connection connection =  this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String productID = id;
                product = new Product();
                product.setId(productID);
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setColor(resultSet.getString("color"));
                product.setDescription(resultSet.getString("description"));
                int categoryId = resultSet.getInt("categoryid");
                product.setCategory(new Category(categoryId,resultSet.getString("category")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public List<Product> findProductByName(String name) {
        List<Product> productList = new ArrayList<>();
        Product product = null;
        try {
            Connection connection =  this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_NAME);
            preparedStatement.setString(1, "%"+name+"%");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                product = new Product();
                product.setId(resultSet.getString("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setColor(resultSet.getString("color"));
                product.setDescription(resultSet.getString("description"));
                int categoryId = resultSet.getInt("categoryid");
                product.setCategory(new Category(categoryId,resultSet.getString("category")));
                productList.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();

        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELEC_FROM_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product;
            while (resultSet.next()){
                product = new Product();
                product.setId(resultSet.getString("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setColor(resultSet.getString("color"));
                product.setDescription(resultSet.getString("description"));
                int categoryId = resultSet.getInt("categoryid");
                product.setCategory(new Category(categoryId,resultSet.getString("category")));
                productList.add(product);
            }
            connection.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return productList;
    }
}
