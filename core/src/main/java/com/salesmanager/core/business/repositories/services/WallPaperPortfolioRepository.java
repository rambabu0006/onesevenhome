package com.salesmanager.core.business.repositories.services;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.salesmanager.core.model.customer.WallPaperPortfolio;


public interface WallPaperPortfolioRepository extends JpaRepository<WallPaperPortfolio, Long> {
    

}
