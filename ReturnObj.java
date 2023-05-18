package com.bilibili.entity;

import java.util.Map;

public class ReturnObj {
private String statuS;
private String msg;
private Map<String,String> result;
public static ReturnObj buildSuccess() {
	ReturnObj returnObj = new ReturnObj();
	returnObj.setStatuS("200");
	returnObj.setMsg("success");
	return returnObj;
}
public static ReturnObj buildFault() {
	ReturnObj returnObj = new ReturnObj();
	returnObj.setStatuS("400");
	returnObj.setMsg("fault");
	return returnObj;
}

public String getStatuS() {
	return statuS;
}
public void setStatuS(String statuS) {
	this.statuS = statuS;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public Map<String, String> getResult() {
	return result;
}
public void setResult(Map<String, String> result) {
	this.result = result;
}

}
