package com.example.shardingjdbcdemo.dao;

import com.example.shardingjdbcdemo.model.OrderItem;
import com.example.shardingjdbcdemo.model.OrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    long countByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    int deleteByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    int insert(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    int insertSelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    List<OrderItem> selectByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item1
     *
     * @mbg.generated Fri Jul 03 09:03:34 GMT+08:00 2020
     */
    int updateByPrimaryKey(OrderItem record);
}