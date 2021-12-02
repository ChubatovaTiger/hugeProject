package subProj_1870

import subProj_1870.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1870")
    name = "subProj 1870"

    buildType(subProj_bt_1870_4)
    buildType(subProj_bt_1870_5)
    buildType(subProj_bt_1870_2)
    buildType(subProj_bt_1870_3)
    buildType(subProj_bt_1870_0)
    buildType(subProj_bt_1870_1)
})
