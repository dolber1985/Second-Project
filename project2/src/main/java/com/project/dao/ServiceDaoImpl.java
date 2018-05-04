package com.project.dao;

import com.project.model.ServiceEntity;
import com.project.service.ServiceService;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class ServiceDaoImpl implements ServiceDao {

    @PersistenceContext
    public EntityManager entityManager;

    private static final String SELECT_ALL = "select * from SERVICES order by sr_name";
    private static final String SEARCH_BY_NAME = "select * from SERVICES where lower(sr_name) like ? ";

    public List<ServiceEntity> printServices()  {

      //  List<ServiceEntity> serviceList = new List<ServiceEntity>();

        Query selectAll = entityManager.createQuery("select rr from ServiceEntity rr order by sr_name");

        return /*(List<ServiceEntity>)*/ selectAll.getResultList();
       // return (("select rr from ServiceEntity rr order by sr_name") selectAll).getResultList();

    /*
            if(connectDB(SELECT_ALL)) {

                rs = stmt.executeQuery();

                // process result set
                while (rs.next()) {
                    // retrieve data from result set row
                    ServiceEntity service = new ServiceEntity();
                    service.setSr_name(rs.getString("sr_name"));
                    service.setSr_type(rs.getString("sr_type"));
                    service.setSr_description(rs.getString("sr_description"));
                    service.setSr_price(rs.getInt("sr_price"));
                    service.setSr_time(rs.getInt("sr_time"));
                    service.setSr_wellness_center(rs.getString("sr_wellness_center"));
                    service.setSr_serviceID(rs.getInt("sr_serviceID"));
                    service.setSr_image(rs.getString("sr_image"));
                    serviceList.add(service);
                }
            }
            else {
                return null;
            }


        return serviceList;*/
    }
/*
    public static List<ServiceService> searchService(String searchService) throws Exception {
        List<ServiceService> serviceList = new ArrayList<>();*/
/*
		try {

		// only search if searchService is not empty
		if (searchService != null && searchService.trim().length() > 0) {

		// set parameters
			connectDB(SEARCH_BY_NAME);
		String coolSearchService = "%" + searchService.toLowerCase() + "%";
		stmt.setString(1, coolSearchService);

		} else {
		// create query to get all artists
			connectDB(SELECT_ALL);
		}

		// execute query
		rs = stmt.executeQuery();

		while (rs.next()) {

		// retrieve data from result set row

		String name = rs.getString("sr_name");
        String type = rs.getString("sr_type");
        String description = rs.getString("sr_description");
        int price = rs.getInt("sr_price");
        String center = rs.getString("sr_wellness_center");
        int id = rs.getInt("sr_serviceID");

        // create new service object
        ServiceBean tempService = new ServiceBean(name, type, description, price, center, id);

        // add it to the list of services
        serviceList.add(tempService);
		}
*/
     /*   return serviceList;*//*
		}
		finally {
		disconnectDB();
		}
		}*/

  /*  }*/
}
