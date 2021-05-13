package com.iut.as2021.dao;

public abstract class DaoFactory {

	public static DaoFactory getDAOFactory(ETypeDao cible) {
		DaoFactory daoF = null;
		switch (cible) {
		case MYSQL:
			daoF = new MySqlDaoFactory();
			break;
		case ORACLE:
			daoF = null;
			break;
		case XML:
			daoF = null;
			break;
		case FILE:
			daoF = null;
			break;
		}
		return daoF;
	}

	public abstract IDaoMathResult getDaoMathResult();
}