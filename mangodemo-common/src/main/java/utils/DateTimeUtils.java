package utils;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��׼��ʽ������ʱ��
 * @author Louis
 * @date Jan 14, 2019
 */
public class DateTimeUtils {

	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * ��ȡ��ǰ��׼��ʽ������ʱ��
	 * @param date
	 * @return
	 */
	public static String getDateTime() {
		return getDateTime(new Date());
	}
	
	/**
	 * ��׼��ʽ������ʱ��
	 * @param date
	 * @return
	 */
	public static String getDateTime(Date date) {
		return (new SimpleDateFormat(DATE_FORMAT)).format(date);
	}
}
