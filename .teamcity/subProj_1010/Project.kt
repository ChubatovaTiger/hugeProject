package subProj_1010

import subProj_1010.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1010")
    name = "subProj 1010"

    buildType(subProj_bt_1010_5)
    buildType(subProj_bt_1010_4)
    buildType(subProj_bt_1010_3)
    buildType(subProj_bt_1010_2)
    buildType(subProj_bt_1010_1)
    buildType(subProj_bt_1010_0)
})
