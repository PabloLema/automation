package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Utils {

    public XSSFSheet sheet() {
        File file = new File("./src/test/resources/documents/dataExcel.xlsx");
        XSSFSheet dataSheet = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            dataSheet = workbook.getSheetAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataSheet;
    }

    public String getUrl() {
        return sheet().getRow(1).getCell(0).toString();
    }

    public String getUser() {
        return sheet().getRow(1).getCell(1).toString();
    }

    public String getPassword() {
        return sheet().getRow(1).getCell(2).toString();
    }

    public String getObservationContent() {
        return sheet().getRow(1).getCell(3).toString();
    }
}
