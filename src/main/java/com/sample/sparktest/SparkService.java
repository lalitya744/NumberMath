package com.sample.sparktest;

import java.io.Serializable;

import org.apache.spark.sql.SparkSession;

public class SparkService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SparkSession sparkSession;

	public SparkSession getSparkSession() {
		if (sparkSession == null) {
			sparkSession = SparkSession.builder().appName("NumbersMath").master("local[*]")
					.config("spark.dirver.memory", "20gb").config("spark.dirver.maxResultSize", "4gb")
					.config("spark.dirver.cores", "2").config("spark.cores.max", "2").getOrCreate();
		}
		return sparkSession;
	}
	
	public void close() {
		if (sparkSession == null) {
			sparkSession.close();
		}
	}

}
