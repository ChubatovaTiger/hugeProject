package subProj_780

import subProj_780.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_780")
    name = "subProj 780"

    buildType(subProj_bt_780_3)
    buildType(subProj_bt_780_4)
    buildType(subProj_bt_780_1)
    buildType(subProj_bt_780_2)
    buildType(subProj_bt_780_0)
    buildType(subProj_bt_780_5)
})
