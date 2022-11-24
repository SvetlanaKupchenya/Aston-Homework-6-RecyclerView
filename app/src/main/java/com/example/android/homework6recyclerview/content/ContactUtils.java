/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.homework6recyclerview.content;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class ContactUtils {

    public static ArrayList<Contacts> CONTACT_ITEMS = new ArrayList<>();

    public static String CONTACT_ID_KEY = "item_id";

    private static final int COUNT = 100;

    public static class Contacts {
        public final String contact_name;
        public final String contact_surname;
        public final String contact_telnumber;
        public final String contact_photo;

        private Contacts(String name, String surname, String telNumber, String contactPhoto) {
            this.contact_name = name;
            this.contact_surname = surname;
            this.contact_telnumber = telNumber;
            this.contact_photo = contactPhoto;
        }
    }

    private static void addItem(Contacts item) {
        CONTACT_ITEMS.add(item);
    }

    static {
        for (int i = 0; i < COUNT; i++) {
            addItem(createContactAtPosition(i));
        }
    }

    private static Contacts createContactAtPosition(int position) {
        Faker faker = new Faker();
        String newName = "";
        String newSurname = "";
        String newTelNumber = "";
        String newContactPhoto = "";
        switch (position) {
            case 0:
                newName = faker.name().firstName();//"Том";
                newSurname = faker.name().lastName();//"Айртон";
                newTelNumber = "+79001001000";
                newContactPhoto = "https://i.picsum.photos/id/10/2500/1667.jpg?hmac=J04WWC_ebchx3WwzbM-Z4_KC_LeLBWr5LZMaAkWkF68";
                break;
            case 1:
                newName = faker.name().firstName();//"Шура";
                newSurname = faker.name().lastName();//"Балаганов";
                newTelNumber = "+79001001001";
                newContactPhoto = "https://i.picsum.photos/id/11/2500/1667.jpg?hmac=xxjFJtAPgshYkysU_aqx2sZir-kIOjNR9vx0te7GycQ";
                break;
            case 2:
                newName = faker.name().firstName();//"Настасья";
                newSurname = faker.name().lastName();//"Барашкова";
                newTelNumber = "+79001001002";
                newContactPhoto = "https://i.picsum.photos/id/12/2500/1667.jpg?hmac=Pe3284luVre9ZqNzv1jMFpLihFI6lwq7TPgMSsNXw2w";
                break;
            case 3:
                newName = faker.name().firstName();//"Иван";
                newSurname = faker.name().lastName();//"Бездомный";
                newTelNumber = "+79001001003";
                newContactPhoto = "https://i.picsum.photos/id/13/2500/1667.jpg?hmac=SoX9UoHhN8HyklRA4A3vcCWJMVtiBXUg0W4ljWTor7s";
                break;
            case 4:
                newName = faker.name().firstName();//"Пётр";
                newSurname = faker.name().lastName();//"Безухов";
                newTelNumber = "+79001001004";
                newContactPhoto = "https://i.picsum.photos/id/14/2500/1667.jpg?hmac=ssQyTcZRRumHXVbQAVlXTx-MGBxm6NHWD3SryQ48G-o";
                break;
            case 5:
                newName = faker.name().firstName();//"Остап";
                newSurname = faker.name().lastName();//"Бендер";
                newTelNumber = "+79001001005";
                newContactPhoto = "https://i.picsum.photos/id/15/2500/1667.jpg?hmac=Lv03D1Y3AsZ9L2tMMC1KQZekBVaQSDc1waqJ54IHvo4";
                break;
            case 6:
                newName = faker.name().firstName();//"Михаил";
                newSurname = faker.name().lastName();//"Берлиоз";
                newTelNumber = "+79001001006";
                newContactPhoto = "https://i.picsum.photos/id/16/2500/1667.jpg?hmac=uAkZwYc5phCRNFTrV_prJ_0rP0EdwJaZ4ctje2bY7aE";
                break;
            case 7:
                newName = faker.name().firstName();//"Пётр";
                newSurname = faker.name().lastName();//"Бобчинский";
                newTelNumber = "+79001001007";
                newContactPhoto = "https://i.picsum.photos/id/17/2500/1667.jpg?hmac=HD-JrnNUZjFiP2UZQvWcKrgLoC_pc_ouUSWv8kHsJJY";
                break;
            case 8:
                newName = faker.name().firstName();//"Мари";
                newSurname = faker.name().lastName();//"Болконская";
                newTelNumber = "+79001001008";
                newContactPhoto = "https://i.picsum.photos/id/20/3670/2462.jpg?hmac=CmQ0ln-k5ZqkdtLvVO23LjVAEabZQx2wOaT4pyeG10I";
                break;
            case 9:
                newName = faker.name().firstName();//"Иван";
                newSurname = faker.name().lastName();//"Борменталь";
                newTelNumber = "+79001001009";
                newContactPhoto = "https://i.picsum.photos/id/24/4855/1803.jpg?hmac=ICVhP1pUXDLXaTkgwDJinSUS59UWalMxf4SOIWb9Ui4";
                break;
            case 10:
                newName = faker.name().firstName();//"Никанор";
                newSurname = faker.name().lastName();//"Босой";
                newTelNumber = "+79001001010";
                newContactPhoto = "https://i.picsum.photos/id/29/4000/2670.jpg?hmac=rCbRAl24FzrSzwlR5tL-Aqzyu5tX_PA95VJtnUXegGU";
                break;
            case 11:
                newName = faker.name().firstName();//"Герберт";
                newSurname = faker.name().lastName();//"Браун";
                newTelNumber = "+79001001011";
                newContactPhoto = "https://i.picsum.photos/id/30/1280/901.jpg?hmac=A_hpFyEavMBB7Dsmmp53kPXKmatwM05MUDatlWSgATE";
                break;
            case 12:
                newName = faker.name().firstName();//"Сусанна";
                newSurname = faker.name().lastName();//"Брокер";
                newTelNumber = "+79001001012";
                newContactPhoto = "https://i.picsum.photos/id/28/4928/3264.jpg?hmac=GnYF-RnBUg44PFfU5pcw_Qs0ReOyStdnZ8MtQWJqTfA";
                break;
            case 13:
                newName = faker.name().firstName();//"Тарас";
                newSurname = faker.name().lastName();//"Бульба";
                newTelNumber = "+79001001013";
                newContactPhoto = "https://i.picsum.photos/id/186/2048/1275.jpg?hmac=s7zZ_JZGEdO6Z5osibrSaE9roarIGV7aTEKJXacZi_U";
                break;
            case 14:
                newName = faker.name().firstName();//"Зинаида";
                newSurname = faker.name().lastName();//"Бунина";
                newTelNumber = "+79001001014";
                newContactPhoto = "https://i.picsum.photos/id/36/4179/2790.jpg?hmac=OCuYYm0PkDCMwxWhrtoSefG5UDir4O0XCcR2x-aSPjs";
                break;
            case 15:
                newName = faker.name().firstName();//"Иван";
                newSurname = faker.name().lastName();//"Варенуха";
                newTelNumber = "+79001001015";
                newContactPhoto = "https://i.picsum.photos/id/37/2000/1333.jpg?hmac=vpYLNsQZwU2szsZc4Uo17cW786vR0GEUVq4icaKopQI";
                break;
            case 16:
                newName = faker.name().firstName();//"Михаил";
                newSurname = faker.name().lastName();//"Верещагин";
                newTelNumber = "+79001001016";
                newContactPhoto = "https://i.picsum.photos/id/38/1280/960.jpg?hmac=HBrgyJHQOGVicaWoXgvdSfTakkAyv4BxAt4rF0DhWkU";
                break;
            case 17:
                newName = faker.name().firstName();//"Пётр";
                newSurname = faker.name().lastName();//"Верховенский";
                newTelNumber = "+79001001017";
                newContactPhoto = "https://i.picsum.photos/id/189/2048/1536.jpg?hmac=R5GGFRgevRAOGu_pBXx0u2hhkhT30ICuSMIAisvauIo";
                break;
            case 18:
                newName = faker.name().firstName();//"Иешуа";
                newSurname = faker.name().lastName();//"Га-Ноцри";
                newTelNumber = "+79001001018";
                newContactPhoto = "https://i.picsum.photos/id/39/3456/2304.jpg?hmac=cc_VPxzydwTUbGEtpsDeo2NxCkeYQrhTLqw4TFo-dIg";
                break;
            case 19:
                newName = faker.name().firstName();//"Птица";
                newSurname = faker.name().lastName();//"Говорун";
                newTelNumber = "+79001001019";
                newContactPhoto = "https://i.picsum.photos/id/41/1280/805.jpg?hmac=W9CWeYdlZisqEfhjuODl83T3lCXAqjUZrOe9iMFPYmI";
                break;
            case 20:
                newName = faker.name().firstName();//"Иудушка";
                newSurname = faker.name().lastName();//"Головлёв";
                newTelNumber = "+79001001020";
                newContactPhoto = "https://i.picsum.photos/id/42/3456/2304.jpg?hmac=dhQvd1Qp19zg26MEwYMnfz34eLnGv8meGk_lFNAJR3g";
                break;
            case 21:
                newName = faker.name().firstName();//"Яков";
                newSurname = faker.name().lastName();//"Голядкин";
                newTelNumber = "+79001001021";
                newContactPhoto = "https://i.picsum.photos/id/43/1280/831.jpg?hmac=glK-rQ0ppFClW-lvjk9FqEWKog07XkOxJf6Xg_cU9LI";
                break;
            case 22:
                newName = faker.name().firstName();//"Мадам";
                newSurname = faker.name().lastName();//"Грицацуева";
                newTelNumber = "+79001001022";
                newContactPhoto = "https://i.picsum.photos/id/44/4272/2848.jpg?hmac=a0rRK2VqTNYMvxqfQjFI65m4ZzMGnKRJzHvrJovjoQQ";
                break;
            case 23:
                newName = faker.name().firstName();//"Макар";
                newSurname = faker.name().lastName();//"Девушкин";
                newTelNumber = "+79001001023";
                newContactPhoto = "https://i.picsum.photos/id/45/4592/2576.jpg?hmac=Vc7_kMYufvy96FxocZ1Zx6DR1PNsNQXF4XUw1mZ2dlc";
                break;
            case 24:
                newName = faker.name().firstName();//"Варвара";
                newSurname = faker.name().lastName();//"Добросёлова";
                newTelNumber = "+79001001024";
                newContactPhoto = "https://i.picsum.photos/id/46/3264/2448.jpg?hmac=ZHE8nk-Q9uRp4MxgKNvN7V7pYFvA-9BCv99ltY3HBv4";
                break;
            case 25:
                newName = faker.name().firstName();//"Пётр";
                newSurname = faker.name().lastName();//"Добчинский";
                newTelNumber = "+79001001025";
                newContactPhoto = "https://i.picsum.photos/id/190/2048/1365.jpg?hmac=NWS1_X_JJ-Edi-9SZRhNwHyjKt1nECckxrGLS8_idjY";
                break;
            case 26:
                newName = faker.name().firstName();//"Старец";
                newSurname = faker.name().lastName();//"Зосима";
                newTelNumber = "+79001001026";
                newContactPhoto = "https://i.picsum.photos/id/47/4272/2848.jpg?hmac=G8dXSLa-ngBieraQt5EORu-4r6tveX3fhvBTZM0Y8xM";
                break;
            case 27:
                newName = faker.name().firstName();//"Дарья";
                newSurname = faker.name().lastName();//"Иванова";
                newTelNumber = "+79001001027";
                newContactPhoto = "https://i.picsum.photos/id/48/5000/3333.jpg?hmac=y3_1VDNbhii0vM_FN6wxMlvK27vFefflbUSH06z98so";
                break;
            case 28:
                newName = faker.name().firstName();//"Пётр";
                newSurname = faker.name().lastName();//"Йогель";
                newTelNumber = "+79001001028";
                newContactPhoto = "https://i.picsum.photos/id/49/1280/792.jpg?hmac=NnUJy0O9-pXHLmY2loqVs2pJmgw9xzuixgYOk4ALCXU";
                break;
            case 29:
                newName = faker.name().firstName();//"Василь";
                newSurname = faker.name().lastName();//"Казак";
                newTelNumber = "+79001001029";
                newContactPhoto = "https://i.picsum.photos/id/50/4608/3072.jpg?hmac=E6WgCk6MBOyuRjW4bypT6y-tFXyWQfC_LjIBYPUspxE";
                break;
            case 30:
                newName = faker.name().firstName();//"Алексей";
                newSurname = faker.name().lastName();//"Карамазов";
                newTelNumber = "+79001001030";
                newContactPhoto = "https://i.picsum.photos/id/51/5000/3333.jpg?hmac=9dZb89mIRt-mPQpI_ScJAxVsNI82SFCGOuiKsvGSchY";
                break;
            case 31:
                newName = faker.name().firstName();//"Дмитрий";
                newSurname = faker.name().lastName();//"Карамазов";
                newTelNumber = "+79001001031";
                newContactPhoto = "https://i.picsum.photos/id/52/1280/853.jpg?hmac=FBJ023QL6SsJpbQl8B20ExSey3BjyRH1MOw7Uo7fIMU";
                break;
            case 32:
                newName = faker.name().firstName();//"Иван";
                newSurname = faker.name().lastName();//"Карамазов";
                newTelNumber = "+79001001032";
                newContactPhoto = "https://i.picsum.photos/id/53/1280/1280.jpg?hmac=QP5opo-oENp5iFwsSiWH8azQuR0w0bwps6MT6yvhKwA";
                break;
            case 33:
                newName = faker.name().firstName();//"Фёдор";
                newSurname = faker.name().lastName();//"Карамазов";
                newTelNumber = "+79001001033";
                newContactPhoto = "https://i.picsum.photos/id/54/3264/2176.jpg?hmac=blh020fMeJ5Ru0p-fmXUaOAeYnxpOPHnhJojpzPLN3g";
                break;
            case 34:
                newName = faker.name().firstName();//"Платон";
                newSurname = faker.name().lastName();//"Каратаев";
                newTelNumber = "+79001001034";
                newContactPhoto = "https://i.picsum.photos/id/55/4608/3072.jpg?hmac=ahGhylwdN52ULB37deeMZX6T_G7NiERtoPhwydMvUKQ";
                break;
            case 35:
                newName = faker.name().firstName();//"Тимофей";
                newSurname = faker.name().lastName();//"Квасцов";
                newTelNumber = "+79001001035";
                newContactPhoto = "https://i.picsum.photos/id/56/2880/1920.jpg?hmac=BIplhYgNZ9bsjPXYhD0xx6M1yPgmg4HtthKkCeJp6Fk";
                break;
            case 36:
                newName = faker.name().firstName();//"Адам";
                newSurname = faker.name().lastName();//"Козлевич";
                newTelNumber = "+79001001036";
                newContactPhoto = "https://i.picsum.photos/id/57/2448/3264.jpg?hmac=ewraXYesC6HuSEAJsg3Q80bXd1GyJTxekI05Xt9YjfQ";
                break;
            case 37:
                newName = faker.name().firstName();//"Капитан";
                newSurname = faker.name().lastName();//"Копейкин";
                newTelNumber = "+79001001037";
                newContactPhoto = "https://i.picsum.photos/id/58/1280/853.jpg?hmac=YO3QnOm9TpyM5DqsJjoM4CHg8oIq4cMWLpd9ALoP908";
                break;
            case 38:
                newName = faker.name().firstName();//"Настасья";
                newSurname = faker.name().lastName();//"Коробочка";
                newTelNumber = "+79001001038";
                newContactPhoto = "https://i.picsum.photos/id/60/1920/1200.jpg?hmac=fAMNjl4E_sG_WNUjdU39Kald5QAHQMh-_-TsIbbeDNI";
                break;
            case 39:
                newName = faker.name().firstName();//"Анатоль";
                newSurname = faker.name().lastName();//"Курагин";
                newTelNumber = "+79001001039";
                newContactPhoto = "https://i.picsum.photos/id/61/3264/2448.jpg?hmac=Xi3Kq99U5tueFi0aajgUP0yWAL4xwCHg5ZXGZRLTqyI";
                break;
            case 40:
                newName = faker.name().firstName();//"Элен";
                newSurname = faker.name().lastName();//"Курагина";
                newTelNumber = "+79001001040";
                newContactPhoto = "https://i.picsum.photos/id/62/2000/1333.jpg?hmac=PbFIn8k0AndjiUwpOJcfHz2h-wPCQi_vJRTJZPdr6kQ";
                break;
            case 41:
                newName = faker.name().firstName();//"Дмитрий";
                newSurname = faker.name().lastName();//"Ларин";
                newTelNumber = "+79001001041";
                newContactPhoto = "https://i.picsum.photos/id/63/5000/2813.jpg?hmac=HvaeSK6WT-G9bYF_CyB2m1ARQirL8UMnygdU9W6PDvM";
                break;
            case 42:
                newName = faker.name().firstName();//"Ольга";
                newSurname = faker.name().lastName();//"Ларина";
                newTelNumber = "+79001001042";
                newContactPhoto = "https://i.picsum.photos/id/66/3264/2448.jpg?hmac=H9yvGug9-Lk5f-1qZqs6dEV-Yd40jFOIC7oudo4eBK4";
                break;
            case 43:
                newName = faker.name().firstName();//"Татьяна";
                newSurname = faker.name().lastName();//"Ларина";
                newTelNumber = "+79001001043";
                newContactPhoto = "https://i.picsum.photos/id/67/2848/4288.jpg?hmac=X_Z0Wdd3HiJ8eWT0ohdmpRSIA6e6s265INUMuHA8MqA";
                break;
            case 44:
                newName = faker.name().firstName();//"Василий";
                newSurname = faker.name().lastName();//"Ласточкин";
                newTelNumber = "+79001001044";
                newContactPhoto = "https://i.picsum.photos/id/68/4608/3072.jpg?hmac=0KfOS12jehkc6HbfMXWj3GMFve9kVs82dYsN12Npn2Y";
                break;
            case 45:
                newName = faker.name().firstName();//"Капитан";
                newSurname = faker.name().lastName();//"Лебядкин";
                newTelNumber = "+79001001045";
                newContactPhoto = "https://i.picsum.photos/id/69/4912/3264.jpg?hmac=Q08LW3SoOxPfaE-y8-braexxvm5PESXMCdEDqFbEhQ8";
                break;
            case 46:
                newName = faker.name().firstName();//"Степан";
                newSurname = faker.name().lastName();//"Лиходеев";
                newTelNumber = "+79001001046";
                newContactPhoto = "https://i.picsum.photos/id/193/3578/2451.jpg?hmac=M5yoazhwdwMa_27rC5-S50SNFvCy4Kni0wXoa6iVF0g";
                break;
            case 47:
                newName = faker.name().firstName();//"Васисуалий";
                newSurname = faker.name().lastName();//"Лоханкин";
                newTelNumber = "+79001001047";
                newContactPhoto = "https://i.picsum.photos/id/70/3011/2000.jpg?hmac=-npCfe1kpGYW7HcBlZvrEZ9Qb_EdiGLbDxE26amgotM";
                break;
            case 48:
                newName = faker.name().firstName();//"Пётр";
                newSurname = faker.name().lastName();//"Лужин";
                newTelNumber = "+79001001048";
                newContactPhoto = "https://i.picsum.photos/id/71/5000/3333.jpg?hmac=wBjyqoAke0uv6bTtbbIby9s-VTQ52gIkI-QVXWS3W0I";
                break;
            case 49:
                newName = faker.name().firstName();//"Эллочка";
                newSurname = faker.name().lastName();//"Людоедка";
                newTelNumber = "+79001001049";
                newContactPhoto = "https://i.picsum.photos/id/72/3000/2000.jpg?hmac=hPLN3NcJrehzDdebypIHkhh2RLnh89HwJ8QemMsRjzc";
                break;
            case 50:
                newName = faker.name().firstName();//"Никифор";
                newSurname = faker.name().lastName();//"Ляпис-Трубецкой";
                newTelNumber = "+79001001050";
                newContactPhoto = "https://i.picsum.photos/id/196/2048/1536.jpg?hmac=ms1QhP7El_5Dctsq98kJyzsT7-WqnGVNN-pwjAQ98x0";
                break;
            case 51:
                newName = faker.name().firstName();//"Аммос";
                newSurname = faker.name().lastName();//"Ляпкин-Тяпкин";
                newTelNumber = "+79001001051";
                newContactPhoto = "https://i.picsum.photos/id/74/4288/2848.jpg?hmac=q02MzzHG23nkhJYRXR-_RgKTr6fpfwRgcXgE0EKvNB8";
                break;
            case 52:
                newName = faker.name().firstName();//"Иван";
                newSurname = faker.name().lastName();//"Манилов";
                newTelNumber = "+79001001052";
                newContactPhoto = "https://i.picsum.photos/id/75/1999/2998.jpg?hmac=0agRZd8c5CRiFvADOWJqfTv6lqYBty3Kw-9LEtLp_98";
                break;
            case 53:
                newName = faker.name().firstName();//"Ипполит";
                newSurname = faker.name().lastName();//"Матвеевич";
                newTelNumber = "+79001001053";
                newContactPhoto = "https://i.picsum.photos/id/76/4912/3264.jpg?hmac=VkFcSa2Rbv0R0ndYnz_FAmw02ON1pPVjuF_iVKbiiV8";
                break;
            case 54:
                newName = faker.name().firstName();//"Жорж";
                newSurname = faker.name().lastName();//"Милославский";
                newTelNumber = "+79001001054";
                newContactPhoto = "https://i.picsum.photos/id/77/1631/1102.jpg?hmac=sg0ArFCRjP1wlUg8vszg5RFfGiXZJkWEtqLLCRraeBw";
                break;
            case 55:
                newName = faker.name().firstName();//"Алоизий";
                newSurname = faker.name().lastName();//"Могарыч";
                newTelNumber = "+79001001055";
                newContactPhoto = "https://i.picsum.photos/id/78/1584/2376.jpg?hmac=80UVSwpa9Nfcq7sQ5kxb9Z5sD2oLsbd5zkFO5ybMC4E";
                break;
            case 56:
                newName = faker.name().firstName();//"Князь";
                newSurname = faker.name().lastName();//"Мышкин";
                newTelNumber = "+79001001056";
                newContactPhoto = "https://i.picsum.photos/id/79/2000/3011.jpg?hmac=TQsXWj0kLBLRXbSAh2Pygog1-cOefqpjEoKyl0uD3tg";
                break;
            case 57:
                newName = faker.name().firstName();//"Капитан";
                newSurname = faker.name().lastName();//"Немо";
                newTelNumber = "+79001001057";
                newContactPhoto = "https://i.picsum.photos/id/80/3888/2592.jpg?hmac=zD95NwXZ7mGAMj-z4444Elf43I4HJvd7Afm2tloweLw";
                break;
            case 58:
                newName = faker.name().firstName();//"Павел";
                newSurname = faker.name().lastName();//"Ноздрёв";
                newTelNumber = "+79001001058";
                newContactPhoto = "https://i.picsum.photos/id/81/5000/3250.jpg?hmac=gFiddUc7I25C06HUIMesyaFCjSOWE3L3uDl0QSyuX4M";
                break;
            case 59:
                newName = faker.name().firstName();//"Евгений";
                newSurname = faker.name().lastName();//"Онегин";
                newTelNumber = "+79001001059";
                newContactPhoto = "https://i.picsum.photos/id/82/1500/997.jpg?hmac=VcdCqu9YiLpbCtr8YowUCSUD3-245TGekiXmtiMXotw";
                break;
            case 60:
                newName = faker.name().firstName();//"Василий";
                newSurname = faker.name().lastName();//"Ордынов";
                newTelNumber = "+79001001060";
                newContactPhoto = "https://i.picsum.photos/id/83/2560/1920.jpg?hmac=LFdAxfpbYKs0hZr0LhHVWyqXarWGg7FtM8pIzJPBc0w";
                break;
            case 61:
                newName = faker.name().firstName();//"Фёдор";
                newSurname = faker.name().lastName();//"Отец";
                newTelNumber = "+79001001061";
                newContactPhoto = "https://i.picsum.photos/id/84/1280/848.jpg?hmac=YFRYDI4UsfbeTzI8ZakNOR98wVU7a-9a2tGF542539s";
                break;
            case 62:
                newName = faker.name().firstName();//"Доктор";
                newSurname = faker.name().lastName();//"Павлыш";
                newTelNumber = "+79001001062";
                newContactPhoto = "https://i.picsum.photos/id/85/1280/774.jpg?hmac=h_HHpvfhMmLP6uOSrHS7HSlXVRuMKfBbc8HFKd1Acv4";
                break;
            case 63:
                newName = faker.name().firstName();//"Жак";
                newSurname = faker.name().lastName();//"Паганель";
                newTelNumber = "+79001001063";
                newContactPhoto = "https://i.picsum.photos/id/87/1280/960.jpg?hmac=tyU21LuCEO1qRepY4GnT9gGkfKbvY__ZrZYg_JxZxI8";
                break;
            case 64:
                newName = faker.name().firstName();//"Бонавентур";
                newSurname = faker.name().lastName();//"Пенкроф";
                newTelNumber = "+79001001064";
                newContactPhoto = "https://i.picsum.photos/id/88/1280/1707.jpg?hmac=NnkwPVDBTVxHkc4rALB_fyu-OHY2usdm7iRk5El7JC4";
                break;
            case 65:
                newName = faker.name().firstName();//"Степан";
                newSurname = faker.name().lastName();//"Плюшкин";
                newTelNumber = "+79001001065";
                newContactPhoto = "https://i.picsum.photos/id/89/4608/2592.jpg?hmac=G9E4z5RMJgMUjgTzeR4CFlORjvogsGtqFQozIRqugBk";
                break;
            case 66:
                newName = faker.name().firstName();//"Максимилиан";
                newSurname = faker.name().lastName();//"Поплавский";
                newTelNumber = "+79001001066";
                newContactPhoto = "https://i.picsum.photos/id/92/3568/2368.jpg?hmac=k-61p7oMQe6U59dEgm0Gu6bWTJGPfHblWxMskxTBZMo";
                break;
            case 67:
                newName = faker.name().firstName();//"Аксентий";
                newSurname = faker.name().lastName();//"Поприщин";
                newTelNumber = "+79001001067";
                newContactPhoto = "https://i.picsum.photos/id/93/2000/1334.jpg?hmac=HdhcVTbAYkFCXsu1qBRWeEPiy05Qjc3LbnMWJlfEFjo";
                break;
            case 68:
                newName = faker.name().firstName();//"Филипп";
                newSurname = faker.name().lastName();//"Преображенский";
                newTelNumber = "+79001001068";
                newContactPhoto = "https://i.picsum.photos/id/94/2133/1200.jpg?hmac=renErwq5Y1V0wU0ah6ssb9JR6lzlhs9n05UuPzO-v0M";
                break;
            case 69:
                newName = faker.name().firstName();//"Михаил";
                newSurname = faker.name().lastName();//"Ракиткин";
                newTelNumber = "+79001001069";
                newContactPhoto = "https://i.picsum.photos/id/95/2048/2048.jpg?hmac=rvEUpzQSeSWTzfsWTIytYnLieOx_Iaa6PfYOxVwEb1g";
                break;
            case 70:
                newName = faker.name().firstName();//"Родион";
                newSurname = faker.name().lastName();//"Раскольников";
                newTelNumber = "+79001001070";
                newContactPhoto = "https://i.picsum.photos/id/96/4752/3168.jpg?hmac=KNXudB1q84CHl2opIFEY4ph12da5JD5GzKzH5SeuRVM";
                break;
            case 71:
                newName = faker.name().firstName();//"Григорий";
                newSurname = faker.name().lastName();//"Римский";
                newTelNumber = "+79001001071";
                newContactPhoto = "https://i.picsum.photos/id/98/3264/2176.jpg?hmac=yRaOwMpmio9mwf43lbPEYI_5-WiPWoghJZyOKldQ43U";
                break;
            case 72:
                newName = faker.name().firstName();//"Парфён";
                newSurname = faker.name().lastName();//"Рогожин";
                newTelNumber = "+79001001072";
                newContactPhoto = "https://i.picsum.photos/id/99/4912/3264.jpg?hmac=jobkGP8_9Sch9BmMGe3xmm8yjCVQ3iSHrbu_4kOOciY";
                break;
            case 73:
                newName = faker.name().firstName();//"Яков";
                newSurname = faker.name().lastName();//"Розенталь";
                newTelNumber = "+79001001073";
                newContactPhoto = "https://i.picsum.photos/id/102/4320/3240.jpg?hmac=ico2KysoswVG8E8r550V_afIWN963F6ygTVrqHeHeRc";
                break;
            case 74:
                newName = faker.name().firstName();//"Николай";
                newSurname = faker.name().lastName();//"Ростов";
                newTelNumber = "+79001001074";
                newContactPhoto = "https://i.picsum.photos/id/104/3840/2160.jpg?hmac=Rv0qxBiYb65Htow4mdeDlyT5kLM23Z2cDlN53YYldZU";
                break;
            case 75:
                newName = faker.name().firstName();//"Наташа";
                newSurname = faker.name().lastName();//"Ростова";
                newTelNumber = "+79001001075";
                newContactPhoto = "https://i.picsum.photos/id/106/2592/1728.jpg?hmac=E1-3Hac5ffuCVwYwexdHImxbMFRsv83exZ2EhlYxkgY";
                break;
            case 76:
                newName = faker.name().firstName();//"Александр";
                newSurname = faker.name().lastName();//"Рюхин";
                newTelNumber = "+79001001076";
                newContactPhoto = "https://i.picsum.photos/id/107/5000/3333.jpg?hmac=RA_wrO9Hs-AelIqfc3yu08bk_5CZ6FhFyy1CQ_qhgjs";
                break;
            case 77:
                newName = faker.name().firstName();//"Грушенька";
                newSurname = faker.name().lastName();//"Светлова";
                newTelNumber = "+79001001077";
                newContactPhoto = "https://i.picsum.photos/id/108/2000/1333.jpg?hmac=jtsJnUALS7Y2pJnLKGF7fSvGhEKpDWLvjTr9bRVFELA";
                break;
            case 78:
                newName = faker.name().firstName();//"Аркадий";
                newSurname = faker.name().lastName();//"Свидригайлов";
                newTelNumber = "+79001001078";
                newContactPhoto = "https://i.picsum.photos/id/109/4287/2392.jpg?hmac=K5ytllhfakgsUEDFnY5ujHIGJTzELPQgVJjZMpRlfJY";
                break;
            case 79:
                newName = faker.name().firstName();//"Алиса";
                newSurname = faker.name().lastName();//"Селезнёва";
                newTelNumber = "+79001001079";
                newContactPhoto = "https://i.picsum.photos/id/110/5000/3333.jpg?hmac=AvUBrnXG4ebvrtC08T95vEzD1I9SryZ8KSQ4iJ9tb9s";
                break;
            case 80:
                newName = faker.name().firstName();//"Аркадий";
                newSurname = faker.name().lastName();//"Семплеяров";
                newTelNumber = "+79001001080";
                newContactPhoto = "https://i.picsum.photos/id/112/4200/2800.jpg?hmac=8Qhr0ehkFOnlKO__aKhLMQTu2qzcAten9LHpBO6uk-k";
                break;
            case 81:
                newName = faker.name().firstName();//"Зося";
                newSurname = faker.name().lastName();//"Синицкая";
                newTelNumber = "+79001001081";
                newContactPhoto = "https://i.picsum.photos/id/116/3504/2336.jpg?hmac=C46vgpj3R407e8pCyy8NhIsNaBZCjb4r5d71keNgMJY";
                break;
            case 82:
                newName = faker.name().firstName();//"Павел";
                newSurname = faker.name().lastName();//"Смердяков";
                newTelNumber = "+79001001082";
                newContactPhoto = "https://i.picsum.photos/id/118/1500/1000.jpg?hmac=jumRsHTbfg0frrVd5Xw1187nwNcZCqJbqrdlXpPAIjw";
                break;
            case 83:
                newName = faker.name().firstName();//"Сайрус";
                newSurname = faker.name().lastName();//"Смит";
                newTelNumber = "+79001001083";
                newContactPhoto = "https://i.picsum.photos/id/119/3264/2176.jpg?hmac=PYRYBOGQhlUm6wS94EkpN8dTIC7-2GniC3pqOt6CpNU";
                break;
            case 84:
                newName = faker.name().firstName();//"Михаил";
                newSurname = faker.name().lastName();//"Собакевич";
                newTelNumber = "+79001001084";
                newContactPhoto = "https://i.picsum.photos/id/121/1600/1067.jpg?hmac=QDrnlQAvC_54xDpx2afpzKMbjCZvnRljseYvkK8XPCQ";
                break;
            case 85:
                newName = faker.name().firstName();//"Андрей";
                newSurname = faker.name().lastName();//"Соков";
                newTelNumber = "+79001001085";
                newContactPhoto = "https://i.picsum.photos/id/122/4147/2756.jpg?hmac=-B_1uAvYufznhjeA9xSSAJjqt07XrVzDWCf5VDNX0pQ";
                break;
            case 86:
                newName = faker.name().firstName();//"Гедеон";
                newSurname = faker.name().lastName();//"Спилет";
                newTelNumber = "+79001001086";
                newContactPhoto = "https://i.picsum.photos/id/124/3504/2336.jpg?hmac=B1Avp6or9Df8vpnN4kQsGNfD66j8hH3gLtootCoTw4M";
                break;
            case 87:
                newName = faker.name().firstName();//"Александр";
                newSurname = faker.name().lastName();//"Стравинский";
                newTelNumber = "+79001001087";
                newContactPhoto = "https://i.picsum.photos/id/125/1500/1000.jpg?hmac=s6pniw6JFp6F753Ow9mnVAVqt8tOcP8ZlZE5-aJ22co";
                break;
            case 88:
                newName = faker.name().firstName();//"Алексей";
                newSurname = faker.name().lastName();//"Турбин";
                newTelNumber = "+79001001088";
                newContactPhoto = "https://i.picsum.photos/id/127/4032/2272.jpg?hmac=QFoFT2_eb_DCqjdlj09UFgUHwI_zefDTBdECRz9lO5Q";
                break;
            case 89:
                newName = faker.name().firstName();//"Весельчак";
                newSurname = faker.name().lastName();//"У";
                newTelNumber = "+79001001089";
                newContactPhoto = "https://i.picsum.photos/id/128/3823/2549.jpg?hmac=VbPyA2vESva2YdoXqll9REBcbQIskgv_c-D60C1s0xc";
                break;
            case 90:
                newName = faker.name().firstName();//"Корнелий";
                newSurname = faker.name().lastName();//"Удалов";
                newTelNumber = "+79001001090";
                newContactPhoto = "https://i.picsum.photos/id/141/2048/1365.jpg?hmac=xcZmN-VINP95YwmI3AXCTIxfzd61fhaczQmodKQjLbY";
                break;
            case 91:
                newName = faker.name().firstName();//"Филеас";
                newSurname = faker.name().lastName();//"Фогг";
                newTelNumber = "+79001001091";
                newContactPhoto = "https://i.picsum.photos/id/142/4272/2848.jpg?hmac=z8IS_an6FQ8ijJOBd-wSVg1JTZbeIDG4TbjHwLQbs0I";
                break;
            case 92:
                newName = faker.name().firstName();//"Зицпредседатель";
                newSurname = faker.name().lastName();//"Фунт";
                newTelNumber = "+79001001092";
                newContactPhoto = "https://i.picsum.photos/id/147/2448/2448.jpg?hmac=Xk6y7EeyG6VQTac1N9IhDAwLVNVeCn_KBN4nO5SRxPw";
                break;
            case 93:
                newName = faker.name().firstName();//"Иван";
                newSurname = faker.name().lastName();//"Хлестаков";
                newTelNumber = "+79001001093";
                newContactPhoto = "https://i.picsum.photos/id/149/3454/2288.jpg?hmac=JoHMBHymDuk59QWHK89nquWAXE4Su1mF07OKdvmpN3g";
                break;
            case 94:
                newName = faker.name().firstName();//"Степан";
                newSurname = faker.name().lastName();//"Хохлаков";
                newTelNumber = "+79001001094";
                newContactPhoto = "https://i.picsum.photos/id/152/3888/2592.jpg?hmac=M1xv1MzO9xjf5-tz1hGR9bQpNt973ANkqfEVDW0-WYU";
                break;
            case 95:
                newName = faker.name().firstName();//"Лиза";
                newSurname = faker.name().lastName();//"Хохлакова";
                newTelNumber = "+79001001095";
                newContactPhoto = "https://i.picsum.photos/id/159/5000/2460.jpg?hmac=h12oeFVhY4-vOrALaICJ4k4dqemWn1lvaMN8yvnIU1w";
                break;
            case 96:
                newName = faker.name().firstName();//"Павел";
                newSurname = faker.name().lastName();//"Чичиков";
                newTelNumber = "+79001001096";
                newContactPhoto = "https://i.picsum.photos/id/162/1500/998.jpg?hmac=j-Xr1aKHzCJQigPBLF0nKTudXM2w9u1-Smxlam0YOt8";
                break;
            case 97:
                newName = faker.name().firstName();//"Клим";
                newSurname = faker.name().lastName();//"Чугункин";
                newTelNumber = "+79001001097";
                newContactPhoto = "https://i.picsum.photos/id/164/1200/800.jpg?hmac=wkqGUkaeW3kiAsHq_VwxSWWossIMAwFV4eUfFzuDkew";
                break;
            case 98:
                newName = faker.name().firstName();//"Полиграф";
                newSurname = faker.name().lastName();//"Шариков";
                newTelNumber = "+79001001098";
                newContactPhoto = "https://i.picsum.photos/id/165/2000/1333.jpg?hmac=KK4nT-Drh_vgMxg3hb7rOd6peHRIYmxMg0IEyxlTVFg";
                break;
            case 99:
                newName = faker.name().firstName();//"Анна";
                newSurname = faker.name().lastName();//"Шерер";
                newTelNumber = "+79001001099";
                newContactPhoto = "https://i.picsum.photos/id/182/2896/1944.jpg?hmac=lzw4TC7qF2R3BEJu05d0M6rdglY57ugjugCP6XoiMbQ";
                break;
        }
        return new Contacts(newName, newSurname, newTelNumber, newContactPhoto);
    }
}
