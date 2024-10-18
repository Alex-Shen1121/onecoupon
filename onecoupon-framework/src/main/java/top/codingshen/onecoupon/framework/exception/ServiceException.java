package top.codingshen.onecoupon.framework.exception;

import top.codingshen.onecoupon.framework.errorCode.BaseErrorCode;
import top.codingshen.onecoupon.framework.errorCode.IErrorCode;

import java.util.Optional;

/**
 * @ClassName ServiceException
 * @Description 服务端运行异常｜请求运行过程中出现的不符合业务预期的异常
 * @Author alex_shen
 * @Date 2024/10/19 - 02:37
 */
public class ServiceException extends AbstractException {
    public ServiceException(String message) {
        this(message, null, BaseErrorCode.SERVICE_ERROR);
    }

    public ServiceException(IErrorCode errorCode) {
        this(null, errorCode);
    }

    public ServiceException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ServiceException(String message, Throwable throwable, IErrorCode errorCode) {
        super(Optional.ofNullable(message).orElse(errorCode.message()), throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ServiceException{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
