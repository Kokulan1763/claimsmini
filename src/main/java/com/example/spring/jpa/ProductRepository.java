package com.example.spring.jpa;



import java.util.List;

import org.springframework.data.repository.CrudRepository;


//Remove @RepositoryRestResource below to disable auto REST api:

public interface ProductRepository extends CrudRepository<MemberPremium, Long>{


/*

    List<MemberPremium> findByName(String name);
    List<MemberPremium> findByNameAndPrice(String name,double price);
*/}