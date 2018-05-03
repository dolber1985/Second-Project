package com.project.dao;

import com.project.model.LoginEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {


    @PersistenceContext
    public EntityManager entityManager;
    //public boolean authenticateUser(LoginEntity loginBean);

    public LoginEntity getLoginById(String username1) {
        //return entityManager.find(LoginEntity.class, username1);
        Query q = entityManager.createQuery("SELECT u FROM LoginEntity u WHERE u.username = :name");
        q.setParameter("name", username1);
        return (LoginEntity) q.getSingleResult();

    }

}
