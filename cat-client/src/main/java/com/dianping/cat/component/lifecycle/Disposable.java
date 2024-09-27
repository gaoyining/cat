package com.dianping.cat.component.lifecycle;

import com.dianping.cat.apiguardian.api.API;

@API(status = API.Status.INTERNAL, since = "3.1")
public interface Disposable {
	public void dispose();
}
