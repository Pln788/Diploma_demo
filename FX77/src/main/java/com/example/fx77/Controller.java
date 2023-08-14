
package com.example.fx77;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.apache.commons.math3.*;
import org.apache.commons.math3.linear.*;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;


public class Controller implements Initializable {
    @FXML
    private TextField removeChart;
    @FXML
    private TextField yStart;
    @FXML
    private TextField yEnd;
    @FXML
    private TextField maxCard;
    @FXML
    private GridPane gridSpectrum11;
    @FXML
    private TextField xStart11;
    @FXML
    private TextField xStart2;
    @FXML
    private TextField xEnd11;
    @FXML
    private TextField xEnd2;
    @FXML
    private Button card2;
    @FXML
    private TextField maxCard2;
    @FXML
    private TextField maxCard1;
    @FXML
    private Button card1;
    @FXML
    private GridPane gridSpectrum2;
    @FXML
    private GridPane gridSpectrum1;
    @FXML
    private TextField xEnd1;
    @FXML
    private TextField xStart1;
    ArrayList<Double> xCoords = new ArrayList<>();
    ArrayList<Double> yCoords = new ArrayList<>();
    ArrayList<Double> xCoordsField = new ArrayList<>();
    ArrayList<Double> yCoordsField = new ArrayList<>();
    ArrayList<XYChart.Series> charts = new ArrayList<>();
    ArrayList<Double> xCoordsRes = new ArrayList<>();
    ArrayList<Double> yCoordsRes = new ArrayList<>();


    @FXML
    private Label ENC;
    @FXML
    private Label EN;
    @FXML
    private Label from;
    @FXML
    private Label before;
    @FXML
    private Label doLanguage;
    @FXML
    private Label Label1;
    @FXML
    private Label Label2;
    @FXML
    private Label Label3;
    @FXML
    private Label Label4;
    @FXML
    private Label Label5;
    @FXML
    private Label Label6;
    @FXML
    private Label Label7;
    @FXML
    private Label Label8;
    @FXML
    private Label Label9;
    @FXML
    private Label Label10;
    @FXML
    private Label Label11;
    @FXML
    private Label Label12;
    @FXML
    private Label Label13;
    @FXML
    private Label Label14;
    @FXML
    private Label Label15;
    @FXML
    private Label Label16;
    @FXML
    private Label Label17;
    @FXML
    private Label Label18;
    @FXML
    private Label Label19;
    @FXML
    private Label Label20;
    @FXML
    private Label Label21;
    @FXML
    private Label Label22;
    @FXML
    private Label Label23;
    @FXML
    private Label Label24;
    @FXML
    private Label Label25;
    @FXML
    private Label Label26;
    @FXML
    private Label Label27;
    @FXML
    private Label Label28;
    @FXML
    private Label Label29;
    @FXML
    private Label Label30;
    @FXML
    private Label Label31;
    @FXML
    private Label Label32;
    @FXML
    private Label Label33;
    @FXML
    private Label Label34;
    @FXML
    private Label Label35;
    @FXML
    private Label Label36;
    @FXML
    private Label Label37;
    @FXML
    private Label Label38;
    @FXML
    private Label Label39;
    @FXML
    private Label Label40;
    @FXML
    private Label Label41;
    @FXML
    private Label Label42;
    @FXML
    private Label Label43;
    @FXML
    private Label Label44;
    @FXML
    private Label Label45;
    @FXML
    private Label Label46;
    @FXML
    private Label Label47;
    @FXML
    private Label Label48;
    @FXML
    private Label Label49;
    @FXML
    private Label Label50;
    @FXML
    private Label Label51;
    @FXML
    private Label Label52;
    @FXML
    private Label Label53;
    @FXML
    private Label Label54;
    @FXML
    private Label Label55;
    @FXML
    private Label Label56;
    @FXML
    private Label Label57;
    @FXML
    private Label Label58;
    @FXML
    private Label Label59;
    @FXML
    private Label Label60;
    @FXML
    private Label Label61;
    @FXML
    private Label Label62;
    @FXML
    private Label Label63;
    @FXML
    private Label Label64;
    @FXML
    private Label Label65;
    @FXML
    private Label Label66;
    @FXML
    private Label Label67;
    @FXML
    private Label Label68;
    @FXML
    private Label Label69;
    @FXML
    private Label Label70;
    @FXML
    private Label Label71;
    @FXML
    private Label Label72;
    @FXML
    private Label Label73;
    @FXML
    private Label Label74;
    @FXML
    private Label Label75;
    @FXML
    private Label Label76;
    @FXML
    private Label Label77;
    @FXML
    private Label Label78;
    @FXML
    private Label Label79;
    @FXML
    private Label Label80;
    @FXML
    private Label Label81;
    @FXML
    private Label Label82;
    @FXML
    private Label Label83;
    @FXML
    private Label Label84;
    @FXML
    private Label Label85;
    @FXML
    private Label Label86;
    @FXML
    private Label Label87;
    @FXML
    private Label Label88;
    @FXML
    private Label Label89;
    @FXML
    private Label Label90;
    @FXML
    private Label Label91;
    @FXML
    private Label Label92;
    @FXML
    private Label Label93;
    @FXML
    private Label Label94;
    @FXML
    private Label Label95;
    @FXML
    private Label Label96;
    @FXML
    private Label Label97;
    @FXML
    private Label Label98;
    @FXML
    private Label Label99;
    @FXML
    private Label Label100;
    @FXML
    private Label Label011;
    @FXML
    private Label Label021;
    @FXML
    private Label Label031;
    @FXML
    private Label Label041;
    @FXML
    private Label Label051;
    @FXML
    private Label Label061;
    @FXML
    private Label Label071;
    @FXML
    private Label Label081;
    @FXML
    private Label Label091;
    @FXML
    private Label Label101;
    @FXML
    private Label Label111;
    @FXML
    private Label Label121;
    @FXML
    private Label Label131;
    @FXML
    private Label Label141;
    @FXML
    private Label Label151;
    @FXML
    private Label Label161;
    @FXML
    private Label Label171;
    @FXML
    private Label Label181;
    @FXML
    private Label Label191;
    @FXML
    private Label Label201;
    @FXML
    private Label Label211;
    @FXML
    private Label Label221;
    @FXML
    private Label Label231;
    @FXML
    private Label Label241;
    @FXML
    private Label Label251;
    @FXML
    private Label Label261;
    @FXML
    private Label Label271;
    @FXML
    private Label Label281;
    @FXML
    private Label Label291;
    @FXML
    private Label Label301;
    @FXML
    private Label Label311;
    @FXML
    private Label Label321;
    @FXML
    private Label Label331;
    @FXML
    private Label Label341;
    @FXML
    private Label Label351;
    @FXML
    private Label Label361;
    @FXML
    private Label Label371;
    @FXML
    private Label Label381;
    @FXML
    private Label Label391;
    @FXML
    private Label Label401;
    @FXML
    private Label Label411;
    @FXML
    private Label Label421;
    @FXML
    private Label Label431;
    @FXML
    private Label Label441;
    @FXML
    private Label Label451;
    @FXML
    private Label Label461;
    @FXML
    private Label Label471;
    @FXML
    private Label Label481;
    @FXML
    private Label Label491;
    @FXML
    private Label Label501;
    @FXML
    private Label Label511;
    @FXML
    private Label Label521;
    @FXML
    private Label Label531;
    @FXML
    private Label Label541;
    @FXML
    private Label Label551;
    @FXML
    private Label Label561;
    @FXML
    private Label Label571;
    @FXML
    private Label Label581;
    @FXML
    private Label Label591;
    @FXML
    private Label Label601;
    @FXML
    private Label Label611;
    @FXML
    private Label Label621;
    @FXML
    private Label Label631;
    @FXML
    private Label Label641;
    @FXML
    private Label Label651;
    @FXML
    private Label Label661;
    @FXML
    private Label Label671;
    @FXML
    private Label Label681;
    @FXML
    private Label Label691;
    @FXML
    private Label Label701;
    @FXML
    private Label Label711;
    @FXML
    private Label Label721;
    @FXML
    private Label Label731;
    @FXML
    private Label Label741;
    @FXML
    private Label Label751;
    @FXML
    private Label Label761;
    @FXML
    private Label Label771;
    @FXML
    private Label Label781;
    @FXML
    private Label Label791;
    @FXML
    private Label Label801;
    @FXML
    private Label Label811;
    @FXML
    private Label Label821;
    @FXML
    private Label Label831;
    @FXML
    private Label Label841;
    @FXML
    private Label Label851;
    @FXML
    private Label Label861;
    @FXML
    private Label Label871;
    @FXML
    private Label Label881;
    @FXML
    private Label Label891;
    @FXML
    private Label Label901;
    @FXML
    private Label Label911;
    @FXML
    private Label Label921;
    @FXML
    private Label Label931;
    @FXML
    private Label Label941;
    @FXML
    private Label Label951;
    @FXML
    private Label Label961;
    @FXML
    private Label Label971;
    @FXML
    private Label Label981;
    @FXML
    private Label Label991;
    @FXML
    private Label Label1001;
    @FXML
    private Label Label012;
    @FXML
    private Label Label022;
    @FXML
    private Label Label032;
    @FXML
    private Label Label042;
    @FXML
    private Label Label052;
    @FXML
    private Label Label062;
    @FXML
    private Label Label072;
    @FXML
    private Label Label082;
    @FXML
    private Label Label092;
    @FXML
    private Label Label102;
    @FXML
    private Label Label112;
    @FXML
    private Label Label122;
    @FXML
    private Label Label132;
    @FXML
    private Label Label142;
    @FXML
    private Label Label152;
    @FXML
    private Label Label162;
    @FXML
    private Label Label172;
    @FXML
    private Label Label182;
    @FXML
    private Label Label192;
    @FXML
    private Label Label202;
    @FXML
    private Label Label212;
    @FXML
    private Label Label222;
    @FXML
    private Label Label232;
    @FXML
    private Label Label242;
    @FXML
    private Label Label252;
    @FXML
    private Label Label262;
    @FXML
    private Label Label272;
    @FXML
    private Label Label282;
    @FXML
    private Label Label292;
    @FXML
    private Label Label302;
    @FXML
    private Label Label312;
    @FXML
    private Label Label322;
    @FXML
    private Label Label332;
    @FXML
    private Label Label342;
    @FXML
    private Label Label352;
    @FXML
    private Label Label362;
    @FXML
    private Label Label372;
    @FXML
    private Label Label382;
    @FXML
    private Label Label392;
    @FXML
    private Label Label402;
    @FXML
    private Label Label412;
    @FXML
    private Label Label422;
    @FXML
    private Label Label432;
    @FXML
    private Label Label442;
    @FXML
    private Label Label452;
    @FXML
    private Label Label462;
    @FXML
    private Label Label472;
    @FXML
    private Label Label482;
    @FXML
    private Label Label492;
    @FXML
    private Label Label502;
    @FXML
    private Label Label512;
    @FXML
    private Label Label522;
    @FXML
    private Label Label532;
    @FXML
    private Label Label542;
    @FXML
    private Label Label552;
    @FXML
    private Label Label562;
    @FXML
    private Label Label572;
    @FXML
    private Label Label582;
    @FXML
    private Label Label592;
    @FXML
    private Label Label602;
    @FXML
    private Label Label612;
    @FXML
    private Label Label622;
    @FXML
    private Label Label632;
    @FXML
    private Label Label642;
    @FXML
    private Label Label652;
    @FXML
    private Label Label662;
    @FXML
    private Label Label672;
    @FXML
    private Label Label682;
    @FXML
    private Label Label692;
    @FXML
    private Label Label702;
    @FXML
    private Label Label712;
    @FXML
    private Label Label722;
    @FXML
    private Label Label732;
    @FXML
    private Label Label742;
    @FXML
    private Label Label752;
    @FXML
    private Label Label762;
    @FXML
    private Label Label772;
    @FXML
    private Label Label782;
    @FXML
    private Label Label792;
    @FXML
    private Label Label802;
    @FXML
    private Label Label812;
    @FXML
    private Label Label822;
    @FXML
    private Label Label832;
    @FXML
    private Label Label842;
    @FXML
    private Label Label852;
    @FXML
    private Label Label862;
    @FXML
    private Label Label872;
    @FXML
    private Label Label882;
    @FXML
    private Label Label892;
    @FXML
    private Label Label902;
    @FXML
    private Label Label912;
    @FXML
    private Label Label922;
    @FXML
    private Label Label932;
    @FXML
    private Label Label942;
    @FXML
    private Label Label952;
    @FXML
    private Label Label962;
    @FXML
    private Label Label972;
    @FXML
    private Label Label982;
    @FXML
    private Label Label992;
    @FXML
    private Label Label1002;



    @FXML
    private GridPane gridSpectrum;
    @FXML
    private Button card;
    @FXML
    private TextField xStart;
    @FXML
    private TextField xEnd;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private MenuItem AllCharts;
    @FXML
    private TextField numberOfChart;
    @FXML
    private MenuItem field;
    @FXML
    private MenuItem smoothing;
    @FXML
    private MenuItem buttonBL;
    @FXML
    private Button language;
    @FXML
    private LineChart<Double,Double> chart;
    @FXML
    private NumberAxis Count;
    @FXML
    private NumberAxis xAxis;
    int mi =0;
    Double startFirstCard;
    Double endFirstCard;
    Double startFirstCard1;
    Double endFirstCard1;
    Double startFirstCard2;
    Double endFirstCard2;

    Double newmax1;
    Double newmax2;
    Label[] labels1=new Label[]{Label1,Label2,Label3,Label4,Label5,Label6,Label7,Label8,Label9,Label10,Label11,Label12,Label13,Label14,Label15,Label16,Label17,Label18,Label19,Label20,
            Label21,Label22,Label23,Label24,Label25,Label26,Label27,Label28,Label29,Label30,Label31,Label32,Label33,Label34,Label35,Label36,Label37,Label38,Label39,Label40,
            Label41,Label42,Label43,Label44,Label45,Label46,Label47,Label48,Label49,Label50,Label51,Label52,Label53,Label54,Label55,Label56,Label57,Label58,Label59,Label60,
            Label61,Label62,Label63,Label64,Label65,Label66,Label67,Label68,Label69,Label70,Label71,Label72,Label73,Label74,Label75,Label76,Label77,Label78,Label79,Label80,
            Label81,Label82,Label83,Label84,Label85,Label86,Label87,Label88,Label89,Label90,
            Label91,Label92,Label93,Label94,Label95,Label96,Label97,Label98,Label99,Label100};
    Label[] labels2=new Label[]{Label011,Label021,Label031,Label041,Label051,Label061,Label071,Label081,Label091,Label101,Label111,Label121,Label131,Label141,Label151,Label161,Label171,Label181,Label191,Label201,
            Label211,Label221,Label231,Label241,Label251,Label261,Label271,Label281,Label291,Label301,Label311,Label321,Label331,Label341,Label351,Label361,Label371,Label381,Label391,Label401,
            Label411,Label421,Label431,Label441,Label451,Label461,Label471,Label481,Label491,Label501,Label511,Label521,Label531,Label541,Label551,Label561,Label571,Label581,Label591,Label601,
            Label611,Label621,Label631,Label641,Label651,Label661,Label671,Label681,Label691,Label701,Label711,Label721,Label731,Label741,Label751,Label761,Label771,Label781,Label791,Label801,
            Label811,Label821,Label831,Label841,Label851,Label861,Label871,Label881,Label891,Label901,
            Label911,Label921,Label931,Label941,Label951,Label961,Label971,Label981,Label991,Label1001};
    Label[] labels3=new Label[]{Label012,Label022,Label032,Label042,Label052,Label062,Label072,Label082,Label092,Label102,Label112,Label122,Label132,Label142,Label152,Label162,Label172,Label182,Label192,Label202,
            Label212,Label222,Label232,Label242,Label252,Label262,Label272,Label282,Label292,Label302,Label312,Label322,Label332,Label342,Label352,Label362,Label372,Label382,Label392,Label402,
            Label412,Label422,Label432,Label442,Label452,Label462,Label472,Label482,Label492,Label502,Label512,Label522,Label532,Label542,Label552,Label562,Label572,Label582,Label592,Label602,
            Label612,Label622,Label632,Label642,Label652,Label662,Label672,Label682,Label692,Label702,Label712,Label722,Label732,Label742,Label752,Label762,Label772,Label782,Label792,Label802,
            Label812,Label822,Label832,Label842,Label852,Label862,Label872,Label882,Label892,Label902,
            Label912,Label922,Label932,Label942,Label952,Label962,Label972,Label982,Label992,Label1002};
    public void newMethod(){
        System.out.println("Тут создается новый файлик, удобно, стильно, молодежно");
    }
    public void removeChart(){
        System.out.println("pineapple");
    }

    public void doBorders(int start, int end){

       xAxis.setAutoRanging(false);
       xAxis.setLowerBound(start);
       xAxis.setUpperBound(end);

    }
    public void pressed2(MouseEvent event2,Label label) {
        try {
            ArrayList<Double> yMaxCoords = new ArrayList<>();
            startFirstCard1= Double.parseDouble(xStart11.getText());
            endFirstCard1= Double.parseDouble(xEnd11.getText());
            ArrayList<Double> xCoordsField = new ArrayList<>();
            ArrayList<Double> yCoordsField = new ArrayList<>();
            int h =0;
            for (int c=0;c<100;c++) {
                for (int i = h; i <1024+h; i++) {
                    if (xCoords.get(i)>startFirstCard1&&xCoords.get(i)<endFirstCard1){
                        xCoordsField.add(xCoords.get(i));
                    }
                }
                h+=1024;

            }

            int b =0;
            for (int c=0;c<100;c++) {
                for (int i = b; i <1024+b; i++) {
                    if (xCoords.get(i)>startFirstCard1&&xCoords.get(i)<endFirstCard1){
                        yCoordsField.add(yCoords.get(i));
                    }
                }
                b+=1024;

            }
            double max = yCoordsField.get(0);
            int z = 0;
            for (int c = 0; c < 100; c++) {
                for (int i = z; i < yCoordsField.size()/100 + z; i++) {
                    if (yCoordsField.get(i) > max)
                        max = yCoordsField.get(i);

                }
                yMaxCoords.add(max);
                max = 0;
                z +=yCoordsField.size()/100 ;
            }
            double sum = 0;
            for (int i = 0; i < yMaxCoords.size(); i++) {
                sum += yMaxCoords.get(i);
            }
            double min1 = yMaxCoords.get(0);
            double max1 = yMaxCoords.get(0);

            for (Double i : yMaxCoords) {
                if (i < min1)
                    min1 = i;
                if (i > max1)
                    max1 = i;
            }
            Label[] labels2=new Label[]{Label011,Label021,Label031,Label041,Label051,Label061,Label071,Label081,Label091,Label101,Label111,Label121,Label131,Label141,Label151,Label161,Label171,Label181,Label191,Label201,
                    Label211,Label221,Label231,Label241,Label251,Label261,Label271,Label281,Label291,Label301,Label311,Label321,Label331,Label341,Label351,Label361,Label371,Label381,Label391,Label401,
                    Label411,Label421,Label431,Label441,Label451,Label461,Label471,Label481,Label491,Label501,Label511,Label521,Label531,Label541,Label551,Label561,Label571,Label581,Label591,Label601,
                    Label611,Label621,Label631,Label641,Label651,Label661,Label671,Label681,Label691,Label701,Label711,Label721,Label731,Label741,Label751,Label761,Label771,Label781,Label791,Label801,
                    Label811,Label821,Label831,Label841,Label851,Label861,Label871,Label881,Label891,Label901,
                    Label911,Label921,Label931,Label941,Label951,Label961,Label971,Label981,Label991,Label1001};


            for (int i = 0; i < labels2.length; i++) {
                labels2[i].setText(yMaxCoords.get(i).toString());

            }
            for (int i = 0; i < labels2.length; i++) {
                if (labels2[i].getText().equals(label.getText())) {
                    mi = i;
                }
            }
            int hah =0;
            for (int c=0;c<100;c++) {
                XYChart.Series series = new XYChart.Series();
                for (int i = hah; i <1024+hah; i++) {
                    series.getData().add(new XYChart.Data(xCoords.get(i), yCoords.get(i)));
                }
                hah+=1024;
                charts.add(c, series);
                series.setName("График № "+(c+1));


            }


            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(charts.get(mi));

        } catch (NumberFormatException e) {
            System.out.println("Введите число");
        } catch (Exception e) {
            System.out.println(":3");
        }
    }
    int number;

    public void pressed3(MouseEvent event3,Label label) {
        try {
            ArrayList<Double> yMaxCoords = new ArrayList<>();
            startFirstCard2= Double.parseDouble(xStart2.getText());
            endFirstCard2= Double.parseDouble(xEnd2.getText());
            ArrayList<Double> xCoordsField = new ArrayList<>();
            ArrayList<Double> yCoordsField = new ArrayList<>();
            int h =0;
            for (int c=0;c<100;c++) {
                for (int i = h; i <1024+h; i++) {
                    if (xCoords.get(i)>startFirstCard2&&xCoords.get(i)<endFirstCard2){
                        xCoordsField.add(xCoords.get(i));
                    }
                }
                h+=1024;

            }

            int b =0;
            for (int c=0;c<100;c++) {
                for (int i = b; i <1024+b; i++) {
                    if (xCoords.get(i)>startFirstCard2&&xCoords.get(i)<endFirstCard2){
                        yCoordsField.add(yCoords.get(i));
                    }
                }
                b+=1024;

            }
            double max = yCoordsField.get(0);
            int z = 0;
            for (int c = 0; c < 100; c++) {
                for (int i = z; i < yCoordsField.size()/100 + z; i++) {
                    if (yCoordsField.get(i) > max)
                        max = yCoordsField.get(i);

                }
                yMaxCoords.add(max);
                max = 0;
                z +=yCoordsField.size()/100 ;
            }
            double sum = 0;
            for (int i = 0; i < yMaxCoords.size(); i++) {
                sum += yMaxCoords.get(i);
            }
            double min1 = yMaxCoords.get(0);
            double max1 = yMaxCoords.get(0);

            for (Double i : yMaxCoords) {
                if (i < min1)
                    min1 = i;
                if (i > max1)
                    max1 = i;
            }
            Label[] labels3=new Label[]{Label012,Label022,Label032,Label042,Label052,Label062,Label072,Label082,Label092,Label102,Label112,Label122,Label132,Label142,Label152,Label162,Label172,Label182,Label192,Label202,
                    Label212,Label222,Label232,Label242,Label252,Label262,Label272,Label282,Label292,Label302,Label312,Label322,Label332,Label342,Label352,Label362,Label372,Label382,Label392,Label402,
                    Label412,Label422,Label432,Label442,Label452,Label462,Label472,Label482,Label492,Label502,Label512,Label522,Label532,Label542,Label552,Label562,Label572,Label582,Label592,Label602,
                    Label612,Label622,Label632,Label642,Label652,Label662,Label672,Label682,Label692,Label702,Label712,Label722,Label732,Label742,Label752,Label762,Label772,Label782,Label792,Label802,
                    Label812,Label822,Label832,Label842,Label852,Label862,Label872,Label882,Label892,Label902,
                    Label912,Label922,Label932,Label942,Label952,Label962,Label972,Label982,Label992,Label1002};


            for (int i = 0; i < labels3.length; i++) {
                labels3[i].setText(yMaxCoords.get(i).toString());

            }
            for (int i = 0; i < labels3.length; i++) {
                if (labels3[i].getText().equals(label.getText())) {
                    mi = i;
                }
            }
            int hah =0;
            for (int c=0;c<100;c++) {
                XYChart.Series series = new XYChart.Series();
                for (int i = hah; i <1024+hah; i++) {
                    series.getData().add(new XYChart.Data(xCoords.get(i), yCoords.get(i)));
                }
                hah+=1024;
                charts.add(c, series);
                series.setName("График № "+(c+1));


            }


            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(charts.get(mi));


        } catch (NumberFormatException e) {
            System.out.println("Введите число");
        } catch (Exception e) {
            System.out.println(":3");
        }
    }
    public void pressed1(MouseEvent event1,Label label) {
        try {
            ArrayList<Double> yMaxCoords = new ArrayList<>();
            startFirstCard= Double.parseDouble(xStart1.getText());
            endFirstCard= Double.parseDouble(xEnd1.getText());
            ArrayList<Double> xCoordsField = new ArrayList<>();
            ArrayList<Double> yCoordsField = new ArrayList<>();
            int h =0;
            for (int c=0;c<100;c++) {
                for (int i = h; i <1024+h; i++) {
                    if (xCoords.get(i)>startFirstCard&&xCoords.get(i)<endFirstCard){
                        xCoordsField.add(xCoords.get(i));
                    }
                }
                h+=1024;

            }

            int b =0;
            for (int c=0;c<100;c++) {
                for (int i = b; i <1024+b; i++) {
                    if (xCoords.get(i)>startFirstCard&&xCoords.get(i)<endFirstCard){
                        yCoordsField.add(yCoords.get(i));
                    }
                }
                b+=1024;

            }
            double max = yCoordsField.get(0);
            int z = 0;
            for (int c = 0; c < 100; c++) {
                for (int i = z; i < yCoordsField.size()/100 + z; i++) {
                    if (yCoordsField.get(i) > max)
                        max = yCoordsField.get(i);

                }
                yMaxCoords.add(max);
                max = 0;
                z +=yCoordsField.size()/100 ;
            }
            double sum = 0;
            for (int i = 0; i < yMaxCoords.size(); i++) {
                sum += yMaxCoords.get(i);
            }
            double min1 = yMaxCoords.get(0);
            double max1 = yMaxCoords.get(0);

            for (Double i : yMaxCoords) {
                if (i < min1)
                    min1 = i;
                if (i > max1)
                    max1 = i;
            }

            Label[] labels1 = new Label[]{Label1, Label2, Label3, Label4, Label5, Label6, Label7, Label8, Label9, Label10, Label11, Label12, Label13, Label14, Label15, Label16, Label17, Label18, Label19, Label20,
                    Label21, Label22, Label23, Label24, Label25, Label26, Label27, Label28, Label29, Label30, Label31, Label32, Label33, Label34, Label35, Label36, Label37, Label38, Label39, Label40,
                    Label41, Label42, Label43, Label44, Label45, Label46, Label47, Label48, Label49, Label50, Label51, Label52, Label53, Label54, Label55, Label56, Label57, Label58, Label59, Label60,
                    Label61, Label62, Label63, Label64, Label65, Label66, Label67, Label68, Label69, Label70, Label71, Label72, Label73, Label74, Label75, Label76, Label77, Label78, Label79, Label80,
                    Label81, Label82, Label83, Label84, Label85, Label86, Label87, Label88, Label89, Label90,
                    Label91, Label92, Label93, Label94, Label95, Label96, Label97, Label98, Label99, Label100};
            for (int i = 0; i < labels1.length; i++) {
                labels1[i].setText(yMaxCoords.get(i).toString());

            }
            for (int i = 0; i < labels1.length; i++) {
                if (labels1[i].getText().equals(label.getText())) {
                    mi = i;
                }
            }
            int hah =0;
            for (int c=0;c<100;c++) {
                XYChart.Series series = new XYChart.Series();
                for (int i = hah; i <1024+hah; i++) {
                    series.getData().add(new XYChart.Data(xCoords.get(i), yCoords.get(i)));
                }
                hah+=1024;
                charts.add(c, series);
                series.setName("График № "+(c+1));


            }


            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(charts.get(mi));

        } catch (NumberFormatException e) {
            System.out.println("Введите число");
        } catch (Exception e) {
            System.out.println(":3");
        }
    }

    @FXML
    private void createBaseLine(ActionEvent event) {
        try {
            ArrayList<XYChart.Series> charts = new ArrayList<>();
            number = Integer.parseInt(numberOfChart.getText());
            int L = 1024;
            int start;
            int end;
            int numGraph = number - 1;
            ArrayList<Double> ystillvalue = new ArrayList<>();
            for (int i = numGraph * 1024; i < (numGraph + 1) * 1024; i++) {
                ystillvalue.add(yCoords.get(i));
            }
            ArrayList<Double> cal;
            cal = calculate(ystillvalue, L);
            double number = 0;
            for (int i = 0; i < L; i++) {
                number = ystillvalue.get(i) - cal.get(i);
                if (number < 0) {
                    number = 0;
                    yCoordsRes.add(number);
                    xCoordsRes.add(xCoords.get(i));
                } else {
                    yCoordsRes.add(number);
                    xCoordsRes.add(xCoords.get(i));
                }
            }
            XYChart.Series series = new XYChart.Series();
            for (int i = 0; i < 1024; i++) {
                series.getData().add(new XYChart.Data(xCoordsRes.get(i), yCoordsRes.get(i)));

                charts.add(series);
                series.setName("График № " + (numGraph + 1));
            }

            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(charts.get((numGraph)));


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

        @FXML
    private void doSmoothing(ActionEvent event) {
        try {
            number=Integer.parseInt(numberOfChart.getText());
            int L = 1024;

            ArrayList<Double> ystillvalue = new ArrayList<>();
            for (int i = (number-1) * 1024; i < (number) * 1024; i++) {
                ystillvalue.add(yCoords.get(i));
            }

            double[] b = new double[L];
            for (int i = 0; i < L; i++) {
                b[i] = ystillvalue.get(i);
            }

            double[] coeffs = SGFilter.computeSGCoefficients(10,
                    4,
                    2);
            SGFilter sgFilter = new SGFilter(10, 4);

            double[] smooth = sgFilter.smooth(b,
                    coeffs);
            ArrayList<Double> yCoords1 = new ArrayList<>();
            yCoords1.add(ystillvalue.get(0));
            for (int i = 0; i <smooth.length; i++) {
                if (i==0){
                    yCoords1.add(ystillvalue.get(i));
                }
                yCoords1.add(smooth[i]);
                if (i==smooth.length){
                    yCoords1.add(ystillvalue.get(i));
                }
            }

            XYChart.Series series = new XYChart.Series();
            for (int i = 0; i <yCoords1.size(); i++) {
                series.getData().add(new XYChart.Data(xCoords.get(i), yCoords1.get(i)));
            }
            charts.add(series);
            series.setName("График № "+(number));
            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(series);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void viewSpectr(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fullSpectrum.fxml"));
            Parent root4 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root4));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void chooseNumberOfChart(ActionEvent event) {
        try {
            number=Integer.parseInt(numberOfChart.getText());
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader("C:\\Users\\missi\\IdeaProjects\\nw.txt")); //"C:\\Users\\missi\\IdeaProjects\\new.txt"
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


            int character = 0;
            StringBuilder sb = new StringBuilder();
            while (true) {
                try {
                    if (!((character = br.read()) != -1)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                char ch = (char) character;
                if (character == ']') {
                    break;
                }
                sb.append(ch);

            }
            String s = sb.toString().substring(1);
            int size = s.length();
            String[] s1 = s.split(",");
            for (String s2 : s1) {
                String[] temp2 = s2.split(" ");
                for (String s3 : temp2) {
                    try {
                        xCoords.add(Double.parseDouble(s3));
                    } catch (NumberFormatException ignored) {
                    }
                }
            }
            int charactery = 0;
            StringBuilder sby = new StringBuilder();
            while (true) {
                try {
                    if (!((charactery = br.read()) != -1)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                char chy = (char) charactery;
                sby.append(chy);
            }
// sby.substring(7745);
            String str = sby.toString();
            int index = str.indexOf('[');
            int index2 = str.indexOf(']');
            String temp = sby.substring(index + 1, index2);
            String[] s1y = temp.split(",");
            for (String s2y : s1y) {
                String[] temp2y = s2y.split(" ");
                for (String s3y : temp2y) {
                    try {
                        yCoords.add(Double.parseDouble(s3y));
                    } catch (NumberFormatException ignored) {
                    }
                }


            }
            for (int j = 0; j < yCoords.size() - 1024; j++) {
                xCoords.add(xCoords.get(j));
            }
            int h =0;
            for (int c=0;c<100;c++) {
                XYChart.Series series = new XYChart.Series();
                for (int i = h; i <1024+h; i++) {
                    series.getData().add(new XYChart.Data(xCoords.get(i), yCoords.get(i)));
                }
                h+=1024;
                charts.add(c, series);
                series.setName("График № "+(c+1));
            }

            chart.getData().clear();
            chart.setCreateSymbols(false);
            chart.getData().add(charts.get(number-1));

            int starty=Integer.parseInt(yStart.getText());;
            int endy=Integer.parseInt(yEnd.getText());

            int start = Integer.parseInt(xStart.getText());
            int end = Integer.parseInt(xEnd.getText());

            if((start!=0&&end!=0)&(starty==0&&endy==0)) {
                xAxis.setAutoRanging(false);
                xAxis.setLowerBound(start);
                xAxis.setUpperBound(end);
            }else if ((start!=0&&end!=0)&(starty!=0&&endy!=0)){
                Count.setAutoRanging(false);
                xAxis.setAutoRanging(false);
                xAxis.setLowerBound(start);
                xAxis.setUpperBound(end);
                Count.setLowerBound(starty);
                Count.setUpperBound(endy);
            }
            else {
                xAxis.setAutoRanging(true);
                Count.setAutoRanging(true);

            }



        }
        catch (NumberFormatException e){
            System.out.println("Введите число");
        }
        catch (Exception e) {
            System.out.println(":3");
        }
    }
    @FXML
    private void chooseField(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("field.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root2));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Double> calculate(ArrayList<Double> b1, int L) {
        double[][] matrixA = new double[L][L];
        double[][] matrixB1 = new double[matrixA.length - 1][L];
        double[][] matrixB = new double[matrixA.length - 2][L];
        double[][] matrixC1 = new double[matrixA.length - 1][L];
        double[][] matrixC = new double[matrixA.length - 2][L];
        double[][] matrixD2 = new double[L - 1][L];
        double[][] matrixD = new double[L - 2][L];
        double[][] TmatrixD = new double[matrixD[0].length][matrixD.length];
        double[] onematrix = new double[L];
        double[][] onediag = new double[L][L];
        double[] result = new double[L];
        ArrayList<Double> resultL = new ArrayList<>();
        double[] b = new double[L];
        for (int i = 0; i < L; i++) {
            b[i] = b1.get(i);
        }

        //FULL0or1
        // эта штука делает матрицу L на L  единичками по диагонали
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < L; j++) {
                if (i != j) {
                    matrixA[i][j] = 0;
                }
                if (i == j) {
                    matrixA[i][j] = 1;
                }
            }
        }

        //MASSIVEDONTFRST
        // тут из этой матрицы удаляется первая строка
        for (int i = 0; i < matrixA.length; i++) {
            if (i != 0) {
                for (int j = 0; j < matrixA.length; j++) {
                    matrixB1[i - 1][j] = matrixA[i][j];
                }
            } else {
            }
        }

        //MASSIVEDONTLST
        // тут удаляется последняя, все это по факту сейчас только подготовка к обработке,
        // необходимо создать разряженную матрицу
        for (int i = 0; i < matrixA.length - 1; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixC1[i][j] = matrixA[i][j];
            }
        }

        //MATRIXSUBSTRUCT
        // cейчас мы вычитаем из матрицы без первой строки матрицу без второй строки,
        // так единички и нолики распределются необходимым нам образом
        for (int i = 0; i < matrixB1.length; i++) {
            for (int j = 0; j < matrixB1[0].length; j++) {
                matrixD2[i][j] = matrixB1[i][j] - matrixC1[i][j];
            }
        }
        matrixA = matrixD2;

        //MASSIVEDONTFRST2
        //Еще раз убираем первую строку, нужно еще раз их перемешать
        for (int i = 0; i < matrixA.length; i++) {
            if (i != 0) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixB[i - 1][j] = matrixA[i][j];
                }
            } else {
            }
        }

        //MASSIVEDONTLST2
        //нужно снова убрать последнюю
        for (int i = 0; i < matrixA.length - 1; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                matrixC[i][j] = matrixA[i][j];
            }
        }

        //MATRIXSUBSTRUCT2
        //снова вычитаем
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                matrixD[i][j] = matrixB[i][j] - matrixC[i][j];
            }
        }

        //TRANSPORT
        //Теперь транспонируем ее, что бы потом умножить на не транспонированную по приколу
        for (int i = 0; i < matrixD.length; i++) {
            for (int j = 0; j < matrixD[0].length; j++) {
                TmatrixD[j][i] = matrixD[i][j];
            }
        }
        //ONEMASSIVEGLIN
        //создаем массив из единичек, потом необходимо будет перезаписывать сюда цифры в цикле и использовать,
        // каждый проход цикла сюда перезаписываются штуки, это будет умножаться на наш массив и ему будет круто
        for (int i = 0; i < onematrix.length; i++) {
            onematrix[i] = 1;
        }

        //Необходимое нам количество итераций 10, такое же значение было и в питоне
        for (int PIIBHILISM = 0; PIIBHILISM < 2; PIIBHILISM++) {
            int k = 0;

            //Наш массив, который из единичек и куда будут записывать значения по прохождению цикла,
            // в этом месте располагается по диагонали новой матрицы, так будет происходить 10 раз
            //но вместо единичек будут записываться 0.1 или 0.9 в
            // зависимости больше значение изначального или меньше
            for (int i = 0; i < onediag.length; i++) {
                for (int j = 0; j < onediag[0].length; j++) {
                    if (i == j) {
                        onediag[i][j] = onematrix[k];
                        k++;
                    }
                }
            }
            double[][] NewMatrix = new double[L][L];

            //произведение по формуле не знаю нужна ли вам формула, кину если нужна,
            // но наша матрица, которую получаем после вычитаний строк, умножается на ее же транспонированную
            RealMatrix matrix = new Array2DRowRealMatrix(TmatrixD);
            RealMatrix matrix1 = new Array2DRowRealMatrix(matrixD);
            RealMatrix d = matrix.multiply(matrix1);
//            for (int i = 0; i < TmatrixD.length; i++) {
//                for (int l = 0; l < matrixD[0].length; l++) {
//                    for (int j = 0; j < matrixD.length; j++) {
//                        NewMatrix[i][l] += TmatrixD[i][j] * matrixD[j][l];
//                    }
//                }
//            }
            NewMatrix = d.getData();

            //10000 это наше значение лямбды, табличное, нов проге у Саши стояло 1000000, поэтому я вьебал его
            for (int i = 0; i < NewMatrix.length; i++) {
                for (int j = 0; j < NewMatrix[0].length; j++) {
                    NewMatrix[i][j] = NewMatrix[i][j] * 10000;
                }
            }

            //вот тут наша матрица с которой мы работаем умножается на ту,
            // которая получилась когда единички расположило по диагонали
            for (int i = 0; i < NewMatrix.length; i++) {
                for (int j = 0; j < NewMatrix.length; j++) {
                    NewMatrix[i][j] = NewMatrix[i][j] + onediag[i][j];
                }
            }

            //дальше был использован метод, библиотечный, который решает матрицу Ax=b
            RealVector x = null;
            double[] temp1 = new double[L];
            for (int i = 0; i < L; i++) {
                temp1[i] = b[i] * onematrix[i];
            }
            try {
                RealMatrix a = new Array2DRowRealMatrix(NewMatrix);
                RealVector c = new ArrayRealVector(temp1);
                DecompositionSolver solver = new LUDecomposition(a).getSolver();
                x = solver.solve(c);
            } catch (Exception e) {
                e.printStackTrace();
            }

            result = x.toArray();

            //дальше, в зависимости от значений, которые мы получаем,
            // в массив с единичками, который создавали перед циклом
            // записываются 0.1 или 0.9
            for (int i = 0; i < L; i++) {
                if (b[i] > result[i]) {
                    onematrix[i] = 0.1;
                } else {
                    onematrix[i] = 0.9;
                }
            }

        }
        for (int i = 0; i < L; i++) {
            resultL.add(result[i]);
        }

        return resultL;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void doCard1(ActionEvent event) {
        try {
            ArrayList<Double> yMaxCoords = new ArrayList<>();
            startFirstCard1= Double.parseDouble(xStart11.getText());
            endFirstCard1= Double.parseDouble(xEnd11.getText());

            ArrayList<Double> xCoordsField = new ArrayList<>();
            ArrayList<Double> yCoordsField = new ArrayList<>();
            int h =0;
            for (int c=0;c<100;c++) {
                for (int i = h; i <1024+h; i++) {
                    if (xCoords.get(i)>startFirstCard1&&xCoords.get(i)<endFirstCard1){
                        xCoordsField.add(xCoords.get(i));
                    }
                }
                h+=1024;

            }

            int b =0;
            for (int c=0;c<100;c++) {
                for (int i = b; i <1024+b; i++) {
                    if (xCoords.get(i)>startFirstCard1&&xCoords.get(i)<endFirstCard1){
                        yCoordsField.add(yCoords.get(i));
                    }
                }
                b+=1024;

            }
            double max = yCoordsField.get(0);
            int z = 0;
            for (int c = 0; c < 100; c++) {
                for (int i = z; i < yCoordsField.size()/100 + z; i++) {
                    if (yCoordsField.get(i) > max)
                        max = yCoordsField.get(i);

                }
                yMaxCoords.add(max);
                max = 0;
                z += yCoordsField.size()/100;
            }
            double sum = 0;
            for (int i = 0; i < yMaxCoords.size(); i++) {
                sum += yMaxCoords.get(i);
            }
            double min1 = yMaxCoords.get(0);
            double max1 = yMaxCoords.get(0);

            for (Double i: yMaxCoords) {
                if(i < min1)
                    min1 = i;
                if(i > max1)
                    max1 = i;
            }
            double average = sum/yMaxCoords.size();
            double hip=average/8;

            Label[] labels2=new Label[]{Label011,Label021,Label031,Label041,Label051,Label061,Label071,Label081,Label091,Label101,Label111,Label121,Label131,Label141,Label151,Label161,Label171,Label181,Label191,Label201,
                    Label211,Label221,Label231,Label241,Label251,Label261,Label271,Label281,Label291,Label301,Label311,Label321,Label331,Label341,Label351,Label361,Label371,Label381,Label391,Label401,
                    Label411,Label421,Label431,Label441,Label451,Label461,Label471,Label481,Label491,Label501,Label511,Label521,Label531,Label541,Label551,Label561,Label571,Label581,Label591,Label601,
                    Label611,Label621,Label631,Label641,Label651,Label661,Label671,Label681,Label691,Label701,Label711,Label721,Label731,Label741,Label751,Label761,Label771,Label781,Label791,Label801,
                    Label811,Label821,Label831,Label841,Label851,Label861,Label871,Label881,Label891,Label901,
                    Label911,Label921,Label931,Label941,Label951,Label961,Label971,Label981,Label991,Label1001};
            for (int i=0;i<labels2.length;i++) {
                labels2[i].setText(yMaxCoords.get(i).toString());

            }
            for (int i=0;i<labels2.length;i++) {
                Label temp12=labels2[i];
                Label finalTemp1 = temp12;
                labels2[i].setOnMousePressed(event2 -> pressed2(event2, finalTemp1));

            }

            for (int i=0;i<labels2.length;i++) {
                if (Double.parseDouble(labels2[i].getText())>=min1&&Double.parseDouble(labels2[i].getText()) <=( average - hip*4)) {
                    labels2[i].setStyle("-fx-background-color: #E0FFFF");
                }
                else if (Double.parseDouble(labels2[i].getText())>=( average - hip*4)&&Double.parseDouble(labels2[i].getText()) <=( average - hip*3)) {
                    labels2[i].setStyle("-fx-background-color: #AFEEEE");
                }
                else if (Double.parseDouble(labels2[i].getText())>=( average - hip*3)&&Double.parseDouble(labels2[i].getText()) <=( average - hip*2)) {
                    labels2[i].setStyle("-fx-background-color: #7FFFD4");
                }
                else if (Double.parseDouble(labels2[i].getText())>=( average - hip*2)&&Double.parseDouble(labels2[i].getText()) <=( average - hip)) {
                    labels2[i].setStyle("-fx-background-color: #40E0D0");
                }
                else if (Double.parseDouble(labels2[i].getText())>=( average-hip)&&Double.parseDouble(labels2[i].getText()) <=(average)) {
                    labels2[i].setStyle("-fx-background-color: #E6E6FA");}
                else if (Double.parseDouble(labels2[i].getText())<=( average+hip)&&Double.parseDouble(labels2[i].getText()) >=( average)) {
                    labels2[i].setStyle("-fx-background-color: #00CED1");
                } else if (Double.parseDouble(labels2[i].getText())<=( average + hip*2)&&Double.parseDouble(labels2[i].getText()) >=( average + hip)) {
                    labels2[i].setStyle("-fx-background-color: #058c7e");
                } else if (Double.parseDouble(labels2[i].getText())<=( average + hip*3)&&Double.parseDouble(labels2[i].getText()) >=( average + hip*2)) {
                    labels2[i].setStyle("-fx-background-color: #D8BFD8");
                } else if (Double.parseDouble(labels2[i].getText())<=( average + hip*4)&&Double.parseDouble(labels2[i].getText()) >=( average + hip*3)) {
                    labels2[i].setStyle("-fx-background-color: #4169E1");
                } else if (Double.parseDouble(labels2[i].getText())<=max1&&Double.parseDouble(labels2[i].getText()) >=( average + hip*4)) {
                    labels2[i].setStyle("-fx-background-color: #0000FF");}

            }
            startFirstCard1=0.0;
            endFirstCard1= 0.0;

        }
        catch (NumberFormatException e){
            System.out.println("Введите число");
        }
        catch (Exception e) {
            System.out.println(":3");
        }
    }
    public void doCard2(ActionEvent event) {
        try {
            ArrayList<Double> yMaxCoords = new ArrayList<>();
            startFirstCard2= Double.parseDouble(xStart2.getText());
            endFirstCard2= Double.parseDouble(xEnd2.getText());

            ArrayList<Double> xCoordsField = new ArrayList<>();
            ArrayList<Double> yCoordsField = new ArrayList<>();
            int h =0;
            for (int c=0;c<100;c++) {
                for (int i = h; i <1024+h; i++) {
                    if (xCoords.get(i)>startFirstCard2&&xCoords.get(i)<endFirstCard2){
                        xCoordsField.add(xCoords.get(i));
                    }
                }
                h+=1024;

            }

            int b =0;
            for (int c=0;c<100;c++) {
                for (int i = b; i <1024+b; i++) {
                    if (xCoords.get(i)>startFirstCard2&&xCoords.get(i)<endFirstCard2){
                        yCoordsField.add(yCoords.get(i));
                    }
                }
                b+=1024;

            }
            double max = yCoordsField.get(0);
            int z = 0;
            for (int c = 0; c < 100; c++) {
                for (int i = z; i < yCoordsField.size()/100 + z; i++) {
                    if (yCoordsField.get(i) > max)
                        max = yCoordsField.get(i);

                }
                yMaxCoords.add(max);
                max = 0;
                z += yCoordsField.size()/100;
            }
            double sum = 0;
            for (int i = 0; i < yMaxCoords.size(); i++) {
                sum += yMaxCoords.get(i);
            }
            double min1 = yMaxCoords.get(0);
            double max1 = yMaxCoords.get(0);

            for (Double i: yMaxCoords) {
                if(i < min1)
                    min1 = i;
                if(i > max1)
                    max1 = i;
            }
            double average = sum/yMaxCoords.size();
            double hip=average/8;
            Label[] labels3=new Label[]{Label012,Label022,Label032,Label042,Label052,Label062,Label072,Label082,Label092,Label102,Label112,Label122,Label132,Label142,Label152,Label162,Label172,Label182,Label192,Label202,
                    Label212,Label222,Label232,Label242,Label252,Label262,Label272,Label282,Label292,Label302,Label312,Label322,Label332,Label342,Label352,Label362,Label372,Label382,Label392,Label402,
                    Label412,Label422,Label432,Label442,Label452,Label462,Label472,Label482,Label492,Label502,Label512,Label522,Label532,Label542,Label552,Label562,Label572,Label582,Label592,Label602,
                    Label612,Label622,Label632,Label642,Label652,Label662,Label672,Label682,Label692,Label702,Label712,Label722,Label732,Label742,Label752,Label762,Label772,Label782,Label792,Label802,
                    Label812,Label822,Label832,Label842,Label852,Label862,Label872,Label882,Label892,Label902,
                    Label912,Label922,Label932,Label942,Label952,Label962,Label972,Label982,Label992,Label1002};
            for (int i=0;i<labels3.length;i++) {
                labels3[i].setText(yMaxCoords.get(i).toString());

            }
            for (int i=0;i<labels3.length;i++) {
                Label temp12=labels3[i];
                Label finalTemp1 = temp12;
                labels3[i].setOnMousePressed(event3 -> pressed3(event3, finalTemp1));

            }

            if (maxCard2.getText().equals("max")) {
                for (int i = 0; i < labels3.length; i++) {
                    if (Double.parseDouble(labels3[i].getText()) >= min1 && Double.parseDouble(labels3[i].getText()) <= (average - hip * 4)) {
                        labels3[i].setStyle("-fx-background-color: #1E90FF");
                    } else if (Double.parseDouble(labels3[i].getText()) >= (average - hip * 4) && Double.parseDouble(labels3[i].getText()) <= (average - hip * 3)) {
                        labels3[i].setStyle("-fx-background-color: #00BFFF");
                    } else if (Double.parseDouble(labels3[i].getText()) >= (average - hip * 3) && Double.parseDouble(labels3[i].getText()) <= (average - hip * 2)) {
                        labels3[i].setStyle("-fx-background-color: #00FFFF");
                    } else if (Double.parseDouble(labels3[i].getText()) >= (average - hip * 2) && Double.parseDouble(labels3[i].getText()) <= (average - hip)) {
                        labels3[i].setStyle("-fx-background-color: #9ACD32");
                    } else if (Double.parseDouble(labels3[i].getText()) >= (average - hip) && Double.parseDouble(labels3[i].getText()) <= (average)) {
                        labels3[i].setStyle("-fx-background-color: #FFFF00");
                    } else if (Double.parseDouble(labels3[i].getText()) <= (average + hip) && Double.parseDouble(labels3[i].getText()) >= (average)) {
                        labels3[i].setStyle("-fx-background-color: #FFD700");
                    } else if (Double.parseDouble(labels3[i].getText()) <= (average + hip * 2) && Double.parseDouble(labels3[i].getText()) >= (average + hip)) {
                        labels3[i].setStyle("-fx-background-color: #FF6347");
                    } else if (Double.parseDouble(labels3[i].getText()) <= (average + hip * 3) && Double.parseDouble(labels3[i].getText()) >= (average + hip * 2)) {
                        labels3[i].setStyle("-fx-background-color: #FF4500");
                    } else if (Double.parseDouble(labels3[i].getText()) <= (average + hip * 4) && Double.parseDouble(labels3[i].getText()) >= (average + hip * 3)) {
                        labels3[i].setStyle("-fx-background-color: #FF0000");
                    } else if (Double.parseDouble(labels3[i].getText()) <= max1 && Double.parseDouble(labels3[i].getText()) >= (average + hip * 4)) {
                        labels3[i].setStyle("-fx-background-color: #B22222");
                    }

                }
            }else {
                average = (sum+Double.parseDouble(maxCard2.getText()))/yMaxCoords.size()+1;
                hip=average/4;
                for (int i = 0; i < labels3.length; i++) {
                    if (Double.parseDouble(labels3[i].getText()) >= min1 && Double.parseDouble(labels3[i].getText()) <= (average - hip * 4)) {
                        labels3[i].setStyle("-fx-background-color: #E0FFFF");
                    } else if (Double.parseDouble(labels3[i].getText()) >= (average - hip * 4) && Double.parseDouble(labels3[i].getText()) <= (average - hip * 3)) {
                        labels3[i].setStyle("-fx-background-color: #AFEEEE");
                    } else if (Double.parseDouble(labels3[i].getText()) >= (average - hip * 3) && Double.parseDouble(labels3[i].getText()) <= (average - hip * 2)) {
                        labels3[i].setStyle("-fx-background-color: #7FFFD4");
                    } else if (Double.parseDouble(labels3[i].getText()) >= (average - hip * 2) && Double.parseDouble(labels3[i].getText()) <= (average - hip)) {
                        labels3[i].setStyle("-fx-background-color: #40E0D0");
                    } else if (Double.parseDouble(labels3[i].getText()) >= (average - hip) && Double.parseDouble(labels3[i].getText()) <= (average)) {
                        labels3[i].setStyle("-fx-background-color: #E6E6FA");
                    } else if (Double.parseDouble(labels3[i].getText()) <= (average + hip) && Double.parseDouble(labels3[i].getText()) >= (average)) {
                        labels3[i].setStyle("-fx-background-color: #00CED1");
                    } else if (Double.parseDouble(labels3[i].getText()) <= (average + hip * 2) && Double.parseDouble(labels3[i].getText()) >= (average + hip)) {
                        labels3[i].setStyle("-fx-background-color: #058c7e");
                    } else if (Double.parseDouble(labels3[i].getText()) <= (average + hip * 3) && Double.parseDouble(labels3[i].getText()) >= (average + hip * 2)) {
                        labels3[i].setStyle("-fx-background-color: #D8BFD8");
                    } else if (Double.parseDouble(labels3[i].getText()) <= (average + hip * 4) && Double.parseDouble(labels3[i].getText()) >= (average + hip * 3)) {
                        labels3[i].setStyle("-fx-background-color: #4169E1");
                    } else if (Double.parseDouble(labels3[i].getText()) <= Double.parseDouble(maxCard2.getText()) && Double.parseDouble(labels3[i].getText()) >= (average + hip * 4)) {
                        labels3[i].setStyle("-fx-background-color: #0000FF");
                    }

                }
            }

        }
        catch (NumberFormatException e){
            System.out.println("Введите число");
        }
        catch (Exception e) {
            System.out.println(":3");
        }
    }
    public void doCard(ActionEvent event) {
        try {
            ArrayList<Double> yMaxCoords = new ArrayList<>();
            startFirstCard= Double.parseDouble(xStart1.getText());
            endFirstCard= Double.parseDouble(xEnd1.getText());

            ArrayList<Double> xCoordsField = new ArrayList<>();
            ArrayList<Double> yCoordsField = new ArrayList<>();
            int h =0;
            for (int c=0;c<100;c++) {
                for (int i = h; i <1024+h; i++) {
                    if (xCoords.get(i)>startFirstCard&&xCoords.get(i)<endFirstCard){
                        xCoordsField.add(xCoords.get(i));
                    }
                }
                h+=1024;

            }

            int b =0;
            for (int c=0;c<100;c++) {
                for (int i = b; i <1024+b; i++) {
                    if (xCoords.get(i)>startFirstCard&&xCoords.get(i)<endFirstCard){
                        yCoordsField.add(yCoords.get(i));
                    }
                }
                b+=1024;

            }
            double max = yCoordsField.get(0);
            int z = 0;
            for (int c = 0; c < 100; c++) {
                for (int i = z; i < yCoordsField.size()/100 + z; i++) {
                    if (yCoordsField.get(i) > max)
                        max = yCoordsField.get(i);

                }
                yMaxCoords.add(max);
                max = 0;
                z += yCoordsField.size()/100;
            }
            double sum = 0;
            for (int i = 0; i < yMaxCoords.size(); i++) {
                sum += yMaxCoords.get(i);
            }
            double min1 = yMaxCoords.get(0);
            double max1 = yMaxCoords.get(0);

            for (Double i: yMaxCoords) {
                if(i < min1)
                    min1 = i;
                if(i > max1)
                    max1 = i;
            }
            double average = sum/yMaxCoords.size();
            double hip=average/8;

            Label[] labels=new Label[]{Label1,Label2,Label3,Label4,Label5,Label6,Label7,Label8,Label9,Label10,Label11,Label12,Label13,Label14,Label15,Label16,Label17,Label18,Label19,Label20,
                    Label21,Label22,Label23,Label24,Label25,Label26,Label27,Label28,Label29,Label30,Label31,Label32,Label33,Label34,Label35,Label36,Label37,Label38,Label39,Label40,
                    Label41,Label42,Label43,Label44,Label45,Label46,Label47,Label48,Label49,Label50,Label51,Label52,Label53,Label54,Label55,Label56,Label57,Label58,Label59,Label60,
                    Label61,Label62,Label63,Label64,Label65,Label66,Label67,Label68,Label69,Label70,Label71,Label72,Label73,Label74,Label75,Label76,Label77,Label78,Label79,Label80,
                    Label81,Label82,Label83,Label84,Label85,Label86,Label87,Label88,Label89,Label90,
                    Label91,Label92,Label93,Label94,Label95,Label96,Label97,Label98,Label99,Label100,};
            for (int i=0;i<labels.length;i++) {
                labels[i].setText(yMaxCoords.get(i).toString());

            }
            for (int i=0;i<labels.length;i++) {
                Label temp12=labels[i];
                Label finalTemp1 = temp12;
                labels[i].setOnMousePressed(event1 -> pressed1(event1, finalTemp1));

            }
            if (maxCard.getText().equals("max")) {
                for (int i=0;i<labels.length;i++) {
                    if (Double.parseDouble(labels[i].getText())>=min1&&Double.parseDouble(labels[i].getText()) <=( average - hip*4)) {
                        labels[i].setStyle("-fx-background-color: #E0FFFF");
                    }
                    else if (Double.parseDouble(labels[i].getText())>=( average - hip*4)&&Double.parseDouble(labels[i].getText()) <=( average - hip*3)) {
                        labels[i].setStyle("-fx-background-color: #AFEEEE");
                    }
                    else if (Double.parseDouble(labels[i].getText())>=( average - hip*3)&&Double.parseDouble(labels[i].getText()) <=( average - hip*2)) {
                        labels[i].setStyle("-fx-background-color: #7FFFD4");
                    }
                    else if (Double.parseDouble(labels[i].getText())>=( average - hip*2)&&Double.parseDouble(labels[i].getText()) <=( average - hip)) {
                        labels[i].setStyle("-fx-background-color: #40E0D0");
                    }
                    else if (Double.parseDouble(labels[i].getText())>=( average-hip)&&Double.parseDouble(labels[i].getText()) <=(average)) {
                        labels[i].setStyle("-fx-background-color: #E6E6FA");}
                    else if (Double.parseDouble(labels[i].getText())<=( average+hip)&&Double.parseDouble(labels[i].getText()) >=( average)) {
                        labels[i].setStyle("-fx-background-color: #00CED1");
                    } else if (Double.parseDouble(labels[i].getText())<=( average + hip*2)&&Double.parseDouble(labels[i].getText()) >=( average + hip)) {
                        labels[i].setStyle("-fx-background-color: #058c7e");
                    } else if (Double.parseDouble(labels[i].getText())<=( average + hip*3)&&Double.parseDouble(labels[i].getText()) >=( average + hip*2)) {
                        labels[i].setStyle("-fx-background-color: #D8BFD8");
                    } else if (Double.parseDouble(labels[i].getText())<=( average + hip*4)&&Double.parseDouble(labels[i].getText()) >=( average + hip*3)) {
                        labels[i].setStyle("-fx-background-color: #4169E1");
                    } else if (Double.parseDouble(labels[i].getText())<=max1&&Double.parseDouble(labels[i].getText()) >=( average + hip*4)) {
                        labels[i].setStyle("-fx-background-color: #0000FF");}

                }

            }
            else {
                 average = (sum+Double.parseDouble(maxCard.getText()))/yMaxCoords.size()+1;
                 hip=average/4;
                for (int i=0;i<labels.length;i++) {
                    if (Double.parseDouble(labels[i].getText())>=min1&&Double.parseDouble(labels[i].getText()) <=( average - hip*4)) {
                        labels[i].setStyle("-fx-background-color: #E0FFFF");
                    }
                    else if (Double.parseDouble(labels[i].getText())>=( average - hip*4)&&Double.parseDouble(labels[i].getText()) <=( average - hip*3)) {
                        labels[i].setStyle("-fx-background-color: #AFEEEE");
                    }
                    else if (Double.parseDouble(labels[i].getText())>=( average - hip*3)&&Double.parseDouble(labels[i].getText()) <=( average - hip*2)) {
                        labels[i].setStyle("-fx-background-color: #7FFFD4");
                    }
                    else if (Double.parseDouble(labels[i].getText())>=( average - hip*2)&&Double.parseDouble(labels[i].getText()) <=( average - hip)) {
                        labels[i].setStyle("-fx-background-color: #40E0D0");
                    }
                    else if (Double.parseDouble(labels[i].getText())>=( average-hip)&&Double.parseDouble(labels[i].getText()) <=(average)) {
                        labels[i].setStyle("-fx-background-color: #E6E6FA");}
                    else if (Double.parseDouble(labels[i].getText())<=( average+hip)&&Double.parseDouble(labels[i].getText()) >=( average)) {
                        labels[i].setStyle("-fx-background-color: #00CED1");
                    } else if (Double.parseDouble(labels[i].getText())<=( average + hip*2)&&Double.parseDouble(labels[i].getText()) >=( average + hip)) {
                        labels[i].setStyle("-fx-background-color: #058c7e");
                    } else if (Double.parseDouble(labels[i].getText())<=( average + hip*3)&&Double.parseDouble(labels[i].getText()) >=( average + hip*2)) {
                        labels[i].setStyle("-fx-background-color: #D8BFD8");
                    } else if (Double.parseDouble(labels[i].getText())<=( average + hip*4)&&Double.parseDouble(labels[i].getText()) >=( average + hip*3)) {
                        labels[i].setStyle("-fx-background-color: #4169E1");
                    } else if (Double.parseDouble(labels[i].getText())<=Double.parseDouble(maxCard.getText())&&Double.parseDouble(labels[i].getText()) >=( average + hip*4)) {
                        labels[i].setStyle("-fx-background-color: #0000FF");}

                }

            }

            for (int i=0;i<labels.length;i++) {
                if (Double.parseDouble(labels[i].getText())>=min1&&Double.parseDouble(labels[i].getText()) <=( average - hip*4)) {
                labels[i].setStyle("-fx-background-color: #E0FFFF");
            }
                else if (Double.parseDouble(labels[i].getText())>=( average - hip*4)&&Double.parseDouble(labels[i].getText()) <=( average - hip*3)) {
               labels[i].setStyle("-fx-background-color: #AFEEEE");
            }
                else if (Double.parseDouble(labels[i].getText())>=( average - hip*3)&&Double.parseDouble(labels[i].getText()) <=( average - hip*2)) {
                labels[i].setStyle("-fx-background-color: #7FFFD4");
            }
                else if (Double.parseDouble(labels[i].getText())>=( average - hip*2)&&Double.parseDouble(labels[i].getText()) <=( average - hip)) {
                  labels[i].setStyle("-fx-background-color: #40E0D0");
                }
                else if (Double.parseDouble(labels[i].getText())>=( average-hip)&&Double.parseDouble(labels[i].getText()) <=(average)) {
                labels[i].setStyle("-fx-background-color: #E6E6FA");}
                else if (Double.parseDouble(labels[i].getText())<=( average+hip)&&Double.parseDouble(labels[i].getText()) >=( average)) {
                    labels[i].setStyle("-fx-background-color: #00CED1");
                } else if (Double.parseDouble(labels[i].getText())<=( average + hip*2)&&Double.parseDouble(labels[i].getText()) >=( average + hip)) {
                    labels[i].setStyle("-fx-background-color: #058c7e");
                } else if (Double.parseDouble(labels[i].getText())<=( average + hip*3)&&Double.parseDouble(labels[i].getText()) >=( average + hip*2)) {
                    labels[i].setStyle("-fx-background-color: #D8BFD8");
                } else if (Double.parseDouble(labels[i].getText())<=( average + hip*4)&&Double.parseDouble(labels[i].getText()) >=( average + hip*3)) {
                    labels[i].setStyle("-fx-background-color: #4169E1");
                } else if (Double.parseDouble(labels[i].getText())<=max1&&Double.parseDouble(labels[i].getText()) >=( average + hip*4)) {
                labels[i].setStyle("-fx-background-color: #0000FF");}

            }


        }
        catch (NumberFormatException e){
            System.out.println("Введите число");
        }
        catch (Exception e) {
            System.out.println(":3");
        }
    }

    public void doTranslate(MouseEvent event) {
        if(from.getText().equals("     От: ")){
        card.setText("Heat map calculation");
        ENC.setText("    Enter number of chart");
        EN.setText("         Select a range of Х-axis values");
        from.setText(" From");
        before.setText(" Before");}
    }
}









