package com.rtx.hadoop.dfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

public class UserFileSystem {
    public static void main(String[] args) throws IOException, InterruptedException {
        Configuration properties = new Configuration();
        properties.set("fs.defaultFS","hdfs://149.28.71.47/");
        FileSystem fs = FileSystem.get(URI.create("hdfs://149.28.71.47/user/root/test.txt"),properties,"root");
        Path path = new Path("hdfs://149.28.71.47/user/root/test.txt");
        BufferedReader  reader  = new BufferedReader(new InputStreamReader(fs.open(path)));
        String s = null;
        while((s=reader.readLine())!=null){
            System.out.println(s);
        }
        reader.close();
        fs.close();

    }
}
