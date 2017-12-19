package com.salesmanager.core.business.services.services;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.salesmanager.core.business.repositories.services.MachineryPortfolioRepository;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityServiceImpl;
import com.salesmanager.core.model.customer.MachineryPortfolio;

@Service("machineryPortfolioService")
public class MachineryPortfolioServiceImpl extends SalesManagerEntityServiceImpl<Long, MachineryPortfolio> 
		implements MachineryPortfolioService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MachineryPortfolioServiceImpl.class);
	
	private MachineryPortfolioRepository machineryPortfolioRepository;

	
	@Inject
	public MachineryPortfolioServiceImpl(MachineryPortfolioRepository machineryPortfolioRepository) {
		super(machineryPortfolioRepository);
		this.machineryPortfolioRepository = machineryPortfolioRepository;
	}

}
