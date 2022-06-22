package com.StockApp.stock.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class LoginDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iLdId;

	@JsonProperty
	private int iEmpId;

	@JsonProperty
	private String vUserName;

	@JsonProperty
	@JsonIgnore
	private String vPassword;

	@JsonProperty
	@JsonIgnore
	private int iCancelFlag=0;

	@JsonProperty
	@JsonIgnore
	private int iStatus=1;

}