package org.apache.commons.httpclient.methods;

import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GetMethod extends HttpMethodBase
{
  private static final Log LOG;
  static Class class$org$apache$commons$httpclient$methods$GetMethod;

  static
  {
    Class localClass;
    if (class$org$apache$commons$httpclient$methods$GetMethod == null)
    {
      localClass = class$("org.apache.commons.httpclient.methods.GetMethod");
      class$org$apache$commons$httpclient$methods$GetMethod = localClass;
    }
    while (true)
    {
      LOG = LogFactory.getLog(localClass);
      return;
      localClass = class$org$apache$commons$httpclient$methods$GetMethod;
    }
  }

  public GetMethod()
  {
    setFollowRedirects(true);
  }

  public GetMethod(String paramString)
  {
    super(paramString);
    LOG.trace("enter GetMethod(String)");
    setFollowRedirects(true);
  }

  static Class class$(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString);
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
    }
  }

  public String getName()
  {
    return "GET";
  }

  public void recycle()
  {
    LOG.trace("enter GetMethod.recycle()");
    super.recycle();
    setFollowRedirects(true);
  }
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     org.apache.commons.httpclient.methods.GetMethod
 * JD-Core Version:    0.6.2
 */