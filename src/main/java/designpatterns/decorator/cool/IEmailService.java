package designpatterns.decorator.cool;

import java.util.Collection;

public interface IEmailService {
    void send(Email email);
    Collection<Email.EmailInfo> listEmails(int indexBegin, int indexEnd);
    Email downloadEmail(Email.EmailInfo emailInfo);

    class Email {

        private EmailInfo emailInfo;

        public EmailInfo getEmailInfo() {
            return emailInfo;
        }

        public class EmailInfo {
        }
    }
}
