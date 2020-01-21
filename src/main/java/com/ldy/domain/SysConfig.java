package com.ldy.domain;

 public class SysConfig {
        private String cid;
        private String id;
        private String userId;

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        @Override
        public String toString() {
            return "SysConfig{" +
                    "cid='" + cid + '\'' +
                    ", id='" + id + '\'' +
                    ", userId='" + userId + '\'' +
                    '}';
        }
}