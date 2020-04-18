// package hust.soict.hedspi.garbage;

// import java.io.FileReader;
// import java.io.IOException;

// public class NoGarbage {
// 	public static void main(String[] args) throws IOException {
// 		// int c;
// 		// FileReader input = new FileReader("C:\\Users\\lenovo\\Desktop\\garbage.txt");
// 		// StringBuffer buffer = new StringBuffer();
// 		// do {
// 		// 	c = input.read();
// 		// 	if(Character.isWhitespace((char)c)) {
// 		// 		System.out.println(buffer.toString());
// 		// 	}else {
// 		// 		buffer.append((char)c);
// 		// 	}
// 		// }while(c != -1);
// 		// System.out.println(buffer.toString());
// 		// input.close();
		
// 	}
// }
package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class NoGarbage {
	public static void main(String[] args)throws Exception 
	  {
	  long start = System.currentTimeMillis();
	  File file = new File("C:\\Users\\lenovo\\Desktop\\garbage.txt"); 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st=""; 
	  String tmp;
	  while ((tmp = br.readLine()) != null) 
	    st += tmp; 
	  
	  System.out.println(st);
	  System.out.println(System.currentTimeMillis()-start);
	  } 

	
}
