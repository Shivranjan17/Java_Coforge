package com.coforge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.entities.Account;

import jakarta.annotation.PostConstruct;

@Controller

public class AccountController {

    
	 private static final ArrayList<Account> accountList = new ArrayList<Account>();
    @PostConstruct
    public void init() {
    	

        accountList.add(new Account(1001L, "Shivranjan Pathak", "SBI", "Mumbai", 50000.00));
        accountList.add(new Account(1002L, "Amit Sharma", "HDFC Bank", "Pune", 65000.00));
        accountList.add(new Account(1003L, "Neha Verma", "ICICI Bank", "Delhi", 42000.00));
        accountList.add(new Account(1004L, "Rahul Singh", "Axis Bank", "Lucknow", 78000.00));
        accountList.add(new Account(1005L, "Priya Gupta", "PNB", "Jaipur", 35000.00));
        accountList.add(new Account(1006L, "Karan Mehta", "Kotak Mahindra", "Ahmedabad", 91000.00));
        accountList.add(new Account(1007L, "Sneha Patil", "Bank of Baroda", "Nagpur", 27000.00));
        accountList.add(new Account(1008L, "Rohit Kumar", "Canara Bank", "Patna", 60000.00));
        accountList.add(new Account(1009L, "Anjali Mishra", "Union Bank", "Bhopal", 48000.00));
        accountList.add(new Account(1010L, "Vikas Yadav", "Indian Bank", "Indore", 55000.00));
    }
    @RequestMapping("/accounts")
    public ModelAndView getAllAccounts(Model model) {
    	ModelAndView mv = new ModelAndView();
        
        
        mv.addObject("accountList", accountList);
        mv.setViewName("list");//(/WEB-INF/views/list.jsp)
        return mv;
    }
    @RequestMapping(value ="/accounts/add")
    public String addAccountForm(Model model) {
    	model.addAttribute("account", new Account());
    	return "add-account";
    }
    
    @RequestMapping(value="/accounts/create",method=RequestMethod.POST)
    public String createAccount(@ModelAttribute Account account,Model model) {
    	accountList.add(account);
    	return "redirect:/accounts";
    }
    
    @RequestMapping(value = "/accounts/update/{accNo}")
    public String updateAccountForm(@PathVariable (value = "accNo") long accNo ,Model model) {
    	Account acc =null;
    	for(Account account :accountList) {
    		if(account.getAccNo()==accNo) {
    			acc=account;
    			break;
    		}
    	}
    	model.addAttribute("account", acc);
    	return "update-account";
    }
    
    @RequestMapping(value="/accounts/modify",method=RequestMethod.POST)
    public String updateAccount(@ModelAttribute("account") Account account) {
    	for(Account acc:accountList) {
    		
    		if(acc.getAccNo()==account.getAccNo()) {
    		acc.setAccHolderName(account.getAccHolderName());
    		acc.setBankName(account.getBankName());
    		acc.setAddress(account.getAddress());
    		acc.setBalance(account.getBalance());
    		break;
    	}
    	}
    	return "redirect:/accounts";
    }
    
    @RequestMapping("/accounts/info/{accNo}")
    public String getAccountInfo(@PathVariable("accNo") long accNo ,Model model) {
    	Account account = null;
    	for(Account acc:accountList){
    		if(accNo==acc.getAccNo()) {
    			account = acc;
    			break;
    		}
    	}
    	model.addAttribute("account",account);
    	return "info-account";
    }
    
    @RequestMapping(value="/accounts/delete/{accNo}")
    public String deleteAccount(@PathVariable("accNo")long accNo) {
    	Account account = null;
    	for(Account acc: accountList) {
    		if(accNo==acc.getAccNo()) {
    			account=acc;
    			break;
    		}
    	}
    	accountList.remove(account);
    	return "redirect:/accounts";
    }
}