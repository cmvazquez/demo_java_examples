
public class TopLevelClass {
	
	static String var;
	String  var2 = "var2 is a field in some top-level-class";
	
	
	static {
		var = "field  initialized inside of static block";		
		System.out.println("static block called!!! " ) ;
	}
	
	void accessMembersOfAnotherOuterClass(OuterClass outer ) {
		
		System.out.println("Member field is in another Top-Level-Class ---->" + outer.varOuterField);
		System.out.println("Member static in another Top-Level-Class ---->" + OuterClass.varStaticOuterField);

	}
	
	public static void main(String[] args) {
		
		TopLevelClass app = new TopLevelClass();		
		app.accessMembersOfAnotherOuterClass(new OuterClass());

	}

}
