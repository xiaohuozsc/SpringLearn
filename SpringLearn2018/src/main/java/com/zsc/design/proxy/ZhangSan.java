package com.zsc.design.proxy;

public class ZhangSan implements Person{
	private String sex = "��";
	private String name = "·�˼�";
	@Override
	public void findLove() {
		System.out.println("�ҵ�������" + this.getName() + ",�Ա�" + this.getSex());
		System.out.println("ûʲô�£�");

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
