package cn.campsg.java.experiment.entity;

public class Hrstaff extends Employe{
		//private String rsname;
		public Hrstaff(){}
		public Hrstaff(String name){
			super(name,5,5000);
			
		}
		public void paySalary(Employe em){
			int level = em.getStage();
			if (level<=5) 
				em.setPay(em.getPay()+500);
			else if(level<10)
				em.setPay(em.getPay()+800);
			else if(level<16)
				em.setPay(em.getPay()+1000);
			else 
				System.out.println("�����ڶ�Ӧ��ְ�����޷����Ŷ��⸡��нˮ");
			
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
