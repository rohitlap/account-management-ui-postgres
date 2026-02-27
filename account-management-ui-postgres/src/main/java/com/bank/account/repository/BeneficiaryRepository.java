
package com.bank.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.account.entity.Beneficiary;

import java.util.List;

public interface BeneficiaryRepository 
        extends JpaRepository<Beneficiary,Long>{

List<Beneficiary> findByCustomerId(String customerId);

List<Beneficiary> findByReceiverName(String receiverName);

}