package org.charlie.service;

import org.charlie.dao.AccountBalanceDao;
import org.charlie.entity.AccountBalance;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Charlie-6327
 * @date 2022/12/24
 */

@Service
public class AccountBalanceService {

    private AccountBalanceDao dao;

    public AccountBalanceService(AccountBalanceDao dao) {
        this.dao = dao;
    }

    public AccountBalanceService() {}

    @Transactional(rollbackFor = Exception.class)
    public AccountBalance queryAccountByCustomId(Integer customerId) {
        return dao.queryAccountByCustomId(customerId);
    }

    @Transactional(rollbackFor = Exception.class)
    public int saveAccountBalance(AccountBalance accountBalance) {
        return dao.saveAccountBalance(accountBalance);
    }
}
