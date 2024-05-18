/*
WAP to read data from three different files namely file1.txt, file2.txt, 
file3.txt and save all these 3 file's content in an another single file namely 
content.txt using multithreading in java. 

*/


/*
Author : ManMohan
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MultithreadedFileReader2 {

    public static void main(String[] args) {
        // Provide the full paths for the input files
        String file1Path = "C:\\Users\\smanm\\eclipse-workspace\\lmsLabs\\src\\file1.txt";
        String file2Path = "C:\\Users\\smanm\\eclipse-workspace\\lmsLabs\\src\\file2.txt";
        String file3Path = "C:\\Users\\smanm\\eclipse-workspace\\lmsLabs\\src\\file3.txt";
        String outputPath = "C:\\Users\\smanm\\eclipse-workspace\\lmsLabs\\src\\content.txt";
        // Create threads for each file processing task
        Thread t1 = new Thread(new FileProcessor(file1Path, outputPath));
        Thread t2 = new Thread(new FileProcessor(file2Path, outputPath));
        Thread t3 = new Thread(new FileProcessor(file3Path, outputPath));

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }

    static class FileProcessor implements Runnable {
        private String inputFile;
        private String outputFile;

        public FileProcessor(String inputFile, String outputFile) {
            this.inputFile = inputFile;
            this.outputFile = outputFile;
        }

        @Override
        public void run() {
            try {
                // Open input file for reading
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));

                // Open output file for writing (appending)
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true));

                String line;
                // Read each line from input file and write it to output file
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }

                // Close the reader and writer
                reader.close();
                writer.close();

                System.out.println("File '" + inputFile + "' has been processed.");
            } catch (IOException e) {
                System.out.println("Error processing file: " + e.getMessage());
            }
        }
    }
}
/*file1.txt 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :)

file2.txt 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 

file3.txt
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 


/*OUTPUT
File 'C:\Users\smanm\eclipse-workspace\lmsLabs\src\file2.txt' has been processed.
File 'C:\Users\smanm\eclipse-workspace\lmsLabs\src\file1.txt' has been processed.
File 'C:\Users\smanm\eclipse-workspace\lmsLabs\src\file3.txt' has been processed.

content.txt
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *1* data  CONTEXT !!! SENSITIVE DATA THERE :)
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *3* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 
THIS IS FILE *2* data  CONTEXT !!! SENSITIVE DATA THERE :) 


*/






