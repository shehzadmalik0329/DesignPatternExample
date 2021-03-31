package com.java.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class ConnectMySQL {

	static int lport;
	static String rhost;
	static int rport;
	
	public static void go(){
		String user = "lmsusr";
		String password = "lmsusr123$";
		String host = "10.21.0.241";
		int port=22;
		try
		{
			JSch jsch = new JSch();
			Session session = jsch.getSession(user, host, port);
			lport = 3306;
			rhost = "10.21.0.241";
			rport = 3306;
			session.setPassword(password);
			session.setConfig("StrictHostKeyChecking", "no");
			System.out.println("Establishing Connection...");
			session.connect();
			int assinged_port=session.setPortForwardingL(lport, rhost, rport);
			System.out.println("localhost:"+assinged_port+" -> "+rhost+":"+rport);
		}
		catch(Exception e){System.err.print(e);}
	}
	
	public static void main(String[] args) {
		try{
			go();
		} catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("An example for updating a Row from Mysql Database!");
		Connection con = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://" + rhost +":" + lport + "/";
		String db = "xxapps";
		String dbUser = "UserReadOnly";
		String dbPasswd = "lmsDEVview@123$";
		try{
			Class.forName(driver);
			con = DriverManager
					.getConnection(url+db, dbUser, dbPasswd);
			try{
				Statement st = con.createStatement();
				String sql = "SELECT * FROM GET_EXTERNAL_ONLINE_TRAINING_LIST_V" ;

				ResultSet rs = st.executeQuery(sql);
				
				while(rs.next()){
			         //Retrieve by column name
					System.out.println("Data exists");
			      }
			      rs.close();
			}
			catch (SQLException s){
				System.out.println("SQL statement is not executed!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}

