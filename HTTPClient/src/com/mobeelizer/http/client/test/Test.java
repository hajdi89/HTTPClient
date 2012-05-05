package com.mobeelizer.http.client.test;

import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.mobeelizer.http.client.utils.ConnectionUtils;

public class Test {
	public static void main(String[] args) {
		try {
			
			DefaultHttpClient httpclient = new DefaultHttpClient();
			
			//autentykacja GET 
			HttpGet request = new HttpGet("http://cloud.mobeelizer.com/sync/authenticate");
			
			//synchronizacja pełna POST
			//HttpPost request = new HttpPost("http://cloud.mobeelizer.com/sync/synchronizeAll");
			
			//synchronizacja, content-type:multipart/form-data, dołączony plik z danymi do dodania w requescie, POST
			//File file = new File("fileToSendToCloud.txt");
			//FileEntity entity = new FileEntity(file, "multipart/form-data");
			//HttpPost request = new HttpPost("http://cloud.mobeelizer.com/sync/synchronize");
			//httppost.setEntity(entity);
			
			//checkStatus GET, parametr: ticket z sychronizacji
			//HttpGet request = new HttpGet("http://cloud.mobeelizer.com/sync/checkStatus?ticket=2967");
			
			
			//getSynchronizationData GET, parametr ticket z synchronizacji, zwraca binarny plik z danymi do synchronizacji
			//HttpGet request = new HttpGet("http://cloud.mobeelizer.com/sync/data?ticket=2967");	
				
			//potwierdzenie synchronizacji, POST, parametr: ticket
			//HttpPost request = new HttpPost("http://cloud.mobeelizer.com/sync/confirm");
			
			ConnectionUtils.addCommonHeaders(request);
			
			HttpResponse response = httpclient.execute(request);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
			    System.out.println(EntityUtils.toString(entity));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
