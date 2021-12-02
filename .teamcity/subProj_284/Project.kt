package subProj_284

import subProj_284.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_284")
    name = "subProj 284"

    buildType(subProj_bt_284_5)
    buildType(subProj_bt_284_4)
    buildType(subProj_bt_284_3)
    buildType(subProj_bt_284_2)
    buildType(subProj_bt_284_1)
    buildType(subProj_bt_284_0)
})
