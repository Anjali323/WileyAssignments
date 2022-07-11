package com.anjali.client;

import java.util.Scanner;

import com.anjali.presentation.Presentation;
import com.anjali.presentation.PresentationImpl;

public class Client {

	public static void main(String[] args) {
		Presentation employeePresentation=new PresentationImpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
	
		}
	}

}
