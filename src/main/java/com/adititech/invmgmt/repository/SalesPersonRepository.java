package com.adititech.invmgmt.repository;

import com.adititech.invmgmt.domain.MasterSalesperson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by kvishal on 09-01-2018.
 */
public interface SalesPersonRepository extends JpaRepository<MasterSalesperson,Long> {
    public List<MasterSalesperson> findAllByActiveOrderBySalesPersonNameAsc(boolean active);
}
