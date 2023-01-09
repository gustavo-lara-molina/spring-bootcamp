package com.example.question1;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
public class SupplyData {
    private List<Supply> supplyList;
    private static SupplyData instance = null;
    public static SupplyData getInstance(){
        if(instance == null){
            instance = new SupplyData();
        }
        return instance;
    }
    public SupplyData(){
        supplyList = new ArrayList<Supply>();
        supplyList.add(new Supply("Product1", "2021-03-16T08:53:48.616Z",10,""));
        supplyList.add(new Supply ("Product2","2021-03-16T08:59:48.616Z",5,""));
        supplyList.add(new Supply ("Product3","2021-03-16T09:10:48.616Z",30,""));
        supplyList.add(new  Supply ("Product4","2021-03-16T09:10:48.616Z",20, ""));
    }
    public List<Supply>fetchProducts(){
        return supplyList;
    }
 }
