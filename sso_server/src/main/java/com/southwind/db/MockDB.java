package com.southwind.db;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 *   后期可以考虑把这个token放到 Redis
 *
 */
public class MockDB {
    //记录token
    public static Set<String> tokenSet = new HashSet<>();
    //客户端登出地址
    public static Map<String,Set<String>> clientLogoutUrlMap = new HashMap<>();
}
