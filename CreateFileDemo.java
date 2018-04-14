package study19;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class CreateFileDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\eclipse\\eclipseWorkspace\\JABA");
		String[] fileArray = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File file = new File(dir, name);
				if (file.isFile()) {
					boolean m = file.getName().endsWith(".txt");
					return m;
				} else {
					return false;
				}
			}
		});
		for (String s : fileArray) {
			System.out.println(s);
		}
	}
}
