package com.codeo.Hikaricp;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;

public class ReadingDataFromDatabse {

	

	private static Connection connection =null;
	
	private static HikariDataSource datasource;
	static {
	try {
		Properties properties = new Properties();
		
		//properties = new Properties();
		
		properties.load(new FileInputStream("src/main/java/com/jdbc/demo_com/db.properties"));
		
		String driverClassName = properties.getProperty("driver.class.name");
		String dbUrl = properties.getProperty("db.url");
		String dbUserName= properties.getProperty("db.username");
		String dbPassword = properties.getProperty("db.password");
		
		datasource = new HikariDataSource();
		
		datasource.setDriverClassName(driverClassName);
		datasource.setJdbcUrl(dbUrl);
		datasource.setUsername(dbUserName);
		datasource.setPassword(dbPassword);
		datasource.setMaximumPoolSize(100);
		datasource.setMinimumIdle(10);
		
	}

	catch(IOException e)
	{
		e.printStackTrace();
	}
}
	public static DataSource getDataSource()
	{
		return datasource ;
	}
}