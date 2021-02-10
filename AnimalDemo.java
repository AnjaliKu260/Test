package Test;
class Animal {
	
	void shout()
	{
		System.out.println(" Animal sout");
	}

}

class Dog extends Animal
{
	 void shout() 
		{
			System.out.println(" Bark");
		}
}
class Horse extends Animal

{
	 void shout()
		{
			System.out.println(" Neigh ");
		}
}

class Cat extends Animal
{
	 void shout()  
		{
			System.out.println(" Mewo Mewo");
		}
}


public class AnimalDemo {

	public static void main(String[] args) {
		Animal dog=new Dog();
		dog.shout();

		Animal horse=new Horse();
		horse.shout();
		Animal cat=new Cat();
		cat.shout();
		
	}

}
