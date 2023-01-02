package org.charlie.entity;

import lombok.Data;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 账户余额
 *
 * @author Charlie-6327
 * @date 2022/12/23
 */

@Data
public class AccountBalance {

    private Integer id;

    private Integer customerId;

    private BigDecimal balance;

    private LocalDateTime addTime;

    private LocalDateTime updateTime;
}
