package com.biyao.proxy.staticproxy;

/**
 * @author hxs
 * Title: 静态代理
 * Description: 优点:在不修改目标对象的功能前提下，能通过代理对象对目标功能拓展
 * 缺点：因为代理需要与目标对象实现一样的接口，所以会有很多代理类
 * Create Time: 2019/9/3
 */
public class TeacherDaoProxy implements ITeacherDao{

	private ITeacherDao target; // 目标对象，通过接口来聚合

	//构造器
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("开始代理  完成某些操作。。。。。 ");//方法
		target.teach();
		System.out.println("提交。。。。。");//方法
	}
}
