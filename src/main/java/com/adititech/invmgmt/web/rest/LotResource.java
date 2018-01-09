package com.adititech.invmgmt.web.rest;

import com.adititech.invmgmt.service.LotService;
import com.adititech.invmgmt.service.dto.LotDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kvishal on 04-01-2018.
 */
@RestController
@RequestMapping("/api")
public class LotResource {

    private final Logger log = LoggerFactory.getLogger(LotResource.class);

    private final LotService lotService;

    public LotResource(LotService lotService)
    {
        this.lotService = lotService;
    }

    @RequestMapping(value = "/lots",method = RequestMethod.POST)
    public List<LotDTO> getDiamondDetails(@RequestBody List<String> lotNo)
    {
        return  lotService.getLots(lotNo);
    }

    @RequestMapping(value = "/searchlotno{lotNo}",method = RequestMethod.GET)
    public List<String> findLotNo(@PathVariable String lotNo)
    {
        return lotService.findLotNo(lotNo);
    }






}
