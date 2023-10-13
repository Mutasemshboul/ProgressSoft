package com.ClusteredData.repository;

import com.ClusteredData.model.entity.FxDeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusteredDataRepo extends JpaRepository<FxDeal,Long> {

}
