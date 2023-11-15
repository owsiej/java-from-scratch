package main.modul4.modul4_projekt;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Map;

public class Monitor {
    private final String name;
    private final double diagonal;
    private final String aspectRatio;
    private Map<String, Integer> resolution;


    public Monitor(String name, double diagonal, String aspectRatio) {
        this.name = name;
        this.diagonal = diagonal;
        this.aspectRatio = aspectRatio;
        this.resolution = Resolution.DEFAULT.getResolution();
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getName() {
        return name;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public String setResolution(String newResolution) {
        resolution = Resolution.valueOf(newResolution.toUpperCase()).getResolution();
        return "Your current resolution is " + resolution;
    }

    public Map<String, Integer> getResolution() {
        return resolution;
    }


    public Map<String, BigDecimal> getWidthAndHeightOfScreenInInches() {
        BigDecimal aR = new BigDecimal(aspectRatio.split(":")[0]).divide(new BigDecimal(aspectRatio.split(":")[1]),
                2,
                RoundingMode.HALF_UP);
        BigDecimal screenHeight = new BigDecimal(diagonal).divide(aR.pow(2).add(BigDecimal.valueOf(1)).sqrt(new MathContext(10)),
                2,
                RoundingMode.HALF_UP);
        BigDecimal screenWidth = aR.multiply(screenHeight).setScale(2, RoundingMode.HALF_UP);
        return Map.of("screenWidth", screenHeight, "screenHeight", screenWidth);
    }
}
