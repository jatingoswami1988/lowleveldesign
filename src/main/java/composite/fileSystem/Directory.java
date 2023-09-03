package composite.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

	private String directoryName;
	List<FileSystem> fileSystems;
	
	public void add(FileSystem fileSystemObject) {
		fileSystems.add(fileSystemObject);
	}

	public Directory(String directoryName) {
		this.directoryName = directoryName;
		this.fileSystems = new ArrayList<>();
	}

	@Override
	public void ls() {
		System.out.println("directory name :" + directoryName);

		for (FileSystem fileSystem : fileSystems) {
			fileSystem.ls();
		}
	}

}
