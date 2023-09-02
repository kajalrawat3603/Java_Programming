package unit03;
//import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P13_Task01_FileHandligInJava {
  
	public static void main(String[] args) throws IOException  {
		FileHandelling name=new FileHandelling();
		name.countWords();
		name.countLines();
		name.countCharacter();
		name.writeIntoAFile();
	}
}

class FileHandelling{
	static int count=1;
	static int lines=0;
	static int countChar=0;
	void countWords() throws IOException{
		String path="C:\\Users\\KAJAL\\eclipse-workspace\\JavaPrograming\\src\\unit03\\unit-3_multithreading";
		File file=new File(path);
		FileReader obj=new FileReader(file);
		BufferedReader br=new BufferedReader(obj);
		int prev=0,next=0;
		prev=br.read();
		while((next=br.read())!=-1)
		{
			if(prev==' '||prev=='\n'&&(next!=' '||next!='\n'))
			{
				count++;
			}
			prev=next;
		}
		System.out.println("Count Of Words:"+count);
		obj.close();
		br.close();
	}
	void countLines() throws IOException
	{
		File file=new File("C:\\Users\\KAJAL\\eclipse-workspace\\JavaPrograming\\src\\unit03\\unit-3_multithreading");
		FileReader obj=new FileReader(file);
		BufferedReader br=new BufferedReader(obj);
		String str;
		while((str=br.readLine())!=null)
		{
			lines++;
		}
		System.out.println("Number of lines in file:"+lines);
		obj.close();
		br.close();
	}
	void writeIntoAFile() throws IOException
	{
		FileWriter obj=null;
		try
		{
			obj=new FileWriter("C:\\Users\\KAJAL\\eclipse-workspace\\JavaPrograming\\src\\unit03\\sampel.txt");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		BufferedWriter f_writer=new BufferedWriter(obj);
		//String text="This is the program to store data in a text file";
		f_writer.write(String.valueOf(count));
		f_writer.write("\n");
		f_writer.write(String.valueOf(lines));
		f_writer.write("\n");
		f_writer.write(String.valueOf(countChar));
		f_writer.write("\n");
		f_writer.write("dfsdos");
		f_writer.close();
	}
    void countCharacter() throws IOException
    {
    	File file=new File("C:\\Users\\KAJAL\\eclipse-workspace\\JavaPrograming\\src\\unit03\\unit-3_multithreading");
    	FileReader obj=new FileReader(file);
    	BufferedReader br=new BufferedReader(obj);
    	String str;
    	while((str=br.readLine())!=null)
    	{
    		countChar+=str.length();
    	}
    	System.out.println("Number of Characters:"+countChar);
    	obj.close();
    	br.close();
    }
}
