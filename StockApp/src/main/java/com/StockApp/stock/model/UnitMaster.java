package com.StockApp.stock.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class UnitMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    private int iUmId;

    @JsonProperty
    private String vUnitName;

    @JsonProperty
    private int iStatus=1;

    @JsonProperty
    private int iCancelFlag=0;
}
