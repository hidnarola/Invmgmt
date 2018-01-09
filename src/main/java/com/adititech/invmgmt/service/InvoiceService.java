package com.adititech.invmgmt.service;

import com.adititech.invmgmt.domain.*;
import com.adititech.invmgmt.repository.*;
import com.adititech.invmgmt.security.SecurityUtils;
import com.adititech.invmgmt.service.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kvishal on 08-01-2018.
 */
@Service
public class InvoiceService {

    private final Logger log = LoggerFactory.getLogger(InvoiceService.class);

    @Autowired
    private MasterLocationRepository locationRepository;

    @Autowired
    private SalesPersonRepository salesPersonRepository;

    @Autowired
    private LotCategoryRepository lotCategoryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReceiveTranRepository receiveTranRepository;


    public List<MasterLocationDTO> getLocations() {
        List<MasterLocation> locationList = locationRepository.findAllByActiveOrderByLocationNameAsc(true);
        List<MasterLocationDTO> locationDtoList = new ArrayList<MasterLocationDTO>();
        MasterLocationDTO locationDTO;
        if (locationList != null && !locationList.isEmpty()) {
            for (MasterLocation location : locationList) {
                locationDTO = new MasterLocationDTO();
                locationDTO.setLocationId(location.getLocationId());
                locationDTO.setLocationName(location.getLocationName());
                locationDtoList.add(locationDTO);
            }
        }
        return locationDtoList;
    }

    public List<SalesPersonDTO> getAllSalesPersons(boolean active) {
        List<MasterSalesperson> salesPersonEList = salesPersonRepository.findAllByActiveOrderBySalesPersonNameAsc(active);
        List<SalesPersonDTO> salesPersonDTOList = new ArrayList<SalesPersonDTO>();
        SalesPersonDTO salesPersonDTO;
        if (salesPersonEList != null && !salesPersonEList.isEmpty()) {
            for (MasterSalesperson salesPersonEnt : salesPersonEList) {
                salesPersonDTO = new SalesPersonDTO();
                salesPersonDTO.setSalesPersonId(salesPersonEnt.getSalesPersonId());
                salesPersonDTO.setSalesPersonName(salesPersonEnt.getSalesPersonName());
                salesPersonDTOList.add(salesPersonDTO);
            }
        }

        return salesPersonDTOList;

    }

    public List<LotCategoryDTO> getAllCategory(boolean active) {
        List<MasterLotCategory> categoryEList = lotCategoryRepository.findAllByActiveOrderByLotCategoryName(active);
        List<LotCategoryDTO> categoryDTOList = new ArrayList<LotCategoryDTO>();
        LotCategoryDTO categoryDTO;
        if (categoryEList != null && !categoryEList.isEmpty()) {
            for (MasterLotCategory categoryEnt : categoryEList) {
                categoryDTO = new LotCategoryDTO();
                categoryDTO.setLotCategoryId(categoryEnt.getLotCategoryId());
                categoryDTO.setLotCategoryName(categoryEnt.getLotCategoryName());
                categoryDTOList.add(categoryDTO);
            }
        }
        return categoryDTOList;
    }

    @Transactional
    public void generateInvoice(InvoiceDTO invoiceDTO) {

        List<LotDTO> lotList = invoiceDTO.getLotList();
        double totalQuantity = 0;
        double totalAmount = 0;
        int totalLots = 0;
        if (lotList != null && !lotList.isEmpty()) {
            totalLots = lotList.size();
            for (LotDTO lot : lotList) {
                totalQuantity += lot.getWeight();
                totalAmount += lot.getAmount();
            }
        }

        String loginUser = SecurityUtils.getCurrentUserLogin().get();
        long userId = userRepository.findOneByLogin(loginUser).get().getId();


        Receive receive = new Receive();
        receive.setPurchase(true);
        receive.setReceiveSell(false);
        receive.setrReturn(false);
        receive.setOpeningStock(false);
        receive.setReceiveInternal(false);
        receive.setReceiveDate(new Date());
        receive.setReceiveLots(totalLots);
        receive.setReceiveQuantity(totalQuantity);
        receive.setExchangeRate(invoiceDTO.getExchangeRate());
        receive.setInvTotal(totalAmount);
        receive.setInvLocalTotal(totalAmount);
        receive.setInvDollarTotal(totalAmount);
        receive.setInvoiceDate(new Date());
        receive.setRemarks(invoiceDTO.getNarration());
        receive.setSalesPersonId(invoiceDTO.getSalesPerson());
        receive.setModifiedOn(new Date());
        receive.setModifiedBy(userId);
        receive.setModifiedMachineName(invoiceDTO.getRemoteAddress());
        receive.setActive(true);

        ReceiveTransaction receiveTran = new ReceiveTransaction();
        if (lotList != null && !lotList.isEmpty()) {
            Lot lotEnt;
            for (LotDTO lot : lotList) {
                lotEnt = new Lot();
                lot.setLotId(lot.getLotId());

                receiveTran.setReceive(receive);
                receiveTran.setLot(lotEnt);
                receiveTran.setQuantity(lot.getWeight());
                receiveTran.setModifiedOn(new Date());
                receiveTran.setModifiedBy(userId);
                receiveTran.setModifiedMachineName(invoiceDTO.getRemoteAddress());

                receiveTranRepository.save(receiveTran);
            }
        }


    }
}
