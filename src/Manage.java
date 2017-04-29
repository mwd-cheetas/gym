import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Manage {
	public Manage(){
		mtr = new ManageTrainer();
		mte = new ManageTrainee();
	}
public ManageTrainer mtr ;//= new ManageTrainer();
public ManageTrainee mte ;//= new ManageTrainee();
}
class ManageTrainer {
	List<Trainer>trainers=new ArrayList<Trainer>();
	public void addtrainer(Trainer tt){
		
		Scanner  s = new Scanner(System.in);///(int age,String name,int weight,int experience,String phone)
		System.out.println("Enter Name: ");
		tt.name=s.next();
		System.out.println("Enter Age: ");
		tt.age=s.nextInt();
		System.out.println("Enter Weight: ");
		tt.weight=s.nextInt();
		System.out.println("Enter Experience in Years: ");
		tt.experience=s.nextInt();
		System.out.println("Enter Phone: ");
		tt.phone=s.next();
		System.out.println("Enter Type of Training Press 1 for Fitness press 2 for MassGain");
		s.close();
		for (int i = 0; i < trainers.size(); i++) {
			if (trainers.get(i).name==tt.name) {
				System.out.println("Trainer with same name already found !!!try again ");
				addtrainer(tt);
			}
		}
		addttt(tt);
			
	}
	private void addttt(Trainer g)
	{
		trainers.add(g);
	}
	public void removetrainer(String name)
	{
		for (int i = 0; i < trainers.size(); i++) {
			if (trainers.get(i).name==name) {
				trainers.remove(i);
				break;
			} else {
				System.out.println("Trainer not Found");
			}
		}
	}
}
class ManageTrainee {
	List<Trainee>trainees=new ArrayList<Trainee>();
	public void addttt(Trainee g)
	{
		trainees.add(g);
	}
	public void addtrainee(Trainee tt){
		
		Scanner  s = new Scanner(System.in);///(String name,int age,int weight,String phone,String email)
		System.out.println("Enter Name: ");
		tt.name=s.next();
		System.out.println("Enter Age: ");
		tt.age=s.nextInt();
		System.out.println("Enter Weight: ");
		tt.weight=s.nextInt();
		System.out.println("Enter Email: ");
		tt.email=s.next();
		System.out.println("Enter Phone: ");
		tt.phone=s.next();
		s.close();
		for (int i = 0; i < trainees.size(); i++) {
			if (trainees.get(i).name==tt.name) {
				System.out.println("Trainee with same name already found !!! ");
				return;
			}
		}
		addttt(tt);
	
	
	}
 	public void removetrainer(String name)
	{
		for (int i = 0; i < trainees.size(); i++) {
			if (trainees.get(i).name==name) {
				trainees.remove(i);
				break;
			} else {
				System.out.println("Trainee not Found");
			}
		}
	}
}