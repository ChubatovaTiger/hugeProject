package subProj_210

import subProj_210.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_210")
    name = "subProj 210"

    buildType(subProj_bt_210_3)
    buildType(subProj_bt_210_4)
    buildType(subProj_bt_210_5)
    buildType(subProj_bt_210_0)
    buildType(subProj_bt_210_1)
    buildType(subProj_bt_210_2)
})
