package main.modul4.modul4_projekt;

import java.util.Map;

public enum Resolution {
    LOW(Map.of("width", 640, "height", 480)),
    MEDIUM(Map.of("width", 1024, "height", 768)),
    HIGH(Map.of("width", 1920, "height", 1080)),
    ULTRA(Map.of("width", 3840, "height", 2160)),
    DEFAULT(Map.of("width", 1280, "height", 720));

    private final Map<String, Integer> resolution;

    Resolution(Map<String, Integer> resolution) {
        this.resolution = resolution;
    }

    public static void listResolutions() {
        for (Resolution res : Resolution.values()) {
            System.out.println(res + " - " + res.getResolution());
        }

    }

    public Map<String, Integer> getResolution() {
        return resolution;
    }
}
