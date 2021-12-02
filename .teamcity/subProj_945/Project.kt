package subProj_945

import subProj_945.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_945")
    name = "subProj 945"

    buildType(subProj_bt_945_2)
    buildType(subProj_bt_945_3)
    buildType(subProj_bt_945_4)
    buildType(subProj_bt_945_5)
    buildType(subProj_bt_945_0)
    buildType(subProj_bt_945_1)
})
