package com.iut.as2021.dao;

import java.util.List;
import java.sql.Connection;
//import com.iut.as2021.dao.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.iut.as2021.metier.MathResultat;

public class MySqlDao implements IDaoMathResult {

	@Override
	public MathResultat readyById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MathResultat> getAll() {
		String sql = "select * from operation";
		Connection co = Connexion.getConnexion();
		
		Statement requete = co.createStatement();
		ResultSet res = requete.executeQuery(sql);
		// String sql = "select * from etudiant";
        // Connection con = Connexion.getConnexion();
        
        // Statement requete = con.createStatement();
        // ResultSet res = requete.executeQuery(sql);
		// Statement statement = co.createStatement();
        // ResultSet resultSet = statement.executeQuery("SELECT * FROM operation");
        
        // while(resultSet.next()) {
        //     System.out.println("nom : " + resultSet.getString("nom"));
        // }
		return null;
	}
	
		@Override
		public boolean create(MathResultat object) {
			// TODO Auto-generated method stub
			return false;
		}

	@Override
	public boolean update(MathResultat object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(MathResultat object) {
		// TODO Auto-generated method stub
		return false;
	}

}