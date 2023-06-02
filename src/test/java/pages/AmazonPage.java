package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    // page classlari surekli kullandigimiz locate islemleri
    // ve varsa login gibi kucuk islevleri iceren methodlar barindirir
    // selenium ile locate islemi veya herhangi bir islem gerceklestirmek istedigimizde
    // WebDriver objesine ihtiyacimizz vardir.




    // POM da driver classinda olusturdugumuz WebDriver driver objesini
    // page classlarina tanimlamak icin PageFactory class indan
    // initElements() kullanilir.

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(), this);
        //bu ayari constructor icine koyma sebebimiz :
        // page sayfalarina obje olusturularak ulasildigi icin
        //kim page sayfasini kullanmak isterse
        //page sayfasindan obje olusturmak icin constructor calisacak ve
        //bu constructor icinde bulunaan initElements() methodu
        //gerekli ayari yapmis olacak
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;



    @FindBy(xpath ="(//div[@class='sg-col-inner'])[1]")

    public WebElement aramaSonucuElementi;

}
