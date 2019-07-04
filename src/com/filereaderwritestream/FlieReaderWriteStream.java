package com.filereaderwritestream;
/*
 * 将文本数据写入到一个磁盘文本文件中，然后再将文件的内容读出来并显示。
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FlieReaderWriteStream {

	public static void main(String[] args) throws IOException {
		FileWriter fw;
		fw = new FileWriter("./filestream.txt"); //打开文件输出流
		char[] array = {'文', '本', '输', '入', '输', '出', '实', '例', '。'};
		for (int i = 0; i < array.length; i++)
			fw.write(array[i]); //写数据到文件输出流，也就是写入文件
		fw.close(); //关闭文件输出流，及关闭文件
		FileReader fr = new FileReader("./filestream.txt"); //打开文件输入流
		int value;
		
		//read()：从字符输入流读取单个字符作为返回值；若已到流末尾，则返回-1。
		while ((value = fr.read()) != -1) //从文件输入流读数据
			System.out.print((char) value);
		fr.close();
	}

}
