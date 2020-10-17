package pl.ppj;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class DirRecurrApp {
	
	
	public static void listTree(String path)	{
		
	}

	public static void main(String[] args) {
		
		String path = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input initial path address: ");
		path = scanner.next();
		
		File rootDir = new File(path);
		File[] listOfFileNames = rootDir.listFiles();
		
		
		for (File fileName: listOfFileNames) {
			if (fileName.isDirectory()) {
			System.out.println(fileName);
		}
		}
	
	}
	
	public static void search(File file) {
		
	}

}
