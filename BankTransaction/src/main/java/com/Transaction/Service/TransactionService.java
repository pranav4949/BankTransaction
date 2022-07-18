package com.Transaction.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Transaction.Model.TransactionModel;
import com.Transaction.Repository.TransactionRepository;

@Service
public class TransactionService {
	
	
	@Autowired
	TransactionRepository transactionRepository;

	public TransactionModel savetransaction(TransactionModel transactionModel) {
		transactionRepository.save(transactionModel);
		return transactionModel ;
	}

	public List<TransactionModel> alltransacton() {
		List<TransactionModel>transactionList=transactionRepository.findAll();
		return transactionList;
	}

	public TransactionModel updatetransactiuon(String id, TransactionModel transactionModel) {
		Optional<TransactionModel> transactionModel1=transactionRepository.findById(id);
		TransactionModel transactionModel2=transactionModel1.get();
		transactionModel2.setTransactionid(transactionModel.getTransactionid());
		transactionModel2.setFromaccount(transactionModel.getFromaccount());
		transactionModel2.setToaccount(transactionModel.getToaccount());
		transactionModel2.setTransactionamount(transactionModel.getTransactionamount());
		transactionModel2.setTransactiondate(new Date());
		transactionRepository.save(transactionModel2);
		
		return transactionModel2;
	}

	public String deleteById(String id) {
		transactionRepository.deleteById(id);
		return "transaction deleted successfully";
	}

}
