package com.tuananh.ChatApp.dao.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tuananh.ChatApp.enities.User;

@Transactional
@Repository
public class UserDao implements DAO{
	@PersistenceContext	
    private EntityManager entityManager;
	

	@Override
	public <T> List<T> getAll() {
		// TODO Auto-generated method stub
		 String hql = "FROM User AS u WHERE u.activeFlg = 1";
	    return entityManager.createQuery(hql).getResultList();
	}

	
}
