package com.adititech.invmgmt.repository;

import com.adititech.invmgmt.domain.MasterLotCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kvishal on 09-01-2018.
 */
public interface LotCategoryRepository extends JpaRepository<MasterLotCategory,Long> {
    public List<MasterLotCategory> findAllByActiveOrderByLotCategoryName(boolean active);
}
