package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Employe;
import cn.campsg.java.experiment.entity.Hrstaff;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe em1 = new Employe("�ϵ�",12,12000);
		Employe em2 = new Employe("��ؤ",5,4500);
		Employe em3 = new Employe("����",9,6500);
		Hrstaff hr = new Hrstaff("HR");
		em1.work();
		em2.work();
		em3.work();
		hr.work();
		System.out.println("HR��ʼ���Ź��ʣ�");
		hr.paySalary(em1);
		hr.paySalary(em2);
		hr.paySalary(em3);
		hr.paySalary(hr);
		System.out.println("Ա��"+em1.getName()+"��нˮ��"+em1.getPay());
		System.out.println("Ա��"+em2.getName()+"��нˮ��"+em2.getPay());
		System.out.println("Ա��"+em3.getName()+"��нˮ��"+em3.getPay());
		System.out.println("Ա��"+hr.getName()+"��нˮ��"+hr.getPay());
	}

}
