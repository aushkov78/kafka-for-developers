package com.prosoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Symbol {
    private long id;
    private char sValue;
    private String sColor;
    private int sType;
}
