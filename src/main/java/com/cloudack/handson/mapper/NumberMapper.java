package com.cloudack.handson.mapper;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;
import org.apache.log4j.Logger;

public  class NumberMapper extends
Mapper<LongWritable, Text, LongWritable, Text> {


public void map(LongWritable key, Text value, Context context)
	throws IOException, InterruptedException {
    context.write(new LongWritable(Integer.parseInt(value.toString())), new Text(""));
}
}
