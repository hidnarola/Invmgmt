package com.adititech.invmgmt.repository;

import com.adititech.invmgmt.domain.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kvishal on 05-01-2018.
 */
@Repository
public interface LotRepository extends JpaRepository<Lot,Long> {
    public List<Lot> findAllByLotNoIn(List<String> lotNo);
    public List<Lot> findByLotNoContaining(String lotNo);
}
