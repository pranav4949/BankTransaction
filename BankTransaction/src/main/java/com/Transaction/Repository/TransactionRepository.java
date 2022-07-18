package com.Transaction.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Transaction.Model.TransactionModel;
@Repository
public interface TransactionRepository extends MongoRepository<TransactionModel,String> {

}
