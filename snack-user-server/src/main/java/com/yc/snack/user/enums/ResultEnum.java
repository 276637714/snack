package com.yc.snack.user.enums;

public enum ResultEnum {
	SUCCESS(200,"成功"),
	ERROR(500,"失败"),
	DATA_NULL(501,"数据为空"),
	CODE_ERROR(500,"验证码错误"),
	CODE_TIMEOUT(501,"验证码过期"),
	LOGIN_SUCCESS(200,"登录成功"),
	LOGIN_ERROR(501,"账号或密码错误"),
	REG_ERROR(500,"注册失败"),
	REG_SUCCESS(200,"注册成功");

	private Integer code;
	private String msg;
	ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
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
	
}