package com.dongba.foo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by dongba on 2017-07-19.
 */
public class Foo {

    public static void main(String[] args) throws IOException {
        File file = new File("luffy.jpg");
        byte[] result = new byte[(int)file.length()];
        FileInputStream fis = new FileInputStream(file);
        fis.read(result);
        fis.close();
    }
}
