package com.project.dao;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

import com.project.model.LoginEntity;

public interface EthereumDao {

	public BigInteger getEth(String walletAddress) throws ExecutionException, InterruptedException;
	public LoginEntity getLoginById(String username);
}
