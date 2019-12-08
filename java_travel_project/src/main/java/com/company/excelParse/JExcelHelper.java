package com.company.excelParse;

import jxl.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.IOException;


public class JExcelHelper {
    public static Map<Integer, List<String>> readJExcel(String fileLocation) throws IOException, BiffException {
        Map<Integer, List<String>> data = new HashMap<Integer, List<String>>();

        Workbook workbook = Workbook.getWorkbook(new File(fileLocation));
        Sheet sheet = workbook.getSheet(0);
        int rows = sheet.getRows();
        int columns = sheet.getColumns();

        for (int i = 0; i < rows; i++) {
            data.put(i, new ArrayList<String>());
            for (int j = 0; j < columns; j++) {
                data.get(i).add(sheet.getCell(j, i).getContents());
            }
        }
        return data;
    }
}

