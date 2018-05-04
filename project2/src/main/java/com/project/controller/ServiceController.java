package com.project.controller;

import com.project.model.ServiceEntity;
import com.project.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

@Controller
public class ServiceController {

    @Autowired
    ServiceService serviceService;


    @RequestMapping(value="serviceController", method = RequestMethod.GET)
    public ModelAndView getServices(HttpServletRequest request, HttpServletResponse response) {

      //  ServiceEntity serviceBean = new ServiceEntity();
        ModelAndView model = new ModelAndView();

            List<ServiceEntity> serviceList = serviceService.getServiceService();
            if(serviceList != null){
                model.addObject("services", serviceList); // Will be available as ${products} in JSP
            }
            else {
                request.setAttribute("errorMessage", "Errore connessione database. Riprova più tardi");
            }
          //  request.getRequestDispatcher("/service_list.jsp").forward(request, response);
            model.setViewName("service_list");




      /*  String name=request.getParameter("username");
        String pwd=request.getParameter("password");

        LoginEntity loginBean = new LoginEntity();
        loginBean.setUsername(name);
        loginBean.setPassword(pwd);


        boolean result = loginService.authenticateUser(loginBean);

        ModelAndView model = new ModelAndView();

        if (result){
            model.addObject("user", loginBean);
            model.setViewName("success");

        }else{
            model.setViewName("error");
        }*/

       return model;

    }


/*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ServiceService serviceService = new ServiceService();
            List<ServiceBean> serviceList = serviceService.getServiceService();
            if(serviceList != null){
                request.setAttribute("services", serviceList); // Will be available as ${products} in JSP
            }
            else {
                request.setAttribute("errorMessage", "Errore connessione database. Riprova più tardi");
            }
            request.getRequestDispatcher("/service_list.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException("Cannot obtain services from DB", e);
        }
    }


    /*
	private List<ServiceBean> serviceList;
	private String searchServices;

    public String getSearchServices() {
		return searchServices;
	}

	public void setSearchServices(String searchServices) {
		this.searchServices = searchServices;
	}*/
/*

public void loadServices() {

		System.out.println("ENTRO LOAD");
        serviceList.clear();

        try {
            if (searchServices != null && searchServices.trim().length() > 0) {
                // search for services by name
                serviceList = ServiceDao.searchService(searchServices);
            }
            else {
                // get all services from database
                serviceList = ServiceDao.getServices();
            }

        } catch (Exception exc) {
            // send this to server logs
          //  logger.log(Level.SEVERE, "Error loading services", exc);

            // add error message

        }
        finally {
            // reset the search info
            searchServices = null;
        }
    }*/
}
