package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.services;

import com.rnkrsoft.time.DateStyle;
import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains.*;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
public class ViewFormalTableServiceImpl implements ViewFormalTableService{
    @Override
    public View1FormalTableResponse view1(ViewFormalTableRequest request) {
        View1FormalTableResponse response = new View1FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(View1FormalTable.builder().age1(i).age2(i).amt1("12.34").build());
        }
        return response;
    }

    @Override
    public View2FormalTableResponse view2(ViewFormalTableRequest request) {
        View2FormalTableResponse response = new View2FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(View2FormalTable.builder()
                    .date1(DateUtils.toString(new Date(), DateStyle.DAY_FORMAT2))
                    .date2(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT2))
                    .build());
        }
        return response;
    }

    @Override
    public View3FormalTableResponse view3(ViewFormalTableRequest request) {
        View3FormalTableResponse response = new View3FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(View3FormalTable.builder()
                    .select1(ProvinceEnum.SI_CHUAN.getCode())
                    .selects1(Arrays.asList(ProvinceEnum.HE_NAN.getCode(), ProvinceEnum.SI_CHUAN.getCode()))
                    .build());
        }
        return response;
    }

    @Override
    public View4FormalTableResponse view4(ViewFormalTableRequest request) {
        View4FormalTableResponse response = new View4FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(View4FormalTable.builder()
                    .tree1("028")
                    .trees1(Arrays.asList("028", "0828"))
                    .build());
        }
        return response;
    }

    @Override
    public View5FormalTableResponse view5(ViewFormalTableRequest request) {
        View5FormalTableResponse response = new View5FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(View5FormalTable.builder()
                    .image1("/images/demo1.jpg")
                    .image2("/images/demo2.jpg")
                    .images1(Arrays.asList("/images/demo1.jpg"))
                    .images2(Arrays.asList("/images/demo1.jpg", "/images/demo2.jpg"))
                    .build());
        }
        return response;
    }

    @Override
    public View6FormalTableResponse view6(ViewFormalTableRequest request) {
        View6FormalTableResponse response = new View6FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(View6FormalTable.builder()
                    .file1("/images/demo1.jpg")
                    .file2("/images/demo2.jpg")
                    .files1(Arrays.asList("/images/demo1.jpg"))
                    .files2(Arrays.asList("/images/demo1.jpg", "/images/demo2.jpg"))
                    .build());
        }
        return response;
    }
}
