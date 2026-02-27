package com.bank.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.bank.account.entity.Beneficiary;
import com.bank.account.service.BeneficiaryService;

@Controller
public class UIController{

private final BeneficiaryService service;

public UIController(BeneficiaryService service){
this.service=service;
}

@GetMapping("/")
public String home(Model model){

model.addAttribute("list",
service.listAll());

return "index";
}

@PostMapping("/addReceiver")
public String add(Beneficiary b){

service.add(b);

return "redirect:/";
}


@GetMapping("/searchCustomer")
public String searchCustomer(
@RequestParam String customerId,
Model model){

model.addAttribute("list",
service.searchByCustomer(customerId));

return "index";
}


@GetMapping("/searchName")
public String searchName(
@RequestParam String receiverName,
Model model){

model.addAttribute("list",
service.searchByName(receiverName));

return "index";
}


@GetMapping("/deactivate/{id}")
public String deactivate(@PathVariable Long id){

service.deactivate(id);

return "redirect:/";
}

}