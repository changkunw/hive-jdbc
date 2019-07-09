import org.apache.hadoop.hive.shims.ShimLoader;
import org.apache.hadoop.util.VersionInfo;


public class VersionTest {

    public static void main(String[] args) {

        System.out.println(VersionInfo.getVersion());

        String majorVersion = ShimLoader.getMajorVersion();
        System.out.println(majorVersion.split("\\.").length);
        System.out.println(majorVersion);

    }
}
