package javax.web.skeleton4j.benchmark;

import com.rnkrsoft.skeleton4j.authority.mock.MockAuthorityExtractor;
import com.rnkrsoft.skeleton4j.authority.mock.MockAuthorityService;
import com.rnkrsoft.skeleton4j.pool.CommunityModulePool;
import com.rnkrsoft.skeleton4j.registry.CommunityComponentRegistry;
import com.rnkrsoft.skeleton4j.service.CommunitySkeleton4jService;
import com.rnkrsoft.skeleton4j.theme.layui.community.LayuiCommunityTheme;
import com.rnkrsoft.skeleton4j.validate.DefaultSkeleton4jValidator;

import javax.web.skeleton4j.boot.Skeleton4jApplicationLoader;
import javax.web.skeleton4j.boot.annotation.Skeleton4jApplication;
import javax.web.skeleton4j.boot.annotation.Skeleton4jRemoteConfigure;
import javax.web.skeleton4j.enums.RuntimeEnvironment;

/**
 * Created by rnkrsoft.com on 2019/3/9.
 */
@Skeleton4jApplication(
        remoteConfigure = @Skeleton4jRemoteConfigure(
                host = "localhost",
                port = 8080,
                groupId = "com.rnkrsoft.skeleton4j",
                artifactId = "skeleton4j-benchmark-jar",
                version = "1.0.2",
                env = "dev",
                securityKey = ""
        ),
        app = "Skeleton4jBenchmark",
        appDesc = "Skeleton4j基准测试",
        env = RuntimeEnvironment.DEV,
        modules = {
                DialogBoxModule.class,
        },
        themes = LayuiCommunityTheme.class,
        index = "/",
        defaultTheme = LayuiCommunityTheme.class,
        authorityService = MockAuthorityService.class,
        authorityExtractor = MockAuthorityExtractor.class,
        skeleton4jService = CommunitySkeleton4jService.class,
        componentRegistry = CommunityComponentRegistry.class,
        validator = DefaultSkeleton4jValidator.class,
        modulePool = CommunityModulePool.class,
        serverPort = 8080
)
public class DialogBox {
    public static void main(String[] args) {
        Skeleton4jApplicationLoader.runWith(DialogBox.class, args);
    }
}
