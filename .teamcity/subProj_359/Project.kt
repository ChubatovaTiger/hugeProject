package subProj_359

import subProj_359.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_359")
    name = "subProj 359"

    buildType(subProj_bt_359_1)
    buildType(subProj_bt_359_2)
    buildType(subProj_bt_359_3)
    buildType(subProj_bt_359_4)
    buildType(subProj_bt_359_0)
    buildType(subProj_bt_359_5)
})
