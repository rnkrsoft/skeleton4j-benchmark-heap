package javax.web.skeleton4j.benchmark.download.interfaces.services.impl;

import com.rnkrsoft.io.buffer.ByteBuf;

import javax.web.skeleton4j.benchmark.download.interfaces.domains.Create2Request;
import javax.web.skeleton4j.benchmark.download.interfaces.domains.Create2Response;
import javax.web.skeleton4j.benchmark.download.interfaces.domains.Download1Request;
import javax.web.skeleton4j.benchmark.download.interfaces.domains.Download1Response;
import javax.web.skeleton4j.benchmark.download.interfaces.services.DownloadService;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2019/9/2.
 */
public class DownloadServiceImpl implements DownloadService {
    @Override
    public Download1Response download1(Download1Request request) {
        Download1Response response = new Download1Response();
        ByteBuf byteBuf = ByteBuf.allocate(1024).autoExpand(true);
        byteBuf.putUTF8("this is a test").putUTF8("this is a test2");
        File file = new File("./target", UUID.randomUUID().toString() + ".txt");
        try {
            byteBuf.write(file.getCanonicalPath());
            response.setDownloadFile(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public Create2Response create2(Create2Request request) {
        Create2Response response = new Create2Response();
        return response;
    }
}
