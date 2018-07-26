package Lesson11.HomeWorke;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.nio.charset.Charset;

public class FactorialFileWriter {

    private final int name;

    public FactorialFileWriter(int name) {
        this.name = name;
    }

    public void writeToFile(BigInteger factorial) {

        Writer out = null;
        try {
            out = new OutputStreamWriter(
                    new FileOutputStream("files/factorial_" + name + ".txt"), Charset.defaultCharset());
            out.write(String.valueOf(factorial));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
