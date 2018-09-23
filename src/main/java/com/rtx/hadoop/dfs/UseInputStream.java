package com.rtx.hadoop.dfs;



import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UseInputStream {
    static {
        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
    }
    public static void main(String[] args) {

        InputStream in = null;
        try {
            in = new URL("hdfs://149.28.71.47/user/root/test.txt").openStream();
            BufferedReader reader  =new BufferedReader(new InputStreamReader(in));
            String s = null;
            while((s=reader.readLine())!=null){
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            IOUtils.closeStream(in);
        }

    }
}
