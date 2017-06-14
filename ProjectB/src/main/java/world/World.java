package world;

import org.joda.time.DateTime;

import foo.Foo;

public class World {
	public World(){
		
	}
	
	public void world(){
		Foo foo = new Foo();
		foo.foo();
		DateTime date = new DateTime();
		System.out.println("world");
	}

}
