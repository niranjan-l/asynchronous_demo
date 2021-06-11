package com.niranjan2021.Asynchronoustask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;

import java.util.Arrays;

@SpringBootApplication

@EnableTask
public class AsynchronousTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsynchronousTaskApplication.class, args);
	}


	@Bean
	public MyTask createMyTaskExecutor(){
		return  new MyTask();
	}

	@Bean
	public MyTask2 createMyTask2Executor(){
		return  new MyTask2();
	}


	   class MyTask implements CommandLineRunner {

		   @Override
		   public void run(String... strings) throws Exception {

			   if (null != strings) {
				   System.out.println("parameters length is " + strings.length);
				   Arrays.stream(strings).forEach(System.out::println);
			   }


		   }
	   }

		   class MyTask2 implements CommandLineRunner {

			   @Override
			   public void run(String... strings) throws Exception {

				   if (null != strings) {
					   System.out.println("parameters length is " + strings.length);
					   Arrays.stream(strings).forEach(System.out::println);
				   }


			   }
		   }


}
