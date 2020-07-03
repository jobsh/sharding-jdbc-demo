# sharding-jdbc-demo
## sharding-jdbc.xml说明
整体架构为两个节点做分库分表，xml中分别为ms0和ms1
其中ms0为主从的节点
ms0 :
  192.168.248.172 : 作为主库
  192.168.248.173 : 作为从库
  配置的主从规则为random => 只能从库中读
ms1 ：
  192.168.248.173   
  使用mysqlww5.7  如果使用mysql8.0  需要更换mysql-connector驱动， 驱动名是：com.mysql.cj.jdbc.Driver
