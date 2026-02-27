package com.bank.account.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.bank.account.entity.Beneficiary;
import com.bank.account.service.BeneficiaryService;

@RestController
@RequestMapping("/api/beneficiaries")
public class BeneficiaryController {

private final BeneficiaryService service;

public BeneficiaryController(BeneficiaryService service){
this.service=service;
}

@PostMapping
public Beneficiary add(@RequestBody Beneficiary b){

return service.add(b);
}

@GetMapping
public List<Beneficiary> list(){

return service.listAll();
}

@DeleteMapping("/{id}")
public Beneficiary deactivate(@PathVariable Long id){

return service.deactivate(id);
}

}