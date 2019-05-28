package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Employe;
import cn.campsg.java.experiment.entity.Hrstaff;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe em1 = new Employe("南帝",12,12000);
		Employe em2 = new Employe("北丐",5,4500);
		Employe em3 = new Employe("中神",9,6500);
		Hrstaff hr = new Hrstaff("HR");
		em1.work();
		em2.work();
		em3.work();
		hr.work();
		System.out.println("HR开始发放工资：");
		hr.paySalary(em1);
		hr.paySalary(em2);
		hr.paySalary(em3);
		hr.paySalary(hr);
		System.out.println("员工"+em1.getName()+"的薪水："+em1.getPay());
		System.out.println("员工"+em2.getName()+"的薪水："+em2.getPay());
		System.out.println("员工"+em3.getName()+"的薪水："+em3.getPay());
		System.out.println("员工"+hr.getName()+"的薪水："+hr.getPay());
	}

}
