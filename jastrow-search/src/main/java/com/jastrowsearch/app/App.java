package com.jastrowsearch.app;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {


            PDDocument document = PDDocument.load(new File("page.pdf"));

            String text = new PDFTextStripper().getText(document);
            System.out.println(text);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
