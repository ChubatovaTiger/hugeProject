package subProj_1023

import subProj_1023.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1023")
    name = "subProj 1023"

    buildType(subProj_bt_1023_5)
    buildType(subProj_bt_1023_4)
    buildType(subProj_bt_1023_3)
    buildType(subProj_bt_1023_2)
    buildType(subProj_bt_1023_1)
    buildType(subProj_bt_1023_0)
})
