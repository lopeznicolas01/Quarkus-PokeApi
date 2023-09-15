package cl.forum.arq.bts.pojo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
    @JsonProperty("result")
	private boolean result;

    @JsonProperty("status")
    private ErrorBody status;
    
    

	public ErrorResponse() {
		super();
	}

	public ErrorResponse(boolean result, ErrorBody status) {
		super();
		this.result = result;
		this.status = status;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public ErrorBody getStatus() {
		return status;
	}

	public void setStatus(ErrorBody status) {
		this.status = status;
	}
    
    
}
