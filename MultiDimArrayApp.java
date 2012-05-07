public class MultiDimArrayApp {
	public static void main(String[] args){
		final int MAX_STUDENT = 50;
		final int MAX_SUBJECTS = 3;
		int[][] marks = new int[MAX_STUDENT][MAX_SUBJECTS];
		for (int id = 0; id < MAX_STUDENT; id++)
		{
			for (int subject = 0; subject< MAX_SUBJECTS; subject++){
				marks[id][subject] = (int)(Math.random()*100);
			}
		}

		System.out.println("Student\t");
		for (int subject = 0; subject < MAX_SUBJECTS; subject++){
			System.out.print("\t" + "Subject " + subject + "\t");
		}

		System.out.println();
		for (int id = 0; id < MAX_STUDENT; id++)
		{
			for (int subject = 0; subject< MAX_SUBJECTS; subject++){
				System.out.print("\t" + marks[id][subject] + "\t");
			}
			System.out.println();
		}
	}
	
}