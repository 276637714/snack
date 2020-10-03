package com.yc.snack.user.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.yc.snack.user.enums.ResultEnum;

public class ResultVO {
	private Integer code;
	private String msg;

	@JsonProperty("data") // 以Json数据返回，属性名为data
	private Object obj;

	@Override
	public String toString() {
		return "ResultVO [code=" + code + ", msg=" + msg + ", obj=" + obj + "]";
	}

	public ResultVO() {
		super();
	}

	public ResultVO(Integer code) {
		super();
		this.code = code;
	}

	public ResultVO(Integer code, Object obj) {
		super();
		this.code = code;
		this.obj = obj;
	}

	public ResultVO(String msg, Object obj) {
		super();
		this.msg = msg;
		this.obj = obj;
	}

	public ResultVO(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public ResultVO(Integer code, String msg, Object obj) {
		super();
		this.code = code;
		this.msg = msg;
		this.obj = obj;
	}

	public ResultVO(ResultEnum enums, Object obj) {
		super();
		this.code = enums.getCode();
		this.msg = enums.getMsg();
		this.obj = obj;
	}
	
	public ResultVO(ResultEnum enums) {
		super();
		this.code = enums.getCode();
		this.msg = enums.getMsg();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
