package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.ResuableMethods;

public class AileButcemStepDef {
    AileButcemPage page=new AileButcemPage();

    @Given("Ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() {
        for (int i = 0; i < 6; i++) {
            ResuableMethods.ekranKaydirmaMethodu(900,1400,800,130,1400);
        }
        ResuableMethods.scrollWithUiScrollableAndClick("Giriş Yap");

    }

    @When("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void ve_bilgilerini_girerek_kullanici_bilgileriyle(String Mail, String password, String girisyap) throws InterruptedException {
      Thread.sleep(2000);
        page.emailBox.sendKeys(ConfigReader.getProperty(Mail));
        Thread.sleep(2000);
        page.passwordBox.sendKeys(password);
        Thread.sleep(2000);
        page.GirisYapButon.click();


    }
    @Then("Uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {

    }
    @Then("Sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_bolumune_gidin(String string) {

    }
    @Then("Uygulamayi kapatin")
    public void uygulamayi_kapatin() {

    }
}
