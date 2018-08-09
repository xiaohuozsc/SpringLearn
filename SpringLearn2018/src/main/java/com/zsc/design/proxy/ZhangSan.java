package com.zsc.design.proxy;

public class ZhangSan implements Person{
	private String sex = "男";
	private String name = "路人甲";
	@Override
	public void findLove() {
		System.out.println("我的名字是" + this.getName() + ",性别：" + this.getSex());
		System.out.println("没什么事！");

	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
