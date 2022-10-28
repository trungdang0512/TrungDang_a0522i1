package ss15_IOTextFile.bai_tap.Read_CSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    private static final String FILE_URL = "D:\\CodeGym\\TrungDang_a0522i1\\Module 02\\src\\ss15_IOTextFile\\bai_tap\\Read_CSV\\mobile.csv";
    private static final String NEW_FILE = "D:\\CodeGym\\TrungDang_a0522i1\\Module 02\\src\\ss15_IOTextFile\\bai_tap\\Read_CSV\\newfile.csv";
    public static List<City> readCSV() throws IOException {
        List<City> cityList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        fileReader = new FileReader(FILE_URL);
        bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        City city;

        while ((line = bufferedReader.readLine()) != null){
            temp =  line.split(",");
            int id = Integer.parseInt(temp[0]);
            String shortName = temp[1];
            String fullName = temp[2];

            city = new City(id,shortName,fullName);
//            System.out.println(city.toString());
            cityList.add(city);
        }
        bufferedReader.close();
        return cityList;
    }

    public static void writeCSV(List<City> list) throws IOException {
        FileWriter fileWriter = new FileWriter(NEW_FILE);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str =  "";

        for (City city : list){
            str += city.getId() + "," + city.getShortName() + "," + city.getFullName() + "\n";
        }
        if (str != null && !str.isEmpty()){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println("Done!");
    }

    public static void main(String[] args) throws IOException {
        List<City> list = ReadCSV.readCSV();
        for(City city: list){
            System.out.println(city.toString());
        }
//        ReadCSV.writeCSV(list);
    }
}
