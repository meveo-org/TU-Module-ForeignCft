package org.meveo.script;

import java.util.Map;

import org.meveo.service.script.Script;
import org.meveo.admin.exception.BusinessException;
import org.meveo.script.ScriptD;

public class ScriptC extends Script {
	
	@Override
	public void execute(Map<String, Object> parameters) throws BusinessException {
		super.execute(parameters);
      
      	new ScriptD();
	}
	
}