package subProj_735

import subProj_735.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_735")
    name = "subProj 735"

    buildType(subProj_bt_735_3)
    buildType(subProj_bt_735_4)
    buildType(subProj_bt_735_5)
    buildType(subProj_bt_735_0)
    buildType(subProj_bt_735_1)
    buildType(subProj_bt_735_2)
})
