import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.toKString
import platform.windows.CheckRadioButton
import platform.windows.GetUserDefaultLocaleName
import platform.windows.WCHARVar

const val next = "next"
const val apply = "apply"
const val back = "back"
const val skip = "skip"
const val error = "error"
const val welcome = "welcome"
const val cancel = "cancel"
const val confirmation = "confirmation"
const val cancel_text = "cancel_text"
const val text_1 = "text_1"
const val text_1_1 = "text_1_1"
const val title_2 = "title_2"
const val lang = "lang"
const val accept = "accept"
const val mp_tab_key = "mp_tab_key"
const val mp_esc_key = "mp_esc_key"
const val mp_space_key = "mp_space_key"
const val gd_space_key = "gd_space_key"
const val mp_1_key = "mp_1_key"
const val mp_2_key = "mp_2_key"
const val mp_3_key = "mp_3_key"
const val mp_4_key = "mp_4_key"
const val mp_5_key = "mp_5_key"
const val mp_6_key = "mp_6_key"
const val mp_7_key = "mp_7_key"
const val mp_t_key = "mp_t_key"
const val mp_c_key = "mp_c_key"
const val mp_e_key = "mp_e_key"
const val mp_f_key = "mp_f_key"
const val mp_q_key = "mp_q_key"
const val mp_m_key = "mp_m_key"
const val mp_g_key = "mp_g_key"
const val mp_r_key = "mp_r_key"
const val mp_v_key = "mp_v_key"
const val mp_ctrl_key = "mp_ctrl_key"
const val gd_ctrl_key = "gd_ctrl_key"
const val mp_z_key = "mp_z_key"
const val mp_f4_key = "mp_f4_key"
const val mp_o_key = "mp_o_key"
const val mp_i_key = "mp_i_key"
const val mp_l_key = "mp_l_key"
const val mp_caps_key = "mp_caps_key"
const val gd_q_key = "gd_q_key"
const val gd_e_key = "gd_e_key"
const val gd_r_key = "gd_r_key"
const val lock_mouse_key = "lock_mouse_key"
const val br_tab_key = "br_tab_key"
const val br_space_key = "br_space_key"
const val br_b_key = "br_b_key"
const val br_c_key = "br_c_key"
const val br_o_key = "br_o_key"
const val br_e_key = "br_e_key"
const val br_g_key = "br_g_key"
const val br_f_key = "br_f_key"
const val br_t_key = "br_t_key"
const val br_h_key = "br_h_key"
const val br_q_key = "br_q_key"
const val br_r_key = "br_r_key"
const val br_v_key = "br_v_key"
const val br_n_key = "br_n_key"
const val br_ctrl_key = "br_ctrl_key"
const val br_caps_key = "br_caps_key"
const val br_alt_key = "br_alt_key"
const val br_3_key = "br_3_key"
const val br_4_key = "br_4_key"
const val dmz_tab_key = "dmz_tab_key"
const val dmz_ctrl_key = "dmz_ctrl_key"
const val dmz_space_key = "dmz_space_key"
const val dmz_c_key = "dmz_c_key"
const val dmz_e_key = "dmz_e_key"
const val dmz_f_key = "dmz_f_key"
const val dmz_h_key = "dmz_h_key"
const val dmz_g_key = "dmz_g_key"
const val dmz_v_key = "dmz_v_key"
const val dmz_t_key = "dmz_t_key"
const val lang_en = "lang_en"
const val lang_hu = "lang_hu"
const val lang_tr = "lang_tr"
const val lang_ar = "lang_ar"
const val lang_es = "lang_es"
const val lang_ptbr = "lang_ptbr"
const val lang_id = "lang_id"
const val lang_ru = "lang_ru"
const val lang_fr = "lang_fr"

val en = mapOf(
    next to "Next",
    apply to "Apply",
    back to "Back",
    skip to "Delete configuration",
    error to "Error",
    cancel to "Cancel",
    welcome to "Welcome!",
    confirmation to "Confirmation",
    cancel_text to "Are you sure you want to close the application?",
    text_1_1 to "Choose a language to get started:",
    title_2 to "Terms of use",
    accept to "Accept",
    mp_tab_key to "Combat performance panel",
    mp_esc_key to "Menu",
    mp_space_key to "Jump/Drone up",
    gd_space_key to "Jump",
    mp_1_key to "Weapon 1",
    mp_2_key to "Weapon 2",
    mp_3_key to "Scorestreak 1",
    mp_4_key to "Scorestreak 2",
    mp_5_key to "Scorestreak 3",
    mp_6_key to "Scorestreak 4",
    mp_7_key to "Scorestreak 5",
    mp_t_key to "Detonate C4",
    mp_c_key to "Crouch/Slide",
    mp_e_key to "Operator skill",
    mp_f_key to "Plant - Defuse bomb/Cancel throwable/Pick up weapon/Open airdrop",
    mp_q_key to "Grenade/Tactical grenade",
    mp_m_key to "Map",
    mp_g_key to "Switch grenade/Lethal grenade",
    mp_r_key to "Reload",
    mp_v_key to "Knife",
    mp_ctrl_key to "Prone/Drone down",
    gd_ctrl_key to "Flight forward",
    mp_z_key to "Voice",
    mp_f4_key to "Emoji",
    mp_o_key to "Auto run/Night vision",
    br_o_key to "Auto run",
    mp_i_key to "Signal",
    mp_l_key to "Sound",
    mp_caps_key to "Execution",
    gd_q_key to "Ability 1",
    gd_e_key to "Ability 2",
    gd_r_key to "Ability 3",
    lock_mouse_key to "Lock mouse to screen",
    br_tab_key to "Backpack open/close",
    dmz_tab_key to "Backpack",
    br_space_key to "Jump/Brake",
    dmz_space_key to "Jump",
    br_caps_key to "Execution/Snowboard",
    br_b_key to "Revive",
    br_c_key to "Crouch/Slide/Change position in car",
    dmz_c_key to "Crouch/Slide",
    br_e_key to "Skill/Aircraft jammer",
    dmz_e_key to "Skill",
    br_g_key to "Pick up items/Enter car (second)",
    dmz_g_key to "Pick up items/accept mission",
    br_f_key to "Cancel grenade/Enter-exit car/Doors/Pick up item",
    dmz_f_key to "Open loot box",
    br_t_key to "Open-Close loot box/Jump snowboard",
    br_h_key to "Pick up item/Open-Close loot box/Enter car (first)",
    dmz_h_key to "Pick up item",
    br_q_key to "Enter car",
    br_r_key to "Reload",
    br_v_key to "Desperado",
    dmz_v_key to "Zipline",
    dmz_t_key to "Rescue teammate",
    br_n_key to "1st/3rd person switch",
    br_ctrl_key to "Prone",
    dmz_ctrl_key to "Prone",
    br_alt_key to "Free view",
    br_3_key to "Grenade",
    br_4_key to "Armor",
    lang_en to "English - English",
    lang_hu to "Hungarian - Magyar",
    lang_tr to "Turkish - Türkçe",
    lang_ar to "Arabic - العربية",
    lang_es to "Spanish - Español",
    lang_ptbr to "Portuguese (Brazilian) - Português (Brasil)",
    lang_id to "Indonesian - Bahasa Indonesia",
    lang_ru to "Russian - Русский",
    lang_fr to "French - Français"
)

val hu = mapOf(
    next to "Következő",
    apply to "Alkalmaz",
    back to "Vissza",
    skip to "Konfiguráció törlése",
    cancel to "Mégse",
    error to "Hiba",
    welcome to "Üdvözöljük!",
    confirmation to "Megerősítés",
    cancel_text to "Biztosan be szeretnéd zárni az alkalmazást?",
    text_1_1 to "A kezdéshez válasszon nyelvet:",
    title_2 to "Felhasználói feltételek",
    accept to "Elfogadom",
    mp_tab_key to "Harc teljesítmény panel",
    mp_esc_key to "Menü",
    mp_space_key to "Ugrás/Drón fel",
    gd_space_key to "Ugrás",
    mp_1_key to "Fegyver 1",
    mp_2_key to "Fegyver 2",
    mp_3_key to "Scorestreak 1",
    mp_4_key to "Scorestreak 2",
    mp_5_key to "Scorestreak 3",
    mp_6_key to "Scorestreak 4",
    mp_7_key to "Scorestreak 5",
    mp_t_key to "C4 robbantás",
    mp_c_key to "Guggolás/Csúszás",
    mp_e_key to "Operator skill",
    mp_f_key to "Bomba telepítés-hatástalanítás/Mégse gránát/Fegyvercsere/Airdrop kinyitás",
    mp_q_key to "Gránát/Taktikai gránát",
    mp_m_key to "Térkép",
    mp_g_key to "Gránát csere/Halálos gránát",
    mp_r_key to "Újratöltés",
    mp_v_key to "Kés",
    mp_ctrl_key to "Fekvés/Drón le",
    gd_ctrl_key to "Repülés előre",
    mp_z_key to "Mikrofon",
    mp_f4_key to "Emoji",
    mp_o_key to "Auto futás/Éjjel látás",
    br_o_key to "Auto futás",
    mp_i_key to "Jelzés",
    mp_l_key to "Hang",
    mp_caps_key to "Kivégzés",
    gd_q_key to "Képesség 1",
    gd_e_key to "Képesség 2",
    gd_r_key to "Képesség 3",
    br_tab_key to "Táska kinyit/becsuk",
    dmz_tab_key to "Táska",
    br_space_key to "Ugrás/Fék",
    dmz_space_key to "Ugrás",
    br_b_key to "Feléleszt",
    br_c_key to "Guggolás/Csúszás/Hely csere autóban",
    dmz_c_key to "Guggolás/Csúszás",
    br_e_key to "Képesség/Rakéta hárítás",
    dmz_e_key to "Képesség",
    br_g_key to "Elem felvétele/Beszállás autóba (másodlagos)",
    dmz_g_key to "Elem felvétele/Küldetés elfogadása",
    br_f_key to "Mégse gránát/Be-ki szállás autóból/Ajtók/Elem felvétele",
    dmz_f_key to "Láda kinyitása",
    br_t_key to "Láda nyitás-zárás/Ugrás hó deszka",
    br_h_key to "Elem felvétele/Láda nyitás-zárás",
    dmz_h_key to "Elem felvétele",
    br_q_key to "Beszállás autóba",
    br_r_key to "Újratöltés",
    br_v_key to "Desperado",
    dmz_v_key to "Csúszka",
    dmz_t_key to "Csapattárs gyógyítása",
    br_n_key to "Belső/Külső nézet váltás",
    br_ctrl_key to "Fekvés",
    dmz_ctrl_key to "Fekvés",
    br_alt_key to "Szabad nézet",
    br_3_key to "Gránát",
    br_4_key to "Páncél",
    lock_mouse_key to "Kurzor rögzítése a képernyőhöz",
    lang_en to "Angol - English",
    lang_hu to "Magyar - Magyar",
    lang_tr to "Török - Türkçe",
    lang_ar to "Arab - العربية",
    lang_es to "Spanyol - Español",
    lang_ptbr to "Portugál (Brazíl) - Português (Brasil)",
    lang_id to "Indonéz - Bahasa Indonesia",
    lang_ru to "Orosz - Русский",
    lang_fr to "Francia - Français"
)

val tr = mapOf(
    next to "İleri",
    apply to "Uygula",
    back to "Geri",
    skip to "Yapılandırmayı sil",
    error to "Hata",
    cancel to "İptal",
    welcome to "Hoş geldiniz!",
    confirmation to "Onay",
    cancel_text to "Uygulamayı kapatmak istediğinize emin misiniz?",
    text_1_1 to "Başlamak için bir dil seçin:",
    title_2 to "Kullanım koşulları",
    accept to "Kabul et",
    mp_tab_key to "Savaş performans paneli",
    mp_esc_key to "Menü",
    mp_space_key to "Zıpla/Drone yukarı",
    gd_space_key to "Zıpla",
    mp_1_key to "Silah 1",
    mp_2_key to "Silah 2",
    mp_3_key to "Skor serisi 1",
    mp_4_key to "Skor serisi 2",
    mp_5_key to "Skor serisi 3",
    mp_6_key to "Skor serisi 4",
    mp_7_key to "Skor serisi 5",
    mp_t_key to "C4 patlat",
    mp_c_key to "Çömel/Kay",
    mp_e_key to "Operatör yeteneği",
    mp_f_key to "Bombayı kur/İmha et/Atılabiliri iptal et/Silah al/Hava ikmali aç",
    mp_q_key to "El bombası/Taktik el bombası",
    mp_m_key to "Harita",
    mp_g_key to "El bombası değiştir/Öldürücü el bombası",
    mp_r_key to "Şarjör değiştir",
    mp_v_key to "Bıçak",
    mp_ctrl_key to "Yat/Drone aşağı",
    gd_ctrl_key to "İleri uçuş",
    mp_z_key to "Sesli sohbet",
    mp_f4_key to "Emoji",
    mp_o_key to "Otomatik koşu/Gece görüşü",
    br_o_key to "Otomatik koşu",
    mp_i_key to "Sinyal",
    mp_l_key to "Ses",
    mp_caps_key to "İnfaz",
    gd_q_key to "Yetenek 1",
    gd_e_key to "Yetenek 2",
    gd_r_key to "Yetenek 3",
    lock_mouse_key to "Fareyi ekrana kilitle",
    br_tab_key to "Sırt çantasını aç/kapat",
    dmz_tab_key to "Sırt çantası",
    br_space_key to "Zıpla/Fren",
    dmz_space_key to "Zıpla",
    br_caps_key to "İnfaz/Snowboard",
    br_b_key to "Canlandır",
    br_c_key to "Çömel/Kay/Arabadaki pozisyonu değiştir",
    dmz_c_key to "Çömel/Kay",
    br_e_key to "Yetenek/Uçak bozucu",
    dmz_e_key to "Yetenek",
    br_g_key to "Eşya al/Araca bin (ikinci)",
    dmz_g_key to "Eşya al/Görevi kabul et",
    br_f_key to "El bombasını iptal et/Araca bin-in/Çık/Kapılar/Eşya al",
    dmz_f_key to "Ganimet kutusunu aç",
    br_t_key to "Ganimet kutusunu aç/kapat/Snowboard zıpla",
    br_h_key to "Eşya al/Ganimet kutusunu aç/kapat/Araca bin (ilk)",
    dmz_h_key to "Eşya al",
    br_q_key to "Araca bin",
    br_r_key to "Şarjör değiştir",
    br_v_key to "Desperado",
    dmz_v_key to "Zipline",
    dmz_t_key to "Takım arkadaşını kurtar",
    br_n_key to "1./3. kişi değiştir",
    br_ctrl_key to "Yat",
    dmz_ctrl_key to "Yat",
    br_alt_key to "Serbest bakış",
    br_3_key to "El bombası",
    br_4_key to "Zırh",
    lang_en to "İngilizce - English",
    lang_hu to "Macarca - Magyar",
    lang_tr to "Türkçe - Türkçe",
    lang_ar to "Arapça - العربية",
    lang_es to "İspanyolca - Español",
    lang_ptbr to "Portekizce (Brezilya) - Português (Brasil)",
    lang_id to "Endonezce - Bahasa Indonesia",
    lang_ru to "Rusça - Русский",
    lang_fr to "Fransızca - Français"
)

val ar = mapOf(
    next to "التالي",
    apply to "تطبيق",
    back to "رجوع",
    skip to "حذف التهيئة",
    error to "خطأ",
    cancel to "إلغاء",
    welcome to "مرحباً!",
    confirmation to "تأكيد",
    cancel_text to "هل أنت متأكد أنك تريد إغلاق التطبيق؟",
    text_1_1 to "اختر لغة للبدء:",
    title_2 to "شروط الاستخدام",
    accept to "أوافق",
    mp_tab_key to "لوحة أداء القتال",
    mp_esc_key to "القائمة",
    mp_space_key to "قفز / رفع الدرون",
    gd_space_key to "قفز",
    mp_1_key to "السلاح 1",
    mp_2_key to "السلاح 2",
    mp_3_key to "سلسلة النقاط 1",
    mp_4_key to "سلسلة النقاط 2",
    mp_5_key to "سلسلة النقاط 3",
    mp_6_key to "سلسلة النقاط 4",
    mp_7_key to "سلسلة النقاط 5",
    mp_t_key to "تفجير C4",
    mp_c_key to "انحناء / انزلاق",
    mp_e_key to "مهارة المشغّل",
    mp_f_key to "زرع / تفكيك القنبلة / إلغاء الرمي / التقاط سلاح / فتح الإمداد الجوي",
    mp_q_key to "قنبلة يدوية / قنبلة تكتيكية",
    mp_m_key to "الخريطة",
    mp_g_key to "تبديل القنابل / قنبلة قاتلة",
    mp_r_key to "إعادة التلقيم",
    mp_v_key to "سكين",
    mp_ctrl_key to "استلقاء / إنزال الدرون",
    gd_ctrl_key to "طيران للأمام",
    mp_z_key to "الدردشة الصوتية",
    mp_f4_key to "إيموجي",
    mp_o_key to "جري تلقائي / رؤية ليلية",
    br_o_key to "جري تلقائي",
    mp_i_key to "إشارة",
    mp_l_key to "الصوت",
    mp_caps_key to "إعدام",
    gd_q_key to "قدرة 1",
    gd_e_key to "قدرة 2",
    gd_r_key to "قدرة 3",
    lock_mouse_key to "قفل المؤشر داخل الشاشة",
    br_tab_key to "فتح / إغلاق حقيبة الظهر",
    dmz_tab_key to "حقيبة الظهر",
    br_space_key to "قفز / فرامل",
    dmz_space_key to "قفز",
    br_caps_key to "إعدام / لوح التزلج",
    br_b_key to "إنعاش",
    br_c_key to "انحناء / انزلاق / تغيير الوضع داخل السيارة",
    dmz_c_key to "انحناء / انزلاق",
    br_e_key to "قدرة / جهاز تشويش الطائرة",
    dmz_e_key to "قدرة",
    br_g_key to "التقاط عناصر / دخول السيارة (الثاني)",
    dmz_g_key to "التقاط عناصر / قبول المهمة",
    br_f_key to "إلغاء القنبلة / دخول وخروج السيارة / الأبواب / التقاط عنصر",
    dmz_f_key to "فتح صندوق الغنائم",
    br_t_key to "فتح وإغلاق صندوق الغنائم / قفز لوح التزلج",
    br_h_key to "التقاط عنصر / فتح وإغلاق صندوق الغنائم / دخول السيارة (الأول)",
    dmz_h_key to "التقاط عنصر",
    br_q_key to "دخول السيارة",
    br_r_key to "إعادة التلقيم",
    br_v_key to "Desperado",
    dmz_v_key to "حبل انزلاقي",
    dmz_t_key to "إنقاذ زميل",
    br_n_key to "التبديل بين منظور أول وثالث",
    br_ctrl_key to "استلقاء",
    dmz_ctrl_key to "استلقاء",
    br_alt_key to "رؤية حرة",
    br_3_key to "قنبلة يدوية",
    br_4_key to "درع",
    lang_en to "الإنجليزية / English",
    lang_hu to "الهنغارية / Magyar",
    lang_tr to "التركية - Türkçe",
    lang_ar to "العربية - العربية",
    lang_es to "الإسبانية - Español",
    lang_ptbr to "البرتغالية (البرازيل) - Português (Brasil)",
    lang_id to "الإندونيسية - Bahasa Indonesia",
    lang_ru to "الروسية - Русский",
    lang_fr to "الفرنسية - Français"
)

val es = mapOf(
    next to "Siguiente",
    apply to "Aplicar",
    back to "Atrás",
    skip to "Eliminar configuración",
    error to "Error",
    cancel to "Cancelar",
    welcome to "¡Bienvenido!",
    confirmation to "Confirmación",
    cancel_text to "¿Seguro que quieres cerrar la aplicación?",
    text_1_1 to "Elige un idioma para empezar:",
    title_2 to "Términos de uso",
    accept to "Aceptar",
    mp_tab_key to "Panel de rendimiento de combate",
    mp_esc_key to "Menú",
    mp_space_key to "Saltar / Subir dron",
    gd_space_key to "Saltar",
    mp_1_key to "Arma 1",
    mp_2_key to "Arma 2",
    mp_3_key to "Racha de puntos 1",
    mp_4_key to "Racha de puntos 2",
    mp_5_key to "Racha de puntos 3",
    mp_6_key to "Racha de puntos 4",
    mp_7_key to "Racha de puntos 5",
    mp_t_key to "Detonar C4",
    mp_c_key to "Agacharse / Deslizarse",
    mp_e_key to "Habilidad del operador",
    mp_f_key to "Plantar / Desactivar bomba / Cancelar lanzamiento / Recoger arma / Abrir airdrop",
    mp_q_key to "Granada / Granada táctica",
    mp_m_key to "Mapa",
    mp_g_key to "Cambiar granada / Granada letal",
    mp_r_key to "Recargar",
    mp_v_key to "Cuchillo",
    mp_ctrl_key to "Tumbarse / Bajar dron",
    gd_ctrl_key to "Vuelo hacia adelante",
    mp_z_key to "Voz",
    mp_f4_key to "Emoji",
    mp_o_key to "Correr automático / Visión nocturna",
    br_o_key to "Correr automático",
    mp_i_key to "Señal",
    mp_l_key to "Sonido",
    mp_caps_key to "Ejecución",
    gd_q_key to "Habilidad 1",
    gd_e_key to "Habilidad 2",
    gd_r_key to "Habilidad 3",
    lock_mouse_key to "Bloquear el ratón en la pantalla",
    br_tab_key to "Abrir/Cerrar mochila",
    dmz_tab_key to "Mochila",
    br_space_key to "Saltar / Frenar",
    dmz_space_key to "Saltar",
    br_caps_key to "Ejecución / Snowboard",
    br_b_key to "Reanimar",
    br_c_key to "Agacharse / Deslizarse / Cambiar posición en el coche",
    dmz_c_key to "Agacharse / Deslizarse",
    br_e_key to "Habilidad / Inhibidor de aeronave",
    dmz_e_key to "Habilidad",
    br_g_key to "Recoger objetos / Entrar al coche (segundo)",
    dmz_g_key to "Recoger objetos / Aceptar misión",
    br_f_key to "Cancelar granada / Entrar-salir del coche / Puertas / Recoger objeto",
    dmz_f_key to "Abrir caja de botín",
    br_t_key to "Abrir/Cerrar caja de botín / Saltar con snowboard",
    br_h_key to "Recoger objeto / Abrir/Cerrar caja de botín / Entrar al coche (primero)",
    dmz_h_key to "Recoger objeto",
    br_q_key to "Entrar al coche",
    br_r_key to "Recargar",
    br_v_key to "Desperado",
    dmz_v_key to "Tirolesa",
    dmz_t_key to "Rescatar compañero",
    br_n_key to "Cambiar 1ª/3ª persona",
    br_ctrl_key to "Tumbarse",
    dmz_ctrl_key to "Tumbarse",
    br_alt_key to "Vista libre",
    br_3_key to "Granada",
    br_4_key to "Armadura",
    lang_en to "Inglés - English",
    lang_hu to "Húngaro - Magyar",
    lang_tr to "Turco - Türkçe",
    lang_ar to "Árabe - العربية",
    lang_es to "Español - Español",
    lang_ptbr to "Portugués (Brasil) - Português (Brasil)",
    lang_id to "Indonesio - Bahasa Indonesia",
    lang_ru to "Ruso - Русский",
    lang_fr to "Francés - Français"
)

val ptBR = mapOf(
    next to "Próximo",
    apply to "Aplicar",
    back to "Voltar",
    skip to "Excluir configuração",
    error to "Erro",
    cancel to "Cancelar",
    welcome to "Bem-vindo!",
    confirmation to "Confirmação",
    cancel_text to "Tem certeza de que deseja fechar o aplicativo?",
    text_1_1 to "Escolha um idioma para começar:",
    title_2 to "Termos de uso",
    accept to "Aceitar",
    mp_tab_key to "Painel de desempenho de combate",
    mp_esc_key to "Menu",
    mp_space_key to "Pular / Subir drone",
    gd_space_key to "Pular",
    mp_1_key to "Arma 1",
    mp_2_key to "Arma 2",
    mp_3_key to "Série de pontuação 1",
    mp_4_key to "Série de pontuação 2",
    mp_5_key to "Série de pontuação 3",
    mp_6_key to "Série de pontuação 4",
    mp_7_key to "Série de pontuação 5",
    mp_t_key to "Detonar C4",
    mp_c_key to "Agachar / Deslizar",
    mp_e_key to "Habilidade do operador",
    mp_f_key to "Plantar / Desarmar bomba / Cancelar arremesso / Pegar arma / Abrir airdrop",
    mp_q_key to "Granada / Granada tática",
    mp_m_key to "Mapa",
    mp_g_key to "Trocar granada / Granada letal",
    mp_r_key to "Recarregar",
    mp_v_key to "Faca",
    mp_ctrl_key to "Deitar / Descer drone",
    gd_ctrl_key to "Voo para frente",
    mp_z_key to "Voz",
    mp_f4_key to "Emoji",
    mp_o_key to "Correr automaticamente / Visão noturna",
    br_o_key to "Correr automaticamente",
    mp_i_key to "Sinal",
    mp_l_key to "Som",
    mp_caps_key to "Finalização",
    gd_q_key to "Habilidade 1",
    gd_e_key to "Habilidade 2",
    gd_r_key to "Habilidade 3",
    lock_mouse_key to "Travar o mouse na tela",
    br_tab_key to "Abrir/Fechar mochila",
    dmz_tab_key to "Mochila",
    br_space_key to "Pular / Frear",
    dmz_space_key to "Pular",
    br_caps_key to "Finalização / Snowboard",
    br_b_key to "Reanimar",
    br_c_key to "Agachar / Deslizar / Mudar posição no carro",
    dmz_c_key to "Agachar / Deslizar",
    br_e_key to "Habilidade / Jammer da aeronave",
    dmz_e_key to "Habilidade",
    br_g_key to "Pegar itens / Entrar no carro (segundo)",
    dmz_g_key to "Pegar itens / Aceitar missão",
    br_f_key to "Cancelar granada / Entrar-sair do carro / Portas / Pegar item",
    dmz_f_key to "Abrir caixa de loot",
    br_t_key to "Abrir/Fechar caixa de loot / Pular no snowboard",
    br_h_key to "Pegar item / Abrir/Fechar caixa de loot / Entrar no carro (primeiro)",
    dmz_h_key to "Pegar item",
    br_q_key to "Entrar no carro",
    br_r_key to "Recarregar",
    br_v_key to "Desperado",
    dmz_v_key to "Tirolesa",
    dmz_t_key to "Resgatar companheiro",
    br_n_key to "Alternar 1ª/3ª pessoa",
    br_ctrl_key to "Deitar",
    dmz_ctrl_key to "Deitar",
    br_alt_key to "Visão livre",
    br_3_key to "Granada",
    br_4_key to "Armadura",
    lang_en to "Inglês - English",
    lang_hu to "Húngaro - Magyar",
    lang_tr to "Turco - Türkçe",
    lang_ar to "Árabe - العربية",
    lang_es to "Espanhol - Español",
    lang_ptbr to "Português (Brasil) - Português (Brasil)",
    lang_id to "Indonésio - Bahasa Indonesia",
    lang_ru to "Russo - Русский",
    lang_fr to "Francês - Français"
)

val ind = mapOf(
    next to "Berikutnya",
    apply to "Terapkan",
    back to "Kembali",
    skip to "Hapus konfigurasi",
    error to "Kesalahan",
    cancel to "Batal",
    welcome to "Selamat datang!",
    confirmation to "Konfirmasi",
    cancel_text to "Apakah Anda yakin ingin menutup aplikasi?",
    text_1_1 to "Pilih bahasa untuk memulai:",
    title_2 to "Syarat penggunaan",
    accept to "Terima",
    mp_tab_key to "Panel performa pertempuran",
    mp_esc_key to "Menu",
    mp_space_key to "Lompat / Drone naik",
    gd_space_key to "Lompat",
    mp_1_key to "Senjata 1",
    mp_2_key to "Senjata 2",
    mp_3_key to "Skorstreak 1",
    mp_4_key to "Skorstreak 2",
    mp_5_key to "Skorstreak 3",
    mp_6_key to "Skorstreak 4",
    mp_7_key to "Skorstreak 5",
    mp_t_key to "Ledakkan C4",
    mp_c_key to "Jongkok / Meluncur",
    mp_e_key to "Skill operator",
    mp_f_key to "Pasang - jinakkan bom / Batalkan lemparan / Ambil senjata / Buka airdrop",
    mp_q_key to "Granat / Granat taktis",
    mp_m_key to "Peta",
    mp_g_key to "Ganti granat / Granat mematikan",
    mp_r_key to "Isi ulang",
    mp_v_key to "Pisau",
    mp_ctrl_key to "Tengkurap / Drone turun",
    gd_ctrl_key to "Terbang maju",
    mp_z_key to "Suara",
    mp_f4_key to "Emoji",
    mp_o_key to "Lari otomatis / Penglihatan malam",
    br_o_key to "Lari otomatis",
    mp_i_key to "Tanda",
    mp_l_key to "Suara (Audio)",
    mp_caps_key to "Eksekusi",
    gd_q_key to "Kemampuan 1",
    gd_e_key to "Kemampuan 2",
    gd_r_key to "Kemampuan 3",
    lock_mouse_key to "Kunci mouse ke layar",
    br_tab_key to "Buka/tutup ransel",
    dmz_tab_key to "Ransel",
    br_space_key to "Lompat / Rem",
    dmz_space_key to "Lompat",
    br_caps_key to "Eksekusi / Snowboard",
    br_b_key to "Hidupkan kembali",
    br_c_key to "Jongkok / Meluncur / Ubah posisi di mobil",
    dmz_c_key to "Jongkok / Meluncur",
    br_e_key to "Skill / Jammer pesawat",
    dmz_e_key to "Skill",
    br_g_key to "Ambil item / Masuk mobil (kedua)",
    dmz_g_key to "Ambil item / Terima misi",
    br_f_key to "Batalkan granat / Masuk-keluar mobil / Pintu / Ambil item",
    dmz_f_key to "Buka kotak loot",
    br_t_key to "Buka/tutup kotak loot / Lompat snowboard",
    br_h_key to "Ambil item / Buka/tutup kotak loot / Masuk mobil (pertama)",
    dmz_h_key to "Ambil item",
    br_q_key to "Masuk mobil",
    br_r_key to "Isi ulang",
    br_v_key to "Desperado",
    dmz_v_key to "Zipline",
    dmz_t_key to "Selamatkan rekan tim",
    br_n_key to "Ganti orang pertama/ketiga",
    br_ctrl_key to "Tengkurap",
    dmz_ctrl_key to "Tengkurap",
    br_alt_key to "Pandangan bebas",
    br_3_key to "Granat",
    br_4_key to "Armor",
    lang_en to "Inggris - English",
    lang_hu to "Hungaria - Magyar",
    lang_tr to "Turki - Türkçe",
    lang_ar to "Arab - العربية",
    lang_es to "Spanyol - Español",
    lang_ptbr to "Portugis (Brasil) - Português (Brasil)",
    lang_id to "Indonesia - Bahasa Indonesia",
    lang_ru to "Rusia - Русский",
    lang_fr to "Prancis - Français"
)


val ru = mapOf(
    next to "Далее",
    apply to "Применить",
    back to "Назад",
    skip to "Удалить конфигурацию",
    error to "Ошибка",
    cancel to "Отмена",
    welcome to "Добро пожаловать!",
    confirmation to "Подтверждение",
    cancel_text to "Вы уверены, что хотите закрыть приложение?",
    text_1_1 to "Выберите язык, чтобы начать:",
    title_2 to "Условия использования",
    accept to "Принять",
    mp_tab_key to "Панель боевой эффективности",
    mp_esc_key to "Меню",
    mp_space_key to "Прыжок / Дрон вверх",
    gd_space_key to "Прыжок",
    mp_1_key to "Оружие 1",
    mp_2_key to "Оружие 2",
    mp_3_key to "Серия очков 1",
    mp_4_key to "Серия очков 2",
    mp_5_key to "Серия очков 3",
    mp_6_key to "Серия очков 4",
    mp_7_key to "Серия очков 5",
    mp_t_key to "Подорвать C4",
    mp_c_key to "Присесть / Скольжение",
    mp_e_key to "Навык оператора",
    mp_f_key to "Установить / Обезвредить бомбу / Отменить бросок / Подобрать оружие / Открыть аирдроп",
    mp_q_key to "Граната / Тактическая граната",
    mp_m_key to "Карта",
    mp_g_key to "Сменить гранату / Летальная граната",
    mp_r_key to "Перезарядка",
    mp_v_key to "Нож",
    mp_ctrl_key to "Лечь / Дрон вниз",
    gd_ctrl_key to "Полёт вперёд",
    mp_z_key to "Голос",
    mp_f4_key to "Эмодзи",
    mp_o_key to "Автобег / Ночное видение",
    br_o_key to "Автобег",
    mp_i_key to "Сигнал",
    mp_l_key to "Звук",
    mp_caps_key to "Казнь",
    gd_q_key to "Способность 1",
    gd_e_key to "Способность 2",
    gd_r_key to "Способность 3",
    lock_mouse_key to "Зафиксировать мышь в окне",
    br_tab_key to "Открыть/закрыть рюкзак",
    dmz_tab_key to "Рюкзак",
    br_space_key to "Прыжок / Тормоз",
    dmz_space_key to "Прыжок",
    br_caps_key to "Казнь / Сноуборд",
    br_b_key to "Оживить",
    br_c_key to "Присесть / Скольжение / Сменить место в машине",
    dmz_c_key to "Присесть / Скольжение",
    br_e_key to "Навык / Глушилка самолёта",
    dmz_e_key to "Навык",
    br_g_key to "Подобрать предметы / Сесть в машину (второе)",
    dmz_g_key to "Подобрать предметы / Принять задание",
    br_f_key to "Отменить гранату / Сесть-выйти из машины / Двери / Подобрать предмет",
    dmz_f_key to "Открыть ящик с лутом",
    br_t_key to "Открыть/закрыть ящик с лутом / Прыжок на сноуборде",
    br_h_key to "Подобрать предмет / Открыть/закрыть ящик с лутом / Сесть в машину (первое)",
    dmz_h_key to "Подобрать предмет",
    br_q_key to "Сесть в машину",
    br_r_key to "Перезарядка",
    br_v_key to "Desperado",
    dmz_v_key to "Зиплайн",
    dmz_t_key to "Спасти товарища",
    br_n_key to "Переключить 1-е/3-е лицо",
    br_ctrl_key to "Лечь",
    dmz_ctrl_key to "Лечь",
    br_alt_key to "Свободный обзор",
    br_3_key to "Граната",
    br_4_key to "Броня",
    lang_en to "Английский - English",
    lang_hu to "Венгерский - Magyar",
    lang_tr to "Турецкий - Türkçe",
    lang_ar to "Арабский - العربية",
    lang_es to "Испанский - Español",
    lang_ptbr to "Португальский (Бразилия) - Português (Brasil)",
    lang_id to "Индонезийский - Bahasa Indonesia",
    lang_ru to "Русский - Русский",
    lang_fr to "Французский - Français"
)

val fr = mapOf(
    next to "Suivant",
    apply to "Appliquer",
    back to "Retour",
    skip to "Supprimer la configuration",
    error to "Erreur",
    cancel to "Annuler",
    welcome to "Bienvenue !",
    confirmation to "Confirmation",
    cancel_text to "Êtes-vous sûr de vouloir fermer l’application ?",
    text_1_1 to "Choisissez une langue pour commencer :",
    title_2 to "Conditions d’utilisation",
    accept to "Accepter",
    mp_tab_key to "Panneau de performance de combat",
    mp_esc_key to "Menu",
    mp_space_key to "Saut / Drone vers le haut",
    gd_space_key to "Saut",
    mp_1_key to "Arme 1",
    mp_2_key to "Arme 2",
    mp_3_key to "Série de points 1",
    mp_4_key to "Série de points 2",
    mp_5_key to "Série de points 3",
    mp_6_key to "Série de points 4",
    mp_7_key to "Série de points 5",
    mp_t_key to "Déclencher le C4",
    mp_c_key to "S’accroupir / Glisser",
    mp_e_key to "Compétence d’opérateur",
    mp_f_key to "Planter / Désamorcer la bombe / Annuler le lancer / Ramasser une arme / Ouvrir un airdrop",
    mp_q_key to "Grenade / Grenade tactique",
    mp_m_key to "Carte",
    mp_g_key to "Changer de grenade / Grenade létale",
    mp_r_key to "Recharger",
    mp_v_key to "Couteau",
    mp_ctrl_key to "S’allonger / Drone vers le bas",
    gd_ctrl_key to "Vol vers l’avant",
    mp_z_key to "Voix",
    mp_f4_key to "Emoji",
    mp_o_key to "Course auto / Vision nocturne",
    br_o_key to "Course auto",
    mp_i_key to "Signal",
    mp_l_key to "Son",
    mp_caps_key to "Exécution",
    gd_q_key to "Capacité 1",
    gd_e_key to "Capacité 2",
    gd_r_key to "Capacité 3",
    lock_mouse_key to "Verrouiller la souris à l’écran",
    br_tab_key to "Ouvrir / Fermer le sac à dos",
    dmz_tab_key to "Sac à dos",
    br_space_key to "Saut / Frein",
    dmz_space_key to "Saut",
    br_caps_key to "Exécution / Snowboard",
    br_b_key to "Réanimer",
    br_c_key to "S’accroupir / Glisser / Changer de place dans la voiture",
    dmz_c_key to "S’accroupir / Glisser",
    br_e_key to "Compétence / Brouilleur d’aéronef",
    dmz_e_key to "Compétence",
    br_g_key to "Ramasser des objets / Entrer dans la voiture (second)",
    dmz_g_key to "Ramasser des objets / Accepter une mission",
    br_f_key to "Annuler la grenade / Entrer-sortir de la voiture / Portes / Ramasser un objet",
    dmz_f_key to "Ouvrir la caisse de butin",
    br_t_key to "Ouvrir-fermer la caisse de butin / Sauter en snowboard",
    br_h_key to "Ramasser un objet / Ouvrir-fermer la caisse de butin / Entrer dans la voiture (premier)",
    dmz_h_key to "Ramasser un objet",
    br_q_key to "Entrer dans la voiture",
    br_r_key to "Recharger",
    br_v_key to "Desperado",
    dmz_v_key to "Tyrolienne",
    dmz_t_key to "Secourir un coéquipier",
    br_n_key to "Passer en 1re / 3e personne",
    br_ctrl_key to "S’allonger",
    dmz_ctrl_key to "S’allonger",
    br_alt_key to "Vue libre",
    br_3_key to "Grenade",
    br_4_key to "Armure",
    lang_en to "Anglais - English",
    lang_hu to "Hongrois - Magyar",
    lang_tr to "Turc - Türkçe",
    lang_ar to "Arabe - العربية",
    lang_es to "Espagnol - Español",
    lang_ptbr to "Portugais (Brésil) - Português (Brasil)",
    lang_id to "Indonésien - Bahasa Indonesia",
    lang_ru to "Russe - Русский",
    lang_fr to "Français - Français"
)

lateinit var strings: Map<String, String>

fun initLanguage() {
    val langId = when (strings) {
        en   -> EN_LANG_RADIO_ID
        hu   -> HU_LANG_RADIO_ID
        tr   -> TR_LANG_RADIO_ID
        ar   -> AR_LANG_RADIO_ID
        es   -> ES_LANG_RADIO_ID
        ptBR -> PTBR_LANG_RADIO_ID
        ind   -> ID_LANG_RADIO_ID
        ru   -> RU_LANG_RADIO_ID
        fr   -> FR_LANG_RADIO_ID
        else -> EN_LANG_RADIO_ID
    }

    // Update the range to include all language radio buttons in your dialog
    CheckRadioButton(hwndMain, 2001, 2009, langId)
}

@OptIn(ExperimentalForeignApi::class)
fun initStrings(): Map<String, String> {
    val language = reg?.let { getValue(it, lang) } ?: getLocalLanguage()

    return when (language) {
        "hu" -> hu
        "tr" -> tr
        "ar" -> ar
        "es" -> es
        "pt" -> ptBR
        "id" -> ind
        "ru" -> ru
        "fr" -> fr
        else -> en
    }
}

@OptIn(ExperimentalForeignApi::class)
fun getLocalLanguage(): String {
    val bufferSize = 85
    val buffer = nativeHeap.allocArray<WCHARVar>(bufferSize)
    val length = GetUserDefaultLocaleName(buffer, bufferSize)

    return if (length > 0) {
        val langName = buffer.toKString()
        langName.substringBefore('-')
    } else {
        "en"
    }.also {
        nativeHeap.free(buffer.rawValue)
    }
}

const val license =
    "Copyright 2025 Napharcos. All rights reserved.\r\n\r\nPermission is granted to use this software for personal," +
            " non-commercial purposes only.\r\nAny form of copying, distribution, modification, reverse engineering," +
            " or creation of derivative works is strictly prohibited without the express written consent of the author, " +
            "unless otherwise explicitly stated.\r\n\r\nThe source code is made publicly available for transparency and " +
            "to promote trust, not for reuse or redistribution.\r\nViewing or running the source code does not imply " +
            "permission to reuse or incorporate it elsewhere.\r\n\r\nFor any commercial, educational, or redistributive use, " +
            "please contact the author directly for explicit permission.\r\n\r\n\r\nThis software and its components are " +
            "provided \"as is\", without any warranties, express or implied, including but not limited to merchantability " +
            "or fitness for a particular purpose.\r\nUse at your own risk.\r\n\r\nThis software is not affiliated with, " +
            "endorsed by, or supported by the original software developers or publishers, including but not limited to " +
            "Tencent, Activision, or their affiliates.\r\nAny use of associated configurations is done " +
            "at your own risk. The author assumes no responsibility for any resulting issues or damages."