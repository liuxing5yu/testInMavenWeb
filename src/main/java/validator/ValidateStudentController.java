/**
 * 
 */
package validator;

import java.io.UnsupportedEncodingException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 中文文档：http://docs.jboss.org/hibernate/validator/4.3/reference/zh-CN/html_single/#example-message-interpolator
 *
 * @author hwj
 * @date 2018年3月12日 下午5:34:30 
 *
 */
@Controller
@RequestMapping("/validator")
public class ValidateStudentController {

	/**
	 * 表单提交方法
	 */
	@RequestMapping(value = "/index", method = { RequestMethod.GET })
	public String index(Model model) {
		// 如果模型数据中包含同名数据则不再添加，
		// 如果不判断将一直重新new新的模型数据
		if (!model.containsAttribute("validatorBean")) {
			model.addAttribute("validatorBean", new ValidatorBean());
		}
		return "/validator/validator";
	}

	/**
	 * 表单验证方法
	 */
	@RequestMapping(value = "/index", method = { RequestMethod.POST })
	public String indexSave(Model model, @Valid @ModelAttribute("validatorBean") ValidatorBean validatorBean,
			BindingResult result) throws UnsupportedEncodingException {
		// 如果存在验证错误信息重定向到表单提交展示错误信息
		if (result.hasErrors()) {
			return index(model);
		}
		return "redirect:success";
	}

	/**
	 * 表单提交验证成功方法
	 */
	@RequestMapping(value = "/success")
	public String success(Model model) {
		return "成功";
	}
}
