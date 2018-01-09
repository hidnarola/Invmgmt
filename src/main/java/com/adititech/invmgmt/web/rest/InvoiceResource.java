package com.adititech.invmgmt.web.rest;

import com.adititech.invmgmt.security.SecurityUtils;
import com.adititech.invmgmt.service.InvoiceService;
import com.adititech.invmgmt.service.LotService;
import com.adititech.invmgmt.service.dto.InvoiceDTO;
import com.adititech.invmgmt.service.dto.LotCategoryDTO;
import com.adititech.invmgmt.service.dto.MasterLocationDTO;
import com.adititech.invmgmt.service.dto.SalesPersonDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * Created by kvishal on 08-01-2018.
 */
@RestController
@RequestMapping("/api/invoice")
public class InvoiceResource {

    private final Logger log = LoggerFactory.getLogger(InvoiceResource.class);

    private final InvoiceService invoiceService;
    private  final LotService lotService;

    public InvoiceResource(InvoiceService invoiceService,LotService lotService) {
        this.invoiceService = invoiceService;
        this.lotService= lotService;
    }

    @RequestMapping(value = "/location",method = RequestMethod.GET)
    public List<MasterLocationDTO> getLocations() {
//        Optional<String> loginUser = SecurityUtils.getCurrentUserLogin();
//
//        log.debug("User" + loginUser.get());
        return invoiceService.getLocations();
    }

    @RequestMapping(value = "/salesperson",method = RequestMethod.GET)
    public List<SalesPersonDTO> getSalesPersons()
    {
        return invoiceService.getAllSalesPersons(true);
    }

    @RequestMapping(value = "/category",method = RequestMethod.GET)
    public List<LotCategoryDTO> getActiveCategory()
    {
        return invoiceService.getAllCategory(true);
    }

    @RequestMapping(value = "/generate",method = RequestMethod.POST)
    public void generateInvoice(@RequestBody InvoiceDTO invoice, HttpServletRequest request)
    {
        invoice.setRemoteAddress(request.getRemoteAddr());
        invoiceService.generateInvoice(invoice);
    }

}
