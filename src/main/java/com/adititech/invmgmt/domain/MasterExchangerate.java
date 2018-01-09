package com.adititech.invmgmt.domain;

import javax.persistence.*;

/**
 * Created by kvishal on 09-01-2018.
 */
@Entity
@Table(name = "master_exchangerate")
public class MasterExchangerate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExchangeRate_Id")
    private long exchangeRateId;

//    Currency_Id bigint(20)	YES MUL	0
//
//    Exchange_Date datetime(6)	YES
//
//    Exchange_Rate decimal(19,4)	NO		0.0000
//
//    Modified_By bigint(20)	NO
//
//    Modified_On datetime(6)	YES
//
//    Modified_MachineName varchar(50)	NO
//
//    Active tinyint(1)	NO		1
//
//    YearEnd_Id bigint(20)	NO		0

}
