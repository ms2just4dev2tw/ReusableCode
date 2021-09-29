package org.self.enums;

public class PostOffice {

	enum MailHandler {
		// 当前邮件是否是一件存局候领邮件
		GENERAL_DELIVERY {
			@Override
			boolean handle(Mail m) {
				switch (m.generalDelivery) {
				case YES:
					System.out.println("邮件存局候领 " + m);
					return true;
				default:
					return false;
				}
			}
		},
		// 当前邮件能否由机器扫描
		MACHINE_SCAN {
			@Override
			boolean handle(Mail m) {
				switch (m.scannability) {
				case UNSCANNABLE:
					return false;
				default:
					switch (m.destination) {
					case INCORRECT:
						return false;
					default:
						System.out.println("自动投递邮件 " + m);
						return true;
					}
				}
			}
		},
		// 当前邮件能否可读
		VISUAL_INSPECTION {
			@Override
			boolean handle(Mail m) {
				switch (m.readability) {
				case ILLEGIBLE:
					return false;
				default:
					switch (m.destination) {
					case INCORRECT:
						return false;
					default:
						System.out.println("人工投递邮件 " + m);
						return true;
					}
				}
			}
		},
		// 邮件退回给发送者
		RETURN_TO_SENDER {
			@Override
			boolean handle(Mail m) {
				switch (m.source) {
				case MISSING:
					return false;
				default:
					System.out.println("退回邮件 " + m);
					return true;
				}
			}
		};

		// 职责链上的处理方法
		abstract boolean handle(Mail m);
	}

	static boolean handle(Mail m) {
		for (MailHandler handler : MailHandler.values())
			// 如果当前 handler 处理失败，就换下一个 handler
			if (handler.handle(m))
				return true;
		System.err.println(m + " 是一个无效邮件");
		return false;
	}

}
