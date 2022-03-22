
public class DeclaringStringBuilderType {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		System.out.println("\n StringBuilder default capacity ---->" + stringBuilder.capacity());
		
		stringBuilder.append("Testing");
		
		System.out.println("\n StringBuilder capacity ---->" + stringBuilder.capacity());
		
		stringBuilder.append("adding things").append("more facter then stringBuffer").append("because donn't have synchronized methods");
		
		System.out.println("\n StringBuilder capacity ---->" + stringBuilder.capacity());
		System.out.println("\n content in stringBuilder --->"+ stringBuilder);
		
		System.out.println("\n reverse chains ---->" + stringBuilder.reverse());
		
		//clean a stringBuilder
		stringBuilder.setLength(0);
		System.out.println("\n content in stringBuilder --->"+ stringBuilder);
	}

}
