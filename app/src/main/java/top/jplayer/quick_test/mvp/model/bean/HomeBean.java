package top.jplayer.quick_test.mvp.model.bean;

import java.util.List;

import top.jplayer.baseprolibrary.mvp.model.bean.BaseBean;


/**
 * Created by Obl on 2018/7/6.
 * top.jplayer.quick_test.mvp.model.bean
 * call me : jplayer_top@163.com
 * github : https://github.com/oblivion0001
 */

public class HomeBean extends BaseBean {
    public static final int BANNER = 0;
    public static final int BODY_SINGLE = 1;
    public static final int TYPE = 2;
    public static final int BODY_FOOTER = 3;
    public String type;

    public HomeBean(String type) {
        this.type = type;
    }

    public HomeBean() {
    }

    /**
     * response : {"banner":["http://file.jplayer.top/image/1.jpg","http://file.jplayer.top/image/2.jpg","http://file.jplayer.top/image/3.jpg","http://file.jplayer.top/image/4.jpg","http://file.jplayer.top/image/5.jpg","http://file.jplayer.top/image/6.jpg"],"type":[{"typeTitle":"天猫","typeUrl":"https://gw.alicdn.com/tps/TB1d30fPVXXXXbGXXXXXXXXXXXX-183-144.png_.webp"},{"typeTitle":"天猫","typeUrl":"https://gw.alicdn.com/tps/TB1d30fPVXXXXbGXXXXXXXXXXXX-183-144.png_.webp"},{"typeTitle":"天猫","typeUrl":"https://gw.alicdn.com/tps/TB1d30fPVXXXXbGXXXXXXXXXXXX-183-144.png_.webp"},{"typeTitle":"天猫","typeUrl":"https://gw.alicdn.com/tps/TB1d30fPVXXXXbGXXXXXXXXXXXX-183-144.png_.webp"},{"typeTitle":"天猫","typeUrl":"https://gw.alicdn.com/tps/TB1d30fPVXXXXbGXXXXXXXXXXXX-183-144.png_.webp"},{"typeTitle":"天猫","typeUrl":"https://gw.alicdn.com/tps/TB1d30fPVXXXXbGXXXXXXXXXXXX-183-144.png_.webp"},{"typeTitle":"天猫","typeUrl":"https://gw.alicdn.com/tps/TB1d30fPVXXXXbGXXXXXXXXXXXX-183-144.png_.webp"},{"typeTitle":"天猫","typeUrl":"https://gw.alicdn.com/tps/TB1d30fPVXXXXbGXXXXXXXXXXXX-183-144.png_.webp"}],"single":[{"typeTitle":"","typeUrl":"http://gw.alicdn.com/bao/uploaded/i3/2616970884/TB1a5aayYuWBuNjSszgXXb8jVXa_!!0-item_pic.jpg_360x10000Q75.jpg_.webp"},{"typeTitle":"","typeUrl":"http://gw.alicdn.com/bao/uploaded/i3/2616970884/TB1a5aayYuWBuNjSszgXXb8jVXa_!!0-item_pic.jpg_360x10000Q75.jpg_.webp"},{"typeTitle":"","typeUrl":"http://gw.alicdn.com/bao/uploaded/i3/2616970884/TB1a5aayYuWBuNjSszgXXb8jVXa_!!0-item_pic.jpg_360x10000Q75.jpg_.webp"}],"footer":[{"typeTitle":"","typeUrl":"http://gw.alicdn.com/imgextra/i1/2616970884/TB2RUwZCCtYBeNjSspkXXbU8VXa_!!2616970884.jpg_790x10000Q75.jpg_.webp"}]}
     */

    public ResponseBean response;

    public static class ResponseBean {
        public List<String> banner;
        public List<TypeBean> type;
        public List<SingleBean> single;
        public List<FooterBean> footer;

        public static class TypeBean {
            /**
             * typeTitle : 天猫
             * typeUrl : https://gw.alicdn.com/tps/TB1d30fPVXXXXbGXXXXXXXXXXXX-183-144.png_.webp
             */

            public String typeTitle;
            public String typeUrl;
        }

        public static class SingleBean {
            /**
             * typeTitle :
             * typeUrl : http://gw.alicdn.com/bao/uploaded/i3/2616970884/TB1a5aayYuWBuNjSszgXXb8jVXa_!!0-item_pic.jpg_360x10000Q75.jpg_.webp
             */

            public String typeTitle;
            public String typeUrl;
        }

        public static class FooterBean {
            /**
             * typeTitle :
             * typeUrl : http://gw.alicdn.com/imgextra/i1/2616970884/TB2RUwZCCtYBeNjSspkXXbU8VXa_!!2616970884.jpg_790x10000Q75.jpg_.webp
             */

            public String typeTitle;
            public String typeUrl;
        }
    }
}

