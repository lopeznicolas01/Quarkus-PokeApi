package cl.forum.arq.bts.pojo.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorBody {
	
    @JsonProperty("code")
	private int code;
    @JsonProperty("messages")
    private List<String> messages;
    
	public ErrorBody() {
		super();
	}

	public ErrorBody(int code, List<String> messages) {
		super();
		this.code = code;
		this.messages = messages;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
    
}
