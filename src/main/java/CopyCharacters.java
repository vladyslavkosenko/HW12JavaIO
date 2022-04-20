import java.io.*;

public class CopyCharacters {
    public void copy() throws IOException {

        Reader r = new FileReader("tmp.txt");
        Writer w = new FileWriter("test.txt");
        char[] buffer = new char[4096];
        int c = r.read(buffer);
        while (c != -1) {
            w.write(buffer, 0, c);
            c = r.read(buffer);

        }
        r.close();
        w.close();

    }
}

