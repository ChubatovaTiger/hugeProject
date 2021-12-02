package subProj_880

import subProj_880.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_880")
    name = "subProj 880"

    buildType(subProj_bt_880_0)
    buildType(subProj_bt_880_1)
    buildType(subProj_bt_880_2)
    buildType(subProj_bt_880_3)
    buildType(subProj_bt_880_4)
    buildType(subProj_bt_880_5)
})
