package com.adititech.invmgmt.service;

import com.adititech.invmgmt.domain.Diamond;
import com.adititech.invmgmt.domain.Lot;
import com.adititech.invmgmt.repository.DiamondRepository;
import com.adititech.invmgmt.repository.LotRepository;
import com.adititech.invmgmt.service.dto.LotDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kvishal on 08-01-2018.
 */
@Service
public class LotService {

    @Autowired
    private DiamondRepository diamondRepository;

    @Autowired
    private LotRepository lotRepository;

    public List<LotDTO> getLots(List<String> lotNo) {
        List<Diamond> diamondList = diamondRepository.findAllByLotNoIn(lotNo);
        List<LotDTO> lotList = new ArrayList<LotDTO>();
        LotDTO lotDTO;
        if (diamondList != null && !diamondList.isEmpty()) {
            for (Diamond diamond : diamondList) {
                lotDTO = new LotDTO();
                lotDTO.setLotId(diamond.getLotId());
                lotDTO.setLotNo(diamond.getLotNo());
                lotDTO.setWeight(diamond.getWeight());
                lotDTO.setRate(diamond.getSellingPrice());
                lotDTO.setAmount(lotDTO.getPcs() * lotDTO.getRate());
                lotDTO.setLotRemarks(diamond.getLotDescription());
                lotDTO.setLotType("Diamond");
                lotList.add(lotDTO);
            }
        }
    return lotList;
    }

    public List<String> findLotNo(String lotNo) {
        List<Lot> lotNolst = lotRepository.findByLotNoContaining(lotNo);
        List<String> lotNoList = new ArrayList<String>();
        if (lotNolst != null && !lotNolst.isEmpty()) {
            for (Lot lot : lotNolst) {
                lotNoList.add(lot.getLotNo());
            }
        }
        return lotNoList;
    }
}
