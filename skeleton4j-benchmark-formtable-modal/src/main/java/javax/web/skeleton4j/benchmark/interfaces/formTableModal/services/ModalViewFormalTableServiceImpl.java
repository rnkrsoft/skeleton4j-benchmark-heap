package javax.web.skeleton4j.benchmark.interfaces.formTableModal.services;

import com.rnkrsoft.time.DateStyle;
import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.common.interfaces.enums.ProvinceEnum;
import javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
public class ModalViewFormalTableServiceImpl implements ModalViewFormalTableService {
    @Override
    public ModalView1FormalTableResponse view1(ModalViewFormalTableRequest request) {
        ModalView1FormalTableResponse response = new ModalView1FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(ModalView1FormalTable.builder().age1(i).age2(i).amt1("12.34").build());
        }
        return response;
    }

    @Override
    public ModalView2FormalTableResponse view2(ModalViewFormalTableRequest request) {
        ModalView2FormalTableResponse response = new ModalView2FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(ModalView2FormalTable.builder()
                    .date1(DateUtils.toString(new Date(), DateStyle.DAY_FORMAT2))
                    .date2(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT2))
                    .build());
        }
        return response;
    }

    @Override
    public ModalView3FormalTableResponse view3(ModalViewFormalTableRequest request) {
        ModalView3FormalTableResponse response = new ModalView3FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(ModalView3FormalTable.builder()
                    .select1(ProvinceEnum.SI_CHUAN.getCode())
                    .selects1(Arrays.asList(ProvinceEnum.HE_NAN.getCode(), ProvinceEnum.SI_CHUAN.getCode()))
                    .build());
        }
        return response;
    }

    @Override
    public ModalView4FormalTableResponse view4(ModalViewFormalTableRequest request) {
        ModalView4FormalTableResponse response = new ModalView4FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(ModalView4FormalTable.builder()
                    .tree1("028")
                    .trees1(Arrays.asList("028", "0828"))
                    .build());
        }
        return response;
    }

    @Override
    public ModalView5FormalTableResponse view5(ModalViewFormalTableRequest request) {
        ModalView5FormalTableResponse response = new ModalView5FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(ModalView5FormalTable.builder()
                    .image1("/images/demo1.jpg")
                    .image2("/images/demo2.jpg")
                    .images1(Arrays.asList("/images/demo1.jpg"))
                    .images2(Arrays.asList("/images/demo1.jpg", "/images/demo2.jpg"))
                    .build());
        }
        return response;
    }

    @Override
    public ModalView6FormalTableResponse view6(ModalViewFormalTableRequest request) {
        ModalView6FormalTableResponse response = new ModalView6FormalTableResponse();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 3; i++) {
            response.getTable1().add(ModalView6FormalTable.builder()
                    .file1("/images/demo1.jpg")
                    .file2("/images/demo2.jpg")
                    .files1(Arrays.asList("/images/demo1.jpg"))
                    .files2(Arrays.asList("/images/demo1.jpg", "/images/demo2.jpg"))
                    .build());
        }
        return response;
    }
}
