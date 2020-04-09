//Elena Voinu
import java.io.*;

public class ReadInput {
    public static void main(String[] args) throws IOException {
//
//        byte [] data = new byte[11];
//        System.out.println("Enter some characters: ");
//        System.in.read(data);
//        System.out.println("You entered: ");
//
//        for(int i = 0; i < data.length; i++){
//            System.out.println((char) data[i]);
//        }
//

        File file = new File("enter path to the file here"); //("src/test.txt.")
        try{
            //FileInputStream is a subclass of input stream so it's safe to
            // assign an instance of FileInputStream to an InputStream variable
            // could also write FileInputStream instead.
            InputStream  inputStream = new FileInputStream(file);
            System.out.println("Total file size in byte is : " + inputStream.available());

            // The read() method of an InputStream returns an int which contains the byte value of the byte read.
            int content = inputStream.read();

            // while we haven't reached the end of the file (no more bytes to read).
            //To read all bytes in a Java InputStream you must keep reading until the value -1 is returned.
            // This value means that there are no more bytes to read from the InputStream.
            while(content!=-1){

                // read next byte
                content = inputStream.read();

                //convert to characters and display the content
                System.out.print((char)content);
            }
            inputStream.close();
        }

        catch(IOException e) {

            System.out.println(e.getMessage());
        }
    }

}
