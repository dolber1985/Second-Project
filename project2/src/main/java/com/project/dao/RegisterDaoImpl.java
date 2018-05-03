package com.project.dao;

import com.project.model.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.*;

@Repository
@Transactional
public class RegisterDaoImpl implements RegisterDao {

    @PersistenceContext
    public EntityManager entityManager;

    private final static String CHECK_STUDENT = "SELECT * FROM student WHERE name=?1 AND surname=?2 AND personalEmail=?3 AND dateOfBirth=?4";

    private final static String SELECT_BADGE_NUMBER_MAX = "SELECT MAX(badgeNumber) FROM student ";


    public List getCheckedUser(UserEntity newUser) {

        List result = entityManager.createNativeQuery(CHECK_STUDENT)
                .setParameter(1,newUser.getName())
                .setParameter(2,newUser.getSurname())
                .setParameter(3,newUser.getPersonal_email())
                .setParameter(4,newUser.getDate_of_birth())
                .getResultList();

        return result;
    }

    public UserEntity insertNewUser(UserEntity userEntity) {


        return null;
    }


}
