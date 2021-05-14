package com.iut.as2021.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connexion {
	private static Connexion instance;

	public static Connexion getInstance(){
		if (instance == null){
			instance = new Connexion();
		}
		return instance;
	}

	private String url, login, pwd;
	private Connection maConnexion;

	private void MySqlConnexion(){
		this.readProperties();
	}

    // private static final String URL = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr/schutzin1u_calculatrice";
	
	public Connection getConnexion() throws SQLException {
		if(this.maConnexion == null || this.maConnexion.isClosed()){
			this.maConnexion = DriverManager.getConnection(this.url, this.login, this.pwd);
		}
		return maConnexion;
	}

	private void readProperties(){
		Properties p = new Properties();
		File file = new File("config/mysql.properties");
		try{
			FileInputStream source = new FileInputStream(file);
			p.loadFromXML(source);
			this.url = "jdbc:mysql://" + p.getProperty("url") + ":" + p.getProperty("port") + "/" + p.getProperty("bdd");
			this.login = p.getProperty("login");
			this.pwd = p.getProperty("pwd");
		} catch (IOException e){
			System.out.println("Erreur lecture properties : " + e.getMessage());
		}
	}

}
