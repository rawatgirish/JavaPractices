import org.apache.commons.lang3.StringUtils;

/**
 * @author girish.rawat
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		TestVO poisAuditLogVO = new TestVO();
		TestVO blackoutEvent = new TestVO();
		blackoutEvent.setName(null);
		populateEventId(poisAuditLogVO, blackoutEvent);
		System.out.println("poisAuditLogVO "+poisAuditLogVO);
		System.out.println("blackoutEvent" + blackoutEvent);
		System.out.println("Hello World- Java");
	}

	private static void populateEventId(TestVO poisAuditLogVO, TestVO blackoutEvent) {
		if(StringUtils.isBlank(poisAuditLogVO.getId()) && StringUtils.isNotBlank(blackoutEvent.getName())){
			poisAuditLogVO.setId(blackoutEvent.getName());
		}
	}
}
