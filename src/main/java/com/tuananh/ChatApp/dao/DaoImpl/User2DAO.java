package com.tuananh.ChatApp.dao.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository

public class User2DAO implements DAO{
	@PersistenceContext	
    private EntityManager entityManager;
	
	@Override
	public <T> List<T> getAll() {
		// TODO Auto-generated method stub
		String hql = "FROM User WHERE u.userid = 2";
	    return entityManager.createQuery(hql).getResultList();
	}

}
