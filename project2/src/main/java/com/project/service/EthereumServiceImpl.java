package com.project.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.utils.Convert;

import com.project.dao.EthereumDaoImpl;


@Service
public class EthereumServiceImpl implements EthereumService {
	@Autowired
    private EthereumDaoImpl ethereumDao;
	
		public BigDecimal getEthValue() {
			 BigInteger wei = null;
			 BigDecimal wei2= null;
 
			 try{
				 wei = ethereumDao.getEth();
				 wei2= Convert.fromWei(wei.toString(), Convert.Unit.ETHER);
				 
			 } 
			 catch (InterruptedException e){
				 System.out.println("errore interr: "+e);
			 } catch (ExecutionException e){
				 System.out.println("errore exec: "+e);
			 }
			 /*catch (InterruptedException|ExecutionException e) {
	         e.printStackTrace();
	  			} */ 
			 finally {
		    	 
		     }
			return wei2;		 
		 }
		
}
