
package com.bank.account.service;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bank.account.entity.Beneficiary;
import com.bank.account.repository.BeneficiaryRepository;

@Service
public class BeneficiaryService{

private final BeneficiaryRepository repo;

public BeneficiaryService(BeneficiaryRepository repo){
this.repo=repo;
}

public Beneficiary add(Beneficiary b){

b.setStatus("ACTIVE");

return repo.save(b);
}

public List<Beneficiary> listAll(){

return repo.findAll();

}

public List<Beneficiary> searchByCustomer(String id){

return repo.findByCustomerId(id);

}

public List<Beneficiary> searchByName(String name){

return repo.findByReceiverName(name);

}

public Beneficiary deactivate(Long id){

Beneficiary b=repo.findById(id).orElseThrow();

b.setStatus("INACTIVE");

return repo.save(b);
}

}