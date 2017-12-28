package zookeeper;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;
import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/**
 * Created by 罗选通 on 2017/11/9.
 */
public class Zookeeper {
  @Test
  public void test() throws UnknownHostException {
    String PATH = "/configceter";
    String serviceName = "service-a";
    ZkClient zkClient = new ZkClient("127.0.0.1:2181");
    boolean exists = zkClient.exists(PATH);
    if (!exists) {
      zkClient.createPersistent(PATH);
    }
    boolean existsserviceName = zkClient.exists(PATH + "/" + serviceName);
    if (!existsserviceName) {
      zkClient.createPersistent(PATH + "/" + serviceName);
    }
    InetAddress addr = InetAddress.getLocalHost();
    String ip = addr.getHostAddress().toString();
    zkClient.createEphemeral(PATH + "/" + serviceName + "/" + ip);//创建当前服务器节点
    zkClient.subscribeChildChanges(PATH + "/" + serviceName + "/" + ip, new IZkChildListener() {
      @Override
      public void handleChildChange(String parentPath, List<String> currentChilds) throws Exception {
        System.out.println(parentPath);
        List<String> lists = currentChilds;
        System.out.println(lists);
      }
    });
    System.out.println(exists);
  }
}
