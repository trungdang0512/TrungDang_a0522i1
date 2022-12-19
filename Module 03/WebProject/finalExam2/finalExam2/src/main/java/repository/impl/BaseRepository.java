package repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/qlroom";
    private String username = "root"; vvcccklsdafkldjfklsdjfklsdjfkljsdfjklsdfjklsdfjsd
    private String password = "l3enBen$";

    private Connection connection;

    public BaseRepository(){

    }

    public Connection getConnectionJavaToDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcUrl,username,password);
            return connection;
        }
        catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
