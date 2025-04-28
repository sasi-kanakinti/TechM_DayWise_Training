package com.aits.iocdemo;

public interface Tax {
	void setTaxableAmount(double amount);
	void CalculateTaxAmount();
	double getTaxAmount();
	String getTaxType();
	boolean isTaxPaid();
}
