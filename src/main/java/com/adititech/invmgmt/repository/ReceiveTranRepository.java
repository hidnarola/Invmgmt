package com.adititech.invmgmt.repository;

import com.adititech.invmgmt.domain.ReceiveTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kvishal on 09-01-2018.
 */
public interface ReceiveTranRepository extends JpaRepository<ReceiveTransaction,Long>{
}
