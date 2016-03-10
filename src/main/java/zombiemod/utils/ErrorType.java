package zombiemod.utils;

public enum ErrorType {
	
	INFO("info"), ERROR("error"), DEBUG("debug"), FATAL("fatal");
	
	private String errorTypeStr;
	private ErrorType errorType;
	
	ErrorType(String strType) {
		this.setErrorTypeStr(strType);
	}
	
	public String getErrorTypeStr() {
		return this.errorTypeStr;
	}
	
	public ErrorType getErrorType() {
		return this.errorType;
	}
	
	public void setErrorType(ErrorType eType) {
		this.errorType = eType;
	}
	
	public void setErrorTypeStr(String eType) {
		this.errorTypeStr = eType;
	}
}