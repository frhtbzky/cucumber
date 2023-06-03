package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

  features = "src/test/resources/features",
  glue = "stepdefinitions",
  tags = "@regression or @smoke",


  dryRun = false

)


public class Runner {


    /*
    cucumber da runner class i istedigimiz testleri calistirmak
    ve her calistirilan test icin rapor hazirlamak amaciyla kullanilir.


    runner class i bos bir classtir.


    belirtilen bu isleri class icerisindeki kodlar degil
    class deklarasyonunda kullanacagimiz notasyonlar halleder



    @RunWith notasyonu framework umuze JUnit yuklememizin sebebidir.
    ve runner class inin cucumber ile calismasini saglar



    @CucumberOptions ise frameworkumuzde gerekli ayarlari yapar


    features : feature dosyalarimizin bulundugu konumu gosterir
                dikkat edilirse tek tek feature dosyalarini degil
                tum feature dosyalarini iceren klasorun yolunu yaziyoruz

    glue : feature dosyalari ile bagli olan java methodlarinin yerini gosterir
            burada da tek tek klaslari degil tum clasllari iceren package nin
            adresini yazariz. boylece ilgili step hangi class altinda olursa olsun
            cucumber bulup calistirir

    tags : calistirilacak feature veya senaryo lari isaretlemek icin kullanilir
            cucumber runner class i calistirildiginda tum feature dosyalarini
            gozden gecirir ve runner class inda belirtilen tag a sahip tum
            feature ve senaryo lari calistirir


      eger birden fazla tag i kontrol edderek calistirmasini istersek
      "@regression or @smoke"  veya "@regression and @smoke"  gibi yazabilriz


      dryRun : bir feature dosyasini ilk defa yazdigimizda steplerden bazilari
      daha once var olddugundan beyaz bazilari ise ilk defa kullanacagimiz
      icin sari olur


      bu feature dosyasini direkt calistirmak istersek
      bastan baslayarak beyaz olan adimlari calistirir
      ilk sari adima geldiginde exception firlatip
      calistirmayi denedigi ilk sari satir ve geriye kalan sari
      satirlarin eksik steplerini bize yazdirir


      amacimiz feature dosyasini calistirmak degil sadece eksik
      steplere ait kodlari olusturmak ise Runner class inda
      dryRun=true yapip Runner class ini calistiririz

      dryRun=true dedigimizde cucumber testleri calistirmaz
      sadece eksik adim var mi diye kontrol eder
      eksik adim yoksa test passed yazar


      dryRun = false default degerdir ve testleri normal olarak
      calistirmamizi saglar



      that s it
     */





}
