import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherRegex {

	public static void main(String[] args) {
		
		
		Pattern pattern = Pattern.compile("..m");
		// [abc] most contain some a or b or c
		// [^abc] not contain abc
		Matcher matcher = pattern.matcher("abm");
		System.out.println("Found it---> " + matcher.matches());
		
		
		String text = "Suscribe the channel Suscribe Suscribe";
		Pattern pattern2 = Pattern.compile("suscribe",Pattern.CASE_INSENSITIVE );
		Matcher matcher2 = pattern2.matcher(text);
				
		System.out.println("Found it \"suscribe\" using matches()---> " + matcher2.matches());//attemp match the whole text
		System.out.println("Found it \"suscribe\" using lookingAt()---> "+ matcher2.lookingAt());
		
		int counter = 0;
		matcher2.reset();//return index position at the beginning the text
		while(matcher2.find()) {
			counter++;
			System.out.println("Found it \"suscribe\" using find()---> "+ counter + 
					" start " + matcher2.start() + " end " + matcher2.end());
		}
	
	}

}
