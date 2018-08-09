package com.zsc.design.proxy;

public class TestFindLove {
	public static void main(String[] args) {
		Person per = (Person) new ProxyPerson().getInstance(new ZhangSan());
		per.findLove();
	}
}
