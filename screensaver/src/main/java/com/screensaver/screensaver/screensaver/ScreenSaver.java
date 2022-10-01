package com.screensaver.screensaver.screensaver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

@Component
@RequiredArgsConstructor
public class ScreenSaver extends JFrame {

    JFileChooser chooser;
    int i;

    @PostConstruct
    void setPath() throws Exception {
        chooseDirectory();
        System.out.println(chooser.getSelectedFile());
    }

    public JFileChooser chooseDirectory() {
        chooser = new javax.swing.JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Définition du dossier de destination...");
        chooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //
        if (chooser.showOpenDialog(this) == javax.swing.JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): "
                    +  chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : "
                    +  chooser.getSelectedFile());
        }
        else {
            System.out.println("No Selection ");
        }
        return chooser;
    }

    public void takeScreenshot() {
        try {
            Robot robot = new Robot();
            BufferedImage img = robot.createScreenCapture(new Rectangle(0, 0, 1050, 1050));
            ImageIO.write(img, "png", new File("C:\\temp\\"+i+".png"));
            i++;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
