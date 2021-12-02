package subProj_1284

import subProj_1284.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1284")
    name = "subProj 1284"

    buildType(subProj_bt_1284_5)
    buildType(subProj_bt_1284_0)
    buildType(subProj_bt_1284_3)
    buildType(subProj_bt_1284_4)
    buildType(subProj_bt_1284_1)
    buildType(subProj_bt_1284_2)
})
