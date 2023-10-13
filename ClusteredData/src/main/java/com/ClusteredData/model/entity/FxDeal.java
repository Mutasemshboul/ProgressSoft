package com.ClusteredData.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FxDeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "From Currency cannot be Blank")
    @NotNull(message = "From Currency cannot be null")
    private String fromCurrency;
    @NotBlank(message = "To Currency cannot be Blank")
    @NotNull(message = "To Currency cannot be null")
    private String toCurrency;

    @CreationTimestamp
    private LocalDateTime dealTimestamp;

    @DecimalMin(value = "0.0", message = "Deal amount can't be negative")
    @NotNull(message = "Deal Amount cannot be null")
    private Long dealAmount;


}
