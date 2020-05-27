package com.battle.panda.utils;

import com.alibaba.fastjson.JSONObject;

public class MyResponse {

        // 是否成功，true或false
        private Boolean success;
        // 提示信息
        private String msg;
        // 内部服务接口响应
        private Object data;

        // 默认成功
        public final static MyResponse SUCCESS = new MyResponse(true,"成功");
        // 默认失败
        public final static MyResponse FAILED = new MyResponse(false, "失败");
        // 参数错误
        public final static MyResponse FAILED_BED_REQUEST = new MyResponse(false, "参数错误");

        public MyResponse(Boolean success, String msg) {
            this.success = success;
            this.msg = msg;
        }

        public MyResponse(Boolean success, String msg, Object data) {
            this.success = success;
            this.msg = msg;
            this.data = data;
        }

        public static MyResponse success() {
            return new MyResponse(true, "成功");
        }

        public static MyResponse failed() {
            return new MyResponse(false, "失败");
        }

        public Boolean getSuccess() {
            return success;
        }

        public MyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }

        public String getMsg() {
            return msg;
        }

        public MyResponse setMsg(String msg) {
            this.msg = msg;
            return this;
        }

        public Object getData() {
            return data;
        }

        public MyResponse setData(Object data) {
            this.data = data;
            return this;
        }

        public JSONObject toJsonObject() {
            JSONObject result = new JSONObject();
            result.put("success", this.success);
            result.put("msg", this.msg);
            result.put("data", this.data);
            return result;
        }


}
