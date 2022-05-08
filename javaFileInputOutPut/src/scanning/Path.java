package scanning;

import java.nio.file.Paths;

public class Path {

	public static void main(String[] args) {
		// Microsoft Windows syntax
		java.nio.file.Path path = Paths.get("C:\\home\\joe\\foo");

		//Sun Solaris Syntax
		//Path path = Paths.get("/home/joe/foo");

		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
	}

}
