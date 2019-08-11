package utils;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

/**
 * 鏂囦欢鐩稿叧鎿嶄綔
 * @author Louis
 * @date Jan 14, 2019
 */
public class FileUtils {

	/**
	 * 下载文件
	 * @param response
	 * @param file
	 * @param newFileName
	 */
	public static void downloadFile( HttpServletResponse response,File file, String newFileName) {
		try {
			response.setHeader("Content-Disposition", "attachment; filename=" + new String(newFileName.getBytes("ISO-8859-1"), "UTF-8"));
			BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
			InputStream is = new FileInputStream(file.getAbsolutePath());
			BufferedInputStream bis = new BufferedInputStream(is);
			int length = 0;
			byte[] temp = new byte[1 * 1024 * 10];
			while ((length = bis.read(temp)) != -1) {
				bos.write(temp, 0, length);
			}
			bos.flush();
			bis.close();
			bos.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 璇诲彇txt鏂囦欢鐨勫唴瀹�
	 * @param file 鎯宠璇诲彇鐨勬枃浠惰矾寰�
	 * @return 杩斿洖鏂囦欢鍐呭
	 */
	public static String readFile(String file){
		return readFile(new File(file));
	}
	
    /**
     * 璇诲彇txt鏂囦欢鐨勫唴瀹�
     * @param file 鎯宠璇诲彇鐨勬枃浠跺璞�
     * @return 杩斿洖鏂囦欢鍐呭
     */
    public static String readFile(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//鏋勯�犱竴涓狟ufferedReader绫绘潵璇诲彇鏂囦欢
            String s = null;
            while((s = br.readLine())!=null){
            	//浣跨敤readLine鏂规硶锛屼竴娆¤涓�琛�
                result.append(System.lineSeparator() + s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
    
    /**
	 * 閫掑綊鍒犻櫎鏂囦欢
	 * @param file
	 */
	public static void deleteFile(File file) {
	    // 鍒ゆ柇鏄惁鏄竴涓洰褰�, 涓嶆槸鐨勮瘽璺宠繃, 鐩存帴鍒犻櫎; 濡傛灉鏄竴涓洰褰�, 鍏堝皢鍏跺唴瀹规竻绌�.
	    if(file.isDirectory()) {
	        // 鑾峰彇瀛愭枃浠�/鐩綍
	        File[] subFiles = file.listFiles();
	        // 閬嶅巻璇ョ洰褰�
	        for (File subFile : subFiles) {
	            // 閫掑綊璋冪敤鍒犻櫎璇ユ枃浠�: 濡傛灉杩欐槸涓�涓┖鐩綍鎴栨枃浠�, 涓�娆￠�掑綊灏卞彲鍒犻櫎. 
	        	// 濡傛灉杩欐槸涓�涓潪绌虹洰褰�, 澶氭閫掑綊娓呯┖鍏跺唴瀹瑰悗鍐嶅垹闄�
	            deleteFile(subFile);
	        }
	    }
	    // 鍒犻櫎绌虹洰褰曟垨鏂囦欢
	    file.delete();
	}
	
	/**
	 * 鑾峰彇椤圭洰鏍硅矾寰�
	 * @return
	 */
	public static String getProjectPath() {
		String classPath = getClassPath();
		return new File(classPath).getParentFile().getParentFile().getAbsolutePath();
	}

	/**
	 * 鑾峰彇绫昏矾寰�
	 * @return
	 */
	public static String getClassPath() {
		String classPath = FileUtils.class.getClassLoader().getResource("").getPath();
		return classPath;
	}
	
	public static void main(String[] args){
//        File file = new File("D:/errlog.txt");
//        System.out.println(readFile(file));
        System.out.println(getClassPath());
        System.out.println(getProjectPath());
    }
}
