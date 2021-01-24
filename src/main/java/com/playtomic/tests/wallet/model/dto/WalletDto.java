package com.playtomic.tests.wallet.model.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class WalletDto {

    private Long id;
    private String currency;
    private BigDecimal balance;

}
