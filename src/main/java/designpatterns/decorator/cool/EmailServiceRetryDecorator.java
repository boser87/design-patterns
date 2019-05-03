package designpatterns.decorator.cool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmailServiceRetryDecorator implements IEmailService
{
    private final IEmailService emailService;
    public EmailServiceRetryDecorator(IEmailService emailService) {
        this.emailService = emailService;
    }
    @Override
    public void send(Email email) {
        executeWithRetries(() -> emailService.send(email));
    }
    @Override
    public Collection<Email.EmailInfo> listEmails(int indexBegin, int indexEnd) {
        final List<Email.EmailInfo> emailInfos = new ArrayList<>();
        executeWithRetries(() -> emailInfos.addAll(emailService.listEmails(indexBegin, indexEnd)));
        return emailInfos;
    }
    @Override
    public Email downloadEmail(Email.EmailInfo emailInfo) {
        final Email[] email = new Email[1];
        executeWithRetries(() -> email[0] = emailService.downloadEmail(emailInfo));
        return email[0];
    }
    private void executeWithRetries(Runnable runnable) {
        for(int i=0; i<3; ++i) {
            try {
                runnable.run();
            } catch (EmailServiceTransientError e) {
                continue;
            }
            break;
        }
    }
}
