
public  class Find {
	public static int findtrainer(String name){
		ManageTrainer mt = new ManageTrainer();
		for (int i = 0; i < mt.trainers.size(); i++) {
			if (mt.trainers.get(i).name==name) {
				return i;
			}
		}
		return -1;
	}
	public static int findtrainee(String name){
		ManageTrainee mt = new ManageTrainee();
		for (int i = 0; i < mt.trainees.size(); i++) {
			if (mt.trainees.get(i).name==name) {
				return i;
			}
		}
		return -1;
	}
}
