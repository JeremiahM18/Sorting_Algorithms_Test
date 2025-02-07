/*
* This is where I found the code for the graph
* https://www.tutorialspoint.com/jfreechart/jfreechart_xy_chart.htm
*
 */
import java.awt.Color;
import java.awt.BasicStroke;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.chart.ui.ApplicationFrame;
//import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Graphing extends ApplicationFrame {

    public Graphing(String applicationTitle,String chartTitle) {
        super(applicationTitle);
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                chartTitle, "Elements", "Time",
                createDataset(), PlotOrientation.VERTICAL, true, true, false);

        ChartPanel chartPanel = new ChartPanel(xylineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        final XYPlot xyPlot = xylineChart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);   // Bubble Sort
        renderer.setSeriesPaint(1, Color.BLUE);  // Insertion Sort
        renderer.setSeriesPaint(2, Color.GREEN); // Merge Sort
        renderer.setSeriesPaint(3, Color.YELLOW); // Selection Sort
        renderer.setSeriesPaint(4, Color.DARK_GRAY); // Quick Sort
        renderer.setSeriesPaint(5, Color.BLACK); // Shell Sort

        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));
        renderer.setSeriesStroke(2, new BasicStroke(2.0f));
        renderer.setSeriesStroke(3, new BasicStroke(2.0f));
        renderer.setSeriesStroke(4, new BasicStroke(2.0f));
        renderer.setSeriesStroke(5, new BasicStroke(2.0f));

        xyPlot.setRenderer(renderer);
        setContentPane(chartPanel);
    }

    private XYDataset createDataset() {
        final XYSeriesCollection dataset = new XYSeriesCollection();

        XYSeries bubbleSort = new XYSeries("BubbleSort");
        bubbleSort.add(100,1.8326999999999997E-4);
        bubbleSort.add(500, 5.263850000000001E-4);
        bubbleSort.add(1000, 0.0010959800000000003);
        bubbleSort.add(2000, 0.0038622950000000004);
        bubbleSort.add(5000, 0.028046130000000002);
        bubbleSort.add(10000, 0.17560808500000002);
        bubbleSort.add(20000, 0.8912911400000001);
        bubbleSort.add(75000, 13.381858099999999);
        bubbleSort.add(150000, 70.52835719499998);
        dataset.addSeries(bubbleSort);

        XYSeries insertionSort = new XYSeries("InsertionSort");
        insertionSort.add(100,8.033500000000001E-5);
        insertionSort.add(500, 2.80925E-4);
        insertionSort.add(1000, 5.72465E-4);
        insertionSort.add(2000, 5.6291E-4);
        insertionSort.add(5000, 0.00265156);
        insertionSort.add(10000, 0.00958566);
        insertionSort.add(20000, 0.03367294);
        insertionSort.add(75000, 0.58242154);
        insertionSort.add(150000, 2.3272675400000002);
        dataset.addSeries(insertionSort);

        XYSeries mergeSort = new XYSeries("MergeSort");
        mergeSort.add(100,9.5685E-5);
        mergeSort.add(500, 1.3757E-4);
        mergeSort.add(1000, 2.9334E-4);
        mergeSort.add(2000, 3.6085499999999993E-4);
        mergeSort.add(5000, 7.977199999999998E-4);
        mergeSort.add(10000, 8.537749999999999E-4);
        mergeSort.add(20000, 0.0017855450000000001);
        mergeSort.add(75000, 0.00636512);
        mergeSort.add(150000, 0.010539835);
        dataset.addSeries(mergeSort);

        XYSeries selectionSort = new XYSeries("SelectionSort");
        selectionSort.add(100,1.01545E-4);
        selectionSort.add(500, 3.1509999999999996E-4);
        selectionSort.add(1000, 3.9360999999999997E-4);
        selectionSort.add(2000, 0.0013924700000000003);
        selectionSort.add(5000, 0.009251274999999998);
        selectionSort.add(10000, 0.035544095);
        selectionSort.add(20000, 0.16253586000000003);
        selectionSort.add(75000, 2.5214279100000003);
        selectionSort.add(150000, 12.399193244999998);
        dataset.addSeries(selectionSort);

        XYSeries quickSort = new XYSeries("QuickSort");
        quickSort.add(100,5.1890000000000006E-5);
        quickSort.add(500, 8.4575E-5);
        quickSort.add(1000, 1.2993000000000002E-4);
        quickSort.add(2000, 1.98895E-4);
        quickSort.add(5000, 5.10445E-4);
        quickSort.add(10000, 0.0013994599999999997);
        quickSort.add(20000, 0.0022288649999999996);
        quickSort.add(75000, 0.013764365);
        quickSort.add(150000, 0.02761783499999999);
        dataset.addSeries(quickSort);

        XYSeries shellSort = new XYSeries("ShellSort");
        shellSort.add(100,8.8635E-5);
        shellSort.add(500, 2.6137E-4);
        shellSort.add(1000, 3.0893E-4);
        shellSort.add(2000, 4.8061499999999994E-4);
        shellSort.add(5000, 0.0016543850000000002);
        shellSort.add(10000, 0.003052835);
        shellSort.add(20000, 0.00635753);
        shellSort.add(75000, 0.027357269999999996);
        shellSort.add(150000, 0.056921195000000015);
        dataset.addSeries(shellSort);
        return dataset;

    }

    public static void main(String[] args) {
        Graphing chart = new Graphing(
                "Sorting Algorithm Performance",
                "Sorting Algorithms Performance Comparison");
        chart.pack();
        ///RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);

    }
}
