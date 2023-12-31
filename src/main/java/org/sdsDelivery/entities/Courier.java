package org.sdsDelivery.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Courier {
    private Long id;
    private String name;
    private String surname;
    private String contactPhone;
}