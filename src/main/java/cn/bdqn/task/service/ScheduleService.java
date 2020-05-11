package cn.bdqn.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    /**
     * second(秒),minute(分),hour(时)，day of Month(日),month(月),day of week(周几)
     * 0 * * * * MON—SAT
     *   【0 0/5 14,18 * * ?】 每天14点整，和18点整， 每隔5分钟执行一次
     *   【0 15 10 ? * 1-6】每个月的周一到周六10：14执行一次
     *   【0 0 2 ? * 6L】每个月最后一个周六凌晨2点执行一次
     *   【0 0 2 LW * ？】每个月最后一个工作日凌晨2点执行一次
     *   【0 9 2-4 ？ * 1#1】每个月的第一个周一凌晨2点到4点期间，每个整点都执行一次
     *
     */


   // @Scheduled(cron = "0,1,2,3,4 * * * * MON—SAT") 代表0，1,2,3,4 执行
    //@Scheduled(cron = "0-4 * * * * MON—SAT ")  代表0到4之间执行一次
    //@Scheduled(cron = "0/4 * * * * MON-SAT") 代表4秒执行一次
    public  void  hello(){
        System.out.println("hello....");
    }
}
