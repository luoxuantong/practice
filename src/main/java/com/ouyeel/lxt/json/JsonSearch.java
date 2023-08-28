package com.ouyeel.lxt.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringJoiner;

public class JsonSearch {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\18538\\Desktop\\1.txt"));
            StringJoiner stringJoiner = new StringJoiner("");
            for (String line : allLines) {
                stringJoiner.add(line);
//                System.out.println(line);
            }
            JSONObject jsonObject = JSON.parseObject(stringJoiner.toString());
            JSONArray headReqList = jsonObject.getJSONArray("headReqList");
            headReqList.forEach(a->{
                JSONObject a1 = (JSONObject) a;
                JSONArray settleLineReqList = a1.getJSONArray("settleLineReqList");
                settleLineReqList.forEach(b->{
                    JSONObject b1 = (JSONObject) b;
                    String settleObjId = b1.getString("settleObjId");
                    System.out.println(settleObjId+",");
                });
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
