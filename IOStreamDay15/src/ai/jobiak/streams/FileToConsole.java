package ai.jobiak.streams;

import java.io.*;

public class FileToConsole {

	public static void main(String[] args) throws IOException {
		
	FileInputStream fis=new FileInputStream("C:\\Users\\Fresher\\Desktop\\Jobiak\\Core\\IOStreamDay15\\src\\ai\\jobiak\\streams\\FileToConsole.java");
	int data=fis.read();
	while(data!=-1) {
		System.out.print((char)data);
		data=fis.read();
	}
	}

}
