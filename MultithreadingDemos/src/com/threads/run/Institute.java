package com.threads.run;

class Student implements Runnable {
	private String studName;
	private String question;
	private Trainer trainer;

	public Student(String studName, String question, Trainer trainer) {
		super();
		this.studName = studName;
		this.question = question;
		this.trainer = trainer;
		Thread thread = new Thread(this, studName);
		thread.start();

	}

	@Override
	public void run() {
		synchronized (trainer) {
			System.out.println(Thread.currentThread().getName() + "........");
			System.out.println("Question time " + studName);
			trainer.explain(studName, question);
			System.out.println("doubt cleared in " + question + " for " + studName);
		}
	}

}

public class Institute {

	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Student student1 = new Student("Ronnie", "Explain Overloading", trainer);
		Student student2 = new Student("Kumaran", "Why Multithreading", trainer);
		Student student3 = new Student("Tharan", "What is JDBC?", trainer);

	}
}
