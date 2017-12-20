package com.salesmanager.shop.controller.vendor;

import java.util.List;

public class ArchitectsResponse {
	
	private Long portfolioId;
	private String errorMessage;
	private String successMessage;
	private boolean status;
	List<VendorPortfolioData> vendorPortfolioList;
	private String vendorDescription;
	private String vendorShortDescription;

	public Long getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<VendorPortfolioData> getVendorPortfolioList() {
		return vendorPortfolioList;
	}
	public void setVendorPortfolioList(List<VendorPortfolioData> vendorPortfolioList) {
		this.vendorPortfolioList = vendorPortfolioList;
	}
	public String getVendorDescription() {
		return vendorDescription;
	}
	public void setVendorDescription(String vendorDescription) {
		this.vendorDescription = vendorDescription;
	}
	public String getVendorShortDescription() {
		return vendorShortDescription;
	}
	public void setVendorShortDescription(String vendorShortDescription) {
		this.vendorShortDescription = vendorShortDescription;
	}
	
}
