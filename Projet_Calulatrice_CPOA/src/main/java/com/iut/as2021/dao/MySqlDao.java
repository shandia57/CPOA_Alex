package com.iut.as2021.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.iut.as2021.metier.MathResultat;
import com.iut.as2021.exceptions.*;
import com.iut.as2021.dao.*;

public class MySqlDao implements IDaoMathResult {
	
	// Changement : 
	//private static MySqlDao instance;
	// par : ->
	private static IDaoMathResult instance;
	private Connection connection = null;

	private MySqlDao(){
		try {
			connection = Connexion.getConnexion();
		} catch (SQLException e) {
			// beurk ..
			System.out.println("Connection vers la db indispossible ..");
		}
	}
	
	// Changement : 
	// public static MySqlDao getDAOInstance
	// getDAOInstance()
	// par : ->
	public static IDaoMathResult getInstance(){
		if(instance == null){
			instance = new MySqlDao();
		}
		return instance;
	}
	
	
	@Override
	public MathResultat readyById(int i) {
		MathResultat result = null;
		try {
			String sql = "SELECT * FROM calcule WHERE id = ?";
			PreparedStatement query = connection.prepareStatement(sql);
			query.setInt(1, i);
			ResultSet res = query.executeQuery();
			while (res.next()) {
				String expression = res.getString("expression");
				result = new MathResultat(expression);
			}
		} catch (SQLException | MathsExceptions e) {
			// beurk ..
			System.out.println(e.getMessage());
		}
		return result;
	}

	@Override
	public List<MathResultat> getAll() {
		return null;
	}

	@Override
	public boolean update(MathResultat object) {
		return false;
	}

	@Override
	public boolean create(MathResultat object) {
		return false;
	}

	@Override
	public boolean delete(MathResultat object) {
		return false;
	}

	
}