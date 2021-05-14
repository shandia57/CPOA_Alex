package com.iut.as2021.dao;

import java.util.List;
import java.sql.Connection;
// import com.iut.as2021.dao.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.iut.as2021.metier.MathResultat;

public class MySqlDao implements IDaoMathResult {

	private static MySqlDao instance;

	private MySqlDao(){}

	public static MySqlDao getDAOInstance(){
		if(instance == null){
			instance = new MySqlDao();
		}
		return instance;
	}

	@Override
	public MathResultat readyById(int i) throws Exception{
		MathResultat exp = null;

		String sql = "select calcul from operation where id =?;";

		Connection con = Connexion.getInstance().getConnexion();

		PreparedStatement requete = con.prepareStatement(sql);
		requete.setInt(1, i);
		ResultSet res = requete.executeQuery();
		if(res.next()){
			exp = new MathResultat(res.getString("expression"));
			exp.setId(i);
		}

		return exp;
	}

	@Override
	public List<MathResultat> getAll() throws SQLException {
		String sql = "SELECT * FROM operation";
        Connection con = Connexion.getInstance().getConnexion();
		
		PreparedStatement requete = con.prepareStatement(sql);
		ResultSet res = requete.executeQuery();
		
		while(res.next()) {
			System.out.println("operation : " + res.getString("calcul"));
		}
		return null;
	}
	
	@Override
	public boolean create(MathResultat object) throws Exception{
		String sql = "INSERT INTO operation (expression) VALUES (?) ";
		Connection con = Connexion.getInstance().getConnexion();
		PreparedStatement requete = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		requete.setString(1, object.getMathResult());

		int nbLignes = requete.executeUpdate();
		ResultSet res = requete.getGeneratedKeys();
		if (res.next()){
			object.setId(res.getInt(1));
		}
		return nbLignes==1;
	}
	
	@Override
	public boolean update(MathResultat object) throws Exception{
		String sql = "UPDATE operation ACT expression=? WHERE id=?;";
		Connection con = Connexion.getInstance().getConnexion();
		PreparedStatement requete = con.prepareStatement(sql);
		requete.setString(1, object.getMathResult());
		requete.setInt(object.getId(), 2);
		
		int nbLignes = requete.executeUpdate(); 
		return nbLignes==1;
	}
	
	@Override
	public boolean delete(MathResultat object) throws Exception{
		String sql = "DELETE FROM operation WHERE id=?;";
		Connection con = Connexion.getInstance().getConnexion();
		PreparedStatement requete = con.prepareStatement(sql);
		requete.setInt(1, object.getId());
		int nbLignes = requete.executeUpdate();
		//! PAS FINI
		return false;
	}

	public MathResultat getLast() throws Exception{
		MathResultat calcul =null;
		System.out.println("test : getLast()");
		
		String sql = "SELECT * FROM operation WHERE id IN(select MAX(id) from operation;";
		
		System.out.println("try : getConnexion()");
		Connection con = Connexion.getInstance().getConnexion();
		System.out.println("test : con ");
		PreparedStatement requete = con.prepareStatement(sql);
		ResultSet res = requete.executeQuery();
		if (res.next()){
			calcul = new MathResultat(res.getString("calcul"));
			calcul.setId(res.getInt("id"));
		}
		return calcul;
	}

}