package Exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling{
	public static void main(String[] args) throws IOException {
		File f=new File("Resources//read.txt");
		//System.out.println(f.delete()); 
		//
	if(!f.exists()) {
		System.out.println(f.mkdir()); ;
//			f.delete();
//			
	}
		//System.out.println(f.createNewFile());
		
		System.out.println(f.isHidden());
		System.out.println(f.canWrite());
		f.setWritable(true);
	    System.out.println(Arrays.toString(f.list()) );
	    System.out.println(Arrays.toString(f.list()) );
	}
}