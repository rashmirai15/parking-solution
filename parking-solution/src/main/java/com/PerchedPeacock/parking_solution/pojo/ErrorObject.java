package com.PerchedPeacock.parking_solution.pojo;

import org.springframework.stereotype.Component;

/**
 * @author rashmi rai
 *
 */
@Component
public class ErrorObject {

	private int errorCode;
	private String errorMessage;
	private String errorSeverity;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorSeverity() {
		return errorSeverity;
	}
	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}
	
	
}

