package nio.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author: wangrui
 */
public class DirectBufferTest {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("input2.txt");
        FileOutputStream outputStream = new FileOutputStream("output2.txt");

        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4);

        while (true) {
            //如果不加上clear方法 那么缓冲区的数据不会再循环时被刷新 将会一直读下去并重复写出数据
            byteBuffer.clear();

            int read = inputChannel.read(byteBuffer);

            System.out.println("reade:" + read);
            if (read == -1) {
                break;
            }
            byteBuffer.flip();

            outputChannel.write(byteBuffer);

        }
    }
}
