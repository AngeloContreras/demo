package com.example.test.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.demo.Models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
