package net.simpleframework.demo;

import java.util.Map;

import net.simpleframework.common.coll.KVMap;
import net.simpleframework.mvc.PageMapping;
import net.simpleframework.mvc.PageParameter;
import net.simpleframework.mvc.component.ext.login.LoginBean;
import net.simpleframework.mvc.template.AbstractTemplatePage;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
@PageMapping(url = "/login")
public class LoginPage extends AbstractTemplatePage {

	@Override
	protected void addComponents(final PageParameter pp) {
		super.addComponents(pp);

		addComponentBean(pp, "LoginPage_login", LoginBean.class).setContainerId("login_" + hashId);
	}

	@Override
	protected void addImportCSS(final PageParameter pp) {
		super.addImportCSS(pp);

		pp.addImportCSS(LoginPage.class, "/login.css");
	}

	@Override
	public Map<String, Object> createVariables(final PageParameter pp) {
		return ((KVMap) super.createVariables(pp)).add("loginId", "login_" + hashId);
	}
}