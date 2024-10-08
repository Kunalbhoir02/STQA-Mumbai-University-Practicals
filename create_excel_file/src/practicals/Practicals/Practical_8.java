package practicals.Practicals;

import jxl.*;
import jxl.write.*;
import jxl.write.Number;
import java.io.*;
import java.util.Locale;

public class Practical_8 {

    public static void main(String[] args) throws IOException, WriteException {
        String[] header = {"Student Name", "Subject 1", "Subject 2", "Subject 3", "Total"};
        String[] sName = {"Pranav", "Ankur", "Aniket", "Piyush", "Nikhil", "Parvati", "Shivraj", "Yash", "Rohit", "Rahul"};
        int[] marks = {85, 90, 81, 82, 74, 76, 89, 92, 96, 85};
        File file = new File("D:\\STQA\\student.xls");

        // Create WorkbookSettings and set locale
        WorkbookSettings wbSettings = new WorkbookSettings();
        wbSettings.setLocale(new Locale("en", "EN"));

        // Create the workbook and sheet
        WritableWorkbook workbook = Workbook.createWorkbook(file, wbSettings);
        WritableSheet excelSheet = workbook.createSheet("Report", 0);

        // Add headers
        for (int c = 0; c < header.length; c++) {
            excelSheet.addCell(new Label(c, 0, header[c]));
        }

        // Add student names and marks
        for (int r = 1; r <= sName.length; r++) {
            excelSheet.addCell(new Label(0, r, sName[r - 1])); // Student name
            for (int c = 1; c < 4; c++) {
                excelSheet.addCell(new Number(c, r, marks[r - 1])); // Subject marks
            }
            // Calculate and add total
            excelSheet.addCell(new Number(4, r, marks[r - 1] * 3));
        }

        workbook.write();
        workbook.close();
        System.out.println("Excel File Created");
    }
}
