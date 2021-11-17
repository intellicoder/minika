package com.monika.system.common;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * 通用返回数据封装
 * @param <T>
 */
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 默认成功信息 */
    public static final String DEF_SUCCESS_MSG = "操作成功！";
    /** 默认失败信息 */
    public static final String DEF_ERROR_MSG = "操作失败！";

    /** 成功状态 */
    private boolean success;

    /** 消息 */
    private String msg;

    /** 状态码 */
    private Integer code;

    /** 时间戳 */
    private Long timestamp;

    /** 数据对象 */
    private T data;




    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public T getData() {
        return data;
    }

    public ResultVo<T> setData(T data) {
        this.data = data;
        return this;
    }

    /**
     * 构造函数
     */
    public ResultVo() {
        // 初始化值
        this.success = true;
        this.msg = DEF_SUCCESS_MSG;
        this.code = HttpStatus.OK.value();
        this.timestamp = System.currentTimeMillis();
    }

    // ================================== 静态方法 ===================================

    /**
     * 返回成功状态
     * @return ResultVo<Object>
     */
    public static ResultVo<Object> success() {
        return new ResultVo<>();
    }

    /**
     * 返回成功状态
     * @param msg 返回信息
     * @return ResultVo<Object>
     */
    public static ResultVo<Object> success(String msg) {
        ResultVo<Object> ret = new ResultVo<>();
        ret.setMsg(msg);
        return ret;
    }

    /**
     * 返回成功状态
     * @param data 返回数据
     * @param <T> 泛型
     * @return ResultVo<T>
     */
    public static <T> ResultVo<T> success(T data) {
        ResultVo<T> ret = new ResultVo<>();
        ret.setData(data);
        return ret;
    }

    /**
     * 返回成功状态
     * @param msg 返回信息
     * @param data 返回数据
     * @param <T> 泛型
     * @return ResultVo<T>
     */
    public static <T> ResultVo<T> success(String msg, T data) {
        ResultVo<T> ret = new ResultVo<>();
        ret.setMsg(msg);
        ret.setData(data);
        return ret;
    }

    /**
     * 返回成功状态
     * @param msg 返回信息
     * @param data 返回数据
     * @param <T> 泛型
     * @return ResultVo<T>
     */
    public static <T> ResultVo<T> success(Integer code, String msg, T data) {
        ResultVo<T> ret = new ResultVo<>();
        ret.setCode(code);
        ret.setMsg(msg);
        ret.setData(data);
        return ret;
    }


    /**
     * 返回错误状态
     * @return ResultVo<Object>
     */
    public static ResultVo<Object> error() {
        return ResultVo.error(
                HttpStatus.INTERNAL_SERVER_ERROR.value()
                , DEF_ERROR_MSG, null);
    }

    /**
     * 返回错误状态
     * @param msg 返回信息
     * @return ResultVo<Object>
     */
    public static ResultVo<Object> error(String msg) {
        return ResultVo.error(
                HttpStatus.INTERNAL_SERVER_ERROR.value()
                , msg, null);
    }

    /**
     * 返回错误状态
     * @param code 错误编号
     * @param msg 返回信息
     * @return ResultVo<T>
     */
    public static ResultVo<Object> error(Integer code, String msg) {
        return ResultVo.error(code, msg, null);
    }

    /**
     * 返回成功状态
     * @param code 错误编号
     * @param data 返回数据
     * @param <T> 泛型
     * @return ResultVo<T>
     */
    public static <T> ResultVo<T> error(Integer code, String msg, T data) {
        ResultVo<T> ret = new ResultVo<>();
        ret.setMsg(msg);
        ret.setCode(code);
        ret.setData(data);
        ret.setSuccess(false);
        return ret;
    }

}

