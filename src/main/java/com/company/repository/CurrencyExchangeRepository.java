package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.model.ExchangeValue;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Integer> {

}
