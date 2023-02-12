package com.ds.pattern.create.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static final Map<String, Object> inst = new ConcurrentHashMap<>();

    public ContainerSingleton(){}

    public Object getBean(String className){
        synchronized (inst){
            if(!inst.containsKey(className)){
                Object obj = null;
                try{
                    obj = Class.forName(className).newInstance();
                    inst.put(className, inst);
                }catch (Exception e){
                  e.printStackTrace();
                }
                return obj;
            }else {
                return inst.get(className);
            }
        }
    }

}
