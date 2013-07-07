/**
 * 
 */
package com.cloudack.handson.util;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

/**
 * @author pudi
 *
 */
public class WordCountPartitioner extends Partitioner<Text, IntWritable> {

	@Override
	public int getPartition(Text key, IntWritable value, int numPartitions) {
		int diff = key.toString().charAt(0);	
		return diff%numPartitions;
	}

}
