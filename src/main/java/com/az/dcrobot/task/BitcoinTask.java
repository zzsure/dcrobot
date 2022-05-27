package com.az.dcrobot.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 比特币定时任务
 * @author zzsure
 * @date 2022/05/27
 */
@Component
public class BitcoinTask {

    private static final Logger LOG = LoggerFactory.getLogger(BitcoinTask.class);

    @Value("${env}")
    private String env;

    @Scheduled(fixedRate = 3000)
    public void autoInvestTask() {
        LOG.info("task execute time: " + LocalDateTime.now() + " in env: " + env);
    }

}
