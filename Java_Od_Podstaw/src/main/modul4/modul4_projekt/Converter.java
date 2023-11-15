package main.modul4.modul4_projekt;

import main.modul4.modul4_projekt.files.File;
import main.modul4.modul4_projekt.files.image.JPGImageFile;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {

    public static BigDecimal getDPI(Monitor monitor) {
        BigDecimal resolutionWidth = new BigDecimal(monitor.getResolution().get("width"));
        BigDecimal resolutionHeight = new BigDecimal(monitor.getResolution().get("height"));
        BigDecimal screenWidth = monitor.getWidthAndHeightOfScreenInInches().get("screenWidth");
        BigDecimal screenHeight = monitor.getWidthAndHeightOfScreenInInches().get("screenHeight");
        BigDecimal DPI = resolutionHeight.divide(screenHeight, 2, RoundingMode.HALF_UP)
                .add(resolutionWidth.divide(screenWidth, 2, RoundingMode.HALF_UP))
                .divide(new BigDecimal(2), 2, RoundingMode.HALF_UP);
        return DPI;
    }

    public static BigDecimal getDPI(JPGImageFile file, Monitor monitor) {
        BigDecimal resolutionWidth = new BigDecimal(file.getResolution().get("width"));
        BigDecimal resolutionHeight = new BigDecimal(file.getResolution().get("height"));
        BigDecimal screenWidth = monitor.getWidthAndHeightOfScreenInInches().get("screenWidth");
        BigDecimal screenHeight = monitor.getWidthAndHeightOfScreenInInches().get("screenHeight");
        BigDecimal DPI = resolutionHeight.divide(screenHeight, 2, RoundingMode.HALF_UP)
                .add(resolutionWidth.divide(screenWidth, 2, RoundingMode.HALF_UP))
                .divide(new BigDecimal(2), 2, RoundingMode.HALF_UP);
        return DPI;
    }

    public static File toPDF(File file) {
        String oldFileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        String newFileName = file.getName().replace(oldFileExtension, "pdf");
        file.setName(newFileName);
        System.out.println(file.getName());
        return file;
    }
}
