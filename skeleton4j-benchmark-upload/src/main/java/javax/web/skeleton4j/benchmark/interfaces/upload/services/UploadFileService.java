package javax.web.skeleton4j.benchmark.interfaces.upload.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.upload.domains.UploadFile1Request;
import javax.web.skeleton4j.benchmark.interfaces.upload.domains.UploadFileResponse;
import java.io.IOException;

/**
 * Created by rnkrsoft.com on 2019/7/11.
 */
@ApidocService("上传文件服务")
public interface UploadFileService {
    @ApidocInterface("上传文件1")
    UploadFileResponse upload1(UploadFile1Request request) throws IOException;
}
