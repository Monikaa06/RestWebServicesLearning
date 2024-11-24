package com.rws.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rws.application.bean.Card;

@Component
public interface CardRepository extends JpaRepository<Card, Long> {

}
