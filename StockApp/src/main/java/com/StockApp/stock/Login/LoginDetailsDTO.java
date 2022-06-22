package com.StockApp.stock.Login;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class LoginDetailsDTO {

	@JsonProperty
	private int iEmpId;

	@JsonProperty
	private String vUserName;

	@JsonProperty
	private String vPassword;

	@JsonProperty
	private int iCancelFlag=0;

	@JsonProperty
	private int iStatus=1;

}