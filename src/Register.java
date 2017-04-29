import java.util.Scanner;


public class Register{
	ManageTrainer mm = new ManageTrainer();
	ManageTrainee me = new ManageTrainee();
	public void registertrainer(String name){
		for (int i = 0; i < mm.trainers.size(); i++) {
			System.out.println("Name: "+mm.trainers.get(i).name+"Age: "+mm.trainers.get(i).age+"Experience: "+mm.trainers.get(i).experience+"Phone: "+mm.trainers.get(i).phone);
		}
		System.out.println("Enter Name of Trainer to Register");
		Scanner s = new Scanner (System.in);
		String nn=s.next();
		s.close();
		int indextrainer = Find.findtrainer(nn);
		if (indextrainer!=-1) {
			mm.trainers.get(indextrainer).comission+=1000;
			me.trainees.get(Find.findtrainee(name)).t=mm.trainers.get(indextrainer);
		}
		else {
			System.out.println("Error in naming try again");
			registertrainer(name);
		}
		
		
		
		
		
	}
}
