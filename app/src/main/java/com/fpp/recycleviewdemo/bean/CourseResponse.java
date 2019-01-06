package com.fpp.recycleviewdemo.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Description:  科二科三教程实体
 * Author: fpp
 * Date: 2018/5/30  8:32
 */

public class CourseResponse implements Serializable{


    /**
     * code : 1
     * msg : ok
     * data : {"list":[{"id":293,"post_title":"新手上路","more":{"thumbnail":"https://yun.xiaojiangjiakao.com/upload/portal/20180606/fb62555566d023af5eb348608f9cea60.png","template":""},"post_content":"","update_time":1528273217},{"id":292,"post_title":"驾照挂失","more":{"thumbnail":"https://yun.xiaojiangjiakao.com/upload/portal/20180606/af3eceace7affe9d588732932b04c616.png","template":""},"post_content":"","update_time":1528273193},{"id":291,"post_title":"驾照换证","more":{"thumbnail":"https://yun.xiaojiangjiakao.com/upload/portal/20180606/d4cde008733d83eb428b012828fe3350.png","template":""},"post_content":"","update_time":1528273158},{"id":290,"post_title":"驾照年审","more":{"thumbnail":"https://yun.xiaojiangjiakao.com/upload/portal/20180606/3c89717ddea0631dbf067289b6646fc9.png","template":""},"post_content":"","update_time":1528273127},{"id":289,"post_title":"驾照领取","more":{"thumbnail":"https://yun.xiaojiangjiakao.com/upload/portal/20180606/86aa065023f995fe52786a94ef6d28f0.png","template":""},"post_content":"","update_time":1528273035}]}
     */

    private int code;
    private String msg;
    private CourseListBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CourseListBean getData() {
        return data;
    }

    public void setData(CourseListBean data) {
        this.data = data;
    }

    public static class CourseListBean implements Serializable{
        private List<CourseBean> list;

        public List<CourseBean> getList() {
            return list;
        }

        public void setList(List<CourseBean> list) {
            this.list = list;
        }

        public static class CourseBean implements Serializable {
            /**
             * id : 293
             * post_title : 新手上路
             * more : {"thumbnail":"https://yun.xiaojiangjiakao.com/upload/portal/20180606/fb62555566d023af5eb348608f9cea60.png","template":""}
             * post_content :
             * update_time : 1528273217
             * favorite_count : 0
             * comment_count : 0
             * post_hits : 38
             * video : 0   // 0:不是视频；  1：是视频；
             */

            private int id;
            private String post_title;
            private MoreBean more;
            private String post_content;
            private String post_excerpt;
            private int update_time;
            private int favorite_count;
            private int comment_count;
            private int post_hits;
            private int video;



            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPost_title() {
                return post_title;
            }

            public void setPost_title(String post_title) {
                this.post_title = post_title;
            }

            public MoreBean getMore() {
                return more;
            }

            public void setMore(MoreBean more) {
                this.more = more;
            }

            public String getPost_content() {
                return post_content;
            }

            public void setPost_content(String post_content) {
                this.post_content = post_content;
            }

            public String getPost_excerpt() {
                return post_excerpt;
            }

            public void setPost_excerpt(String post_excerpt) {
                this.post_excerpt = post_excerpt;
            }

            public int getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(int update_time) {
                this.update_time = update_time;
            }

            public int getFavorite_count() {
                return favorite_count;
            }

            public void setFavorite_count(int favorite_count) {
                this.favorite_count = favorite_count;
            }

            public int getComment_count() {
                return comment_count;
            }

            public void setComment_count(int comment_count) {
                this.comment_count = comment_count;
            }

            public int getPost_hits() {
                return post_hits;
            }

            public void setPost_hits(int post_hits) {
                this.post_hits = post_hits;
            }

            public int getVideo() {
                return video;
            }

            public void setVideo(int video) {
                this.video = video;
            }

            public static class MoreBean implements Serializable{
                /**
                 * thumbnail : https://yun.xiaojiangjiakao.com/upload/portal/20180627/d4895ecdfec680fd2c0d9638702eb8dd.png
                 * template :
                 * files : [{"url":"http://img.xiaojiangjiakao.com/20180627/7podaodingdiantingchejiaocheng.mp4","name":""}]
                 */

                private String thumbnail;
                private String template;
                private List<FilesBean> files;

                public String getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public String getTemplate() {
                    return template;
                }

                public void setTemplate(String template) {
                    this.template = template;
                }
                public List<FilesBean> getFiles() {
                    return files;
                }

                public void setFiles(List<FilesBean> files) {
                    this.files = files;
                }

                public static class FilesBean implements Serializable{
                    /**
                     * url : http://img.xiaojiangjiakao.com/20180627/7podaodingdiantingchejiaocheng.mp4
                     * name :
                     */

                    private String url;
                    private String name;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }
    }
}
