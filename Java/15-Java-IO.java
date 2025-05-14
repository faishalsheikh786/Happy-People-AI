import java.io.*;
import java.util.Properties;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JavaIOExamples {


    // 1. Write a program to read text from .txt file using InputStream
    public static void readUsingInputStream() throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }





    // 2. Write a program to write text to .txt file using OutputStream
    public static void writeUsingOutputStream() throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        String data = "This is written using OutputStream.";
        fos.write(data.getBytes());
        fos.close();
    }





    // 3. Read text from a .txt file using BufferedInputStream
    public static void readUsingBufferedInputStream() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
        int i;
        while ((i = bis.read()) != -1) {
            System.out.print((char) i);
        }
        bis.close();
    }





    // 4. Write text to a .txt file using BufferedOutputStream
    public static void writeUsingBufferedOutputStream() throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output_buffered.txt"));
        String data = "This is written using BufferedOutputStream.";
        bos.write(data.getBytes());
        bos.flush();
        bos.close();
    }





    // 5. Write a program to read text from .txt file using FileReader
    public static void readUsingFileReader() throws IOException {
        FileReader fr = new FileReader("input.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }





    // 6. Write a program to write text to .txt file using FileWriter
    public static void writeUsingFileWriter() throws IOException {
        FileWriter fw = new FileWriter("file_writer.txt");
        fw.write("This is written using FileWriter.");
        fw.close();
    }

    // 7. Read text from a .txt file using BufferedReader
    public static void readUsingBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }





    // 8. Write text to a .txt file using BufferedWriter
    public static void writeUsingBufferedWriter() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("buffered_writer.txt"));
        bw.write("This is written using BufferedWriter.");
        bw.close();
    }





    // 9. Write a program to read data from properties file.
    public static void readFromPropertiesFile() throws IOException {
        FileInputStream fis = new FileInputStream("config.properties");
        Properties props = new Properties();
        props.load(fis);
        System.out.println("username: " + props.getProperty("username"));
        System.out.println("password: " + props.getProperty("password"));
        fis.close();
    }





    // 10. Write a program to read data from excel
    public static void readFromExcel() throws Exception {
        FileInputStream fis = new FileInputStream("data.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        workbook.close();
        fis.close();
    }





    // 11. Write a program to write data to excel
    public static void writeToExcel() throws Exception {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Name");
        row.createCell(1).setCellValue("Age");
        row = sheet.createRow(1);
        row.createCell(0).setCellValue("Alice");
        row.createCell(1).setCellValue(24);
        FileOutputStream fos = new FileOutputStream("output.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();
    }




    
    public static void main(String[] args) throws Exception {
        // Call methods one by one as needed
        readUsingInputStream();
        writeUsingOutputStream();
        readUsingBufferedInputStream();
        writeUsingBufferedOutputStream();
        readUsingFileReader();
        writeUsingFileWriter();
        readUsingBufferedReader();
        writeUsingBufferedWriter();
        readFromPropertiesFile();
        readFromExcel();
        writeToExcel();
    }
}
