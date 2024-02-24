package com.testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.aventstack.extentreports.ExtentTest;

public class Helper {
	private static Connection connection = null;
	private static final String url = "jdbc:postgresql://localhost/risk_db";
	private static final String user = "postgres";
	private static final String password = "postgres";
	
	public static Connection connect() throws SQLException {
		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection == null) {
			System.out.println("Connection Failed...");
		} else {
			System.out.println("Connection Success...");
		}
		return connection;
	}
	public static void postRiskCatalogue() {
		
		
	}
	
}
