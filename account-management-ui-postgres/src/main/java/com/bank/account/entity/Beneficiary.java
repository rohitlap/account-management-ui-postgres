
package com.bank.account.entity;
import jakarta.persistence.*;

@Entity
public class Beneficiary{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

private String customerId;
private String receiverName;
private String accountNumber;
private String ifsc;
private String status;

public Long getId(){return id;}
public String getCustomerId(){return customerId;}
public void setCustomerId(String v){customerId=v;}
public String getReceiverName(){return receiverName;}
public void setReceiverName(String v){receiverName=v;}
public String getAccountNumber(){return accountNumber;}
public void setAccountNumber(String v){accountNumber=v;}
public String getIfsc(){return ifsc;}
public void setIfsc(String v){ifsc=v;}
public String getStatus(){return status;}
public void setStatus(String v){status=v;}
}
