package Package1;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

	String userName="Bhaskar";
	transient String password="Kajal0123";
	
	private void writeOIbject(ObjectOutputStream os) throws Exception {
		Serialization object creation;
	}
}

