package javaPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShmClient {

	static int shmid;
	// static long shmAddress;
	static String shmRead;
	static int pid;

	public void shmTest() throws IOException {
		System.out.println("----Started-----");
		System.load("/javaPackage/libshmlib.so");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			shmid = shmget(pid);
			shmRead = shmat(shmid);
			System.out.println(shmRead);
			String line = br.readLine();
		}

	}

	private static void getMyPID() {
		pid = -1;
		try {
			pid = Integer.parseInt((new File("/proc/self")).getCanonicalFile()
					.getName());
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Eror in obtaining pid of java process");
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Eror in obtaining pid of java process");
			System.exit(1);
		}
	}

	native int shmget(int pid);

	native String shmat(int shmid);
}
