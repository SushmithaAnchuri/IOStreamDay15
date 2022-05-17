package ai.jobiak.streams;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileToFile
{
public static void main(String[] args) throws IOException
{
FileReader fr = new FileReader("Input.txt");
FileWriter fw = new FileWriter("Output.txt");
String data = " ";
int i;
while ((i = fr.read())!=-1)
{
data += (char)i;
}
System.out.println(data);
fw.write(data);
fr.close();
fw.close();
System.out.println("File reading and writing both done");
}

}
