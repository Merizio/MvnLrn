package br.ufes.mvn;

import java.io.FileReader;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );

        //Tree<> 

        Reader in = new FileReader("female-and-male-life-expectancy-at-birth-in-years.csv");
        Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(in);
        for (CSVRecord record : records) {
            String Year = record.get(2);
            if(Year.equals("2020")){
                String country = record.get(0);
                String age = record.get(3);

                System.err.println("País:"+country+" Expectativa:"+age);
            }
        }
    }
}
