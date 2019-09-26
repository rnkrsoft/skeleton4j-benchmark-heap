package javax.web.skeleton4j.benchmark.interfaces.upload.services.impl;

import com.rnkrsoft.io.buffer.ByteBuf;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import javax.web.skeleton4j.benchmark.interfaces.upload.domains.UploadFile1Request;
import javax.web.skeleton4j.benchmark.interfaces.upload.domains.UploadFileResponse;
import javax.web.skeleton4j.benchmark.interfaces.upload.services.UploadFileService;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by rnkrsoft.com on 2019/7/11.
 */
public class UploadFileServiceImpl implements UploadFileService {
    @Override
    public UploadFileResponse upload1(UploadFile1Request request) throws IOException {
        UploadFileResponse response = new UploadFileResponse();
        ByteBuf byteBuf = ByteBuf.allocate(1024).autoExpand(true);
        InputStream is = null;
        try {
            is = request.inputStream();
            byteBuf.read(is);
            System.out.println(byteBuf.getString(Charset.forName("UTF-8"), byteBuf.readableLength()));
            System.out.println(request.getName());
        }finally {
            IOUtils.closeQuietly(is);
        }
        return response;
    }
}
