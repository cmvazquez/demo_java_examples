
import com.ejemplos.objects.Cat;
import com.ejemplos.objects.Dog;

public class Polymorphism {

	public static void main(String[] args) {
		Cat var1 = new Cat("kitty", "persa", 3);
		Dog var2 = new Dog("Lulu","chow chow",5);
		
		 var1.showBehavior();
		 var2.showBehavior();

	}

}
