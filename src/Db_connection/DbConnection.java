/*
============================================================================================================
Adroit HRM V1.0.0 - (c)Copyright Adroit Solutions Ltd. 2017.
This object includes confidential information and intellectual property of Adroit Solutions Ltd,
and is protected by local and international copyright and Trade Secret laws and agreements.
------------------------------------------------------------------------------------------------------------
Change Log
------------------------------------------------------------------------------------------------------------
DATE       | Author               | Version | Description
------------------------------------------------------------------------------------------------------------
15-08-2017 | EPOU IVAN            | V1.0.0  | Version Completed

============================================================================================================
*/
package Db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Ivan Epou
 */
public class DbConnection {
    public static void main(String[] args){
    
    Connection conn = null;
    
try
    {
        String url = "jdbc:sqlserver://IVANEPOU\\\\MSSQLSERVER:1433;databaseName=human_resource;"+"user=sa;password=1234ivanepou;"; 
       //IVANEPOU is Host and 1433 is port number     
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection(url);
        System.out.println("Connected...");
    }
    catch(ClassNotFoundException | SQLException e)
    {
        e.printStackTrace();
    }
    }
}
