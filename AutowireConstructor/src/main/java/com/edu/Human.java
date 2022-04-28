package com.edu;

public class Human {
	private Heart heartob;

	public Human(Heart heartob) {
		super();
		this.heartob = heartob;
	}


	public void humanFunction()
	{
	
		if(heartob!=null)
		{
			heartob.pump();
		}
		else
		{
			System.out.println("not alive");
		}
	}
	

}
