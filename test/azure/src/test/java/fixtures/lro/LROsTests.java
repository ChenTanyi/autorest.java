package fixtures.lro;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.rest.v2.credentials.BasicAuthenticationCredentials;
import com.microsoft.rest.v2.ServiceCallback;
import fixtures.lro.implementation.AutoRestLongRunningOperationTestServiceImpl;
import fixtures.lro.models.Product;
import fixtures.lro.models.Sku;
import fixtures.lro.models.SubProduct;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class LROsTests {
    private static AutoRestLongRunningOperationTestServiceImpl client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestLongRunningOperationTestServiceImpl(
            new BasicAuthenticationCredentials(null, null)
        );
        AzureProxy.setDefaultPollingDelayInMilliseconds(0);
    }

    @Test
    public void put200Succeeded() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().put200Succeeded(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void put200SucceededNoState() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().put200SucceededNoState(product);
        Assert.assertEquals("100", response.id());
    }

    @Test
    public void put202Retry200() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().put202Retry200(product);
        Assert.assertEquals("100", response.id());
    }

    @Ignore("Can cause flakiness - only run manually")
    public void put202Retry200Async() throws InterruptedException {
        final CountDownLatch lock = new CountDownLatch(1);
        long startTime = System.currentTimeMillis();
        final long[] callbackTime = new long[1];
        Product product = new Product();
        product.withLocation("West US");
//        client.getAzureClient().setLongRunningOperationRetryTimeout(1);
        client.lROs().put202Retry200Async(product, new ServiceCallback<Product>() {
            @Override
            public void failure(Throwable t) {
                fail();
            }

            @Override
            public void success(Product result) {
                Assert.assertEquals("100", result.id());
                callbackTime[0] = System.currentTimeMillis();
                lock.countDown();
            }
        });
        long endTime = System.currentTimeMillis();
        Assert.assertTrue(500 > endTime - startTime);
        Assert.assertTrue(lock.await(3000, TimeUnit.MILLISECONDS));
//        client.getAzureClient().setLongRunningOperationRetryTimeout(0);
        Assert.assertTrue(1000 < callbackTime[0] - startTime);
    }

    @Test
    public void put201CreatingSucceeded200() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().put201CreatingSucceeded200(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void put200UpdatingSucceeded204() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().put200UpdatingSucceeded204(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void put201CreatingFailed200() {
        Product product = new Product();
        product.withLocation("West US");
        try {
            Product response = client.lROs().put201CreatingFailed200(product);
            fail();
        } catch (CloudException e) {
            Assert.assertEquals("Async operation failed with provisioning state: Failed", e.getMessage());
        }
    }

    @Test
    public void put200Acceptedcanceled200() {
        Product product = new Product();
        product.withLocation("West US");
        try {
            Product response = client.lROs().put200Acceptedcanceled200(product);
            fail();
        } catch (CloudException e) {
            Assert.assertEquals("Async operation failed with provisioning state: Canceled", e.getMessage());
        }
    }

    @Test
    public void putNoHeaderInRetry() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().putNoHeaderInRetry(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putAsyncRetrySucceeded() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().putAsyncRetrySucceeded(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putAsyncNoRetrySucceeded() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().putAsyncNoRetrySucceeded(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putAsyncRetryFailed() {
        Product product = new Product();
        product.withLocation("West US");
        try {
            Product response = client.lROs().putAsyncRetryFailed(product);
            fail();
        } catch (CloudException e) {
            Assert.assertEquals("Async operation failed with provisioning state: Failed", e.getMessage());
        }
    }

    @Test
    public void putAsyncNoRetrycanceled() {
        Product product = new Product();
        product.withLocation("West US");
        try {
            Product response = client.lROs().putAsyncNoRetrycanceled(product);
            fail();
        } catch (CloudException e) {
            Assert.assertEquals("Async operation failed with provisioning state: Canceled", e.getMessage());
        }
    }

    @Test
    public void putAsyncNoHeaderInRetry() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().putAsyncNoHeaderInRetry(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putNonResource() {
        Sku sku = new Sku();
        Sku response = client.lROs().putNonResource(sku);
        Assert.assertEquals("100", response.id());
    }

    @Test
    public void putAsyncNonResource() {
        Sku sku = new Sku();
        Sku response = client.lROs().putAsyncNonResource(sku);
        Assert.assertEquals("100", response.id());
    }

    @Test
    public void putSubResource() {
        SubProduct subProduct = new SubProduct();
        SubProduct response = client.lROs().putSubResource(subProduct);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putAsyncSubResource() {
        SubProduct subProduct = new SubProduct();
        SubProduct response = client.lROs().putAsyncSubResource(subProduct);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void deleteProvisioning202Accepted200Succeeded() {
        Product response = client.lROs().deleteProvisioning202Accepted200Succeeded();
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void deleteProvisioning202DeletingFailed200() {
        Product response = client.lROs().deleteProvisioning202DeletingFailed200();
        Assert.assertEquals("Failed", response.provisioningState());
    }

    @Test
    public void deleteProvisioning202Deletingcanceled200() {
        Product response = client.lROs().deleteProvisioning202Deletingcanceled200();
        Assert.assertEquals("Canceled", response.provisioningState());
    }

    @Test
    public void delete204Succeeded() {
        client.lROs().delete204Succeeded();
    }

    @Test
    public void delete202Retry200() {
        Product response = client.lROs().delete202Retry200();
    }

    @Test
    public void delete202NoRetry204() {
        Product response = client.lROs().delete202NoRetry204();
    }

    @Test
    public void deleteNoHeaderInRetry() {
        client.lROs().deleteNoHeaderInRetry();
    }

    @Test
    public void deleteAsyncNoHeaderInRetry() {
        client.lROs().deleteAsyncNoHeaderInRetry();
    }

    @Test
    public void deleteAsyncRetrySucceeded() {
        client.lROs().deleteAsyncRetrySucceeded();
    }

    @Test
    public void deleteAsyncNoRetrySucceeded() {
        client.lROs().deleteAsyncNoRetrySucceeded();
    }

    @Test
    public void deleteAsyncRetryFailed() {
        try {
            client.lROs().deleteAsyncRetryFailed();
            fail();
        } catch (CloudException e) {
            Assert.assertEquals("Async operation failed with provisioning state: Failed", e.getMessage());
        }
    }

    @Test
    public void deleteAsyncRetrycanceled() {
        try {
            client.lROs().deleteAsyncRetrycanceled();
            fail();
        } catch (CloudException e) {
            Assert.assertEquals("Async operation failed with provisioning state: Canceled", e.getMessage());
        }
    }

    @Test
    public void post200WithPayload() {
        Sku response = client.lROs().post200WithPayload();
        Assert.assertEquals("1", response.id());
    }

    @Test
    public void post202Retry200() {
        Product product = new Product();
        product.withLocation("West US");
        client.lROs().post202Retry200(product);
    }

    @Test
    public void post202NoRetry204() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().post202NoRetry204WithRestResponseAsync(product).blockingGet().body();
    }

    @Test
    public void postAsyncRetrySucceeded() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().postAsyncRetrySucceeded(product);
    }

    @Test
    public void postAsyncNoRetrySucceeded() {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROs().postAsyncNoRetrySucceeded(product);
    }

    @Test
    public void postAsyncRetryFailed() {
        try {
            Product product = new Product();
            product.withLocation("West US");
            client.lROs().postAsyncRetryFailed(product);
            fail();
        } catch (CloudException e) {
            Assert.assertEquals("Async operation failed with provisioning state: Failed", e.getMessage());
        }
    }

    @Test
    public void postAsyncRetrycanceled() {
        try {
            Product product = new Product();
            product.withLocation("West US");
            client.lROs().postAsyncRetrycanceled(product);
            fail();
        } catch (CloudException e) {
            Assert.assertEquals("Async operation failed with provisioning state: Canceled", e.getMessage());
        }
    }
}
