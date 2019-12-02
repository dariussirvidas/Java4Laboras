import com.paveldejimas.bazine.TransportasImpl;
import com.paveldejimas.isvestine.AutomobilisImpl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(".\\transportas.txt");
        Scanner input = new Scanner(file);
        ArrayList<AutomobilisImpl> transportoPriemones = new ArrayList<>();
        while (input.hasNext()) {
            String line = input.nextLine();
            Scanner lineScanner = new Scanner(line);
            if(wordCount(line) == 3) {
                /*transportoPriemones.add(new TransportasImpl(lineScanner.next(), lineScanner.nextBoolean(),
                        lineScanner.nextInt()));*/
            }
            else {
                transportoPriemones.add(new AutomobilisImpl(lineScanner.nextBoolean(), lineScanner.nextInt(),
                        lineScanner.next(), lineScanner.nextInt() ,lineScanner.nextInt(), lineScanner.nextBoolean()));
            }
        }
        ListIterator<AutomobilisImpl> list = transportoPriemones.listIterator();
        while(list.hasNext()) {
            System.out.println(list.next());
        }
        /*for (TransportasImpl transportoPriemone : transportoPriemones) {
                System.out.println(transportoPriemone);
        }*/
        list = transportoPriemones.listIterator();
        while (list.hasNext()) {
            if (((AutomobilisImpl)list.next()).getRida() > 500000)
                list.remove();
        }

        Collections.sort(transportoPriemones);
        System.out.println("================================================");

        for (TransportasImpl automobilis:transportoPriemones) {
            System.out.println(automobilis);
        }
    }

    private static int wordCount(String line) {
        Scanner s = new Scanner(line);
        int words = 0;
        while (s.hasNext()) {
            words++;
            s.next();
        }
        return words;
    }
}

