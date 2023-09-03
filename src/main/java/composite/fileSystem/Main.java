package composite.fileSystem;

public class Main {

	public static void main(String args[]) {

		Directory movieDirectory = new Directory("Movie");
		FileSystem file = new File("DDLJ");
		movieDirectory.add(file);

		Directory movieDirectory1 = new Directory("HorrorMovie");
		FileSystem file1 = new File("Darr");
		movieDirectory1.add(file);

		movieDirectory.add(movieDirectory1);
		movieDirectory.ls();
		
	}

}
