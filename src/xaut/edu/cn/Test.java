package xaut.edu.cn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {


	/**从文件（E:\\test.txt）读取数据，并计算每一行数据的平方和并开方，最后将结果重新写入文件（E:\\target.txt"）
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "E:\\test.txt";
		String TargetFile = "E:\\target.txt";
		FileWriter fw = null;
		File file = new File(fileName);
		File targetFile = new File(TargetFile);
		
		BufferedReader br = null;
		String line = null;
		String[] rec = null;
		double x = 0, y = 0, z = 0, sum = 0;
		
		 try {
			br=new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 if (!targetFile.exists()) {

		    	try {
					targetFile.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		    	}
		 
		 try {
			 
			 fw = new FileWriter(TargetFile);
			 
			while((line = br.readLine())!= null){
				    rec = line.split("\t");				
				    
				    x = Double.parseDouble(rec[0]);
				    y = Double.parseDouble(rec[1]);
				    z = Double.parseDouble(rec[2]);
				    
				    sum = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
				    
				    fw.append(sum + "\r\n");
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			if (fw != null) {

			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			fw = null;

			}

			}
	}
	



}
