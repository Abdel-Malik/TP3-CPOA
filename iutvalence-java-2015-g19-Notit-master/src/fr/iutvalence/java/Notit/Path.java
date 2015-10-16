package fr.iutvalence.java.Notit;

import java.io.File;

/**
 * 
 * @author G19
 *
 */
public class Path {

	public static boolean checkPath(String path) {
		File file = new File(path);
		if (file.exists())
			return true;
		return false;
	}

	public static void createPath(String path) {
		File file = new File(path);
		file.mkdirs();
	}
	

	public static int maxIdFileInPath(String path) {
		int max = 0;
		if(checkPath(path)){
			File repository = new File(path);
			File[] files = repository.listFiles();
			if(files.length > 0){
				max = (int) (files[0].getName().charAt(0) - 48);
				for (int index = 0; index < files.length; index++) {
					if (max < (int) (files[index].getName().charAt(0)-48))
						max = (int) (files[index].getName().charAt(0)-48);
				}
			}
		}
		max++;
		return max;
	}
}
