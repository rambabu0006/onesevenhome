package com.salesmanager.shop.model.order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.salesmanager.core.model.order.orderstatus.OrderStatus;
import com.salesmanager.core.model.order.payment.CreditCard;
import com.salesmanager.core.model.payments.PaymentType;

public class OrderEntity extends Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<OrderTotal> totals;

	private PaymentType paymentType;
	@JsonIgnore
	private String paymentModule;
	@JsonIgnore
	private String shippingModule;
	private List<OrderStatus> previousOrderStatus;
	private OrderStatus orderStatus;
	@JsonIgnore
	private CreditCard creditCard;
	private Date datePurchased;
	private String currency;
	private boolean customerAgreed;
	private boolean confirmedAddress;
	
	public void setTotals(List<OrderTotal> totals) {
		this.totals = totals;
	}
	public List<OrderTotal> getTotals() {
		return totals;
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentModule() {
		return paymentModule;
	}
	public void setPaymentModule(String paymentModule) {
		this.paymentModule = paymentModule;
	}
	public String getShippingModule() {
		return shippingModule;
	}
	public void setShippingModule(String shippingModule) {
		this.shippingModule = shippingModule;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	public Date getDatePurchased() {
		return datePurchased;
	}
	public void setDatePurchased(Date datePurchased) {
		this.datePurchased = datePurchased;
	}
	public void setPreviousOrderStatus(List<OrderStatus> previousOrderStatus) {
		this.previousOrderStatus = previousOrderStatus;
	}
	public List<OrderStatus> getPreviousOrderStatus() {
		return previousOrderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public boolean isCustomerAgreed() {
		return customerAgreed;
	}
	public void setCustomerAgreed(boolean customerAgreed) {
		this.customerAgreed = customerAgreed;
	}
	public boolean isConfirmedAddress() {
		return confirmedAddress;
	}
	public void setConfirmedAddress(boolean confirmedAddress) {
		this.confirmedAddress = confirmedAddress;
	}


}
