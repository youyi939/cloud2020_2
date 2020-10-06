package springcloud;

import com.atguigu.springcloud.entities.StartTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/6 4:27 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderDemoApplication9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderDemoApplication9002.class, args);
        StartTime startTime = new StartTime();
        startTime.getStartTime("NacosProviderDemoApplication9002");
    }

}
