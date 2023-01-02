package org.charlie.dao;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@SpringBootTest
class AccountBalanceDaoTest {

    @Resource
    private AccountBalanceDao dao;

    @org.junit.jupiter.api.Test
    void queryAccountByCustomId() {
        dao.queryAccountByCustomId(1);
    }

    @org.junit.jupiter.api.Test
    void saveAccountBalance() {
    }

    @org.junit.jupiter.api.Test
    void updateAccountBalance() {
    }
}