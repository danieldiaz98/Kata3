/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("outlook.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("dis.ulpgc.es");

        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAMA", histogram);
        histogramDisplay.execute();
    }

}