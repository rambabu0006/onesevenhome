package com.salesmanager.core.business.services.services;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.salesmanager.core.business.repositories.services.ArchitectsPortfolioRepository;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityServiceImpl;
import com.salesmanager.core.model.customer.ArchitectsPortfolio;

@Service("architectsPortfolioService")
public class ArchitectsPortfolioServiceImpl extends SalesManagerEntityServiceImpl<Long, ArchitectsPortfolio> 
		implements ArchitectsPortfolioService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ArchitectsPortfolioServiceImpl.class);
	
	private ArchitectsPortfolioRepository architectsPortfolioRepository;

	
	@Inject
	public ArchitectsPortfolioServiceImpl(ArchitectsPortfolioRepository architectsPortfolioRepository) {
		super(architectsPortfolioRepository);
		this.architectsPortfolioRepository = architectsPortfolioRepository;
	}

}