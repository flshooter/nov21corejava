package com.ss.cj_day_three_asgmt_one;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.FileVisitResult;
import java.nio.file.attribute.BasicFileAttributes;

public class FileLister extends SimpleFileVisitor<Path> {
	@Override // reads and displays file name 
	public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
		System.out.println("   " + file.getFileName());
		return FileVisitResult.CONTINUE;
	}

	@Override // leaving directory
	public FileVisitResult postVisitDirectory(Path directory, IOException e) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override // entering directory
	public FileVisitResult preVisitDirectory(Path directory, BasicFileAttributes attributes) throws IOException {
		System.out.println(directory.getFileName());
		return FileVisitResult.CONTINUE;
	}

	@Override // catching error
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.out.println("filesystem error");
		return super.visitFileFailed(file, exc);
	}
}
