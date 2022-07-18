package com.Transaction.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Transaction.Model.TransactionModel;
import com.Transaction.Service.TransactionService;

@RestController
@RequestMapping("/transa")
public class TransactionController {
	
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/post")
	public ResponseEntity<TransactionModel>savetransaction(@RequestBody TransactionModel transactionModel ){
		TransactionModel transactionModel1=transactionService.savetransaction(transactionModel);
		return new ResponseEntity<TransactionModel>(transactionModel1,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<TransactionModel>> alltransaction(){
		List<TransactionModel>transactionList=transactionService.alltransacton();
		return new ResponseEntity<List<TransactionModel>>(transactionList,HttpStatus.OK);
		
	}
	
	
	@PutMapping("/put/{id}")
	public ResponseEntity<TransactionModel>updatetransaction(@PathVariable String id,@RequestBody TransactionModel transactionModel){
		TransactionModel transactionModel1=transactionService.updatetransactiuon(id,transactionModel);
		return new ResponseEntity<TransactionModel>(transactionModel1,HttpStatus.OK);
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String>deleteById(@PathVariable String id){
		String message=transactionService.deleteById(id);
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}

}
