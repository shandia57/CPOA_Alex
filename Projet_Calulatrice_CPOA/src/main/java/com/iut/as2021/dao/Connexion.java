package com.iut.as2021.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connexion {
	
	// Changement : 
	//private static Connexion connexion;
	// par : ->
	private static Connection connexion;
	private String url, login, pwd;
	private Connection maConnexion;
	

	//public static Connexion getInstance(){

		//if (connexion == null){
			//connexion = new Connection();
		//}
		//return connexion;
	//}



	//private void Connexion(){
		//this.readProperties();
	//}

    // private static final String URL = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr/schutzin1u_calculatrice";
	
	// Changement : 
	//public Connection getConnexion() throws SQLException {
		
		//if(this.maConnexion == null || this.maConnexion.isClosed()){
			
			//System.out.println("je passe avant le getConnexion");
			//this.maConnexion = DriverManager.getConnection(this.url, this.login, this.pwd);
			//System.out.println("url : " + this.url);
		//}
		//return maConnexion;
	//}
	// par : ->
	public static Connection getConnexion() throws SQLException {
		if (connexion == null) {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/calculatrice?serverTimezone=UTC", "root", "");
		}
		return connexion;
	}
	private void readProperties(){
		System.out.println("je passe par readProperties");
		Properties p = new Properties();
		File file = new File("config/bdd.properties");
		try{
			FileInputStream source = new FileInputStream(file);
			p.loadFromXML(source);
			//this.url = "jdbc:mysql://" + p.getProperty("url") + ":" + p.getProperty("port") + "/" + p.getProperty("bdd");
			this.url="jdbc:mysql://"+p.getProperty("url")+":"+p.getProperty("port")+"/"+p.getProperty("bdd");
			this.login = p.getProperty("login");
			this.pwd = p.getProperty("pwd");
			System.out.println("url : " + this.url);
		} catch (IOException e){
			System.out.println("Erreur lecture properties : " + e.getMessage());
		}
	}

}
