package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.ImageService;

/**
 * Created by rnkrsoft.com on 2018/12/14.
 */
public class ImageServiceImpl implements ImageService {
    @Override
    public Add1ImageResponse add1Image(Add1ImageRequest request) {
        System.out.println(request);
        Add1ImageResponse response = new Add1ImageResponse();
        response.setImage2("/images/demo2.jpg");
        response.setImage4("/images/demo1.jpg");
        response.getImages2().add("/images/demo1.jpg");

        response.getImages3().add("/images/demo1.jpg");
        response.getImages3().add("/images/demo2.jpg");

        response.getImages5().add("/images/demo1.jpg");

        response.getImages6().add("/images/demo1.jpg");
        response.getImages6().add("/images/demo2.jpg");
        return response;
    }

    @Override
    public Add2ImageResponse add2Image(Add2ImageRequest request) {
        System.out.println(request);
        Add2ImageResponse response = new Add2ImageResponse();
        return response;
    }

    @Override
    public Add3ImageResponse add3Image(Add3ImageRequest request) {
        System.out.println(request);
        Add3ImageResponse response = new Add3ImageResponse();
        return response;
    }
}
