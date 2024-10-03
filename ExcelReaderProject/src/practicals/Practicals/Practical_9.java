package practicals.Practicals;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Practical_9 {
    
    public static void main(String[] args) {
        try {
            // Load the workbook and the first sheet
            Workbook workbook = Workbook.getWorkbook(new File("D:\\STQA\\student.xls"));
            Sheet sheet = workbook.getSheet(0);
            int count = 0;

            // Iterate through each student
            for (int i = 1; i < sheet.getRows(); i++) { // Skip header
                boolean scored60OrMore = false;
                
                // Check scores in subjects
                for (int j = 2; j < 4; j++) { // Subject columns
                    int score = Integer.parseInt(sheet.getCell(j, i).getContents());
                    if (score >= 60) {
                        scored60OrMore = true;
                        break; // Exit loop if score >= 60
                    }
                }
                if (scored60OrMore) count++; // Count if any score is >= 60
            }
            
            System.out.println("Number of students who scored 60 or more in any subject: " + count);
            workbook.close(); // Close the workbook
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for any exceptions
        }
    }
}
