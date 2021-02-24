package service;

import jdbc.ConnectionJDBC;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

public class ProductService implements IProductService{
    @Override
    public List<Product> fillAll() {
        List<Product> productList = new ArrayList<>();
        Connection connection = ConnectionJDBC.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Double price = resultSet.getDouble(3);
                int amount = resultSet.getInt(4);
                String color = resultSet.getString(5);
                String description = resultSet.getString(6);
                String category_name = resultSet.getString(7);
                Product product = new Product(id,name,price,amount,color,description,category_name);
                productList.add(product);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public boolean save(Product product) {
        Boolean test = false;
        Connection connection = ConnectionJDBC.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO product VALUES (?,?,?,?,?,?,?)");
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(1,product.getId());
            preparedStatement.setDouble(3,product.getPrice());
            preparedStatement.setInt(4,product.getAmount());
            preparedStatement.setString(5,product.getColor());
            preparedStatement.setString(6,product.getDescription());
            preparedStatement.setString(7,product.getCategory_name());
            test = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return test;
    }

    @Override
    public boolean update(Product product, int id) {
        Boolean test = false;
        Connection connection = ConnectionJDBC.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update product set name = ?, price = ?, amount = ?, color = ?, description = ?, category_name = ? where id = ?");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(7,product.getId());
            preparedStatement.setDouble(2,product.getPrice());
            preparedStatement.setInt(3,product.getAmount());
            preparedStatement.setString(4,product.getColor());
            preparedStatement.setString(5,product.getDescription());
            preparedStatement.setString(6,product.getCategory_name());
            test = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return test;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }
}
