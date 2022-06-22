package com.StockApp.stock.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class ProductMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private int iProductId;

    @JsonProperty
    private String vProductName;

    @JsonProperty
    private int iQtyPerPack;

    @JsonProperty
    @ManyToOne
    @JoinColumn(name = "iUmId")
    private UnitMaster iUmId;

    @JsonProperty
    private int iStatus=1;

    @JsonProperty
    @ManyToOne
    @JoinColumn(name = "iBmId")
    private BrandMaster iBmId;

    @JsonProperty
    @ManyToOne
    @JoinColumn(name = "iCmId")
    private CommodityMaster iCmId;

    @JsonProperty
    private int iPackingRequiredFlag=0;

    @JsonProperty
    private int iPackingProductId;

    @JsonProperty
    private int iPackingQty;
}
