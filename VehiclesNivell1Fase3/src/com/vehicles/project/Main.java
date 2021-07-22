package com.vehicles.project;

import java.util.*;
import java.util.Scanner;

    public class Main {

	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		
            System.out.println("¿Quín vehicle vols crear? \n1. Un cotxe \n2. Una moto");
            int eleccio = lector.nextInt();
            lector.nextLine();
		
            if(eleccio==1) {
                System.out.println("Escriu la matrícula del cotxe: ");
                String matricula = lector.nextLine();
			
                System.out.println("Escriu la marca del cotxe: ");
                String marca = lector.nextLine();
			
                System.out.println("Específica el color del cotxe: ");
                String color = lector.nextLine();
			
                Car car = new Car(matricula, marca, color);
			
                System.out.println("Possar les rodes del davant!");
                Wheel rodaDavant = demanarRoda();
			
                System.out.println("Possar les rodes del darrere!");
                Wheel rodaDarrere = demanarRoda();
			
                List<Wheel> rodesDavant = new ArrayList<>();
                rodesDavant.add(rodaDavant);
                rodesDavant.add(rodaDavant);
			
                List<Wheel> rodesDarrere = new ArrayList<>();
                rodesDarrere.add(rodaDarrere);
                rodesDarrere.add(rodaDarrere);
			
                car.addWheels(rodesDavant, rodesDarrere);
			
                System.out.println(car.toString());
			
		} else if(eleccio==2) {
                    System.out.println("Escriu la matrícula de la moto: ");
                    String matriculaMoto = lector.nextLine();
			
                    System.out.println("Escriu la marca de la moto: ");
                    String marcaMoto = lector.nextLine();
			
                    System.out.println("Específica el color de la moto: ");
                    String colorMoto = lector.nextLine();
			
                    Bike bike = new Bike(matriculaMoto, marcaMoto, colorMoto);
			
                    System.out.println("Possar les rodes del davant!");
                    Wheel rodaDavant = demanarRoda();
			
                    System.out.println("Possar les rodes del darrere!");
                    Wheel rodaDarrere = demanarRoda();
			
                    bike.addWheels(rodaDavant, rodaDarrere);
			
                    System.out.println(bike.toString());
                } else {
                    System.err.println("Nomès hi ha dues opcions: [1 -> Coche | 2 ->Moto]");
		}
		
		lector.close();
	}
	
	public static Wheel demanarRoda() throws InvalidWheelDiameterException {
		
            Wheel roda;
		
            System.out.println("Escriu la marca de la roda: ");
            String marcaRoda = lector.nextLine();
		
            System.out.println("Escriu el diàmetre de la roda: ");
            double diametreRoda = lector.nextDouble();
            lector.nextLine();
		
            roda = new Wheel(marcaRoda, diametreRoda);
		
            return roda;
	}

    }

   