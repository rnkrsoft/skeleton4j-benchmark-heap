package javax.web.skeleton4j.benchmark.interfaces.upload.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.upload.AbstractUploadFileRequest;
import javax.web.skeleton4j.upload.UploadFileAble;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/7/11.
 */
@Data
public class UploadFile1Request extends AbstractUploadFileRequest{
    @ApidocElement("姓名")
    String name;
}
