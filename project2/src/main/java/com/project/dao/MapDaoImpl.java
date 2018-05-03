package com.project.dao;

import com.project.model.BuildingEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class MapDaoImpl implements MapDao {

    @PersistenceContext
    public EntityManager entityManager;


    public List<BuildingEntity> listHousesByCity(String city) {
        /*

        //return entityManager.find(LoginEntity.class, username1);
        Query q = entityManager.createQuery("SELECT u FROM LoginEntity u WHERE u.username = :name");
        q.setParameter("name", username1);
        return (LoginEntity) q.getSingleResult();
         */

        Query q = entityManager.createQuery("SELECT b FROM BuildingEntity b WHERE b.city = :search");
        q.setParameter("search", city);

        return (List<BuildingEntity>) q.getResultList();
    }
}
