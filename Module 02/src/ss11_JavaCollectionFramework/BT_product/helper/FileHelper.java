package ss11_JavaCollectionFramework.BT_product.helper;

import ss11_JavaCollectionFramework.BT_product.models.Product;
import ss11_JavaCollectionFramework.BT_product.util.Constant;
import ss15_IOTextFile.bai_tap.Read_CSV.City;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static List<String> readFile(String path) {
        List<String> result = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;

            while ((line = reader.readLine()) != null) {
                if(!line.isEmpty()){
                    result.add(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void writeFile(List<Product> list) throws IOException {
        FileWriter fileWriter = new FileWriter(Constant.FILE_PATH);
        BufferedWriter  bufferedWriter = new BufferedWriter(fileWriter);
        String str = "";

        for (Product product: list){
            str += product.getId()  + "," + product.getProductName() + "," + product.getPrice() + "\n";
        }
        if (str != null && !str.isEmpty()){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
