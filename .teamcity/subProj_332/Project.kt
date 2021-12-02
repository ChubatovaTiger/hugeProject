package subProj_332

import subProj_332.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_332")
    name = "subProj 332"

    buildType(subProj_bt_332_5)
    buildType(subProj_bt_332_4)
    buildType(subProj_bt_332_3)
    buildType(subProj_bt_332_2)
    buildType(subProj_bt_332_1)
    buildType(subProj_bt_332_0)
})
