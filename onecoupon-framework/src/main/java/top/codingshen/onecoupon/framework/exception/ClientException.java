package top.codingshen.onecoupon.framework.exception;

import top.codingshen.onecoupon.framework.errorCode.BaseErrorCode;
import top.codingshen.onecoupon.framework.errorCode.IErrorCode;

/**
 * @ClassName ClientException
 * @Description 客户端异常｜用户发起调用请求后因客户端提交参数或其他客户端问题导致的异常
 * @Author alex_shen
 * @Date 2024/10/19 - 02:34
 */
public class ClientException extends AbstractException{

    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ClientException(String message) {
        this(message, null, BaseErrorCode.CLIENT_ERROR);
    }

    public ClientException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ClientException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
