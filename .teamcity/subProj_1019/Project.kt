package subProj_1019

import subProj_1019.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1019")
    name = "subProj 1019"

    buildType(subProj_bt_1019_2)
    buildType(subProj_bt_1019_1)
    buildType(subProj_bt_1019_0)
    buildType(subProj_bt_1019_5)
    buildType(subProj_bt_1019_4)
    buildType(subProj_bt_1019_3)
})
