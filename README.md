# C_Java_sharedMem

A simple example of SharedMem Communication in two ways:<br>
1. Between a C-Server & a C-Client<br>
2. Between a C-Server & a Java-Client<br>

<br>
-

The C implementation is taken from <i>"http://www.cs.cf.ac.uk/Dave/C/node27.html"</i> & slight minor modification is done as required. We basically intent to describe the jni communication between C & Java, accessing the shared memory. 

-

<b>Steps for running:</b>

1. It is an eclipse project, thus you can import it to eclipse & do the required modifications<br>
2. Compile the C-Server as : <i>"gcc -w  shm_server.c -o server"</i><br>
3. You will need to create the new libshmlib.so on modifying jnishm.c, use the following command to do so:<br>
<i>"gcc -shared -Wall -fPIC -I "/usr/lib/jvm/java-6-openjdk-amd64/include" jnishm.c -o libshmlib.so"</i><br>
4. Run the C-server: <i>"./server"</i><br>
6. Run the java-client
        
