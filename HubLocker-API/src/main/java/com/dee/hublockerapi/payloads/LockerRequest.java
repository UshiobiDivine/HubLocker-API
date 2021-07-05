package com.dee.hublockerapi.payloads;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Data
public class LockerRequest {

    @NotBlank
    private String size;

    @NotBlank
    private String price;

    @NotBlank
    private String firstRentPay;

    @NotBlank
    private String quantityAvailable;
}
