package com.example.shardingjdbcdemo;

import com.example.shardingjdbcdemo.dao.OrderItemMapper;
import com.example.shardingjdbcdemo.dao.OrderMapper;
import com.example.shardingjdbcdemo.model.Order;
import com.example.shardingjdbcdemo.model.OrderExample;
import com.example.shardingjdbcdemo.model.OrderItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcDemoApplicationTests {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private OrderItemMapper orderItemMapper;
    @Test
    public void contextLoads() {
    }

    @Test
//    @Transactional(propagation = Propagation.REQUIRED)
    public void testOrder() {
        Order order = new Order();
        order.setUserId(14);
        order.setOrderStatus(1);
        order.setOrderAmount(10.0);
        orderMapper.insertSelective(order);

        /*Order order2 = new Order();
        order2.setUserId(15);
        order2.setOrderStatus(1);
        order2.setOrderAmount(8.0);
        order2.setOrderId(1);
        orderMapper.insertSelective(order2);*/

//        throw new RuntimeException("test XA");
    }

    @Test
    public void testSelectOrder(){
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andOrderIdEqualTo("2");
        List<Order> orders = orderMapper.selectByExample(orderExample);
        orders.forEach(o-> System.out.println(o.getOrderId()+"----"+o.getUserId()));
    }
    @Test
    public void testInsertOrderItem(){
        OrderItem orderItem = new OrderItem();
        orderItem.setId(1);
        orderItem.setOrderId(2);
        orderItem.setItemName("手机");

        orderItemMapper.insert(orderItem);
    }

}
