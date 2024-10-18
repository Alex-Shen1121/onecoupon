package top.codingshen.onecoupon.framework.exception;

import top.codingshen.onecoupon.framework.errorCode.BaseErrorCode;
import top.codingshen.onecoupon.framework.errorCode.IErrorCode;

/**
 * @ClassName RemoteException
 * @Description 远程服务调用异常｜比如订单调用支付失败，向上抛出的异常应该是远程服务调用异常
 * @Author alex_shen
 * @Date 2024/10/19 - 02:40
 */
public class RemoteException extends AbstractException {
    public RemoteException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public RemoteException(String message) {
        this(message, null, BaseErrorCode.CLIENT_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
