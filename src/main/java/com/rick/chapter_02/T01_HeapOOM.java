package com.rick.chapter_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Rick
 * @Date: 2022/10/5 11:43
 */
public class T01_HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
