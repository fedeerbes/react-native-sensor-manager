package com.sensormanager;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.util.Log;

public class SensorManagerModule extends ReactContextBaseJavaModule {
  private static final String		REACT_CLASS = "SensorManager";
  private AccelerometerRecord		mAccelerometerRecord = null;
  private AccelerometerRecordNormalDelay		mAccelerometerRecordNormalDelay = null;
	private GyroscopeRecord 		mGyroscopeRecord = null;
  private GyroscopeRecordNormalDelay 		mGyroscopeRecordNormalDelay = null;
	private MagnetometerRecord		mMagnetometerRecord = null;
	private StepCounterRecord		mStepCounterRecord = null;
	private ThermometerRecord		mThermometerRecord = null;
	private MotionValueRecord		mMotionValueRecord = null;
	private OrientationRecord		mOrientationRecord = null;
	private OrientationRecordNormalDelay		mOrientationRecordNormalDelay = null;
	private ProximityRecord			mProximityRecord = null;
  private LightSensorRecord   mLightSensorRecord = null;

	private ReactApplicationContext	mReactContext;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    public SensorManagerModule(ReactApplicationContext reactContext) {
		super(reactContext);
		mReactContext = reactContext;
    }

    @ReactMethod
    public int startAccelerometer(int delay) {
		if (mAccelerometerRecord == null)
			mAccelerometerRecord = new AccelerometerRecord(mReactContext);
		return (mAccelerometerRecord.start(delay));
    }

    @ReactMethod
    public void stopAccelerometer() {
		if (mAccelerometerRecord != null)
			mAccelerometerRecord.stop();
    }

    @ReactMethod
    public int startAccelerometerNormalDelay(int delay, int sensorDelay) {
		if (mAccelerometerRecordNormalDelay == null)
			mAccelerometerRecordNormalDelay = new AccelerometerRecordNormalDelay(mReactContext);
		return (mAccelerometerRecordNormalDelay.start(delay, sensorDelay));
    }

    @ReactMethod
    public void stopAccelerometerNormalDelay() {
		if (mAccelerometerRecordNormalDelay != null)
			mAccelerometerRecordNormalDelay.stop();
    }

    @ReactMethod
    public int startGyroscope(int delay) {
		if (mGyroscopeRecord == null)
			mGyroscopeRecord = new GyroscopeRecord(mReactContext);
		return (mGyroscopeRecord.start(delay));
    }

    @ReactMethod
    public void stopGyroscope() {
		if (mGyroscopeRecord != null)
			mGyroscopeRecord.stop();
    }

    @ReactMethod
    public int startGyroscopeNormalDelay(int delay, int sensorDelay) {
		if (mGyroscopeRecordNormalDelay == null)
			mGyroscopeRecordNormalDelay = new GyroscopeRecordNormalDelay(mReactContext);
		return (mGyroscopeRecordNormalDelay.start(delay, sensorDelay));
    }

    @ReactMethod
    public void stopGyroscopeNormalDelay() {
		if (mGyroscopeRecordNormalDelay != null)
			mGyroscopeRecordNormalDelay.stop();
    }

    @ReactMethod
    public int startMagnetometer(int delay) {
		if (mMagnetometerRecord == null)
			mMagnetometerRecord = new MagnetometerRecord(mReactContext);
		return (mMagnetometerRecord.start(delay));
    }

    @ReactMethod
    public void stopMagnetometer() {
		if (mMagnetometerRecord != null)
			mMagnetometerRecord.stop();
    }

    @ReactMethod
    public int startStepCounter(int delay) {
		if (mStepCounterRecord == null)
			mStepCounterRecord = new StepCounterRecord(mReactContext);
		return (mStepCounterRecord.start(delay));
    }

    @ReactMethod
    public void stopStepCounter() {
		if (mStepCounterRecord != null)
			mStepCounterRecord.stop();
    }

    @ReactMethod
    public int startThermometer(int delay) {
		if (mThermometerRecord == null)
			mThermometerRecord = new ThermometerRecord(mReactContext);
		return (mThermometerRecord.start(delay));
    }

    @ReactMethod
    public void stopThermometer() {
		if (mThermometerRecord != null)
			mThermometerRecord.stop();
    }

    @ReactMethod
    public int startMotionValue(int delay) {
		if (mMotionValueRecord == null)
			mMotionValueRecord = new MotionValueRecord(mReactContext);
		return (mMotionValueRecord.start(delay));
    }

    @ReactMethod
    public void stopMotionValue() {
		if (mMotionValueRecord != null)
			mMotionValueRecord.stop();
    }

    @ReactMethod
    public int startOrientation(int delay) {
		if (mOrientationRecord == null)
			mOrientationRecord = new OrientationRecord(mReactContext);
		return (mOrientationRecord.start(delay));
    }

    @ReactMethod
    public void stopOrientation() {
		if (mOrientationRecord != null)
			mOrientationRecord.stop();
    }

    @ReactMethod
    public int startOrientationNormalDelay(int delay, int sensorDelay) {
		if (mOrientationRecordNormalDelay == null)
			mOrientationRecordNormalDelay = new OrientationRecordNormalDelay(mReactContext);
		return (mOrientationRecordNormalDelay.start(delay, sensorDelay));
    }

    @ReactMethod
    public void stopOrientationNormalDelay() {
		if (mOrientationRecordNormalDelay != null)
			mOrientationRecordNormalDelay.stop();
    }

    @ReactMethod
    public int startProximity(int delay) {
		if (mProximityRecord == null)
			mProximityRecord = new ProximityRecord(mReactContext);
		return (mProximityRecord.start(delay));
    }

    @ReactMethod
    public void stopProximity() {
		if (mProximityRecord != null)
			mProximityRecord.stop();
    }

    @ReactMethod
    public int startLightSensor(int delay) {
      if(mLightSensorRecord == null)
        mLightSensorRecord = new LightSensorRecord(mReactContext);
      return (mLightSensorRecord.start(delay));
    }

    @ReactMethod
    public void stopLightSensor() {
      if(mLightSensorRecord != null)
        mLightSensorRecord.stop();
    }

	/*
    @Override
    public ReactBarcodeScannerView createViewInstance(ThemedReactContext context) {
    }

    @Override
    public void onDropViewInstance(ReactBarcodeScannerView view) {
    }

    @Override
    public void onHostResume() {
    }

    @Override
    public void onHostPause() {
    }

    @Override
    public void onHostDestroy() {
    }
    */
}
