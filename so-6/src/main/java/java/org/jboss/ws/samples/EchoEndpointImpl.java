package org.jboss.ws.samples;

import javax.jws.WebService;

import foo.bar.Endpoint;

@WebService(endpointInterface = "foo.bar.Endpoint")
public class EchoEndpointImpl implements Endpoint
{
   public String echoString(String s)
   {
      return s;
   }
}
