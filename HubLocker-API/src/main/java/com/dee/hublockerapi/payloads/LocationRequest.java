package com.dee.hublockerapi.payloads;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class LocationRequest {

    @NotBlank
    private String locationName;

    @NotBlank
    private String distance;

    @NotBlank
    @URL
    private String imageUrl;

    @NotBlank
    @Size(max = 5)
    private String rating;
}
