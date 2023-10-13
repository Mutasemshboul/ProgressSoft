package com.ClusteredData.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DealError {
    private int statusCode;
    private String message;
    private long timeStamp;
}
