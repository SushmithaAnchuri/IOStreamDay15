package ai.jobiak.streams;

import java.io.*;
public class KeyboardToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter writer=new FileWriter("mydata..txt");
		
		DataInputStream dis=new DataInputStream(System.in);
		String data=dis.readLine();
		while(!data.equals("stop")) {
		writer.write(data);
			//System.out.println(data);
			data=dis.readLine();
		}
		writer.close();
		System.out.println("after the loop");
	}

}
