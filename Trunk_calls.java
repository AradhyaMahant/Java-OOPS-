package com.R177219040.q4;


public class Trunk_calls {
	static float duration;
	static String type;
	float rate()
		{
			if(type.equals("urgent"))
				return 4.5f;
			else if(type.equals("lightning"))
				return 3.5f;
			else
				return 3f;
		
		}
	

}
