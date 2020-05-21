package entity;

import org.springframework.stereotype.Component;

import org.sqlite.JDBC;

import java.sql.*;
//охранение в базу данных
@Component
public class DBSaving implements SavingInterface {
    private static final String CON_STR = "jdbc:sqlite:fish.s3db";
    private Connection connection;




    @Override
    public void save(Fish fish)
    {
        try {

            DriverManager.registerDriver(new JDBC());
            this.connection = DriverManager.getConnection(CON_STR);
        } catch (Exception e) {e.printStackTrace();}


        try {
            PreparedStatement statement = this.connection.prepareStatement("INSERT INTO fish VALUES(?, ?, ?, ?)");

            statement.setInt(1, fish.getId());
            statement.setString(2, fish.getName());
            statement.setString(3, fish.getColor());
            statement.setDouble(4, fish.getSize());
            statement.executeUpdate();
        } catch (SQLException e) { e.printStackTrace();
        }
    }
}
