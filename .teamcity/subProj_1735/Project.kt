package subProj_1735

import subProj_1735.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1735")
    name = "subProj 1735"

    buildType(subProj_bt_1735_0)
    buildType(subProj_bt_1735_1)
    buildType(subProj_bt_1735_4)
    buildType(subProj_bt_1735_5)
    buildType(subProj_bt_1735_2)
    buildType(subProj_bt_1735_3)
})
