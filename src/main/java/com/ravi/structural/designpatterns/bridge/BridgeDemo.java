//package com.ravi.structural.designpatterns.bridge;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
///**
// * Bridge design pattern is used for
// * Decoupling abstraction and implementation
// * (Encapsulation ,composition,interface).
// * Changes in abstraction wont affect client
// * EX: Drivers (JDBC driver).
// * Needs interfaces and abstract classes
// */
//public class BridgeDemo {
//    public static void main(String[] args) throws SQLException {
//        Connection con = null;
//        Statement statement = null;
//        try {
//            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
//            String dburl = "jdbc:derby:memory:codejava/webdb;create=true";
//            con = DriverManager.getConnection(dburl);
//            statement = con.createStatement();
//            //This client is an abstraction and can work with any database
//
//            statement.executeUpdate("CREATE TABLE Address(ID INT,StreetName VARCHAR(20),City VARCHAR(30))");
//            System.out.println("Table created");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                statement.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            con.close();
//
//        }
//    }
//
//}
