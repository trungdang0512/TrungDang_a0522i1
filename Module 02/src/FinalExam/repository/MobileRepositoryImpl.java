package FinalExam.repository;

import FinalExam.helper.FileHelper;
import FinalExam.models.ChinhHang;
import FinalExam.models.Mobile;
import FinalExam.models.XachTay;
import FinalExam.util.Constant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileRepositoryImpl implements IMobileRepository {
    private static List<Mobile> mobileList = new ArrayList<>();
    private static FileHelper fileHelper = new FileHelper();

    public MobileRepositoryImpl(){
        mobileList = this.mapToMobile();
    }

    @Override
    public void addMobile(Mobile mobile) {
        int lastId = 0;
        if (mobileList.size() > 0){
            lastId = mobileList.get(mobileList.size()-1).getId();
        }
        mobile.setId(lastId+1);
        mobileList.add(mobile);
        fileHelper.write(Constant.FILE_PATH, Collections.singletonList(mobile), true);
    }

    @Override
    public List findAll() {
        return mobileList;
    }

    @Override
    public void removeMobile(int inputID) {
        for (int i = 0; i < mobileList.size(); i++){
            if (mobileList.get(i).getId() == inputID){
                mobileList.remove(i);
                fileHelper.write(Constant.FILE_PATH,mobileList,false);
            }
        }
    }

    @Override
    public List findMobileByName(String inputName) {
        List result = new ArrayList();
        for (int i = 0; i < mobileList.size(); i++){
            if (mobileList.get(i).getName().contains(inputName)){
                result.add(mobileList.get(i));
            }
        }
        return result;
    }

    @Override
    public List findMobileByID(int inputID) {
        List result = new ArrayList();
        for (int i = 0; i < mobileList.size(); i++){
            if (mobileList.get(i).getId() == inputID){
                result.add(mobileList.get(i));
            }
        }
        return result;
    }

    @Override
    public boolean checkMobileNameExist(String inputName) {
        return false;
    }

    @Override
    public boolean checkMobileIDExist(int inputID) {
        boolean check = false;
        for (int i = 0; i < mobileList.size(); i++){
            if (mobileList.get(i).getId() == inputID){
                check = true;
            }
        }
        return check;
    }

    @Override
    public int findMobileIndex(Mobile mobile) {
        return 0;
    }

    private List mapToMobile(){
        List result = new ArrayList();
        List<String> lines = fileHelper.read(Constant.FILE_PATH);

        for (String line: lines){
            String tmp[] = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String name = tmp[1];
            int price = Integer.parseInt(tmp[2]);
            int amount = Integer.parseInt(tmp[3]);
            String producer = tmp[4];

            if (tmp[7].equals("ChinhHang")){
                int day = Integer.parseInt(tmp[5]);
                String zone = tmp[6];

                result.add(new ChinhHang(id,name,price,amount,producer,day,zone));
            }else {
                String country = tmp[5];
                String status = tmp[6];

                result.add(new XachTay(id,name,price,amount,producer,country,status));
            }
        }
        return result;
    }
}
