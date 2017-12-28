package me.anmt.ssm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 罗选通 on 2017/11/7.
 */
public class Main {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/practice?useUnicode=true&characterEncoding=utf-8";
    String user="root";
    String pass="root";
    Connection connection = DriverManager.getConnection(url,user,pass);
    PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()){
      String string = resultSet.getString(2);
      System.out.println(string);
    }
    resultSet.close();
    preparedStatement.close();
    connection.close();
  }
}
