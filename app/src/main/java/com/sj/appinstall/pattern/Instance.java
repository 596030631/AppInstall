package com.sj.appinstall.pattern;

import com.sj.appinstall.net.HttpUtil;
import com.sj.appinstall.net.LoadUtil;

public final class Instance {
//    private Instance() {
//
//    }

    public static class Factory {
        public static final HttpUtil httpUtil = new HttpUtil();
        public static final LoadUtil loadUtil = new LoadUtil();
    }


//    public static Instance getInstance() {
//        return S.ins;
//    }
//
//    private Map<String, T> map = new HashMap<>();
//
//    public T ins(Class<T> c) throws InstantiationException, IllegalAccessException {
//        if (map.containsKey(c.getSimpleName())) {
//            T v = map.get(c.getSimpleName());
//            if (v != null) {
//                return v;
//            }
//        }
//        T value = c.newInstance();
//        map.put(c.getSimpleName(), value);
//        return value;
//    }
}
