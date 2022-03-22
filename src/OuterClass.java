
public class OuterClass { // outer class
	
	String  varOuterField = " this field is in OuterClass"; 
	static String varStaticOuterField = "this static variable is in an OuterClass";
	
	public class Innerclass {	
		
		String  varInnerField = " this from inner class"; 
		
		void accesstoMembersOfOuterclass() {
			System.out.println("\n ======= Printing from method within  Inner class");
			System.out.println("varOuterField -->" + varOuterField);
			System.out.println("\n varStaticOuterField-->" + OuterClass.varStaticOuterField);
		}

		public String getVarInnerField() {
			return varInnerField;
		}

		public void setVarInnerField(String varInnerField) {
			this.varInnerField = varInnerField;
		}
	}
	
	static class StaticInnerclass{
		 String  varStaticInnerField = " this from static inner class"; 
		
		void accessMembersOuterClass(OuterClass outer) {
			System.out.println("\n From method within Static Inner class");
			System.out.println("\n outer.varOuterField --->" + outer.varOuterField);
			System.out.println("\n OuterClass.varStaticOuterField --->" + OuterClass.varStaticOuterField);
		}

		public String getVarStaticInnerField() {
			return varStaticInnerField;
		}

		public void setVarStaticInnerField(String varStaticInnerField) {
			this.varStaticInnerField = varStaticInnerField;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		OuterClass myOuterClass = new OuterClass();//Instantiate outer class		
		OuterClass.Innerclass myInnerclass = myOuterClass.new Innerclass();//Instantiate inner class				
		StaticInnerclass myStaticNestedClass = new StaticInnerclass();//Instantiate static inner class
		
		
		System.out.println(myOuterClass.varOuterField);		
		System.out.println(myInnerclass.varInnerField);		
		System.out.println(myStaticNestedClass.varStaticInnerField);
		myInnerclass.accesstoMembersOfOuterclass();
		myStaticNestedClass.accessMembersOuterClass(myOuterClass);
		
		
		
		
	
	}

	public String getVarOuterField() {
		return varOuterField;
	}

	public void setVarOuterField(String varOuterField) {
		this.varOuterField = varOuterField;
	}

	public static String getVarStaticOuterField() {
		return varStaticOuterField;
	}

	public static void setVarStaticOuterField(String varStaticOuterField) {
		OuterClass.varStaticOuterField = varStaticOuterField;
	}
}



