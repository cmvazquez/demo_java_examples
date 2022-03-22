import java.sql.Timestamp;
import java.util.Date;

public class DateType {

	public static void main(String[] args) {
		
		Date  var = new Date();
		
		System.out.println("\n varDate getTime()-->" + var.getTime());
				
		System.out.println("\n varDate toInstant()-->" + var.toInstant());
		System.out.println("\n varDate using new java.sql.Timestamp() -->" + new java.sql.Timestamp(var.getTime()) );
		
		System.out.println("\n varDate using Timestamp.from() -->" + Timestamp.from(var.toInstant()) );
		
	}

}
