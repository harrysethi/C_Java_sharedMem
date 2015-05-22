package test;

import java.io.IOException;

import javaPackage.ShmClient;

public class TestMain {

	public static void main(String[] args) throws IOException {
		ShmClient shmClient = new ShmClient();
		shmClient.shmTest();
	}

}
