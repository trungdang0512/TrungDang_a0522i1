package dao.impl;

import dao.BaseRepository;
import dao.ICategoryRepository;
import model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements ICategoryRepository {
    private final String SELECT_FROM_CATEGORY = "select * from category";
    private final String SELECT_BY_ID = "select category from category WHERE id = ?;";
    private final String SELECT_BY_NAME = "select id from category WHERE category = ?;";

    static List<Category> categories = new ArrayList<>();
    private BaseRepository baseRepository = new BaseRepository();


    @Override
    public List<Category> findAll() {
        List<Category> categoryList = new ArrayList<>();

        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_CATEGORY);
            ResultSet resultSet = preparedStatement.executeQuery();
            Category category;
            while (resultSet.next()){
                category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("category"));
                categoryList.add(category);
            }
            connection.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return categoryList;
    }

    @Override
    public Category findById(int id) {
        Category category = null;

        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int idCategory = id;
                String name = resultSet.getString("category");
                category = new Category(idCategory, name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }

    @Override
    public int findByName(String name) {
        Category category = null;
        int findId = 0;

        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_NAME);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String nameCategory = name;
                int id = resultSet.getInt("id");
                category = new Category(id,nameCategory);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category.getId();
    }
}
