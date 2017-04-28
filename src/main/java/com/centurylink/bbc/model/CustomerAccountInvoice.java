package com.centurylink.bbc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity()
@Table(name = "CUST_ACCT_INVOICE")
public class CustomerAccountInvoice {
 
	
	private Long custAcctInvoiceId;
	private String billingAccountId;
	private Date invoiceDate;
	private String billingApplicationCd;
	private String customerType;
	private String accountStatusCd;
	private String customerAddressLine1;
	private String customerAddressLine2;
	private String customerAddressLine3;
	private String customerAddressCity;
	private String customerAddressPostalCode;
	private String customerAddressStateCode;
	private String customerAddressZipCode;
	private String customerEmailAddress;
	private String customerFirstName;
	private String customerLastName;
	private String businessName;
	private Date dueDate;
	private Double pastDueAmt;
	private Double currentDueAmt;
	private Double adjustedDueAmt;
	private Long batchTransactionId;
	private Date batchLoadDate;
	private String achAllowedFlag;
	private String customerId;
	private String invoiceId;
	private String enterpriseId;
	
	public static final String CUST_ACCT_INVOICE_SEQ = "CUST_ACCT_INVOICE_SEQ";
	
	
	/**
	 * @return the custAcctInvoiceId
	 */
    @Id
	@SequenceGenerator(name = CUST_ACCT_INVOICE_SEQ, sequenceName = CUST_ACCT_INVOICE_SEQ, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = CUST_ACCT_INVOICE_SEQ)
	@Column(name = "CUST_ACCT_INVOICE_ID")
	public Long getCustAcctInvoiceId() {
		return custAcctInvoiceId;
	}

	/**
	 * @param custAcctInvoiceId the custAcctInvoiceId to set
	 */
	public void setCustAcctInvoiceId(Long custAcctInvoiceId) {
		this.custAcctInvoiceId = custAcctInvoiceId;
	}

	/**
	 * @return the billingAccountId
	 */
	@Column(name = "BILL_ACCT_ID", nullable = false, insertable = true, updatable = true)
	public String getBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * @param billingAccountId the billingAccountId to set
	 */
	public void setBillingAccountId(String billingAccountId) {
		this.billingAccountId = billingAccountId;
	}

	/**
	 * @return the invoiceDate
	 */
	@Column(name = "INVOICE_DT", nullable = false, insertable = true, updatable = true)
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the billingApplicationCd
	 */
	@Column(name = "BILL_APPL_CD", nullable = false, insertable = true, updatable = true)
	public String getBillingApplicationCd() {
		return billingApplicationCd;
	}

	/**
	 * @param billingApplicationCd the billingApplicationCd to set
	 */
	public void setBillingApplicationCd(String billingApplicationCd) {
		this.billingApplicationCd = billingApplicationCd;
	}

	/**
	 * @return the customerType
	 */
	@Column(name = "CUST_TYPE", nullable = false, insertable = true, updatable = true)
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	/**
	 * @return the accountStatusCd
	 */
	@Column(name = "ACCT_STUS_CD", nullable = true, insertable = true, updatable = true)
	public String getAccountStatusCd() {
		return accountStatusCd;
	}

	/**
	 * @param accountStatusCd the accountStatusCd to set
	 */
	public void setAccountStatusCd(String accountStatusCd) {
		this.accountStatusCd = accountStatusCd;
	}

	/**
	 * @return the customerAddressLine1
	 */
	@Column(name = "CUST_ADRS_LN1", nullable = true, insertable = true, updatable = true)
	public String getCustomerAddressLine1() {
		return customerAddressLine1;
	}

	/**
	 * @param customerAddressLine1 the customerAddressLine1 to set
	 */
	public void setCustomerAddressLine1(String customerAddressLine1) {
		this.customerAddressLine1 = customerAddressLine1;
	}

	/**
	 * @return the customerAddressLine2
	 */
	@Column(name = "CUST_ADRS_LN2", nullable = true, insertable = true, updatable = true)
	public String getCustomerAddressLine2() {
		return customerAddressLine2;
	}

	/**
	 * @param customerAddressLine2 the customerAddressLine2 to set
	 */
	public void setCustomerAddressLine2(String customerAddressLine2) {
		this.customerAddressLine2 = customerAddressLine2;
	}

	/**
	 * @return the customerAddressLine3
	 */
	@Column(name = "CUST_ADRS_LN3", nullable = true, insertable = true, updatable = true)
	public String getCustomerAddressLine3() {
		return customerAddressLine3;
	}

	/**
	 * @param customerAddressLine3 the customerAddressLine3 to set
	 */
	public void setCustomerAddressLine3(String customerAddressLine3) {
		this.customerAddressLine3 = customerAddressLine3;
	}

	/**
	 * @return the customerAddressCity
	 */
	@Column(name = "CUST_ADRS_CITY", nullable = true, insertable = true, updatable = true)
	public String getCustomerAddressCity() {
		return customerAddressCity;
	}

	/**
	 * @param customerAddressCity the customerAddressCity to set
	 */
	public void setCustomerAddressCity(String customerAddressCity) {
		this.customerAddressCity = customerAddressCity;
	}

	/**
	 * @return the customerAddressPostalCode
	 */
	@Column(name = "CUST_ADRS_PSTL_CD", nullable = true, insertable = true, updatable = true)
	public String getCustomerAddressPostalCode() {
		return customerAddressPostalCode;
	}

	/**
	 * @param customerAddressPostalCode the customerAddressPostalCode to set
	 */
	public void setCustomerAddressPostalCode(String customerAddressPostalCode) {
		this.customerAddressPostalCode = customerAddressPostalCode;
	}

	/**
	 * @return the customerAddressStateCode
	 */
	@Column(name = "CUST_ADRS_ST_CD", nullable = true, insertable = true, updatable = true)
	public String getCustomerAddressStateCode() {
		return customerAddressStateCode;
	}

	/**
	 * @param customerAddressStateCode the customerAddressStateCode to set
	 */
	public void setCustomerAddressStateCode(String customerAddressStateCode) {
		this.customerAddressStateCode = customerAddressStateCode;
	}

	/**
	 * @return the customerAddressZipCode
	 */
	@Column(name = "CUST_ADRS_ZIP_CD", nullable = true, insertable = true, updatable = true)
	public String getCustomerAddressZipCode() {
		return customerAddressZipCode;
	}

	/**
	 * @param customerAddressZipCode the customerAddressZipCode to set
	 */
	public void setCustomerAddressZipCode(String customerAddressZipCode) {
		this.customerAddressZipCode = customerAddressZipCode;
	}

	/**
	 * @return the customerEmailAddress
	 */
	@Column(name = "CUST_EMAIL_ADRS", nullable = true, insertable = true, updatable = true)
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	/**
	 * @param customerEmailAddress the customerEmailAddress to set
	 */
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	/**
	 * @return the customerFirstName
	 */
	@Column(name = "CUST_FIRST_NM", nullable = true, insertable = true, updatable = true)
	public String getCustomerFirstName() {
		return customerFirstName;
	}

	/**
	 * @param customerFirstName the customerFirstName to set
	 */
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	/**
	 * @return the customerLastName
	 */
	@Column(name = "CUST_LAST_NM", nullable = true, insertable = true, updatable = true)
	public String getCustomerLastName() {
		return customerLastName;
	}

	/**
	 * @param customerLastName the customerLastName to set
	 */
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	/**
	 * @return the businessName
	 */
	@Column(name = "BUSINESS_NM", nullable = true, insertable = true, updatable = true)
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	/**
	 * @return the dueDate
	 */
	@Column(name = "DUE_DT", nullable = true, insertable = true, updatable = true)
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the pastDueAmt
	 */
	@Column(name = "PAST_DUE_AMT", nullable = true, insertable = true, updatable = true)
	public Double getPastDueAmt() {
		return pastDueAmt;
	}

	/**
	 * @param pastDueAmt the pastDueAmt to set
	 */
	public void setPastDueAmt(Double pastDueAmt) {
		this.pastDueAmt = pastDueAmt;
	}

	/**
	 * @return the currentDueAmt
	 */
	@Column(name = "CURRENT_DUE_AMT", nullable = true, insertable = true, updatable = true)
	public Double getCurrentDueAmt() {
		return currentDueAmt;
	}

	/**
	 * @param currentDueAmt the currentDueAmt to set
	 */
	public void setCurrentDueAmt(Double currentDueAmt) {
		this.currentDueAmt = currentDueAmt;
	}

	/**
	 * @return the adjustedDueAmt
	 */
	@Column(name = "ADJ_DUE_AMT", nullable = true, insertable = true, updatable = true)
	public Double getAdjustedDueAmt() {
		return adjustedDueAmt;
	}

	/**
	 * @param adjustedDueAmt the adjustedDueAmt to set
	 */
	public void setAdjustedDueAmt(Double adjustedDueAmt) {
		this.adjustedDueAmt = adjustedDueAmt;
	}

	/**
	 * @return the customerId
	 */
	@Column(name = "CUSTOMER_ID", nullable = true, insertable = true, updatable = true)
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the invoiceId
	 */
	@Column(name = "INVOICE_ID", nullable = true, insertable = true, updatable = true)
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	/**
	 * @return the enterpriseId
	 */
	@Column(name = "ENTERPRISE_ID", nullable = true, insertable = true, updatable = true)
	public String getEnterpriseId() {
		return enterpriseId;
	}

	/**
	 * @param enterpriseId the enterpriseId to set
	 */
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	/**
	 * @return the batchTransactionId
	 */
	@Column(name = "BATCH_TRANSACTION_ID", nullable = false, insertable = true, updatable = true)
	public Long getBatchTransactionId() {
		return batchTransactionId;
	}

	/**
	 * @param batchTransactionId the batchTransactionId to set
	 */
	public void setBatchTransactionId(Long batchTransactionId) {
		this.batchTransactionId = batchTransactionId;
	}

	/**
	 * @return the batchLoadDate
	 */
	@Column(name = "BATCH_LOAD_DT", nullable = false, insertable = true, updatable = true)
	public Date getBatchLoadDate() {
		return batchLoadDate;
	}

	/**
	 * @param batchLoadDate the batchLoadDate to set
	 */
	public void setBatchLoadDate(Date batchLoadDate) {
		this.batchLoadDate = batchLoadDate;
	}

	/**
	 * @return the achAllowedFlag
	 */
	@Column(name = "ACH_ALLOW_FLAG", nullable = false, insertable = true, updatable = true)
	public String getAchAllowedFlag() {
		return achAllowedFlag;
	}

	/**
	 * @param achAllowedFlag the achAllowedFlag to set
	 */
	public void setAchAllowedFlag(String achAllowedFlag) {
		this.achAllowedFlag = achAllowedFlag;
	}
    

	
	
	
}
