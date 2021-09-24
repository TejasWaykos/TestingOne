package Package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class SerializationDemo{
	
	public static void main(String[] args) throws Exception {
		Account a1=new Account();
		System.out.println(a1.userName+"----------"+a1.password);
		
		FileOutputStream os=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(a1);
		
		FileInputStream fs=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fs);
		Account a2=(Account) ois.readObject();
		System.out.println(a2.userName+"--------------"+a2.password);
		
		
	}
}
