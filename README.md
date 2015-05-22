# C_Java_sharedMem

A simple example of SharedMem Communication in two ways:
1. Between a C-Server & a C-Client
2. Between a C-Server & a Java-Client

---

The C implementation is taken from <i>"http://www.cs.cf.ac.uk/Dave/C/node27.html"</i> & slight minor modification is done as require. We basically intent to describe the jni communication between C & Java, accessing the shared memory. 

---

<b>Steps for running:</b>

1. It is an eclipse project, thus you can import it to eclipse & do the required modifications

2. Compile the C-Server as : <i>"gcc -w  shm_server.c -o server"</i>

3. You will need to create the new libshm.so on modifying jnishm.c, use <i>"gcc -shared -Wall -fPIC -I "/usr/lib/jvm/java-6-openjdk-amd64/include" jnishm.c -o libshmlib.so" to do so.</i>

4. Run the C-server: <i>./server</i>

6. Run the java-client
        
