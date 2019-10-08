package com.tools.extract2kafka.common.exception;

import com.tools.extract2kafka.common.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 异常处理器
 */
//@RestControllerAdvice(basePackages={"com.tools.extract2kafka"})
@RestControllerAdvice
public class CommonExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	private static String getOutMsg(final Throwable e) {
		if (e != null) {
			return e.getClass().getCanonicalName();
		}
		return "";
	}

	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(CommonException.class)
	public Result handleRRException(CommonException e){
		return Result.error( e.getMessage(),e.getMessage());
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public Result handlerNoFoundException(Exception e) {
		logger.error(e.getMessage(), e);
		return  Result.error( e.getMessage(),"路径不存在，请检查路径是否正确~");
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public Result handleDuplicateKeyException(DuplicateKeyException e){
		logger.error(e.getMessage(), e);
		return Result.error(e.getMessage(),"数据库中已存在该记录");
	}


	@ExceptionHandler(MissingServletRequestParameterException.class)
	public Result<Object> exception(MissingServletRequestParameterException e) {
		logger.error("参数异常：{}", e.getMessage());
		return Result.paramError("缺少必要参数",getOutMsg(e), null);
	}

	@ExceptionHandler(BindException.class)
	public Result<Object> exception(BindException e) {
		logger.error("参数异常：{}", e.getMessage());
		return Result.paramError(getOutMsg(e), e!=null?e.getFieldError().getDefaultMessage():"参数异常");
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Result<Object> exception(MethodArgumentNotValidException e) {
		logger.error("数据验证未通过：{}", e.getMessage());
		return Result.paramError(getOutMsg(e), e!=null?e.getBindingResult().getFieldError()
				.getDefaultMessage():"数据验证未通过");
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public Result<Object> exception(HttpMessageNotReadableException e) {
		logger.error("参数异常：{}", e.getMessage());
		return Result.paramError(getOutMsg(e), "参数异常");
	}
	@ExceptionHandler(Exception.class)
	public Result handleException(Exception e){
		logger.error(e.getMessage(), e);
		return Result.error(e.getMessage(),"服务器开小差了~");
	}
}
