package cn.campsg.java.experiment.entity;

public class Employe {
	private String name;
	private int stage;
	private int pay;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Employe(String name, int stage, int pay) {
		this.name = name;
		this.stage = stage;
		this.pay = pay;
	}
	public Employe(){}
	public void work(){
		System.out.println(getName()+"做好了本职工作！ ");
	}

}
