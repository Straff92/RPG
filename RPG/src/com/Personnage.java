package com;

public class Personnage {
	
	int vie;
	int mana;
	int str;
	int dex;
	String nom;
	

	public Personnage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("void");
		for ( int i =0; i<16; i++) 
		{
			String str = Integer.toBinaryString( i );
			while(str.length() <4) str = "0"+ str;
			System.out.println(str);
		}
		
		
		//
	}

}
;