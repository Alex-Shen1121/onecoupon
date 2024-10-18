package top.codingshen.onecoupon.framework.exception;

import cn.hutool.core.util.StrUtil;
import lombok.Getter;
import top.codingshen.onecoupon.framework.errorCode.IErrorCode;

import java.util.Optional;

/**
 * @ClassName AbstractException
 * @Description 异常抽象类
 * @Author alex_shen
 * @Date 2024/10/19 - 02:15
 */
@Getter
public abstract class AbstractException extends RuntimeException {

    public final String errorCode;

    public final String errorMessage;

    public AbstractException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable);
        this.errorCode = errorCode.code();
        this.errorMessage = Optional.ofNullable(StrUtil.isBlankIfStr(message) ? message : null).orElse(errorCode.message());
    }

}
