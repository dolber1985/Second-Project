package com.project.dao;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

public interface EthereumDao {

	public BigInteger getEth() throws ExecutionException, InterruptedException;
}
