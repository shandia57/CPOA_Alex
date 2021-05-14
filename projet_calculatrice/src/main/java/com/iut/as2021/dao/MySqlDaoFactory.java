package com.iut.as2021.dao;

public class MySqlDaoFactory extends DaoFactory {

	@Override
	public IDaoMathResult getDaoMathResult() {
		System.out.println("je passe apr le getDaoMathResult" + MySqlDao.getDAOInstance());
		return MySqlDao.getDAOInstance();
	}
}