package com.adititech.invmgmt.repository;

import com.adititech.invmgmt.domain.Diamond;
import com.adititech.invmgmt.domain.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kvishal on 06-01-2018.
 */
public interface DiamondRepository extends JpaRepository<Diamond,Long>{
    public List<Diamond> findAllByLotNoIn(List<String> lotNo);
}

