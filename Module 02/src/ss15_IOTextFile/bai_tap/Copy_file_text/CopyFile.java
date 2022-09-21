package ss15_IOTextFile.bai_tap.Copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static final String SOURCE_FILE_PATH = "D:\\CodeGym\\TrungDang_a0522i1\\Module 02\\src\\ss15_IOTextFile\\bai_tap\\Copy_file_text\\sourcefile.txt";
    private static final String DES_FILE_PATH = "D:\\CodeGym\\TrungDang_a0522i1\\Module 02\\src\\ss15_IOTextFile\\bai_tap\\Copy_file_text\\newfile.txt";

    public static List<String> readTXT() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();

        try {
            fileReader = new FileReader(SOURCE_FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return stringList;
    }

    public static void writeTXT(List<String> stringList) throws IOException {
        FileWriter fileWriter = new FileWriter(DES_FILE_PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "";
        for (String string: stringList){
            str += string + "\n";
        }
        if (str != null && !str.isEmpty()){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println("Copy done!!");
    }

    public static void main(String[] args) throws IOException {
        List<String> list = CopyFile.readTXT();
        writeTXT(list);
    }
}
