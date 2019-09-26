package javax.web.skeleton4j.benchmark;

import com.rnkrsoft.skeleton4j.service.CommunitySkeleton4jService;
import com.rnkrsoft.skeleton4j.authority.mock.MockAuthorityExtractor;
import com.rnkrsoft.skeleton4j.authority.mock.MockAuthorityService;
import com.rnkrsoft.skeleton4j.pool.CommunityModulePool;
import com.rnkrsoft.skeleton4j.registry.CommunityComponentRegistry;
import com.rnkrsoft.skeleton4j.theme.layui.community.LayuiCommunityTheme;
import com.rnkrsoft.skeleton4j.validate.DefaultSkeleton4jValidator;

import javax.web.skeleton4j.boot.Skeleton4jApplicationLoader;
import javax.web.skeleton4j.boot.annotation.Skeleton4jApplication;
import javax.web.skeleton4j.enums.RuntimeEnvironment;

/**
 * Created by rnkrsoft.com on 2019/7/26.
 */
@Skeleton4jApplication(
        app = "Skeleton4j Benchmark",
        appDesc = "Skeleton4j基准测试1",
        env = RuntimeEnvironment.DEV,
        modules = {
                CascadeModule.class
        },
        themes = LayuiCommunityTheme.class,
        index = "/",
        fileStoreProviderUrl = "http://localhost:8080/file.do",
        defaultTheme = LayuiCommunityTheme.class,
        authorityService = MockAuthorityService.class,
        authorityExtractor = MockAuthorityExtractor.class,
        skeleton4jService = CommunitySkeleton4jService.class,
        componentRegistry = CommunityComponentRegistry.class,
        validator = DefaultSkeleton4jValidator.class,
        modulePool = CommunityModulePool.class,
        serverPort = 8080
)
public class Cascade {
    public static void main(String[] args) {
        Skeleton4jApplicationLoader.runWith(Cascade.class, args);
    }
}
