package com.rtx.hadoop.mr.helloworld;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

class HelloMapper extends Mapper<LongWritable, Text,LongWritable, Text> {

    @Override
    public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException {
        System.out.println("value"+value);
        context.write(key,value);

    }
}
