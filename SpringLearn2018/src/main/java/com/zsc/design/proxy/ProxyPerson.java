package com.zsc.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyPerson implements InvocationHandler {
	private Person target;
	public <T> Object getInstance(Person target) {
		this.target = target;
		Class<?> targetClass =  target.getClass();
		return Proxy.newProxyInstance(targetClass.getClassLoader(), targetClass.getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("你的性别是" + this.target.getSex());
		this.target.findLove();
		return null;
	}

}
