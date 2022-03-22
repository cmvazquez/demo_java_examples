
public class ShadowTest {
	
	String var = "field in the outer Class";
	
	public class Innerclass{
		String var = "field in the inner Class with the same name of field in top-level-class";
		
		void methodMemberInnerClass() {
			System.out.println("========= method in  inner class =========");	
			System.out.println("field var = " + var);			
			System.out.println("field this.var = " + this.var);
			System.out.println("field ShadowTest.this.var = " + ShadowTest.this.var);
			
		}
		
		
		
	}
	
	public static class StaticInnerClass{
		String var = "field in static inner Class with the same name of field in top-level-class";
		
		void methodMemberInnerClass(ShadowTest outerClass) {
			System.out.println("========= method in static inner class =========");	
			
			System.out.println("field var = " + var);			
			System.out.println("field this.var = " + this.var);
			//only can access to members variables of the outer class through an object reference.
			System.out.println("field (using an object reference the outer class) ShadowTest.var = " + outerClass.var );
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		ShadowTest app = new ShadowTest();
		ShadowTest.Innerclass innerClass = app.new Innerclass();
		ShadowTest.StaticInnerClass staticInner = new ShadowTest.StaticInnerClass();
		
		innerClass.methodMemberInnerClass();
		staticInner.methodMemberInnerClass(new ShadowTest());
		
	}

}
