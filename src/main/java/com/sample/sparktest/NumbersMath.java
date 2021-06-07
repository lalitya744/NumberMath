package com.sample.sparktest;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class NumbersMath {

	public double getComputedData(String filePath) {

		if (filePath == null) {
			System.err.println("Please provide the input file full path");
			System.exit(0);
		}

		SparkService sparkService = new SparkService();

		JavaSparkContext jsc = new JavaSparkContext(sparkService.getSparkSession().sparkContext());

		JavaRDD<String> lines = jsc.textFile(filePath);

		int sum = 0;

		for (String line : lines.collect()) {
			int number = Integer.parseInt(line);
			sum += number * number;
		}

		return Math.sqrt(sum);

	}

}
