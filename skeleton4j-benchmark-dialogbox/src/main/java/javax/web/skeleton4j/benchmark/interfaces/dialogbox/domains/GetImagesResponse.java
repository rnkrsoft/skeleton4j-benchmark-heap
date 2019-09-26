package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/3/31.
 */
@Data
public class GetImagesResponse extends AbstractResponse {
    @ApidocElement(value = "值", valueDisplayType = ValueDisplayType.IMAGE, layout = WebLayout.LINEAR)
    final List<String> value1 = new ArrayList<String>();
}
