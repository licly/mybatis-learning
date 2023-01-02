CREATE TABLE `account_balance` (
                                   `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                                   `customer_id` int(11) NOT NULL COMMENT '客户ID',
                                   `balance` decimal(10,0) DEFAULT NULL COMMENT '账户余额',
                                   `add_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
                                   `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;