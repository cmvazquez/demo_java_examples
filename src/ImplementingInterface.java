import com.ejemplos.interfaces.InterfaceExample;
import com.ejemplos.interfaces.InterfaceExampleB;


public class ImplementingInterface implements InterfaceExample , InterfaceExampleB{

	
	public static void main(String ... args) {
		InterfaceExample myApp = new ImplementingInterface();
		
		myApp.behavior("Testing methods from a Interface implemented!!");
		myApp.methodDefault();
	}
	
	@Override
	public void behavior(String param1) {
		
		System.out.println(param1);
	}

	@Override
	public void methodDefault() {
		System.out.print("this method was overriding in both interfaces InterfaceExample and InterfaceExampleB \n");
		InterfaceExample.super.methodDefault();
		InterfaceExampleB.super.methodDefault();
		
	}

}
