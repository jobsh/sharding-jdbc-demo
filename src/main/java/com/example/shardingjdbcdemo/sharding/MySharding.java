package com.example.shardingjdbcdemo.sharding;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class MySharding implements PreciseShardingAlgorithm<String> {
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
        // 使用UUID 这里需要是String
        String id = shardingValue.getValue();

        long mode =id.hashCode() % availableTargetNames.size();
        String[] strings = availableTargetNames.toArray(new String[0]);
        mode = Math.abs(mode);

        System.out.println(strings[0]+"---------"+strings[1]);
        System.out.println("mode="+mode);
        return strings[(int)mode];
    }
}
