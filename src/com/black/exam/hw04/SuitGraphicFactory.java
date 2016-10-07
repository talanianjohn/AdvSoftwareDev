package com.black.exam.hw04;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tanner on 9/25/16.
 *
 * Intended to simplify the request of a graphic down to a single line
 *
 *
 */
public class SuitGraphicFactory extends JPanel {

    String type;
    String suit;
    public static final String HEART="heart",SPADE= "spade",CLUB = "club",DIAMONDS="diamonds";

    public SuitGraphicFactory(String s, String suit){
        type = s;
        this.suit = suit;
        setPreferredSize(new Dimension(300,400));
        System.out.println(s+" "+suit);
    }

    @Override
    public void paintComponent(Graphics page) {

        int x = 10;
        int y = 20;
        int xt = 20;
        int yt = 8;
        page.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        page.drawString(suit, 240, 60);
        page.drawString(suit, 40, 320);
        switch (type) {
            case CLUB:

                page.setColor(Color.BLACK);
                page.fillOval(x   , 30 + y, 40, 40);
                page.fillOval(40+x, 30 + y, 40, 40);
                page.fillOval(20+x, y, 40, 40);
                int xpoints[] = {10+xt, 50+xt, 30+xt};
                int ypoints[] = {100+yt, 100+yt, 60+yt};
                int npoints = 3;
                page.fillPolygon(xpoints, ypoints, npoints);
                int bx = 210, bxt = 220;
                int by = 270, byt = 258;
                page.fillOval(bx   , 30 + by, 40, 40);
                page.fillOval(40+bx, 30 + by, 40, 40);
                page.fillOval(20+bx, by, 40, 40);
                int bxpoints[] = {10+bxt, 50+bxt, 30+bxt};
                int bypoints[] = {100+byt, 100+byt, 60+byt};
                int bnpoints = 3;

                page.fillPolygon(bxpoints, bypoints, bnpoints);

                break;
            case HEART:
                page.setColor(Color.RED);
                page.fillOval(40, 30, 50, 50);
                page.setColor(Color.RED);
                page.fillOval(70, 30, 50, 50);

                int hxp[] = {21+xt, 99+xt, 60+xt};
                int hyp[] = {55+yt, 55+yt, 100+yt};
                int hn = 3;

                page.fillPolygon(hxp, hyp, hn);


                int lowerx = 165;
                int lowery = 220;

                page.setColor(Color.RED);
                page.fillOval(40+lowerx, 50+lowery, 50, 50);
                page.setColor(Color.RED);
                page.fillOval(70+lowerx, 50+lowery, 50, 50);

                int hbxp[] = {21+xt+lowerx, 99+xt+lowerx, 60+xt+lowerx};
                int hbyp[] = {75+yt+lowery, 75+yt+lowery, 120+yt+lowery};
                int hbn = 3;

                page.fillPolygon(hbxp, hbyp, hbn);

                break;
            case DIAMONDS:
                page.setColor(Color.RED);

                int dix[] = {10+xt, 30+xt, 50+xt, 30+xt};
                int diy[] = {55+yt, 10+yt, 55+yt, 90+xt};
                int cor = 4;

                page.fillPolygon(dix, diy, cor);
                int dibx[] = {210+xt, 230+xt, 250+xt, 230+xt};
                int diby[] = {305+yt, 260+yt, 305+yt, 340+xt};
                int corb = 4;

                page.fillPolygon(dibx, diby, corb);
                break;


            case SPADE:
                page.setColor(Color.BLACK);
                int sx[] = {40+xt, 80+xt, 60+xt};
                int sy[] = {120+yt, 120+yt, 80+yt};
                int sp = 3;
                page.fillPolygon(sx, sy, sp);
                page.fillOval(40, 50, 50, 50);
                page.fillOval(70, 50, 50, 50);
                int sxp[] = {21+xt, 99+xt, 60+xt};
                int syp[] = {55+yt, 55+yt, 10+yt};
                int snp = 3;
                page.fillPolygon(sxp, syp, snp);
                int sbx[] = {190+xt, 230+xt, 210+xt};
                int sby[] = {350+yt, 350+yt, 310+yt};
                int sbp = 3;
                page.fillPolygon(sbx, sby, sbp);
                page.fillOval(190, 280, 50, 50);
                page.fillOval(220, 280, 50, 50);
                int sbxp[] = {171+xt, 249+xt, 210+xt};
                int sbyp[] = {285+yt, 285+yt, 240+yt};
                int sbnp = 3;
                page.fillPolygon(sbxp, sbyp, sbnp);
                break;

        }

    }


}
