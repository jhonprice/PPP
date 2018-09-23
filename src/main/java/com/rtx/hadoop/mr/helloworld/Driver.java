package com.rtx.hadoop.mr.helloworld;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.NullOutputFormat;

import java.io.IOException;

public class Driver {
    static final String baseDir = "E:/C/ppp/data/";
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        String in = baseDir+"in/data";
        String out = baseDir+"out/"+System.currentTimeMillis();

        Job job = new Job();
        job.setJarByClass(Driver.class);
        job.setJobName("Let's Hello World");

        job.setOutputFormatClass(NullOutputFormat.class);
        FileInputFormat.addInputPath(job,new Path(in));
        //FileOutputFormat.setOutputPath(job,new Path(out));


        job.setMapperClass(HelloMapper.class);
        job.setOutputKeyClass(LongWritable.class);
        job.setOutputValueClass(Text.class);


        System.exit(job.waitForCompletion(true)?0:1);

    }
}
