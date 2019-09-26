package javax.web.skeleton4j.benchmark.download.interfaces.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.skeleton4j.download.DownloadFileAble;

/**
 * Created by rnkrsoft.com on 2019/9/2.
 */
@Data
public class Download1Response extends AbstractResponse implements DownloadFileAble{
    String downloadFile;
}
