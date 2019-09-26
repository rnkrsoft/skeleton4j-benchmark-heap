package javax.web.skeleton4j;

import com.rnkrsoft.skeleton4j.authority.mock.MockAuthorityExtractor;
import com.rnkrsoft.skeleton4j.authority.mock.MockAuthorityService;
import com.rnkrsoft.skeleton4j.benchmark.cascade.CascadeEventModule;
import com.rnkrsoft.skeleton4j.pool.CommunityModulePool;
import com.rnkrsoft.skeleton4j.registry.CommunityComponentRegistry;
import com.rnkrsoft.skeleton4j.service.CommunitySkeleton4jService;
import com.rnkrsoft.skeleton4j.theme.layui.community.LayuiCommunityTheme;
import com.rnkrsoft.skeleton4j.validate.DefaultSkeleton4jValidator;

import javax.web.skeleton4j.benchmark.*;
import javax.web.skeleton4j.boot.Skeleton4jApplicationLoader;
import javax.web.skeleton4j.boot.annotation.Skeleton4jApplication;
import javax.web.skeleton4j.boot.annotation.Skeleton4jCall;
import javax.web.skeleton4j.enums.InterfaceCall;
import javax.web.skeleton4j.enums.RuntimeEnvironment;

/**
 * Created by rnkrsoft.com on 2019/8/28.
 */
@Skeleton4jApplication(
        app = "Skeleton4j Benchmark",
        appDesc = "Skeleton4j基准测试",
        env = RuntimeEnvironment.DEV,
        modules = {
                AuthorityModule.class,
                CascadeModule.class,
                CascadeEventModule.class,
                DialogBoxModule.class,
                DownloadModule.class,
                EventModule.class,
                ExpModule.class,
                FormTableSimpleModule.class,
                FormTableModalModule.class,
                GroupModule.class,
                HomePageModule.class,
                ImpModule.class,
                MenuModule.class,
                MsgBoxModule.class,
                QueryModule.class,
                ReadableModule.class,
                WriteableModule.class,
                ResourceModule.class,
                ToolbarModule.class,
                UploadModule.class,
                WriteableModule.class
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
        serverPort = 8080,
//        serverHost = "localhost",
        overrideCalls = {
                @Skeleton4jCall(basePackage= "javax.web.skeleton4j.benchmark", call = InterfaceCall.LOCAL)
        }
)
public class Main {
    public static void main(String[] args) {
        Skeleton4jApplicationLoader.runWith(Main.class, args);
    }
}
