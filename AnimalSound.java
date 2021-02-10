package Assessment1;

        class AnimalSound1 {

		public void shout()
		{
			System.out.println("Animal gives different sound");
		}
		
	 }
		class Dog extends AnimalSound
		{
			public void shout()
			{
				System.out.println("dog sound is barking");
			}
		}
		
		class Horse extends AnimalSound{
			
			public void shout()
			{
				System.out.println("horse sound is neigh");
			}
		}
		
		class cat extends AnimalSound
		{
			public void shout()
			{
				System.out.println("cat sound is mew");
			}
		
		}
		
	public class AnimalSound
		{
		
		public static void main(String[] args) {
			
			AnimalSound1  a=new AnimalSound1();
			
		     Dog d=new Dog();
			
			 Horse  h=new Horse();
			 
			 cat c=new cat();
			 
			 a.shout();
			 d.shout();
			 h.shout();
			 c.shout();
			
			
		}

		}


	
	
	
	
	
	
	
	