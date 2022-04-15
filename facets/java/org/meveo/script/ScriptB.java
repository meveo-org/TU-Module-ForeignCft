package org.meveo.script;

import java.util.Map;

import org.meveo.service.script.Script;
import org.meveo.admin.exception.BusinessException;
import org.meveo.script.ScriptC;

public class ScriptB extends Script {
	
	@Override
	public void execute(Map<String, Object> parameters) throws BusinessException {
		super.execute(parameters);
      	new ScriptC();
	}
	
}