package Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Processing.LData.*;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class Settings extends javax.swing.JFrame {

    public Settings() {
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/Data/Picture/Logo.png"))); } 
        catch (IOException ex) {System.out.println(ex);}
        showMode();
        showPan();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bngMode = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        SettingLayer = new javax.swing.JLayeredPane();
        Scroll = new javax.swing.JScrollPane();
        SettingZone = new javax.swing.JPanel();
        ChooseMode = new com.k33ptoo.components.KGradientPanel();
        lblChooseMode = new javax.swing.JLabel();
        panMode = new javax.swing.JPanel();
        rbnDark = new javax.swing.JRadioButton();
        rbnLight = new javax.swing.JRadioButton();
        ChooseLang = new com.k33ptoo.components.KGradientPanel();
        lblChooseLang = new javax.swing.JLabel();
        lblLang = new javax.swing.JLabel();
        panLang = new javax.swing.JPanel();
        iconVN = new com.AnLa.IcoPanel();
        iconUSA = new com.AnLa.IcoPanel();
        ChooseTheme = new com.k33ptoo.components.KGradientPanel();
        lblChooseTheme = new javax.swing.JLabel();
        lblTheme = new javax.swing.JLabel();
        panTheme = new javax.swing.JPanel();
        iconDefault = new com.AnLa.IcoPanel();
        iconBubbles = new com.AnLa.IcoPanel();
        iconColor = new com.AnLa.IcoPanel();
        iconCuteColor = new com.AnLa.IcoPanel();
        BackgroundMusic = new com.k33ptoo.components.KGradientPanel();
        lblBMusic = new javax.swing.JLabel();
        iconBMusic = new com.AnLa.IcoPanel();
        panBMusic = new javax.swing.JPanel();
        Bar = new com.k33ptoo.components.KGradientPanel();
        iconPlus = new com.AnLa.IcoPanel();
        iconPlay = new com.AnLa.IcoPanel();
        iconRepeat = new com.AnLa.IcoPanel();
        iconShuffle = new com.AnLa.IcoPanel();
        iconBackward = new com.AnLa.IcoPanel();
        iconForward = new com.AnLa.IcoPanel();
        panSong = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(Lang.getString("Setting")
        );
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Background.setPreferredSize(new java.awt.Dimension(480, 720));

        Scroll.setBorder(null);
        Scroll.setHorizontalScrollBar(null);
        Scroll.setVerticalScrollBar(new combo_suggestion.ScrollBarCustom());

        SettingZone.setPreferredSize(new java.awt.Dimension(480, 1500));

        ChooseMode.setBackground(BLIND);
        ChooseMode.setkBorderRadius(30);

        lblChooseMode.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblChooseMode.setText(Lang.getString("CYMode"));
        lblChooseMode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bngMode.add(rbnDark);
        rbnDark.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rbnDark.setSelected(Mode);
        rbnDark.setText(Lang.getString("Dark"));
        rbnDark.setBorder(null);
        rbnDark.setContentAreaFilled(false);
        rbnDark.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbnDark.setFocusPainted(false);
        rbnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource(Theme+"RadioNull.png")));
        rbnDark.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource(Theme+"Radio.png")));
        rbnDark.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbnDarkFocusGained(evt);
            }
        });

        bngMode.add(rbnLight);
        rbnLight.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rbnLight.setSelected(!Mode);
        rbnLight.setText(Lang.getString("Light"));
        rbnLight.setBorder(null);
        rbnLight.setContentAreaFilled(false);
        rbnLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbnLight.setFocusPainted(false);
        rbnLight.setIcon(new javax.swing.ImageIcon(getClass().getResource(Theme+"RadioNull.png")));
        rbnLight.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource(Theme+"Radio.png")));
        rbnLight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbnLightFocusGained(evt);
            }
        });

        javax.swing.GroupLayout panModeLayout = new javax.swing.GroupLayout(panMode);
        panMode.setLayout(panModeLayout);
        panModeLayout.setHorizontalGroup(
            panModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbnDark, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbnLight, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        panModeLayout.setVerticalGroup(
            panModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panModeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(rbnDark, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rbnLight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout ChooseModeLayout = new javax.swing.GroupLayout(ChooseMode);
        ChooseMode.setLayout(ChooseModeLayout);
        ChooseModeLayout.setHorizontalGroup(
            ChooseModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseModeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblChooseMode, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        ChooseModeLayout.setVerticalGroup(
            ChooseModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseModeLayout.createSequentialGroup()
                .addGroup(ChooseModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChooseModeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblChooseMode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        ChooseLang.setBackground(BLIND);
        ChooseLang.setkBorderRadius(30);

        lblChooseLang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblChooseLang.setText(Lang.getString("CYLang"));
        lblChooseLang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblLang.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLang.setText(UserSetting.getLang().equalsIgnoreCase("en_us") ? Lang.getString("EN") : Lang.getString("VI"));
        lblLang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLangMousePressed(evt);
            }
        });

        panLang.setBackground(BLIND);

        iconVN.setPic(Theme+"VN.png");
        iconVN.setBackground(new java.awt.Color(153, 255, 255));
        iconVN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconVN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconVNMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconVNLayout = new javax.swing.GroupLayout(iconVN);
        iconVN.setLayout(iconVNLayout);
        iconVNLayout.setHorizontalGroup(
            iconVNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        iconVNLayout.setVerticalGroup(
            iconVNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        iconUSA.setPic(Theme+"USA.png");
        iconUSA.setBackground(new java.awt.Color(153, 255, 255));
        iconUSA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconUSA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconUSAMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconUSALayout = new javax.swing.GroupLayout(iconUSA);
        iconUSA.setLayout(iconUSALayout);
        iconUSALayout.setHorizontalGroup(
            iconUSALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        iconUSALayout.setVerticalGroup(
            iconUSALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panLangLayout = new javax.swing.GroupLayout(panLang);
        panLang.setLayout(panLangLayout);
        panLangLayout.setHorizontalGroup(
            panLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLangLayout.createSequentialGroup()
                .addComponent(iconVN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(iconUSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 220, Short.MAX_VALUE))
        );
        panLangLayout.setVerticalGroup(
            panLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLangLayout.createSequentialGroup()
                .addGroup(panLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconVN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconUSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout ChooseLangLayout = new javax.swing.GroupLayout(ChooseLang);
        ChooseLang.setLayout(ChooseLangLayout);
        ChooseLangLayout.setHorizontalGroup(
            ChooseLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChooseLangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ChooseLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ChooseLangLayout.createSequentialGroup()
                        .addComponent(lblChooseLang, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLang, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ChooseLangLayout.setVerticalGroup(
            ChooseLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseLangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ChooseLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseLang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(panLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ChooseTheme.setBackground(BLIND);
        ChooseTheme.setkBorderRadius(30);

        lblChooseTheme.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblChooseTheme.setText(Lang.getString("CYTheme"));
        lblChooseTheme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTheme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTheme.setText(Lang.getString(UserSetting.getTheme()));
        lblTheme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTheme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblThemeMousePressed(evt);
            }
        });

        panTheme.setBackground(BLIND);

        iconDefault.setPic("/Data/Icon/Default/VN.png");
        iconDefault.setBackground(new java.awt.Color(153, 255, 255));
        iconDefault.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconDefault.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconDefaultMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconDefaultLayout = new javax.swing.GroupLayout(iconDefault);
        iconDefault.setLayout(iconDefaultLayout);
        iconDefaultLayout.setHorizontalGroup(
            iconDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        iconDefaultLayout.setVerticalGroup(
            iconDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        iconBubbles.setPic("/Data/Icon/Bubbles/VN.png");
        iconBubbles.setBackground(new java.awt.Color(153, 255, 255));
        iconBubbles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconBubbles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconBubblesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconBubblesLayout = new javax.swing.GroupLayout(iconBubbles);
        iconBubbles.setLayout(iconBubblesLayout);
        iconBubblesLayout.setHorizontalGroup(
            iconBubblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        iconBubblesLayout.setVerticalGroup(
            iconBubblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        iconColor.setPic("/Data/Icon/Color/VN.png");
        iconColor.setBackground(new java.awt.Color(153, 255, 255));
        iconColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconColorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconColorLayout = new javax.swing.GroupLayout(iconColor);
        iconColor.setLayout(iconColorLayout);
        iconColorLayout.setHorizontalGroup(
            iconColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        iconColorLayout.setVerticalGroup(
            iconColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        iconCuteColor.setPic("/Data/Icon/CuteColor/VN.png");
        iconCuteColor.setBackground(new java.awt.Color(153, 255, 255));
        iconCuteColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconCuteColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconCuteColorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconCuteColorLayout = new javax.swing.GroupLayout(iconCuteColor);
        iconCuteColor.setLayout(iconCuteColorLayout);
        iconCuteColorLayout.setHorizontalGroup(
            iconCuteColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        iconCuteColorLayout.setVerticalGroup(
            iconCuteColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panThemeLayout = new javax.swing.GroupLayout(panTheme);
        panTheme.setLayout(panThemeLayout);
        panThemeLayout.setHorizontalGroup(
            panThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panThemeLayout.createSequentialGroup()
                .addComponent(iconDefault, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(iconBubbles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(iconColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(iconCuteColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panThemeLayout.setVerticalGroup(
            panThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panThemeLayout.createSequentialGroup()
                .addGroup(panThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(iconDefault, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconBubbles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(iconCuteColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout ChooseThemeLayout = new javax.swing.GroupLayout(ChooseTheme);
        ChooseTheme.setLayout(ChooseThemeLayout);
        ChooseThemeLayout.setHorizontalGroup(
            ChooseThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChooseThemeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ChooseThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ChooseThemeLayout.createSequentialGroup()
                        .addComponent(lblChooseTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lblTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        ChooseThemeLayout.setVerticalGroup(
            ChooseThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseThemeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ChooseThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(panTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        BackgroundMusic.setBackground(BLIND);
        BackgroundMusic.setkBorderRadius(30);

        lblBMusic.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBMusic.setText(Lang.getString("PBMusic"));
        lblBMusic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        iconBMusic.setPic(Theme+"Toggle"+(showMusic ? "On.png" : "Off.png"));
        iconBMusic.setBackground(new java.awt.Color(153, 255, 255));
        iconBMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconBMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconBMusicMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconBMusicLayout = new javax.swing.GroupLayout(iconBMusic);
        iconBMusic.setLayout(iconBMusicLayout);
        iconBMusicLayout.setHorizontalGroup(
            iconBMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );
        iconBMusicLayout.setVerticalGroup(
            iconBMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        panBMusic.setBackground(BLIND);

        Bar.setBackground(BLIND);
        Bar.setkBorderRadius(50);
        Bar.setkEndColor(BAR);
        Bar.setkStartColor(BAR);
        Bar.setPreferredSize(new java.awt.Dimension(366, 51));

        iconPlus.setPic(Theme+"Plus.png");
        iconPlus.setBackground(BLIND);
        iconPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconPlusMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconPlusLayout = new javax.swing.GroupLayout(iconPlus);
        iconPlus.setLayout(iconPlusLayout);
        iconPlusLayout.setHorizontalGroup(
            iconPlusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        iconPlusLayout.setVerticalGroup(
            iconPlusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        iconPlay.setPic(Theme+(Play ? "Pause" : "Play")+".png");
        iconPlay.setBackground(BAR);
        iconPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconPlayMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconPlayLayout = new javax.swing.GroupLayout(iconPlay);
        iconPlay.setLayout(iconPlayLayout);
        iconPlayLayout.setHorizontalGroup(
            iconPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        iconPlayLayout.setVerticalGroup(
            iconPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        iconRepeat.setPic(Theme+"Repeat"+(Repeat ? "Color.png" : ".png"));
        iconRepeat.setBackground(BAR);
        iconRepeat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconRepeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconRepeatMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconRepeatLayout = new javax.swing.GroupLayout(iconRepeat);
        iconRepeat.setLayout(iconRepeatLayout);
        iconRepeatLayout.setHorizontalGroup(
            iconRepeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        iconRepeatLayout.setVerticalGroup(
            iconRepeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        iconShuffle.setPic(Theme+"Shuffle"+(Shuffle ? "Color.png" : ".png"));
        iconShuffle.setBackground(BAR);
        iconShuffle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconShuffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconShuffleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconShuffleLayout = new javax.swing.GroupLayout(iconShuffle);
        iconShuffle.setLayout(iconShuffleLayout);
        iconShuffleLayout.setHorizontalGroup(
            iconShuffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        iconShuffleLayout.setVerticalGroup(
            iconShuffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        iconBackward.setPic(Theme+"Backward.png");
        iconBackward.setBackground(BAR);
        iconBackward.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconBackward.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconBackwardMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconBackwardLayout = new javax.swing.GroupLayout(iconBackward);
        iconBackward.setLayout(iconBackwardLayout);
        iconBackwardLayout.setHorizontalGroup(
            iconBackwardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        iconBackwardLayout.setVerticalGroup(
            iconBackwardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        iconForward.setPic(Theme+"Forward.png");
        iconForward.setBackground(BAR);
        iconForward.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconForward.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconForwardMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconForwardLayout = new javax.swing.GroupLayout(iconForward);
        iconForward.setLayout(iconForwardLayout);
        iconForwardLayout.setHorizontalGroup(
            iconForwardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        iconForwardLayout.setVerticalGroup(
            iconForwardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BarLayout = new javax.swing.GroupLayout(Bar);
        Bar.setLayout(BarLayout);
        BarLayout.setHorizontalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(iconPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(iconPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(iconBackward, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(iconForward, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(iconRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(iconShuffle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        BarLayout.setVerticalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(iconPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconShuffle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconBackward, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconForward, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panSong.setBackground(BLIND);
        panSong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout panBMusicLayout = new javax.swing.GroupLayout(panBMusic);
        panBMusic.setLayout(panBMusicLayout);
        panBMusicLayout.setHorizontalGroup(
            panBMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panSong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panBMusicLayout.setVerticalGroup(
            panBMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBMusicLayout.createSequentialGroup()
                .addComponent(Bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout BackgroundMusicLayout = new javax.swing.GroupLayout(BackgroundMusic);
        BackgroundMusic.setLayout(BackgroundMusicLayout);
        BackgroundMusicLayout.setHorizontalGroup(
            BackgroundMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundMusicLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BackgroundMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panBMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackgroundMusicLayout.createSequentialGroup()
                        .addComponent(lblBMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(iconBMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        BackgroundMusicLayout.setVerticalGroup(
            BackgroundMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundMusicLayout.createSequentialGroup()
                .addGroup(BackgroundMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundMusicLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblBMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(panBMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SettingZoneLayout = new javax.swing.GroupLayout(SettingZone);
        SettingZone.setLayout(SettingZoneLayout);
        SettingZoneLayout.setHorizontalGroup(
            SettingZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingZoneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SettingZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackgroundMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        SettingZoneLayout.setVerticalGroup(
            SettingZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingZoneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ChooseMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ChooseLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ChooseTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BackgroundMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Scroll.setViewportView(SettingZone);

        SettingLayer.setLayer(Scroll, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout SettingLayerLayout = new javax.swing.GroupLayout(SettingLayer);
        SettingLayer.setLayout(SettingLayerLayout);
        SettingLayerLayout.setHorizontalGroup(
            SettingLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        SettingLayerLayout.setVerticalGroup(
            SettingLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingLayerLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingLayer)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingLayer)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbnDarkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbnDarkFocusGained
        if(!Mode){ setSeting(!Mode, UserSetting.getTheme(), UserSetting.getLang()); showMode(); }
    }//GEN-LAST:event_rbnDarkFocusGained

    private void rbnLightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbnLightFocusGained
        if(Mode){ setSeting(!Mode, UserSetting.getTheme(), UserSetting.getLang());  showMode(); }
    }//GEN-LAST:event_rbnLightFocusGained

    private void lblLangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLangMousePressed
        showMode(); showLang = !showLang;   
        if(showLang){   lblLang.setForeground(SELECT);  }
        showTheme = false;  showPan();
    }//GEN-LAST:event_lblLangMousePressed

    private void iconVNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconVNMousePressed
        if(!lang.equals("vi_VN")){ setLang("VI"); lang = "vi_VN"; }
    }//GEN-LAST:event_iconVNMousePressed

    private void iconUSAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconUSAMousePressed
        if(!lang.equals("en_US")){ setLang("EN"); lang = "en_US"; }
    }//GEN-LAST:event_iconUSAMousePressed

    private void lblThemeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemeMousePressed
        showMode(); showTheme = !showTheme;  
        if(showTheme){  lblTheme.setForeground(SELECT); }
        showLang = false;   showPan();
    }//GEN-LAST:event_lblThemeMousePressed

    private void iconDefaultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDefaultMousePressed
        setTheme("Default");
    }//GEN-LAST:event_iconDefaultMousePressed

    private void iconBubblesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBubblesMousePressed
        setTheme("Bubbles");
    }//GEN-LAST:event_iconBubblesMousePressed

    private void iconColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconColorMousePressed
        setTheme("Color");
    }//GEN-LAST:event_iconColorMousePressed

    private void iconCuteColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconCuteColorMousePressed
        setTheme("CuteColor");
    }//GEN-LAST:event_iconCuteColorMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setSeting(Mode, UserSetting.getTheme(), lang);
    }//GEN-LAST:event_formWindowClosing

    private void iconBMusicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBMusicMousePressed
        showMode(); showMusic = !showMusic; showLang = false;   showTheme = false;
        if(!showMusic){PlayerMS.stop();}
        else{setSong();  paintSong(0);}
        showPan();
        iconBMusic.setPic(Theme+"Toggle"+(showMusic ? "On" : "Off")+".png");
    }//GEN-LAST:event_iconBMusicMousePressed

    private void iconPlusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPlusMousePressed
        JFileChooser SelectPic = windowsJFileChooser();
        FileFilter BoLoc = new FileNameExtensionFilter("Audio file", "mp3", "wav");
        SelectPic.setFileFilter(BoLoc);
        int response = SelectPic.showOpenDialog(null);
        if(response == JFileChooser.APPROVE_OPTION){
            File fileChooser = SelectPic.getSelectedFile();
            System.out.println("\nAudio File Choose: "+fileChooser.getName());
            File fileCopy = new File("src/Data/Sound/"+fileChooser.getName());
            addList(fileCopy);
            paintSong(currentPlayer);
            try { Files.copy(fileChooser.toPath(), fileCopy.toPath(), StandardCopyOption.REPLACE_EXISTING); } 
            catch (IOException ex){ System.out.println("\n!!! Error trying to Copy Audio file to /Data/Sound/ !!!"); }
        }
    }//GEN-LAST:event_iconPlusMousePressed

    private void iconPlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPlayMousePressed
        Play = !Play;
        iconPlay.setPic(Theme+(Play ? "Pause" : "Play")+".png");
        if(Play){   PlayerMS.play();    getSong();}
        else    {   PlayerMS.pause();   System.out.println("Now pause list Music...");  }
    }//GEN-LAST:event_iconPlayMousePressed

    private void iconBackwardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBackwardMousePressed
        PlayerMS.skipBackward(); 
        if(currentPlayer > 0 && !Shuffle){
            currentPlayer--;
            paintSong(currentPlayer);
            System.out.println("List Music: Skip Backward.\tCurrent: "+(currentPlayer+1)+"/"+sizePlayser);   getSong();
        }else if(Shuffle){paintSong(0);}
    }//GEN-LAST:event_iconBackwardMousePressed

    private void iconForwardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconForwardMousePressed
        PlayerMS.skipForward();
        if(currentPlayer < sizePlayser-1 && !Shuffle){
            currentPlayer++; 
            paintSong(currentPlayer);
            System.out.println("List Music: Skip Forward.\tCurrent: "+(currentPlayer+1)+"/"+sizePlayser);   getSong();
        }else if(Shuffle){paintSong(0);}
    }//GEN-LAST:event_iconForwardMousePressed

    private void iconRepeatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRepeatMousePressed
        Repeat = !Repeat;   PlayerMS.setRepeat(Repeat); setBar();
        System.out.println("List Music Repeat: "+Repeat);
    }//GEN-LAST:event_iconRepeatMousePressed

    private void iconShuffleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconShuffleMousePressed
        Shuffle = !Shuffle; PlayerMS.setShuffle(Shuffle); setBar();
        System.out.println("List Music Shuffle: "+Shuffle);
    }//GEN-LAST:event_iconShuffleMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Settings().setVisible(true);
        });
    }
    
    private final JComponent P = super.getRootPane();   //parent component
    private static int indexPlayer = 0, currentPlayer = 0, sizePlayser = 0;
    private static String lang = UserSetting.getLang();
    private static boolean showLang = false, showTheme = false, 
            showMusic = false,  Play = false,   Repeat = false, Shuffle = false; 
    private static final Color BLIND = new Color(0,0,0,0), DARK = new Color(96, 105, 107), LIGHT = new Color(235, 244, 245), 
            SELECT = new Color(248, 172, 255), BAR = new Color(109, 81, 165), SONG = new Color(131, 153, 162), PLAYSONG = new Color(65, 80, 90);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private com.k33ptoo.components.KGradientPanel BackgroundMusic;
    private com.k33ptoo.components.KGradientPanel Bar;
    private com.k33ptoo.components.KGradientPanel ChooseLang;
    private com.k33ptoo.components.KGradientPanel ChooseMode;
    private com.k33ptoo.components.KGradientPanel ChooseTheme;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLayeredPane SettingLayer;
    private javax.swing.JPanel SettingZone;
    private javax.swing.ButtonGroup bngMode;
    private com.AnLa.IcoPanel iconBMusic;
    private com.AnLa.IcoPanel iconBackward;
    private com.AnLa.IcoPanel iconBubbles;
    private com.AnLa.IcoPanel iconColor;
    private com.AnLa.IcoPanel iconCuteColor;
    private com.AnLa.IcoPanel iconDefault;
    private com.AnLa.IcoPanel iconForward;
    private com.AnLa.IcoPanel iconPlay;
    private com.AnLa.IcoPanel iconPlus;
    private com.AnLa.IcoPanel iconRepeat;
    private com.AnLa.IcoPanel iconShuffle;
    private com.AnLa.IcoPanel iconUSA;
    private com.AnLa.IcoPanel iconVN;
    private javax.swing.JLabel lblBMusic;
    private javax.swing.JLabel lblChooseLang;
    private javax.swing.JLabel lblChooseMode;
    private javax.swing.JLabel lblChooseTheme;
    private javax.swing.JLabel lblLang;
    private javax.swing.JLabel lblTheme;
    private javax.swing.JPanel panBMusic;
    private javax.swing.JPanel panLang;
    private javax.swing.JPanel panMode;
    private javax.swing.JPanel panSong;
    private javax.swing.JPanel panTheme;
    private javax.swing.JRadioButton rbnDark;
    private javax.swing.JRadioButton rbnLight;
    // End of variables declaration//GEN-END:variables

    private void showMode()                                 {
        setMode(Background);    setMode(SettingZone);   
        Scroll.getVerticalScrollBar().setBackground(Color.decode(Mode ? "#363B41" : "#FFFFFF"));
        //Set Mode for Choose Mode
        ChooseMode.setkStartColor(Mode ? DARK : LIGHT); ChooseMode.setkEndColor(Mode ? DARK : LIGHT);
        setMode(lblChooseMode); panMode.setBackground(Mode ? DARK : LIGHT); setMode(rbnDark);   setMode(rbnLight);
        //Set Mode for Choose Languages
        ChooseLang.setkStartColor(Mode ? DARK : LIGHT); ChooseLang.setkEndColor(Mode ? DARK : LIGHT);
        setMode(lblChooseLang); setMode(lblLang);   iconVN.setBackground(BLIND);  iconUSA.setBackground(BLIND);
        //Set Mode for choose Theme
        ChooseTheme.setkStartColor(Mode ? DARK : LIGHT);    ChooseTheme.setkEndColor(Mode ? DARK : LIGHT);
        setMode(lblChooseTheme); setMode(lblTheme);
        iconDefault.setBackground(BLIND); iconBubbles.setBackground(BLIND);
        iconColor.setBackground(BLIND); iconCuteColor.setBackground(BLIND);
        //Set Mode for Play Music
        BackgroundMusic.setkStartColor(Mode ? DARK : LIGHT);BackgroundMusic.setkEndColor(Mode ? DARK : LIGHT);
        setMode(lblBMusic); iconBMusic.setBackground(BLIND);
        paintSong(currentPlayer);
    }
    private void showPan()                                  {
        panLang.setVisible(showLang);
        panTheme.setVisible(showTheme);
        panBMusic.setVisible(showMusic);
    }
    private void setTheme(String theme)                     {
        setSeting(Mode, theme, UserSetting.getLang());
        lblTheme.setText(Lang.getString(theme));
        setBar();
    }
    private void setBar()                                   {
        iconPlus.setPic(Theme+"Plus.png");
        iconPlay.setPic(Theme+(Play ? "Pause" : "Play")+".png");
        iconBackward.setPic(Theme+"Backward.png");
        iconForward.setPic(Theme+"Forward.png");
        iconRepeat.setPic(Theme+"Repeat"+(Repeat ? "Color.png" : ".png"));
        iconShuffle.setPic(Theme+"Shuffle"+(Shuffle ? "Color.png" : ".png"));
    }
    private void setLang(String lang)                       {
        lblLang.setText(Lang.getString(lang));
    }
    private void setSong()                                  {
        currentPlayer = 0;
        if(showMusic){
            PlayerMS = new MP3Player(); setList();
            Play = false;   Repeat = false; Shuffle = false; setBar();
        }
    }
    private void paintSong(int indexselect)                 {
        if(showMusic){
            panSong.removeAll();
            List list = PlayerMS.getPlayList();
            sizePlayser = list.size();
            for(int i = 0 ; i < sizePlayser ; i++){
                File file = new File("src/Data/Sound/"+list.get(i).toString());
                addSong(file, indexselect==indexPlayer);
            }
            indexPlayer = 0;
        }
    }
    private void addSong(File fileMusic, boolean select)    {
        com.k33ptoo.components.KGradientPanel song = new com.k33ptoo.components.KGradientPanel();
        com.AnLa.IcoPanel icon = new com.AnLa.IcoPanel();
        javax.swing.JLabel tittle = new javax.swing.JLabel();
        int index = indexPlayer; 
        icon.setVisible(false);
        song.setBackground(BLIND);
        song.setkBorderRadius(50);
        song.setkEndColor(select ? PLAYSONG : SONG);
        song.setkStartColor(select ? PLAYSONG : SONG);
        song.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon.setVisible(true);
            }
            @Override public void mouseExited(java.awt.event.MouseEvent evt) {
                icon.setVisible(false);
            }
        });
        icon.setBackground(select ? PLAYSONG : SONG);
        icon.setPic(Theme+"Remove.png");
        icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon.setVisible(true);
            }
            @Override public void mouseExited(java.awt.event.MouseEvent evt) {
                icon.setVisible(false);
            }
            @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                try { Files.delete(Paths.get("src/Data/Sound/"+fileMusic.getName().replaceAll("%20", " "))); panSong.remove(index); indexPlayer--; } 
                catch (IOException ex) { WOptionPaneM(P, Lang.getString("EDelete"));}
                paintSong(currentPlayer);
            }
        });
        javax.swing.GroupLayout iconLayout = new javax.swing.GroupLayout(icon);
        icon.setLayout(iconLayout);
        iconLayout.setHorizontalGroup(
            iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        iconLayout.setVerticalGroup(
            iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        tittle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tittle.setForeground(new Color(238, 242, 243));
        tittle.setText(fileMusic.getName().replaceAll("%20", " "));
        javax.swing.GroupLayout songLayout = new javax.swing.GroupLayout(song);
        song.setLayout(songLayout);
        songLayout.setHorizontalGroup(
            songLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, songLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        songLayout.setVerticalGroup(
            songLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songLayout.createSequentialGroup()
                .addGroup(songLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        
        setLocationRelativeTo(null);
        panSong.add(song, new AbsoluteConstraints(0,  20+indexPlayer*50+indexPlayer*20, 400, 50));
        indexPlayer++;
        validate();
        repaint();
    }
    private void getSong()                                  {
        File file = new File(PlayerMS.getPlayList().get(currentPlayer).toString());
        System.out.println("\tNow play: "+file.getName().replaceAll("%20", " "));   
    }
}