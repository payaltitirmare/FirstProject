package com.codeo.bonecp;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class DBUtil {

	private static final String DB_USERNAME= "db.username";
	private static final String DB_PASSWORD="db.password";
	private static final String DB_URL="db.url";
//	private static final String DB_DRIVER_CLASS="driver.class.name";
	
	private static Properties properties = null;
	private static BoneCP dataSource;
	
	static {
		try {
			properties = new Properties();
			properties.load(new FileInputStream("src/main/java/com/jdbc/demo_com/db.properties"));
		
			BoneCPConfig boneCPConfig = new BoneCPConfig();
			//boneCPConfig.setJdbcUrl(properties.getProperty(DB_DRIVER_CLASS));
			boneCPConfig.setJdbcUrl(properties.getProperty(DB_URL));
			boneCPConfig.setUsername(properties.getProperty(DB_USERNAME));
			boneCPConfig.setPassword(properties.getProperty(DB_PASSWORD));
			
			
			boneCPConfig.setMinConnectionsPerPartition(5);
			boneCPConfig.setMaxConnectionsPerPartition(100);
			boneCPConfig.setPartitionCount(4);
			boneCPConfig.setLazyInit(true);
			
			dataSource = new BoneCP(boneCPConfig);
			
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		try {
			return dataSource.getConnection();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
