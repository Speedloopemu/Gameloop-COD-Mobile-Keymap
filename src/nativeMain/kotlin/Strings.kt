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
    br_b_key to "Enter car (second)",
    br_c_key to "Crouch/Slide/Change position in car",
    dmz_c_key to "Crouch/Slide",
    br_e_key to "Skill/Aircraft jammer",
    dmz_e_key to "Skill",
    br_g_key to "Revive/Pick up items",
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
    lang_hu to "Hungarian - Magyar"
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
    br_b_key to "Beszállás autóba (másodlagos)",
    br_c_key to "Guggolás/Csúszás/Hely csere autóban",
    dmz_c_key to "Guggolás/Csúszás",
    br_e_key to "Képesség/Rakéta hárítás",
    dmz_e_key to "Képesség",
    br_g_key to "Feléleszt/Elem felvétele",
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
)

lateinit var strings: Map<String, String>

fun initLanguage() {
    val langId = when (strings) {
        en -> EN_LANG_RADIO_ID
        hu -> HU_LANG_RADIO_ID
        else -> EN_LANG_RADIO_ID
    }
    CheckRadioButton(hwndMain, 2001, 2002, langId)
}

@OptIn(ExperimentalForeignApi::class)
fun initStrings(): Map<String, String> {
    val language = reg?.let { getValue(it, lang) } ?: getLocalLanguage()

    return when (language) {
        "hu" -> hu
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