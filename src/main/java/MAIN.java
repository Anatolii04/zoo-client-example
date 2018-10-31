import org.apache.log4j.BasicConfigurator;
import org.apache.zookeeper.KeeperException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;

public class MAIN {
    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        BasicConfigurator.configure();
        Logger logger = LoggerFactory.getLogger(MAIN.class);
        ZKManager zkManager = new ZKManager();
        Object o = zkManager.getZNodeData("/ps/config/schedule/ASSET_SIB_BS_PLACE");
        logger.info(o.toString());
        for (String s:
             zkManager.getChildrenList("/ps/config/schedule", false)) {
            logger.info(s);
        }
    }
}
