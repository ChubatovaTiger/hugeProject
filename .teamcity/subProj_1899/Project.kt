package subProj_1899

import subProj_1899.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1899")
    name = "subProj 1899"

    buildType(subProj_bt_1899_2)
    buildType(subProj_bt_1899_1)
    buildType(subProj_bt_1899_0)
    buildType(subProj_bt_1899_5)
    buildType(subProj_bt_1899_4)
    buildType(subProj_bt_1899_3)
})
