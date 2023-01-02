package org.charlie.controller;

import org.charlie.entity.AccountBalance;
import org.charlie.service.AccountBalanceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Charlie-6327
 * @date 2022/12/24
 */

@RequestMapping("/accountBalance")
@RestController
public class AccountBalanceController {

    @Resource
    private AccountBalanceService service;

    @GetMapping("/queryAccountByCustomId")
    public AccountBalance queryAccountByCustomId(@RequestParam("customerId") Integer customerId) {
        return service.queryAccountByCustomId(customerId);
    }

    @PostMapping("/saveAccountBalance")
    public int saveAccountBalance(@RequestBody AccountBalance accountBalance) {
        return service.saveAccountBalance(accountBalance);
    }

}
