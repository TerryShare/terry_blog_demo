package com.terry.vo;

public class Response {

	//处理是否相应成功
	private Boolean seccess;
	//相应处理的消息
	private String message;
	//响应处理返回内容
	private Object body;
	public Response(boolean seccess, String message) {
		this.message=message;
		this.seccess=seccess;
	}
	public Response(boolean seccess,String message,Object body) {
		this.body=body;
		this.message=message;
		this.seccess=seccess;
		
	}
	public Boolean getSeccess() {
		return seccess;
	}
	public void setSeccess(Boolean seccess) {
		this.seccess = seccess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
}
