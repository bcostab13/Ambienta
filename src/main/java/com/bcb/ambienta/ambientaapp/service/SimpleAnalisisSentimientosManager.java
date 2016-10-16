package com.bcb.ambienta.ambientaapp.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class SimpleAnalisisSentimientosManager implements AnalisisSentimientosManager{
	private static final long serialVersionUID = 1L;
	private final String USER_AGENT = "Mozilla/5.0";
	protected final Log logger = LogFactory.getLog(getClass());
	
	public void analisis(String text)  {
		// TODO Auto-generated method stub
		String url = "http://api.meaningcloud.com/sentiment-2.1";

		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);

		// add header
		post.setHeader("User-Agent", USER_AGENT);
		
		try{
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("key", "41a3c3ce2181a6ade4a0cce9be88a100"));
		urlParameters.add(new BasicNameValuePair("lang", "es"));
		urlParameters.add(new BasicNameValuePair("txt", text));
		
		post.setEntity(new UrlEncodedFormEntity(urlParameters));

		HttpResponse response = client.execute(post);
		/*System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + post.getEntity());
		System.out.println("Response Code : " + 
                                    response.getStatusLine().getStatusCode());*/

		BufferedReader rd = new BufferedReader(
                        new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		
		logger.info(result.toString());
		}catch(Exception e){
			logger.info("Ocurrio un error D:");
		}
	}
	
}
