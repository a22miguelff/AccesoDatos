package appStudents;

import java.util.Scanner;

public class AppStudents {
	private static Scanner sc=new Scanner(System.in);
	private static ManageStudents manager = new ManageStudents();
	
	private static void enrollStudent() {
		System.out.println("DNI del estudiante: ");
		String id=sc.next();
		System.out.println("Nombre del estudiante: ");
		String name=sc.next();
		System.out.println("Apellido del estudiante: ");
		String surname=sc.next();
		System.out.println("Edad del estudiante: ");
		int age=sc.nextInt();

		Students student=new Students(id,name,surname,age);
		boolean inserted=manager.addStudent(student);
	}
	private static void dropStudent() {

	}
	private static void updateStudent() {

	}
	private static void showStudent() {

	}
	private static void showAllStudent() {

	}


	public static void main(String[] args) {
		Students student=new Students("11111111Z","Javier","Lopez",50);
		System.out.println(student);
		Scanner sc=new Scanner(System.in);


		while (true) {
			System.out.println("1.- MATRICULAR UN ESTUDIANTE");
			System.out.println("2.- DAR DE BAJA UN ESTUDIANTE");
			System.out.println("3.- ACTUALIZAR DATOS DE UN ESTUDIANTE");
			System.out.println("4.- VER DATOS DE UN ESTUDIANTE");
			System.out.println("5.- VER DATOS DE TODOS LOS ESTUDIANTES");
			System.out.println("6.- SALIR");
			System.out.println("Elije una de las iguientes opciones:");
			int eleccion= Integer.parseInt(sc.next());		

			switch (eleccion) {
			case 1:
				enrollStudent();
				break;
			case 2:
				dropStudent();
				break;
			case 3:
				updateStudent();
				break;
			case 4:
				showStudent();
				break;
			case 5:
				showAllStudent();
				break;
			case 6:
				return;				
			}
		}
	}

}
