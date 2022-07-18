package com.Transaction.Model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class TransactionModel {
	
	@MongoId
	private String transactionid;
	private String toaccount;
	private String fromaccount;
	private String transactionamount;
	private Date transactiondate=new Date(System.currentTimeMillis());
	
	
	

}
