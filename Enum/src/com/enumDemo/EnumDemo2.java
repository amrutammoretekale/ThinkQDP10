package com.enumDemo;
enum Season{SUMMER,WINTER,MONSOON};
public class EnumDemo2 {
  
	public static void main(String[] args) {
	Season s=Season.SUMMER;
	switch(s) {
	case SUMMER:System.out.println("Cotton cloths");
	     break;
	case WINTER:System.out.println("Woolean cloths");
	     break;
	case MONSOON:System.out.println("umbrella and raincote");
	     break;
	default:System.out.println("error");
	}

	}

}
