package com.UdeA.Ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Ciclo3Application {

	public static void main(String[] args) {

		//SpringApplication.run(Ciclo3Application.class, args);

		Task1 t1 = new Task1("recordar pooo", true, LocalDate.of(2022, 8, 19));
		Task1 t2 = new Task1("Conecer Intellij IDEA", false, LocalDate.of(2022, 8, 20));
		Task1 t3 = new Task1("Conecer de Spring Boot", false, LocalDate.of(2022, 8, 22));
		Task1 t4 = new Task1("Finalizando Tareas...", false, LocalDate.of(2022, 8, 25));
		Task1 t5 = new Task1("Recuperar Finalizando Tareas...", false, LocalDate.of(2022, 8, 20));


		/*System.out.println("descripcion de la tarea");
		System.out.println(t1.getDescription());
		System.out.println("nueva descripcion de la tarea 1:");
		System.out.println(t1.getDescription());


	//se modifica la propiedad de descripcion de t1
		t1.setDescription("recordando POO"); */

		TaskList1 metas = new TaskList1("Tareas Iniciales");//crea una instancia de la clase TaskList1

		metas.addTaskList(t1);
		metas.addTaskList(t2);
		metas.addTaskList(t3);
		metas.addTaskList(t4);
		metas.addTaskList(t5);

		/*System.out.println("Nueva descripcion de la tarea 1");
		System.out.println(t1.getDescription());*/

		//control + alt + / o control + chif + /
		/*.out.println("Tareas iniciales");
		metas.prinTasks();*/

		metas.removeTask("recordar poo");//registro el valor de la descripción de la tarea a eliminar
		System.out.println("Tareas pendientes:");
		metas.prinTasks();//imprime las taresa pendientes por terminar



	}
}
