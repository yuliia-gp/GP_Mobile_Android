package com.All_Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class All_Screens {


    private static WebElement element = null;

    public static WebElement loginButton(WebDriver driver){

        element = driver.findElement(By.id("textViewLogin"));

        return element;

    }

    public static WebElement userName(WebDriver driver){

        element = driver.findElement(By.id("editTextUserName"));

        return element;

    }

    public static WebElement password(WebDriver driver){

        element = driver.findElement(By.id("editTextPassword"));

        return element;

    }

    public static WebElement loginButtonSubmit(WebDriver driver){

        element = driver.findElement(By.id("buttonLogin"));

        return element;

    }

    public static WebElement avatar (WebDriver driver){

        element = driver.findElement(By.id("imageViewAvatar"));

        return element;

    }

    public static WebElement logoutOption(WebDriver driver){

        element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]"));

        return element;

    }

    public static WebElement logoutConfirmPopupOK(WebDriver driver){

        element = driver.findElement(By.id("buttonOk"));

        return element;

    }

    public static WebElement createIcon(WebDriver driver){

        element = driver.findElement(By.id("fabAdd"));

        return element;

    }

    public static WebElement addClass(WebDriver driver){

        element = driver.findElement(By.id("tvAddClass"));

        return element;

    }

    public static WebElement selectAddOption(WebDriver driver){

        element = driver.findElement(By.id("radio_enter_manually"));

        return element;

    }

    public static WebElement selectAddOptionNext(WebDriver driver){

        element = driver.findElement(By.id("next_button"));

        return element;

    }

    public static WebElement enterClassName(WebDriver driver){

        element = driver.findElement(By.id("editTextClassNameFragment"));

        return element;

    }


    public static WebElement selectClassType(WebDriver driver){

        element = driver.findElement(By.id("spinnerClassTypeFragment"));

        return element;

    }


    public static WebElement clickSelectClassType(WebDriver driver){

        element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));

        return element;

    }


    public static WebElement addClassSubmit(WebDriver driver){

        element = driver.findElement(By.id("buttonCreateClass"));

        return element;

    }



    public static WebElement classCreatedOk(WebDriver driver){

        element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));

        return element;

    }


    public static WebElement addStudent(WebDriver driver){

        element = driver.findElement(By.id("menu_save_button"));

        return element;

    }


    public static WebElement studentFirstName(WebDriver driver){

        element = driver.findElement(By.id("edit_text_first_name"));

        return element;

    }


    public static WebElement studentLastName(WebDriver driver){

        element = driver.findElement(By.id("edit_text_last_name"));

        return element;

    }


    public static WebElement selectGradeDrop(WebDriver driver){

        element = driver.findElement(By.id("spinner_grade_level"));

        return element;

    }


    public static WebElement saveStudent(WebDriver driver){

        element = driver.findElement(By.id("menu_save_button"));

        return element;

    }


    public static WebElement selectGrade(WebDriver driver){

        element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]"));

        return element;

    }


    public static WebElement studentRegisterSuccess(WebDriver driver){

        element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));

        return element;

    }


    public static WebElement myStudentDoneButton(WebDriver driver){

        element = driver.findElement(By.id("done_adding_button"));

        return element;

    }


}
