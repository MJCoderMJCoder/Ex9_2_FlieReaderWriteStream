package com.filereaderwritestream;
/*
 * ���ı�����д�뵽һ�������ı��ļ��У�Ȼ���ٽ��ļ������ݶ���������ʾ��
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FlieReaderWriteStream {

	public static void main(String[] args) throws IOException {
		FileWriter fw;
		fw = new FileWriter("./filestream.txt"); //���ļ������
		char[] array = {'��', '��', '��', '��', '��', '��', 'ʵ', '��', '��'};
		for (int i = 0; i < array.length; i++)
			fw.write(array[i]); //д���ݵ��ļ��������Ҳ����д���ļ�
		fw.close(); //�ر��ļ�����������ر��ļ�
		FileReader fr = new FileReader("./filestream.txt"); //���ļ�������
		int value;
		
		//read()�����ַ���������ȡ�����ַ���Ϊ����ֵ�����ѵ���ĩβ���򷵻�-1��
		while ((value = fr.read()) != -1) //���ļ�������������
			System.out.print((char) value);
		fr.close();
	}

}
