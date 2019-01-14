package com.jlp.meatdistribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jlp.meatdistribution.model.Commodity;

@Repository
public interface ICommodityRepo extends JpaRepository<Commodity, Long> {

}
