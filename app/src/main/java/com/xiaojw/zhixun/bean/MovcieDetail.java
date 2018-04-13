package com.xiaojw.zhixun.bean;

import java.util.List;

public class MovcieDetail {


    /**
     * rating : {"max":10,"average":6.6,"stars":"35","min":0}
     * reviews_count : 28
     * wish_count : 6437
     * douban_site :
     * year : 2018
     * images : {"small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2516079193.webp","large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2516079193.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2516079193.webp"}
     * alt : https://movie.douban.com/subject/26430636/
     * id : 26430636
     * mobile_url : https://movie.douban.com/subject/26430636/mobile
     * title : 狂暴巨兽
     * do_count : null
     * share_url : http://m.douban.com/movie/subject/26430636
     * seasons_count : null
     * schedule_url : https://movie.douban.com/subject/26430636/cinema/
     * episodes_count : null
     * countries : ["美国"]
     * genres : ["动作","科幻","冒险"]
     * collect_count : 749
     * casts : [{"alt":"https://movie.douban.com/celebrity/1044707/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.webp"},"name":"道恩·强森","id":"1044707"},{"alt":"https://movie.douban.com/celebrity/1049542/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486878030.07.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486878030.07.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486878030.07.webp"},"name":"娜奥米·哈里斯","id":"1049542"},{"alt":"https://movie.douban.com/celebrity/1044708/","avatars":{"small":"http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p6531.webp","large":"http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p6531.webp","medium":"http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p6531.webp"},"name":"杰弗里·迪恩·摩根","id":"1044708"},{"alt":"https://movie.douban.com/celebrity/1058055/","avatars":{"small":"http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p58173.webp","large":"http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p58173.webp","medium":"http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p58173.webp"},"name":"玛琳·阿克曼","id":"1058055"}]
     * current_season : null
     * original_title : Rampage
     * summary : 巨石强森饰演的灵长类动物学家一直与人类保持距离, 却跟极为聪明的银背大猩猩乔治有着深厚的感情。但是一次基因实验出错, 让这只温驯的大猩猩变成狂怒难驯的庞然巨兽。更可怕的是, 其他动物也发生了同样基因异变。他必须阻止这场全球性的灾难, 更重要是要拯救他的好友乔治。
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1317388/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1432840050.06.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1432840050.06.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1432840050.06.webp"},"name":"布拉德·佩顿","id":"1317388"}]
     * comments_count : 385
     * ratings_count : 713
     * aka : ["毁灭大作战(台)","末日困兽战(港)","狂暴：世纪浩劫","狂暴","怪兽大破坏"]
     */

    private RatingBean rating;
    private int reviews_count;
    private int wish_count;
    private String douban_site;
    private String year;
    private ImagesBean images;
    private String alt;
    private String id;
    private String mobile_url;
    private String title;
    private Object do_count;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private Object episodes_count;
    private int collect_count;
    private Object current_season;
    private String original_title;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<String> countries;
    private List<String> genres;
    private List<CastsBean> casts;
    private List<DirectorsBean> directors;
    private List<String> aka;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public static class RatingBean {
        /**
         * max : 10
         * average : 6.6
         * stars : 35
         * min : 0
         */

        private int max;
        private double average;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean {
        /**
         * small : http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2516079193.webp
         * large : http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2516079193.webp
         * medium : http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2516079193.webp
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class CastsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1044707/
         * avatars : {"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.webp"}
         * name : 道恩·强森
         * id : 1044707
         */

        private String alt;
        private AvatarsBean avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            /**
             * small : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.webp
             * large : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.webp
             * medium : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p196.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class DirectorsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1317388/
         * avatars : {"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1432840050.06.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1432840050.06.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1432840050.06.webp"}
         * name : 布拉德·佩顿
         * id : 1317388
         */

        private String alt;
        private AvatarsBeanX avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBeanX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanX avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanX {
            /**
             * small : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1432840050.06.webp
             * large : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1432840050.06.webp
             * medium : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1432840050.06.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
