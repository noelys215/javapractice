package dev.lpa;


public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park("Yosemite", "37.8855, -119.5360")
        };
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Delaware",
                        "47.2160,-95.2348", "29.1566, -89.2495", "35.1556, -90.0659"),
                new River("Schuylkill",
                        "45.9239,-111.2348", "38.1566, -90.2495"),
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(new River("Colorado", "25.9239,-11.2348, -68.1566, -154.2495"));
        riverLayer.addElements(new River("Missouri", "15.9239,-71.2348, -98.1566, 54.2495"));
        System.out.println();
        riverLayer.renderLayer();
    }

}
