package com.eazytutorial.loans.repo;

import com.eazytutorial.loans.model.LoanModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanModelRepository extends MongoRepository<LoanModel, String> {
}
