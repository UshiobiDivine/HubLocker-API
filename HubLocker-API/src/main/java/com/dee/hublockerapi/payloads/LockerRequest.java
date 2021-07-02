package com.dee.hublockerapi.payloads;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

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
