package com.haipeng.AIDL;

import com.haipeng.AIDL.example.Stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MAIDLService extends Service{

//	private SubBinder mBinder;
	//必须实现的方法
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return mBinder;
	}
	//service被创建时启动该方法
	@Override
	public void onCreate(){
		super.onCreate();
//		mBinder = new SubBinder();
	}
	//service被创建时回调该方法
	@Override
	public int onStartCommand(Intent intent,int flags,int startId){
		return startId;
	}
	//service被摧毁时回调该方法
	@Override
	public void onDestroy(){
		super.onDestroy();
	}
	@Override
	public boolean onUnbind(Intent intent) {
		// TODO Auto-generated method stub
		return super.onUnbind(intent);
	}
	@Override
	public void onRebind(Intent intent) {
		// TODO Auto-generated method stub
		super.onRebind(intent);
	}
     
	private final example.Stub mBinder = new example.Stub() {
		
		@Override
		public int add(int a, int b) throws RemoteException {
			// TODO Auto-generated method stub
			return a+b;
		}
	};
//	
//	public class SubBinder extends Stub
//	{
//
//		@Override
//		public int add(int a, int b) throws RemoteException {
//			// TODO Auto-generated method stub
//			return a+b;
//		}
//		
//	}
	
}
