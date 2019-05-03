package designpatterns.decorator.cool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EmailServiceRetryDecoratorTest {

    @Test
    public void whenDownloadEmailThrowsErrorTheFirstTimeShouldRetry() {
        // Create a mock that fails the first time and then succeed
        IEmailService mock = mock(IEmailService.class);

        IEmailService.Email email = new IEmailService.Email();
        IEmailService.Email.EmailInfo emailInfo = email.getEmailInfo();

        when(mock.downloadEmail(emailInfo))
                .thenThrow(new EmailServiceTransientError())
                .thenReturn(email);
        EmailServiceRetryDecorator decorator = new EmailServiceRetryDecorator(mock);
        assertEquals(email, decorator.downloadEmail(emailInfo));
    }

}
