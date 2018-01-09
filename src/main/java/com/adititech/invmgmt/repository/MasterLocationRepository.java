package com.adititech.invmgmt.repository;

import com.adititech.invmgmt.domain.MasterLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kvishal on 08-01-2018.
 */
@Repository
public interface MasterLocationRepository extends JpaRepository<MasterLocation,Long>{

    public List<MasterLocation> findAllByActiveOrderByLocationNameAsc(boolean isActive);
}
