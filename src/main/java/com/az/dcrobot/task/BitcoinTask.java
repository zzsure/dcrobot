package com.az.dcrobot.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @Scheduled(fixedRate = 3000)
    public void autoInvestTask() {
        LOG.info("任务执行时间：" + LocalDateTime.now());
    }

}
