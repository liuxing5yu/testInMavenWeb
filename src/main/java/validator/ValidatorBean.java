/**
 * 
 */
package validator;

import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 *
 * @author hwj
 * @date 2018年3月12日 下午5:38:55 
 *
 */
public class ValidatorBean {

	/**
	 * 登录用户名
	 */
	// message 直接提供错误信息
	@NotBlank(message = "username 不能为空")
	// message 使用 {} 代表错误内容，从 resources 目录下的 ValidationMessages.properties文件中读取
	@Pattern(regexp = "[a-zA-Z0-9_]{5,10}", message = "{user.username.illegal}")
	private String username;

	/**
	 * 登录密码
	 */
	// ValidationMessages.properties文件中读取
	@Size(min = 5, max = 10, message = "{password.length.illegal}")
	private String password;

	/**
	 * 用户姓名
	 */
	@Size(min = 2, max = 30, message = "用户名长度必须大小{min},小于{max}位")
	@NotNull(message = "用户名不能为空")
	private String firstName;

	/**
	 * 日期验证
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Past(message = "生日日期必须早于当前日期") // 验证注解的元素值（日期类型）比当前时间早
	private Date brithDay;

	@AssertFalse(message = "参数值必须为false")
	private Boolean isFalse;

	@AssertTrue(message = "参数值必须为true")
	private Boolean isTrue;

	@Email(message = "email格式不正确")
	private String email;

	@Length(min = 4, max = 20, message = "部门名称长度必须大于{min},小于{max}")
	@NotBlank(message = "部门名称不能为空,去掉首尾空格")
	private String section;

	@Range(min = 18, max = 60, message = "年龄必须大于{min},小于{max}")
	private int age;

	@Null(message = "参数值必须为null值")
	private String strNull;

	@NotNull(message = "参数值不能为null值")
	private String strNotNull;

	@Max(value = 20, message = "值必须大于等于{value}")
	private int intMax;

	@Min(value = 8, message = "值必须大于等于{value}")
	private int intMin;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Future(message = "未来日期必须大于当前日期")
	private Date futureDate;

	@Digits(integer = 5, fraction = 2, message = "Float整数最多{integer}位，小于最多{fraction}位")
	private Float floatValue;

	@DecimalMax(value = "100", message = "Long的值必须小于{value}")
	private long longMax;

	@DecimalMin(value = "1", message = "Long的值必须大于{value}")
	private long longMin;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBrithDay() {
		return brithDay;
	}

	public void setBrithDay(Date brithDay) {
		this.brithDay = brithDay;
	}

	public Boolean getIsFalse() {
		return isFalse;
	}

	public void setIsFalse(Boolean isFalse) {
		this.isFalse = isFalse;
	}

	public Boolean getIsTrue() {
		return isTrue;
	}

	public void setIsTrue(Boolean isTrue) {
		this.isTrue = isTrue;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStrNull() {
		return strNull;
	}

	public void setStrNull(String strNull) {
		this.strNull = strNull;
	}

	public String getStrNotNull() {
		return strNotNull;
	}

	public void setStrNotNull(String strNotNull) {
		this.strNotNull = strNotNull;
	}

	public int getIntMax() {
		return intMax;
	}

	public void setIntMax(int intMax) {
		this.intMax = intMax;
	}

	public int getIntMin() {
		return intMin;
	}

	public void setIntMin(int intMin) {
		this.intMin = intMin;
	}

	public Date getFutureDate() {
		return futureDate;
	}

	public void setFutureDate(Date futureDate) {
		this.futureDate = futureDate;
	}

	public Float getFloatValue() {
		return floatValue;
	}

	public void setFloatValue(Float floatValue) {
		this.floatValue = floatValue;
	}

	public long getLongMax() {
		return longMax;
	}

	public void setLongMax(long longMax) {
		this.longMax = longMax;
	}

	public long getLongMin() {
		return longMin;
	}

	public void setLongMin(long longMin) {
		this.longMin = longMin;
	}
}
