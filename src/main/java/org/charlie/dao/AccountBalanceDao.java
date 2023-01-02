package org.charlie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.charlie.entity.AccountBalance;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Charlie-6327
 * @date 2022/12/23
 */

// @Mapper
public interface AccountBalanceDao {

    AccountBalance queryAccountByCustomId(@Param("id") Integer id);

    int saveAccountBalance(@Param("ab") AccountBalance accountBalance);

    int updateAccountBalance(AccountBalance accountBalance);
}
