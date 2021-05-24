package com.iut.as2021.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {

	T readyById(int i) throws Exception;

	List<T> getAll() throws SQLException;

	boolean update(T object) throws Exception;

	boolean create(T object) throws Exception;

	boolean delete(T object) throws Exception;

	T getLast() throws Exception;

}