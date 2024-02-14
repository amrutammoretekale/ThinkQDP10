package com.enumDemo;
class ConstantDirec{
	static final String North="North";
	static final String South="South";
	static final String East="East";
	static final String West="West";
}

public class EnumDemo {
   public enum Direction{North,East,West,South};
   
	public static void main(String[] args) {
		
  Direction d1=Direction.North;
  System.out.println(d1);
 
  Direction d2=Direction.North;
  if(d1==d2) {
	  System.out.println("Equal");
  }
  if(d1.equals(d2)) {
	  System.out.println("Equals");
  }
  //iterraate the enum
  System.out.println("----------");
  
  for(Direction d:Direction.values()) {
	  System.out.println(d);
  }
  System.out.println("------------");
  
  System.out.println(Direction.valueOf("North"));
  System.out.println(Direction.South.ordinal());
	}

}
