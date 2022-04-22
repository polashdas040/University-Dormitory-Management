package universitydormitorymanagement;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Home extends javax.swing.JFrame {

    //create MyFunction object  
    MyFunction my = new MyFunction();

    public Home() {
        initComponents();

        //first, run the project by default called three methods
        showLineChart("local_students", "int_students");
        showBarChart("local_students", "int_students");
        showPieChart("local_students", "int_students");
    }

    @SuppressWarnings("deprecation")
    public void showPieChart(String tableName1, String tableName2) {

        DefaultPieDataset barDataset = new DefaultPieDataset();
        JFreeChart piechart;

        if (tableName1.equals("local_students")) {
            barDataset.setValue("Local", new Integer(MyFunction.countLocalStudents(tableName1)));
            barDataset.setValue("International", new Integer(MyFunction.countInternationalStudents(tableName2)));
            barDataset.setValue("Leaved Local", new Integer(MyFunction.countLeavedLocStudents(tableName1)));
            barDataset.setValue("Leaved International", new Integer(MyFunction.countLeavedIntStudents(tableName2)));

            //create chart
            piechart = ChartFactory.createPieChart3D("Students Visualization", barDataset, true, true, false);
        } else {
            barDataset.setValue("Local", new Integer(MyFunction.countLocalEmployees(tableName1)));
            barDataset.setValue("International", new Integer(MyFunction.countInternationalEmployees(tableName2)));
            barDataset.setValue("Not Working Local", new Integer(MyFunction.countLeavedLocEmployees(tableName1)));
            barDataset.setValue("Not Working International", new Integer(MyFunction.countLeavedIntEmployees(tableName2)));

            //create chart
            piechart = ChartFactory.createPieChart3D("Employees Visualization", barDataset, true, true, false);
        }

        PiePlot piePlot = (PiePlot) piechart.getPlot();
        piePlot.setBackgroundPaint(new Color(255, 255, 204));

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelPieChart.removeAll();
        panelPieChart.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart.validate();
    }

    public void showLineChart(String tableName1, String tableName2) {
        //create dataset for the graph
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart linechart;

        if (tableName1.equals("local_students")) {
            dataset.setValue(MyFunction.countLocalStudents(tableName1), "Member", "Loc");
            dataset.setValue(MyFunction.countInternationalStudents(tableName2), "Member", "Int");
            dataset.setValue(MyFunction.countLeavedLocStudents(tableName1), "Member", "LeaLoc");
            dataset.setValue(MyFunction.countLeavedIntStudents(tableName2), "Member", "LeaInt");

            //create chart
            linechart = ChartFactory.createLineChart("Students Visualization", "", "Number of People",
                    dataset, PlotOrientation.VERTICAL, true, true, false);
        } else {
            dataset.setValue(MyFunction.countLocalEmployees(tableName1), "Member", "LeaLoc");
            dataset.setValue(MyFunction.countInternationalEmployees(tableName2), "Member", "Int");
            dataset.setValue(MyFunction.countLeavedLocEmployees(tableName1), "Member", "NotWrokLoc");
            dataset.setValue(MyFunction.countLeavedIntEmployees(tableName2), "Member", "NotWrokInt");

            //create chart
            linechart = ChartFactory.createLineChart("Employees Visualization", "", "Number of People",
                    dataset, PlotOrientation.VERTICAL, true, true, false);
        }

        //create plot object
        CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
        lineCategoryPlot.setBackgroundPaint(new Color(255, 255, 204));

        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(0, 175, 58);
        lineRenderer.setSeriesPaint(0, lineChartColor);

        //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
    }

    public void showBarChart(String tableName1, String tableName2) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart chart;

        if (tableName1.equals("local_students")) {
            dataset.setValue(MyFunction.countLocalStudents(tableName1), "Member", "Loc");
            dataset.setValue(MyFunction.countInternationalStudents(tableName2), "Member", "Int");
            dataset.setValue(MyFunction.countLeavedLocStudents(tableName1), "Member", "LeaLoc");
            dataset.setValue(MyFunction.countLeavedIntStudents(tableName2), "Member", "LeaInt");

            //create chart
            chart = ChartFactory.createBarChart("Students Visualization", "", "Number of People",
                    dataset, PlotOrientation.VERTICAL, true, true, false);
        } else {
            dataset.setValue(MyFunction.countLocalEmployees(tableName1), "Member", "LeaLoc");
            dataset.setValue(MyFunction.countInternationalEmployees(tableName2), "Member", "Int");
            dataset.setValue(MyFunction.countLeavedLocEmployees(tableName1), "Member", "NotWrokLoc");
            dataset.setValue(MyFunction.countLeavedIntEmployees(tableName2), "Member", "NotWrokInt");

            //create chart
            chart = ChartFactory.createBarChart("Employees Visualization", "", "Number of People",
                    dataset, PlotOrientation.VERTICAL, true, true, false);
            
        }

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        categoryPlot.setBackgroundPaint(new Color(255, 255, 204));
        
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(16, 103, 242);
        renderer.setSeriesPaint(0, clr3);

        ChartPanel barpChartPanel = new ChartPanel(chart);
        panelBarChart.removeAll();
        panelBarChart.add(barpChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        welUser = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panelPieChart = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        showAvailableRooms = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        showBookedRooms = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        showLocalStudents = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        showInternationalStudents = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        showLeavedLocStudents = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        showLeavedIntStudents = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        showLocalEmployees = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        showIntEmployees = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        showWorkLocEmployees = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        showWorkIntEmployees = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelLineChart = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();
        stuButton = new javax.swing.JButton();
        empButton = new javax.swing.JButton();
        stuButton1 = new javax.swing.JButton();
        empButton1 = new javax.swing.JButton();
        empButton2 = new javax.swing.JButton();
        stuButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dormitoryicon.png"))); // NOI18N
        jLabel20.setText("University Dormitory Management");

        welUser.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        welUser.setForeground(new java.awt.Color(255, 255, 255));
        welUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        welUser.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 490, Short.MAX_VALUE)
                .addComponent(welUser)
                .addGap(159, 159, 159)
                .addComponent(logout)
                .addGap(415, 415, 415))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(welUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 60));

        jPanel4.setBackground(new java.awt.Color(240, 250, 250));

        panelPieChart.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setForeground(new java.awt.Color(51, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showAvailableRooms.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showAvailableRooms.setText("00");
        jPanel5.add(showAvailableRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel2.setText("Rooms Available");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, -1));

        jPanel6.setBackground(new java.awt.Color(102, 255, 102));
        jPanel6.setForeground(new java.awt.Color(51, 255, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showBookedRooms.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showBookedRooms.setText("00");
        jPanel7.add(showBookedRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel3.setText("Rooms Booked");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel8.setBackground(new java.awt.Color(102, 255, 102));
        jPanel8.setForeground(new java.awt.Color(51, 255, 204));
        jPanel8.setToolTipText("");
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showLocalStudents.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showLocalStudents.setText("00");
        jPanel9.add(showLocalStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel5.setText("Living Local Students");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel10.setBackground(new java.awt.Color(102, 255, 102));
        jPanel10.setForeground(new java.awt.Color(51, 255, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showInternationalStudents.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showInternationalStudents.setText("00");
        jPanel11.add(showInternationalStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel6.setText("Living Int Students");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel12.setBackground(new java.awt.Color(102, 255, 102));
        jPanel12.setForeground(new java.awt.Color(51, 255, 204));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showLeavedLocStudents.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showLeavedLocStudents.setText("00");
        jPanel13.add(showLeavedLocStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel8.setText("Leaved Local Students");
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard.png"))); // NOI18N
        jLabel1.setText(" Dashboard");

        jPanel14.setBackground(new java.awt.Color(102, 255, 102));
        jPanel14.setForeground(new java.awt.Color(51, 255, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showLeavedIntStudents.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showLeavedIntStudents.setText("00");
        jPanel15.add(showLeavedIntStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel10.setText("Leaved Int Students");
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel16.setBackground(new java.awt.Color(102, 255, 102));
        jPanel16.setForeground(new java.awt.Color(51, 255, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 204));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showLocalEmployees.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showLocalEmployees.setText("00");
        jPanel17.add(showLocalEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel12.setText("Working Local Employees");
        jPanel16.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel18.setBackground(new java.awt.Color(102, 255, 102));
        jPanel18.setForeground(new java.awt.Color(51, 255, 204));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(255, 255, 204));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showIntEmployees.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showIntEmployees.setText("00");
        jPanel19.add(showIntEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel14.setText("Working Int Employees");
        jPanel18.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel20.setBackground(new java.awt.Color(102, 255, 102));
        jPanel20.setForeground(new java.awt.Color(51, 255, 204));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(255, 255, 204));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showWorkLocEmployees.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showWorkLocEmployees.setText("00");
        jPanel21.add(showWorkLocEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel16.setText("Not Working Loc Employees");
        jPanel20.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel22.setBackground(new java.awt.Color(102, 255, 102));
        jPanel22.setForeground(new java.awt.Color(51, 255, 204));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(255, 255, 204));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showWorkIntEmployees.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showWorkIntEmployees.setText("00");
        jPanel23.add(showWorkIntEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 80));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel18.setText("Not Working Int Employees");
        jPanel22.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        panelLineChart.setLayout(new java.awt.BorderLayout());

        panelBarChart.setLayout(new java.awt.BorderLayout());

        stuButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        stuButton.setText("Student");
        stuButton.setBorder(null);
        stuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuButtonActionPerformed(evt);
            }
        });

        empButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        empButton.setText("Employee");
        empButton.setBorder(null);
        empButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empButtonActionPerformed(evt);
            }
        });

        stuButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        stuButton1.setText("Student");
        stuButton1.setBorder(null);
        stuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuButton1ActionPerformed(evt);
            }
        });

        empButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        empButton1.setText("Employee");
        empButton1.setBorder(null);
        empButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empButton1ActionPerformed(evt);
            }
        });

        empButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        empButton2.setText("Employee");
        empButton2.setBorder(null);
        empButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empButton2ActionPerformed(evt);
            }
        });

        stuButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        stuButton2.setText("Student");
        stuButton2.setBorder(null);
        stuButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelLineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(455, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(stuButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(empButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(empButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195)
                .addComponent(stuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(empButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(573, 573, 573))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stuButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stuButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 1680, 750));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel24MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room.png"))); // NOI18N
        jLabel4.setText("    Add Room ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 250, 50));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel25MouseExited(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manageroom.png"))); // NOI18N
        jLabel24.setText("    Manage Rooms");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 250, 50));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel26MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel7.setText("    New Student");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel2.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 50));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel27MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manageStudent.png"))); // NOI18N
        jLabel9.setText("    Manage Students");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 50));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel28MouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fees.png"))); // NOI18N
        jLabel11.setText("    Dormitory Fees");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 250, 50));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel29MouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/living.png"))); // NOI18N
        jLabel13.setText("    Living Students");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, 50));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel30MouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leaved.png"))); // NOI18N
        jLabel15.setText("    Leaved Students");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 50));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel31MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel17.setText("    New Employee");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 50));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel32MouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage.png"))); // NOI18N
        jLabel19.setText("    Manage Employees");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 250, 50));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel33MouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salary.png"))); // NOI18N
        jLabel21.setText("    Employees Salary");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 250, 50));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel34MouseExited(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employeeWorking.png"))); // NOI18N
        jLabel29.setText("    Working Employees");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 250, 50));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel35MouseExited(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leaved.png"))); // NOI18N
        jLabel30.setText("    Leaved Employees");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel30MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 250, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 750));

        setBounds(0, 0, 1563, 845);
    }// </editor-fold>//GEN-END:initComponents

    //logout
    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jLabel4.setForeground(new Color(53, 80, 219));
        AddRoom r = new AddRoom();
        r.setVisible(true);
        r.pack();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        jLabel24.setForeground(new Color(53, 80, 219));
        ManageRooms m = new ManageRooms();
        m.setVisible(true);
        m.pack();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        jLabel7.setForeground(new Color(53, 80, 219));
        NewStudent n = new NewStudent();
        n.setVisible(true);
        n.pack();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        jLabel9.setForeground(new Color(53, 80, 219));
        ManageStudents maStu = new ManageStudents();
        maStu.setVisible(true);
        maStu.pack();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jLabel11.setForeground(new Color(53, 80, 219));
        StudentsFees sf = new StudentsFees();
        sf.setVisible(true);
        sf.pack();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jLabel13.setForeground(new Color(53, 80, 219));
        LivingStudents liv = new LivingStudents();
        liv.setVisible(true);
        liv.pack();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        jLabel15.setForeground(new Color(53, 80, 219));
        LeavedStudents lv = new LeavedStudents();
        lv.setVisible(true);
        lv.pack();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        jLabel17.setForeground(new Color(53, 80, 219));
        NewEmployee emp = new NewEmployee();
        emp.setVisible(true);
        emp.pack();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        jLabel19.setForeground(new Color(53, 80, 219));
        ManageEmployees emp = new ManageEmployees();
        emp.setVisible(true);
        emp.pack();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        jLabel21.setForeground(new Color(53, 80, 219));
        EmployeeSalary emp = new EmployeeSalary();
        emp.setVisible(true);
        emp.pack();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        jLabel29.setForeground(new Color(53, 80, 219));
        WorkingEmployees emp = new WorkingEmployees();
        emp.setVisible(true);
        emp.pack();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        jLabel30.setForeground(new Color(53, 80, 219));
        NotWorkingEmployees emp = new NotWorkingEmployees();
        emp.setVisible(true);
        emp.pack();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void stuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuButtonActionPerformed
        showPieChart("local_students", "int_students");
    }//GEN-LAST:event_stuButtonActionPerformed

    private void empButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empButtonActionPerformed
        showPieChart("local_employees", "int_employees");
    }//GEN-LAST:event_empButtonActionPerformed

    private void stuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuButton1ActionPerformed
        showLineChart("local_students", "int_students");
    }//GEN-LAST:event_stuButton1ActionPerformed

    private void empButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empButton1ActionPerformed
        showLineChart("local_employees", "int_employees");
    }//GEN-LAST:event_empButton1ActionPerformed

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jPanel25.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jPanel26.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jPanel27.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jPanel28.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jPanel29.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jPanel30.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jPanel31.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        jPanel32.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        jPanel33.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        jPanel34.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered
        jPanel35.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel30MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jPanel24.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jPanel24.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jPanel25.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jPanel26.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jPanel27.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jPanel28.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jPanel29.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jPanel30.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jPanel31.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        jPanel32.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        jPanel33.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
        jPanel34.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel29MouseExited

    private void jLabel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseExited
        jPanel35.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel30MouseExited

    private void jPanel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseExited
        jPanel35.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel35MouseExited

    private void jPanel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseEntered
        jPanel35.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel35MouseEntered

    private void jPanel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseExited
        jPanel34.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel34MouseExited

    private void jPanel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseEntered
        jPanel34.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel34MouseEntered

    private void jPanel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseExited
        jPanel33.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel33MouseExited

    private void jPanel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseEntered
        jPanel33.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel33MouseEntered

    private void jPanel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseExited
        jPanel32.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel32MouseExited

    private void jPanel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseEntered
        jPanel32.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel32MouseEntered

    private void jPanel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseExited
        jPanel31.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel31MouseExited

    private void jPanel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseEntered
        jPanel31.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel31MouseEntered

    private void jPanel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseExited
        jPanel30.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel30MouseExited

    private void jPanel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseEntered
        jPanel30.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel30MouseEntered

    private void jPanel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseExited
        jPanel29.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel29MouseExited

    private void jPanel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseEntered
        jPanel29.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel29MouseEntered

    private void jPanel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseExited
        jPanel28.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel28MouseExited

    private void jPanel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseEntered
        jPanel28.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel28MouseEntered

    private void jPanel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseExited
        jPanel27.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel27MouseExited

    private void jPanel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseEntered
        jPanel27.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel27MouseEntered

    private void jPanel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseExited
        jPanel26.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel26MouseExited

    private void jPanel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseEntered
        jPanel26.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel26MouseEntered

    private void jPanel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseExited
        jPanel25.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel25MouseExited

    private void jPanel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseEntered
        jPanel25.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel25MouseEntered

    private void jPanel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseExited
        jPanel24.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel24MouseExited

    private void jPanel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseEntered
        jPanel24.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_jPanel24MouseEntered

    private void empButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empButton2ActionPerformed
        showBarChart("local_employees", "int_employees");
    }//GEN-LAST:event_empButton2ActionPerformed

    private void stuButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuButton2ActionPerformed
        showBarChart("local_students", "int_students");
    }//GEN-LAST:event_stuButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empButton;
    private javax.swing.JButton empButton1;
    private javax.swing.JButton empButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel24;
    public static javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel30;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    public static javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelLineChart;
    private javax.swing.JPanel panelPieChart;
    public static javax.swing.JLabel showAvailableRooms;
    public static javax.swing.JLabel showBookedRooms;
    public static javax.swing.JLabel showIntEmployees;
    public static javax.swing.JLabel showInternationalStudents;
    public static javax.swing.JLabel showLeavedIntStudents;
    public static javax.swing.JLabel showLeavedLocStudents;
    public static javax.swing.JLabel showLocalEmployees;
    public static javax.swing.JLabel showLocalStudents;
    public static javax.swing.JLabel showWorkIntEmployees;
    public static javax.swing.JLabel showWorkLocEmployees;
    private javax.swing.JButton stuButton;
    private javax.swing.JButton stuButton1;
    private javax.swing.JButton stuButton2;
    public static javax.swing.JLabel welUser;
    // End of variables declaration//GEN-END:variables
}
